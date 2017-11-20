/**
 * 
 */
package com.ymt.pz365.message;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhailiang
 *
 */
@Configuration
@EnableBinding(MessageChannels.class)
public class MessageConfig {

}
