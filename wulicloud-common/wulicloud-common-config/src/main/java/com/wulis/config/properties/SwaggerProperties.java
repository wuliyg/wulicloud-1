package com.wulis.config.properties;

import com.wulis.config.constant.GlobalConstant;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The class Async task properties.
 *
 * @author paascloud.net @gmail.com
 */
@Data
@ConfigurationProperties(prefix = GlobalConstant.SWAGGER_PREFIX)
public class SwaggerProperties {

    private String title;

    private String description;

    private String version;

    private String license;

    private String licenseUrl;

    private String contactName;

    private String contactUrl;

    private String contactEmail;
}
