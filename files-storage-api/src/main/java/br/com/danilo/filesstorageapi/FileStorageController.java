package br.com.danilo.filesstorageapi;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/api/files")
public class FileStorageController {
    
    private final Path fileStorageLocation;

    public FileStorageController(FileStorageProperties fileStorageProperties){
        this.fileStorageLocation = Paths.get(fileStorageProperties.getGetUploadDir())
            .toAbsolutePath().normalize();

    }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file){
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try{

            Path targerLocation = fileStorageLocation.resolve(fileName);
            file.transferTo(targerLocation);

            String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/api/files/download/")
                .path(fileName)
                .toUriString();
                

                return ResponseEntity.ok("Upload completed" + fileDownloadUri);
            
        }catch(IOException e){

            return ResponseEntity.badRequest().build();

        }
    }
    

}
