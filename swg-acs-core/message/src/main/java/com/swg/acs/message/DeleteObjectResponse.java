/**
 * 
 */
package com.swg.acs.message;

import com.swg.acs.MessageBody;
import com.swg.acs.message.cwmp.ArgumentFactory;
import com.swg.acs.message.cwmp.CwmpMessage;

/**
 * @author satriaprayoga
 *
 */
public class DeleteObjectResponse extends CwmpMessage {

	private static final long serialVersionUID = 8685281520596932341L;
	
	private int status;
	
	public DeleteObjectResponse() {
		super("DeleteObjectResponse");
	}

	/* (non-Javadoc)
	 * @see com.swg.acs.Message#configureBody(com.swg.acs.MessageBody, com.swg.acs.message.cwmp.ArgumentFactory)
	 */
	@Override
	protected void configureBody(MessageBody bodyPart,
			ArgumentFactory argumentFactory) {

	}

	/* (non-Javadoc)
	 * @see com.swg.acs.Message#configureParse(com.swg.acs.MessageBody)
	 */
	@Override
	protected void configureParse(MessageBody messageBody) {
		status=Integer.parseInt(messageBody.getChild("Status").getValue());

	}
	
	public int getStatus() {
		return status;
	}

}
