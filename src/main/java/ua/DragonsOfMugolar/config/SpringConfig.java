package ua.DragonsOfMugolar.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ua.DragonsOfMugolar.dao", "ua.DragonsOfMugolar.service"})
public class SpringConfig {
}
