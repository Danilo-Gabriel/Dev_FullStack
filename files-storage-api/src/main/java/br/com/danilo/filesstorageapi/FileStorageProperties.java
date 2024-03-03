package br.com.danilo.filesstorageapi;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {


    private String getUploadDir;

    public String getGetUploadDir() {
        return getUploadDir;
    }

    public void setGetUploadDir(String getUploadDir) {
        this.getUploadDir = getUploadDir;
    }

   
    
}
