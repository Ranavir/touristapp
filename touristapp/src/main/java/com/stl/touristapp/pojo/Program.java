/*
 *  Copyright (c) 2011 TCube Solutions, All Rights Reserved.
 *
 *  This code is confidential to TCube Solutions and
 *  shall not be disclosed outside the TCube without the
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

import java.sql.Date;

/**
 * @author Nibedita
 * Date : Nov 28, 2011
 */
public class Program {
	private int programId;
	private String programCode;
	private String programName;
	private String programDescription;
	private String programNotes;
	private Date startDate;
	private Date endDate;
	private int statusId;
	private String updatedBy;
	private Date updatedTimestamp;
	/**
	 * Getter Method for programId
	 * @return the programId
	 */
	public int getProgramId() {
		return programId;
	}
	/**
	 * Setter Method for programId
	 * @param programId the programId to set
	 */
	public void setProgramId(int programId) {
		this.programId = programId;
	}
	/**
	 * Getter Method for programCode
	 * @return the programCode
	 */
	public String getProgramCode() {
		return programCode;
	}
	/**
	 * Setter Method for programCode
	 * @param programCode the programCode to set
	 */
	public void setProgramCode(String programCode) {
		this.programCode = programCode;
	}
	/**
	 * Getter Method for programName
	 * @return the programName
	 */
	public String getProgramName() {
		return programName;
	}
	/**
	 * Setter Method for programName
	 * @param programName the programName to set
	 */
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	/**
	 * Getter Method for programDescription
	 * @return the programDescription
	 */
	public String getProgramDescription() {
		return programDescription;
	}
	/**
	 * Setter Method for programDescription
	 * @param programDescription the programDescription to set
	 */
	public void setProgramDescription(String programDescription) {
		this.programDescription = programDescription;
	}
	/**
	 * Getter Method for programNotes
	 * @return the programNotes
	 */
	public String getProgramNotes() {
		return programNotes;
	}
	/**
	 * Setter Method for programNotes
	 * @param programNotes the programNotes to set
	 */
	public void setProgramNotes(String programNotes) {
		this.programNotes = programNotes;
	}
	/**
	 * Getter Method for startDate
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * Setter Method for startDate
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * Getter Method for endDate
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}
	/**
	 * Setter Method for endDate
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	/**
	 * Getter Method for statusId
	 * @return the statusId
	 */
	public int getStatusId() {
		return statusId;
	}
	/**
	 * Setter Method for statusId
	 * @param statusId the statusId to set
	 */
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	/**
	 * Getter Method for updatedBy
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}
	/**
	 * Setter Method for updatedBy
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	/**
	 * Getter Method for updatedTimestamp
	 * @return the updatedTimestamp
	 */
	public Date getUpdatedTimestamp() {
		return updatedTimestamp;
	}
	/**
	 * Setter Method for updatedTimestamp
	 * @param updatedTimestamp the updatedTimestamp to set
	 */
	public void setUpdatedTimestamp(Date updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}
}
