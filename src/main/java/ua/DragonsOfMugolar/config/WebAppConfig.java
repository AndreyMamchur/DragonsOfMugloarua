package ua.DragonsOfMugolar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "ua.DragonsOfMugolar.controller")
public class WebAppConfig extends WebMvcConfigurerAdapter {

    @Bean
    public FreeMarkerViewResolver freeMarkerViewResolver(){
        FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
        resolver.setCache(true);
        resolver.setPrefix("");
        resolver.setSuffix(".ftl");
        resolver.setOrder(1);
        return resolver;
    }

    @Bean
    public FreeMarkerConfigurer freeMarkerConfigurer(){
        FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
        freeMarkerConfigurer.setTemplateLoaderPaths("/", "/WEB-INF/views/game", "/WEB-INF/views/");
        return freeMarkerConfigurer;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
        configurer.enable();
    }
}
