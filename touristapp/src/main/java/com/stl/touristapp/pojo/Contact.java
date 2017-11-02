package com.stl.touristapp.pojo;

import java.util.ArrayList;
/**
 *<p>Title: Contact </p>
 *<p>Description: This is a Model class for Contact</p>
 *<p>Copyright: Copyright (c) 2011</p>
 *<p>Company: Tcubes</p>
 *
 * @author Sibasis
 */
public class Contact implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private int iContactId;
	private String strContactType;
	private String strAddressLine1;
	private String strAddressLine2;
	private String strAddressLine3;
	private String strStreet;
	private String strPOBox;
	private String strCity;
	private int iZipCode;
	private String strState;
	private String strCountry;
	private String strMobileNo;
	private String strHomeContactNo;
	private String strEMailId;
	private String strAltEMailId;
	private String strFaxNo;
	private String strStateName;
	private String strIdTypeCode;
	private String strIdNumber;
	private String strRegion;
	private String strExpDate;
	private ArrayList alBankDetails;


	public Contact(){
	}


	public int getiContactId() {
		return iContactId;
	}


	public void setiContactId(int iContactId) {
		this.iContactId = iContactId;
	}


	public String getStrContactType() {
		return strContactType;
	}


	public void setStrContactType(String strContactType) {
		this.strContactType = strContactType;
	}


	public String getStrAddressLine1() {
		return strAddressLine1;
	}


	public void setStrAddressLine1(String strAddressLine1) {
		this.strAddressLine1 = strAddressLine1;
	}


	public String getStrAddressLine2() {
		return strAddressLine2;
	}


	public void setStrAddressLine2(String strAddressLine2) {
		this.strAddressLine2 = strAddressLine2;
	}


	public String getStrAddressLine3() {
		return strAddressLine3;
	}


	public void setStrAddressLine3(String strAddressLine3) {
		this.strAddressLine3 = strAddressLine3;
	}


	public String getStrStreet() {
		return strStreet;
	}


	public void setStrStreet(String strStreet) {
		this.strStreet = strStreet;
	}


	public String getStrPOBox() {
		return strPOBox;
	}


	public void setStrPOBox(String strPOBox) {
		this.strPOBox = strPOBox;
	}


	public String getStrCity() {
		return strCity;
	}


	public void setStrCity(String strCity) {
		this.strCity = strCity;
	}


	public int getiZipCode() {
		return iZipCode;
	}


	public void setiZipCode(int iZipCode) {
		this.iZipCode = iZipCode;
	}


	public String getStrState() {
		return strState;
	}


	public void setStrState(String strState) {
		this.strState = strState;
	}


	public String getStrCountry() {
		return strCountry;
	}


	public void setStrCountry(String strCountry) {
		this.strCountry = strCountry;
	}


	public String getStrMobileNo() {
		return strMobileNo;
	}


	public void setStrMobileNo(String strMobileNo) {
		this.strMobileNo = strMobileNo;
	}


	public String getStrHomeContactNo() {
		return strHomeContactNo;
	}


	public void setStrHomeContactNo(String strHomeContactNo) {
		this.strHomeContactNo = strHomeContactNo;
	}


	public String getStrEMailId() {
		return strEMailId;
	}


	public void setStrEMailId(String strEMailId) {
		this.strEMailId = strEMailId;
	}


	public String getStrAltEMailId() {
		return strAltEMailId;
	}


	public void setStrAltEMailId(String strAltEMailId) {
		this.strAltEMailId = strAltEMailId;
	}


	public String getStrFaxNo() {
		return strFaxNo;
	}


	public void setStrFaxNo(String strFaxNo) {
		this.strFaxNo = strFaxNo;
	}


	public String getStrStateName() {
		return strStateName;
	}


	public void setStrStateName(String strStateName) {
		this.strStateName = strStateName;
	}


	public String getStrIdTypeCode() {
		return strIdTypeCode;
	}


	public void setStrIdTypeCode(String string) {
		this.strIdTypeCode = string;
	}


	public String getStrIdNumber() {
		return strIdNumber;
	}


	public void setStrIdNumber(String strIdNumber) {
		this.strIdNumber = strIdNumber;
	}


	public String getStrRegion() {
		return strRegion;
	}


	public void setStrRegion(String strRegion) {
		this.strRegion = strRegion;
	}


	public String getStrExpDate() {
		return strExpDate;
	}


	public void setStrExpDate(String strExpDate) {
		this.strExpDate = strExpDate;
	}


	public ArrayList getAlBankDetails() {
		return alBankDetails;
	}


	public void setAlBankDetails(ArrayList alBankDetails) {
		this.alBankDetails = alBankDetails;
	}

	// All getter Methods
}
