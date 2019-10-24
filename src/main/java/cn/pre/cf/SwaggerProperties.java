package cn.pre.cf;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Dora
 * @date 2019/10/23 15:16
 **/
@Data
@ConfigurationProperties(
        prefix = "swagger"
)
@Component
public class SwaggerProperties {

    private String title;

    private String description;

    private String version;

}
