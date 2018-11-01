package config;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

    @Configuration
    @EnableSwagger
    @EnableWebMvc
    @ComponentScan(basePackages = "cn.controller")
    public class SwaggerConfig {
        private SpringSwaggerConfig springSwaggerConfig;
        /**
         * Required to autowire SpringSwaggerConfig
         */
        @Autowired
        public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig)
        {
            this.springSwaggerConfig = springSwaggerConfig;
        }
        /**
         * Every SwaggerSpringMvcPlugin bean is picked up by the swagger-mvc
         * framework - allowing for multiple swagger groups i.e. same code base
         * multiple swagger resource listings.
         */
        @Bean
        public SwaggerSpringMvcPlugin customImplementation()
        {
            return new SwaggerSpringMvcPlugin(this.springSwaggerConfig)
                    .apiInfo(apiInfo())
                    .includePatterns(".*");
        }
        private ApiInfo apiInfo()
        {
            ApiInfo apiInfo = new ApiInfo(
                    "Swagger",
                    "测试Swagger",
                    "开发者: 花韵",
                    "842711149@qq.com",
                    "MIT License",
                    "/LICENSE");
            return apiInfo;
        }
    }
