/**
 * 
 */
package com.imooc.rmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.imooc.rmq.service.OrderService;

/**
 * @author zhailiang
 *
 */
@SpringBootApplication
public class OrderApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OrderApplication.class, args);
		context.getBean(OrderService.class).create();
	}

}
