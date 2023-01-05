package com.finalProject.project;


import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer{

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // TODO Auto-generated method stub
        registry.addResourceHandler("/images/**")
        .addResourceLocations("file:///C:/springWorkspace/product_images/",
                                                "file:///C:/springWorkspace/upload/");

        registry.addResourceHandler("/audio/**")
        .addResourceLocations("file:///C:/springWorkspace/upload/");
    }

    
    

}
