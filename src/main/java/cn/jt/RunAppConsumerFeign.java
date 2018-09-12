package cn.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication //feign不能使用boot要使用cloud
@EnableFeignClients //feign的客户端
public class RunAppConsumerFeign {

	public static void main(String[] args) {
		SpringApplication.run(RunAppConsumerFeign.class, args);
	}
}
