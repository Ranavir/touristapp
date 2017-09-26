package com.stl.touristapp.pojo;

import java.sql.Date;



/**
 *
 * MemberDetailsDto transfer type used to encapsulate data passed to and from business
 * service interfaces.
 * 
 * @author Nibedita
 * @date Nov 17, 2011
 *
 */
public class MemberDetailsDto extends BasicDto{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * This integer refers to the member loyalty Id.
	 */
	private int loyaltyId;
	/**
	 * This String refers to the member loyalty Member Id.
	 */
	private String loyaltyMemberId;
	/**
	 * This integer refers to the member customer Id.
	 */
	private int evaluatCustomerId;
	/**
	 * This String refers to the member password.
	 */
	private String memberPassword;
	/**
	 * This String refers to the member preferred Customer.
	 */
	private String preferredCustomerToEvaluat;
	/**
	 * This Integer refers to the member status Id.
	 */
	private int statusId;
	/**
	 * This date refers to the member enrolled Date.
	 */
	private Date enrolledDate;
	/**
	 * This date refers to the member Re-enrolled Date.
	 */
	private Date reEnrolledDate;
	/**
	 * This Integer refers to the member program Id.
	 */
	private int programId;
	/**
	 * This Integer refers to the member Tier Id.
	 */
	private int tierId;
	/**
	 * This character refers to check 
	 * whether the member belongs to vip or not.
	 */
	private char vipFlag='N';
	/**
	 * This Integer refers to the member category id.
	 */
	private int commnCategoryId;
	/**
	 * This Integer refers to the member points balance.
	 */
	private int pointsBalance;
	/**
	 * This Integer refers to the language Id used by the member.
	 */
	private int languageId;
	/**
	 * This character refers to the whether the terms of service is accepted or not.
	 */
	private char isTodAccepted;
	/**
	 * This String refers to the member image url.
	 */
	private String imgUrl;
	/**
	 * This String refers to the name updated by the member.
	 */
	private String updatedBy;
	/**
	 * This refers to the date updated by the member.
	 */
	private Date updatedTimeStamp;
	/**
	 * This String refers to the member user Id.
	 */
	private String userId;
	/**
	 * The character refers to the member gender.
	 */
	private char gender;
	/**
	 * This refers to the last login date by the member.
	 */
	private Date lastLoginDate;
	/**
	 * This refers to the member group name.
	 */
	private char isCG='N';
	/**
	 * This String refers to the member group name.
	 */
	private String groupName;
	/**
	 * This Integer refers to the member 
	 * login counter(how many times the user login).
	 */
	private int loginCount;
	/**
	 * This string refers to the member secret question 
	 * during forgot password.
	 */
	private String secretQuestion;
	/**
	 * This string refers to the member secret answer 
	 * during forgot password.
	 */
	private String secretAnswer;
	/**
	 * This character refers to check whether the poll accepted.
	 */
	private char isPollAccepted;
	/**
	 * This integer refers to the change balance .
	 */
	private int changeBalance;
	/**
	 * This boolean refers to check the member login .
	 */
	private boolean login=false;
	/**
	 * This integer refers to member branch.
	 */
	private int branch;
	/**
	 * This string refers to member branch code.
	 */
	private String branchCode;
	/**
	 * The string refers to member branch name.
	 */
	private String branchName;
	/**
	 * This boolean refers to whether the 
	 * member Login for the first time or not.
	 */
	private boolean firstTimeLogin=false;
	/**
	 * This String refers to the member card number.
	 */
	private String cardNumber;
	/**
	 * This String refers to the member new password.
	 */
	private String newPassword;
	
	/**
	 * @return the firstTimeLogin
	 */
	public boolean isFirstTimeLogin() {
		return firstTimeLogin;
	}
	/**
	 * @param firstTimeLogin the firstTimeLogin to set
	 */
	public void setFirstTimeLogin(boolean firstTimeLogin) {
		this.firstTimeLogin = firstTimeLogin;
	}
	/**
	 * Getter Method for branch
	 * @return the branch
	 */
	public int getBranch() {
		return branch;
	}
	/**
	 * Setter Method for branch
	 * @param branch the branch to set
	 */
	public void setBranch(int branch) {
		this.branch = branch;
	}
	/**
	 * Getter Method for branchCode
	 * @return the branchCode
	 */
	public String getBranchCode() {
		return branchCode;
	}
	/**
	 * Setter Method for branchCode
	 * @param branchCode the branchCode to set
	 */
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	/**
	 * Getter Method for branchName
	 * @return the branchName
	 */
	public String getBranchName() {
		return branchName;
	}
	/**
	 * Setter Method for branchName
	 * @param branchName the branchName to set
	 */
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	private Contact contact=new Contact();
	private Tier tier=new Tier();
	private Program program=new Program();
	MemberLoyaltyCardDetailsDto memberLoyaltyCardDetailsDto=new MemberLoyaltyCardDetailsDto();
		/**
	 * Getter Method for contact
	 * @return the contact
	 */
	public Contact getContact() {
		return contact;
	}
	/**
	 * Setter Method for contact
	 * @param contact the contact to set
	 */
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	/**
	 * Getter Method for tier
	 * @return the tier
	 */
	public Tier getTier() {
		return tier;
	}
	/**
	 * Setter Method for tier
	 * @param tier the tier to set
	 */
	public void setTier(Tier tier) {
		this.tier = tier;
	}
	/**
	 * Getter Method for program
	 * @return the program
	 */
	public Program getProgram() {
		return program;
	}
	/**
	 * Setter Method for program
	 * @param program the program to set
	 */
	public void setProgram(Program program) {
		this.program = program;
	}
	/**
	 * Getter Method for memberLoyaltyCardDetailsDto
	 * @return the memberLoyaltyCardDetailsDto
	 */
	public MemberLoyaltyCardDetailsDto getMemberLoyaltyCardDetailsDto() {
		return memberLoyaltyCardDetailsDto;
	}
	/**
	 * Setter Method for memberLoyaltyCardDetailsDto
	 * @param memberLoyaltyCardDetailsDto the memberLoyaltyCardDetailsDto to set
	 */
	public void setMemberLoyaltyCardDetailsDto(
			MemberLoyaltyCardDetailsDto memberLoyaltyCardDetailsDto) {
		this.memberLoyaltyCardDetailsDto = memberLoyaltyCardDetailsDto;
	}
		/**
	 * @return the login
	 */
	public boolean isLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(boolean login) {
		this.login = login;
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
	 * @return  loyaltyMemberId
	 */
	public String getLoyaltyMemberId() {
		return loyaltyMemberId;
	}
	/**
	 * @param loyaltyMemberId 
	 */
	public void setLoyaltyMemberId(String loyaltyMemberId) {
		this.loyaltyMemberId = loyaltyMemberId;
	}
	/**
	 * @return  evaluatCustomerId
	 */
	public int getEvaluatCustomerId() {
		return evaluatCustomerId;
	}
	/**
	 * @param evaluatCustomerId 
	 */
	public void setEvaluatCustomerId(int evaluatCustomerId) {
		this.evaluatCustomerId = evaluatCustomerId;
	}
	/**
	 * @return  memberPassword
	 */
	public String getMemberPassword() {
		return memberPassword;
	}
	/**
	 * @param memberPassword 
	 */
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	/**
	 * @return  preferredCustomerToEvaluat
	 */
	public String getPreferredCustomerToEvaluat() {
		return preferredCustomerToEvaluat;
	}
	/**
	 * @param preferredCustomerToEvaluat 
	 */
	public void setPreferredCustomerToEvaluat(String preferredCustomerToEvaluat) {
		this.preferredCustomerToEvaluat = preferredCustomerToEvaluat;
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
	 * @return  enrolledDate
	 */
	public Date getEnrolledDate() {
		return enrolledDate;
	}
	/**
	 * @param enrolledDate 
	 */
	public void setEnrolledDate(Date enrolledDate) {
		this.enrolledDate = enrolledDate;
	}
	/**
	 * @return  reEnrolledDate
	 */
	public Date getReEnrolledDate() {
		return reEnrolledDate;
	}
	/**
	 * @param reEnrolledDate 
	 */
	public void setReEnrolledDate(Date reEnrolledDate) {
		this.reEnrolledDate = reEnrolledDate;
	}
	/**
	 * @return  programId
	 */
	public int getProgramId() {
		return programId;
	}
	/**
	 * @param programId 
	 */
	public void setProgramId(int programId) {
		this.programId = programId;
	}
	/**
	 * @return  tierId
	 */
	public int getTierId() {
		return tierId;
	}
	/**
	 * @param tierId 
	 */
	public void setTierId(int tierId) {
		this.tierId = tierId;
	}
	/**
	 * @return  vipFlag
	 */
	public char getVipFlag() {
		return vipFlag;
	}
	/**
	 * @param vipFlag 
	 */
	public void setVipFlag(char vipFlag) {
		this.vipFlag = vipFlag;
	}
	/**
	 * @return  commnCategoryId
	 */
	public int getCommnCategoryId() {
		return commnCategoryId;
	}
	/**
	 * @param commnCategoryId 
	 */
	public void setCommnCategoryId(int commnCategoryId) {
		this.commnCategoryId = commnCategoryId;
	}
	/**
	 * @return  pointsBalance
	 */
	public int getPointsBalance() {
		return pointsBalance;
	}
	/**
	 * @param pointsBalance 
	 */
	public void setPointsBalance(int pointsBalance) {
		this.pointsBalance = pointsBalance;
	}
	/**
	 * @return  languageId
	 */
	public int getLanguageId() {
		return languageId;
	}
	/**
	 * @param languageId 
	 */
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
	/**
	 * @return  isTodAccepted
	 */
	public char getIsTodAccepted() {
		return isTodAccepted;
	}
	/**
	 * @param isTodAccepted 
	 */
	public void setIsTodAccepted(char isTodAccepted) {
		this.isTodAccepted = isTodAccepted;
	}
	/**
	 * @return  imgUrl
	 */
	public String getImgUrl() {
		return imgUrl;
	}
	/**
	 * @param imgUrl 
	 */
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
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
	/**
	 * @return  userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId 
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return  gender
	 */
	public char getGender() {
		return gender;
	}
	/**
	 * @param gender 
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}
	/**
	 * @return  lastLoginDate
	 */
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	/**
	 * @param lastLoginDate 
	 */
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	/**
	 * @return  isCG
	 */
	public char getIsCG() {
		return isCG;
	}
	/**
	 * @param isCG 
	 */
	public void setIsCG(char isCG) {
		this.isCG = isCG;
	}
	/**
	 * @return  groupName
	 */
	public String getGroupName() {
		return groupName;
	}
	/**
	 * @param groupName 
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	/**
	 * @return  loginCount
	 */
	public int getLoginCount() {
		return loginCount;
	}
	/**
	 * @param loginCount 
	 */
	public void setLoginCount(int loginCount) {
		this.loginCount = loginCount;
	}
	/**
	 * @return  secretQuestion
	 */
	public String getSecretQuestion() {
		return secretQuestion;
	}
	/**
	 * @param secretQuestion 
	 */
	public void setSecretQuestion(String secretQuestion) {
		this.secretQuestion = secretQuestion;
	}
	/**
	 * @return  secretAnswer
	 */
	public String getSecretAnswer() {
		return secretAnswer;
	}
	/**
	 * @param secretAnswer 
	 */
	public void setSecretAnswer(String secretAnswer) {
		this.secretAnswer = secretAnswer;
	}
	/**
	 * @return  isPollAccepted
	 */
	public char getIsPollAccepted() {
		return isPollAccepted;
	}
	/**
	 * @param isPollAccepted 
	 */
	public void setIsPollAccepted(char isPollAccepted) {
		this.isPollAccepted = isPollAccepted;
	}
	/**
	 * @return  changeBalance
	 */
	public int getChangeBalance() {
		return changeBalance;
	}
	/**
	 * @param changeBalance 
	 */
	public void setChangeBalance(int changeBalance) {
		this.changeBalance = changeBalance;
	}
	/**
	 * Getter Method for cardNumber
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}
	/**
	 * Setter Method for cardNumber
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	/**
	 * Getter Method for newPassword
	 * @return the newPassword
	 */
	public String getNewPassword() {
		return newPassword;
	}
	/**
	 * Setter Method for newPassword
	 * @param newPassword the newPassword to set
	 */
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
	
}
