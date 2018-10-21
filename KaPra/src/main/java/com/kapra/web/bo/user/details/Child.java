package com.kapra.web.bo.user.details;

import java.sql.Date;

/**
 * @author Karan Popat
 *
 */
public class Child {

	private String childFirstName;
	private String childLastName;
	private Date childDOB;
	private GenderLookup childGenderLookup;
	private Integer childAge;
	private User childParent;

	public String getChildFirstName() {
		return childFirstName;
	}

	public void setChildFirstName(String childFirstName) {
		this.childFirstName = childFirstName;
	}

	public String getChildLastName() {
		return childLastName;
	}

	public void setChildLastName(String childLastName) {
		this.childLastName = childLastName;
	}

	public Date getChildDOB() {
		return childDOB;
	}

	public void setChildDOB(Date childDOB) {
		this.childDOB = childDOB;
	}

	public GenderLookup getChildGenderLookup() {
		return childGenderLookup;
	}

	public void setChildGenderLookup(GenderLookup childGenderLookup) {
		this.childGenderLookup = childGenderLookup;
	}

	public Integer getChildAge() {
		return childAge;
	}

	public void setChildAge(Integer childAge) {
		this.childAge = childAge;
	}

	public User getChildParent() {
		return childParent;
	}

	public void setChildParent(User childParent) {
		this.childParent = childParent;
	}

}
