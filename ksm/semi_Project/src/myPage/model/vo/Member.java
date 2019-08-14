package myPage.model.vo;

import java.util.Date;

public class Member implements java.io.Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6416118073311618904L;
	private String userId;
	private String userPwd;
	private String userName;
	private String birthDate;
	private String gender;
	private String email;
	private String phone;
	private String address;
	private Date joinDate;
	private String withdrawal;
	private String blackCode;
	
	public Member() {
		
	}
	public Member(String userId, String userPwd, String email, String phone, String address) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	

	public Member(String userId, String userPwd, String userName, String birthDate, String gender, String email,
			String phone, String address) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.birthDate = birthDate;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}



	public Member(String userId, String userPwd, String userName, String birthDate, String gender, String email,
			String phone, String address, Date joinDate, String withdrawal, String blackCode) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.birthDate = birthDate;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.joinDate = joinDate;
		this.withdrawal = withdrawal;
		this.blackCode = blackCode;
	}



	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public String getWithdrawal() {
		return withdrawal;
	}

	public void setWithdrawal(String withdrawal) {
		this.withdrawal = withdrawal;
	}

	public String getBlackCode() {
		return blackCode;
	}

	public void setBlackCode(String blackCode) {
		this.blackCode = blackCode;
	}



	@Override
	public String toString() {
		return "Member [userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName + ", birthDate="
				+ birthDate + ", gender=" + gender + ", email=" + email + ", phone=" + phone + ", address=" + address
				+ ", joinDate=" + joinDate + ", withdrawal=" + withdrawal + ", blackCode=" + blackCode + "]";
	}
	
	
	
}
