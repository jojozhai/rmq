/**
 * 
 */
package com.ymt.pz365.message.event.user;

import java.io.Serializable;

/**
 * @author zhailiang
 *
 */
public class UserRegistEvent implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8327988039535074510L;
	
	private Long id;

	public UserRegistEvent(Long id) {
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	

}
