package cn.taoblog421.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author liaotao
 * @Date 2021/3/9 20:49
 */
@SpringBootApplication
@ComponentScan(basePackages = {"cn.taoblog421"})
@MapperScan("cn.taoblog421.admin.mapper")
@EnableDiscoveryClient
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}
