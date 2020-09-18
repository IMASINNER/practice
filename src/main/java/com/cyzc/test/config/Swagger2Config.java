package com.cyzc.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
//注解开启swagger
@EnableSwagger2
public class Swagger2Config {

    //是否开启swagger，正式环境一般是需要关闭的
   /* @Value("${swagger.enabled}")
    private boolean enableSwagger;*/


    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //.enable(enableSwagger)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.cyzc.test.Controller"))
                .paths(PathSelectors.any())
                .build();


    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                //文档标题
                .title("mySwagger")
                //描述
                .description("接口说明")
                //url
                .termsOfServiceUrl("http://127.0.0.1:8080/")
                //联系信息
                .contact("春意暂迟")
                //版本号
                .version("1.0.0")
                .build();
    }
}
