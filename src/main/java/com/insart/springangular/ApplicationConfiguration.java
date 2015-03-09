package com.insart.springangular;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Repository;

/**
 * User: Evgeniy James
 * Date: 09.03.2015
 */

@Configuration

@ComponentScan(basePackageClasses = ApplicationConfiguration.class, excludeFilters =
@ComponentScan.Filter(value = Repository.class, type = FilterType.ANNOTATION))
@PropertySource("classpath:application.properties")
@Import(MvcConfiguration.class)
public class ApplicationConfiguration {
}
