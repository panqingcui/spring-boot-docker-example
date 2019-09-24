package com.example.demo.config;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;

/**
 * <p>功能描述,该部分必须以中文句号结尾 .</p>
 * <p>
 * 创建日期 2019/9/19
 *
 * @author panqingcui
 * @since 1.0.0
 */
//@Component
public class CustomServletContainer implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {
    /**
     *
     * @param factory
     */
    @Override
    public void customize(ConfigurableWebServerFactory factory) {
       //factory.setPort(8082);
    }
    @Bean
    public ServletWebServerFactory servletContainer() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.addAdditionalTomcatConnectors(createStandardConnector());
        return tomcat;
    }
    private Connector createStandardConnector() {
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setPort(8080);
        return connector;
    }
    private Connector createSslConnector() {
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        Http11NioProtocol protocol = (Http11NioProtocol) connector.getProtocolHandler();
        try {
            File keystore = new ClassPathResource("keystore.p12").getFile();
            File truststore = new ClassPathResource("keystore.p12").getFile();
            connector.setScheme("https");
            connector.setSecure(true);
            connector.setPort(8443);
            protocol.setSSLEnabled(true);
            protocol.setKeystoreFile(keystore.getAbsolutePath());
            protocol.setKeystorePass("123456");
            protocol.setKeystoreType("PKCS12");
//            protocol.setTruststoreFile(truststore.getAbsolutePath());
            ////            protocol.setTruststorePass("password");
            protocol.setKeyAlias("tomcat");
            return connector;
        }
        catch (IOException ex) {
            throw new IllegalStateException("can't access keystore: [" + "keystore"
                                            + "] or truststore: [" + "keystore" + "]", ex);
        }
    }
}

