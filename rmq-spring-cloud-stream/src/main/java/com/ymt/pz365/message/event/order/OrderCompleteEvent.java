/**
 * 
 */
package com.ymt.pz365.message.event.order;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 订单完成事件
 * 
 * @author zhailiang
 *
 */
public class OrderCompleteEvent implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8672755452329255359L;

	/**
	 * 订单id
	 */
	private Long orderId;
	/**
	 * 用户id
	 */
	private Long userId;
	/**
	 * 订单金额
	 */
	private BigDecimal amount;

	/**
	 * @return the orderId
	 */
	public Long getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
}
