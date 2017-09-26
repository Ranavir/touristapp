package com.stl.touristapp.pojo;

import java.sql.Date;

/**
 * @author Nibedita
 * @description
 * @date Nov 17, 2011
 *
 */
public class MemberLoyaltyCardDetailsDto {
	private int cardNumbeId;
	private String cardName;
	private int loyaltyId;
	private int cardTypeId;
	private String cardNumber;
	private Date dateProcessed;
	private Date dateOrdered;
	private Date dateIssued;
	private String replacementReason;
	private Date validFromDate;
	private Date validToDate;
	private int statusId;
	private String updatedBy;
	private Date updatedTimeStamp;
	/**
	 * @return  cardNumbeId
	 */
	public int getCardNumbeId() {
		return cardNumbeId;
	}
	/**
	 * @param cardNumbeId 
	 */
	public void setCardNumbeId(int cardNumbeId) {
		this.cardNumbeId = cardNumbeId;
	}
	/**
	 * @return  cardName
	 */
	public String getCardName() {
		return cardName;
	}
	/**
	 * @param cardName 
	 */
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	/**
	 * @return  loyaltyId
	 */
	public int getLoyaltyId() {
		return loyaltyId;
	}
	/**
	 * @param loyaltyId 
	 */
	public void setLoyaltyId(int loyaltyId) {
		this.loyaltyId = loyaltyId;
	}
	/**
	 * @return  cardTypeId
	 */
	public int getCardTypeId() {
		return cardTypeId;
	}
	/**
	 * @param cardTypeId 
	 */
	public void setCardTypeId(int cardTypeId) {
		this.cardTypeId = cardTypeId;
	}
	/**
	 * @return  cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}
	/**
	 * @param cardNumber 
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	/**
	 * @return  dateProcessed
	 */
	public Date getDateProcessed() {
		return dateProcessed;
	}
	/**
	 * @param dateProcessed 
	 */
	public void setDateProcessed(Date dateProcessed) {
		this.dateProcessed = dateProcessed;
	}
	/**
	 * @return  dateOrdered
	 */
	public Date getDateOrdered() {
		return dateOrdered;
	}
	/**
	 * @param dateOrdered 
	 */
	public void setDateOrdered(Date dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	/**
	 * @return  dateIssued
	 */
	public Date getDateIssued() {
		return dateIssued;
	}
	/**
	 * @param dateIssued 
	 */
	public void setDateIssued(Date dateIssued) {
		this.dateIssued = dateIssued;
	}
	/**
	 * @return  replacementReason
	 */
	public String getReplacementReason() {
		return replacementReason;
	}
	/**
	 * @param replacementReason 
	 */
	public void setReplacementReason(String replacementReason) {
		this.replacementReason = replacementReason;
	}
	/**
	 * @return  validFromDate
	 */
	public Date getValidFromDate() {
		return validFromDate;
	}
	/**
	 * @param validFromDate 
	 */
	public void setValidFromDate(Date validFromDate) {
		this.validFromDate = validFromDate;
	}
	/**
	 * @return  validToDate
	 */
	public Date getValidToDate() {
		return validToDate;
	}
	/**
	 * @param validToDate 
	 */
	public void setValidToDate(Date validToDate) {
		this.validToDate = validToDate;
	}
	/**
	 * @return  statusId
	 */
	public int getStatusId() {
		return statusId;
	}
	/**
	 * @param statusId 
	 */
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	/**
	 * @return  updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}
	/**
	 * @param updatedBy 
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	/**
	 * @return  updatedTimeStamp
	 */
	public Date getUpdatedTimeStamp() {
		return updatedTimeStamp;
	}
	/**
	 * @param updatedTimeStamp 
	 */
	public void setUpdatedTimeStamp(Date updatedTimeStamp) {
		this.updatedTimeStamp = updatedTimeStamp;
	}
}
