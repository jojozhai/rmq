/**
 * 
 */
package com.imooc.rmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhailiang
 *
 */
@Configuration
public class RabbitConfig {
	
	@Bean
	public Queue orderQueue() {
		return new Queue("order");
	}

}
