/**
 * 
 */
package com.imooc.rmq.service.impl;

import org.springframework.stereotype.Service;

import com.imooc.rmq.service.InventoryService;

/**
 * @author zhailiang
 *
 */
@Service
public class InventoryServiceImpl implements InventoryService {

	/* (non-Javadoc)
	 * @see com.imooc.rmq.service.InventoryService#add(long, int)
	 */
	@Override
	public void minus(long productId, int count) {
		System.out.println("change inventory");
	}

}
