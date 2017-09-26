
package com.stl.touristapp.pojo;



/**
 * BasicDto transfer type used to encapsulate data passed to and from business
 * service interfaces.
 * 
 * @author Sibasis Date : Jan 25, 2012
 */
public class BasicDto extends DtoBaseClass {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userId = null;
	private String password = null;
	private String authToken = null;

	/**
	 * Getter Method for userId
	 * 
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * Setter Method for userId
	 * 
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * Getter Method for authToken
	 * 
	 * @return the authToken
	 */
	public String getAuthToken() {
		return authToken;
	}

	/**
	 * Setter Method for authToken
	 * 
	 * @param authToken
	 *            the authToken to set
	 */
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	/**
	 * Getter Method for password
	 * 
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Setter Method for password
	 * 
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
