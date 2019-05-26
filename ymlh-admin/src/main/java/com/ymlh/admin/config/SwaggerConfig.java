package com.ymlh.admin.config;




import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.*;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by zhanghao on 2019/4/30.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    List<Parameter> parameters = new ArrayList<>();
    @Bean
    public Docket createRestApi() {
        ParameterBuilder parameterBuilder = new ParameterBuilder();
        Parameter parameter = parameterBuilder.name("token")
                .defaultValue( "Bearer "+122222)
                .description("token")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false)
                .build();
        parameters.add(parameter);
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //.globalOperationParameters(parameters)
                .select()
                //加了ApiOperation注解的类，生成接口文档
                //.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                //包下的类，生成接口文档
                .apis(RequestHandlerSelectors.basePackage("com.ymlh"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("人人开源")
                .description("renren-admin文档")
                .termsOfServiceUrl("https://www.renren.io")
                .version("4.0.0")
                .build();
    }


}
