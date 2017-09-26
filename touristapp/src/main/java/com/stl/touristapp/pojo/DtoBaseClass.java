/*
 *  Copyright (c) 2011 TCube Solutions, All Rights Reserved.
 *
 *  This code is confidential to TCube Solutions and
 *  shall not be disclosed outside the Bank without the
 *  prior written permission of the Director of Technology
 *  Delivery.
 *
 *  In the event that such disclosure is permitted the
 *  code shall not be copied or distributed other than
 *  on a need-to-know basis and any recipients may be
 *  required to sign a confidentiality undertaking in
 *  favour of TCube.
 */

package com.stl.touristapp.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * DtoBaseClass has to be extended by all the Request, Response and Basic type
 * Data Transfer Objects. This Class implements java.io.Serializable
 * 
 * @author Sibasis
 * 
 */
public class DtoBaseClass implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date timeStamp;

	/**
	 * Getter Method for timeStamp
	 * 
	 * @return the timeStamp
	 */
	public Date getTimeStamp() {
		return timeStamp;
	}

	/**
	 * Setter Method for timeStamp
	 * 
	 * @param timeStamp
	 *            the timeStamp to set
	 */
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

}
