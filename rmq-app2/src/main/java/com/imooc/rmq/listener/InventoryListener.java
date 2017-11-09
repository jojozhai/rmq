/**
 * 
 */
package com.imooc.rmq.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.imooc.rmq.service.InventoryService;

/**
 * @author zhailiang
 *
 */
@Component
public class InventoryListener {
	
	@Autowired 
	private InventoryService inventoryService;
	
	@RabbitListener(queues = "order")
    public void processMessage(String content) {
        System.out.println("receive message:"+content);
        inventoryService.minus(1L, 1);
    }

}
