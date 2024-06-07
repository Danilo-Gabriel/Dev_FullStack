package org.init;

import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;


@OpenAPIDefinition(
        info = @Info(
                title = "",
                version = "",
                contact = @Contact(
                        name = "Danilo Gabriel",
                        url = "http://localhost",
                        email = "danilonascimento.dr@gmail.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.apache.orq/licenses/LICENCE-2.0.html"
                )
        )

)
public class QuarkusSocialApplication extends Application {





}
