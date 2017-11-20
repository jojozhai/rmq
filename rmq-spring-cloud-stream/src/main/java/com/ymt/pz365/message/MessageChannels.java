/**
 * 
 */
package com.ymt.pz365.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author zhailiang
 *
 */
public interface MessageChannels {
	
	String USER_REGIST_EVENT_OUTPUT_CHANNEL = "user_regist";
	
	String ORDER_COMPLETE_EVENT_INPUT_CHANNEL = "order_complete";
	
    @Input(ORDER_COMPLETE_EVENT_INPUT_CHANNEL)
    SubscribableChannel orderCompleteEventInputChannel();

    @Output(USER_REGIST_EVENT_OUTPUT_CHANNEL) 
    MessageChannel userRegistEventOutputChannel();

}
