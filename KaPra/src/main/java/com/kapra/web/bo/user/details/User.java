/**
 * 
 */
package com.kapra.web.bo.user.details;

import java.sql.Date;
import java.util.List;

/**
 * @author Karan Popat
 *
 */
public class User {

	private String userId;
	private String userFirstName;
	private String userLastName;
	private String userEmailId;
	private Long userMobileNo;
	private Date userDateOfBirth;
	private List<Child> userChildren;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserEmailId() {
		return userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	public Long getUserMobileNo() {
		return userMobileNo;
	}

	public void setUserMobileNo(Long userMobileNo) {
		this.userMobileNo = userMobileNo;
	}

	public Date getUserDateOfBirth() {
		return userDateOfBirth;
	}

	public void setUserDateOfBirth(Date userDateOfBirth) {
		this.userDateOfBirth = userDateOfBirth;
	}

	public List<Child> getUserChildren() {
		return userChildren;
	}

	public void setUserChildren(List<Child> userChildren) {
		this.userChildren = userChildren;
	}

}
