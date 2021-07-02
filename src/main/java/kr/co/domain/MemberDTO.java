package kr.co.domain;

import java.io.Serializable;

public class MemberDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userId;
	private String userPw;
	private String userName;
	private String phoneNum;
	private String email;
	private String sex;
	private String regdate;
	private String updateDate;
	private String keepItem;
	private String likeItem;
	private int levelCount;
	
	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}

	public MemberDTO(String userId, String userPw, String userName, String phoneNum, String email, String sex,
			String regdate, String updateDate, String keepItem, String likeItem, int levelCount) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.phoneNum = phoneNum;
		this.email = email;
		this.sex = sex;
		this.regdate = regdate;
		this.updateDate = updateDate;
		this.keepItem = keepItem;
		this.likeItem = likeItem;
		this.levelCount = levelCount;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getKeepItem() {
		return keepItem;
	}

	public void setKeepItem(String keepItem) {
		this.keepItem = keepItem;
	}

	public String getLikeItem() {
		return likeItem;
	}

	public void setLikeItem(String likeItem) {
		this.likeItem = likeItem;
	}

	public int getLevelCount() {
		return levelCount;
	}

	public void setLevelCount(int levelCount) {
		this.levelCount = levelCount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberDTO other = (MemberDTO) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	
}
