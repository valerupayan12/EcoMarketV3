

package com.example.MicroClienteV2.client;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuración del FeignClient para ms-cupon-descuento.
 *
 * BasicAuthRequestInterceptor agrega automáticamente el header:
 *   Authorization: Basic <base64(user:password)>
 *
 * Los valores se leen desde application.properties.
 */
@Configuration
public class FeignCLientConfig {

    @Value("${ms.cupon.user}")
    private String cuponUser;

    @Value("${ms.cupon.password}")
    private String cuponPassword;

    @Bean
    public BasicAuthRequestInterceptor cuponBasicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor(cuponUser, cuponPassword);
    }
}