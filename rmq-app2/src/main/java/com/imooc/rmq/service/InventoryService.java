/**
 * 
 */
package com.imooc.rmq.service;

/**
 * @author zhailiang
 *
 */
public interface InventoryService {
	
	void minus(long productId, int count);

}
