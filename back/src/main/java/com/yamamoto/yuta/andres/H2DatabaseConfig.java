package com.yamamoto.yuta.andres;

import java.sql.SQLException;
import org.h2.tools.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class H2DatabaseConfig {

  @Value("${h2.tcp.port:9092}")
  private String h2TcpPort;

  @Bean
  public Server h2TcpServer() throws SQLException {
    return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", h2TcpPort).start();
  }
}
