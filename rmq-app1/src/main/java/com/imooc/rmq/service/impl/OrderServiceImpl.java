/**
 * 
 */
package com.imooc.rmq.service.impl;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.rmq.service.OrderService;

/**
 * @author zhailiang
 *
 */
@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	/* (non-Javadoc)
	 * @see com.imooc.rmq.service.OrderService#create()
	 */
	@Override
	public void create() {
		System.out.println("create order");
		amqpTemplate.convertAndSend("order", "order created");
	}

}
