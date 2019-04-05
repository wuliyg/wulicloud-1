package com.wulis.config.properties;


import com.wulis.config.constant.GlobalConstant;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = GlobalConstant.ROOT_PREFIX)
public class AssetcloudProperties {
}
