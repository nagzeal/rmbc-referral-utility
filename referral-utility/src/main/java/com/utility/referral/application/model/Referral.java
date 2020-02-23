package com.utility.referral.application.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Document(collection = "Referral")
public class Referral {

	@Id
	public String id;

    public String referralCode;

	public String referralReason;

	public String state;

	public String line;

	public String company;

	public String status;

	public Referral() {
	}

	public Referral(String id, String referralCode, String referralReason, String state, String line, String company,
			String status) {
		this.id = id;
		this.referralCode = referralCode;
		this.referralReason = referralReason;
		this.state = state;
		this.line = line;
		this.company = company;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Referral [id=" + id + ", referralCode=" + referralCode + ", referralReason=" + referralReason
				+ ", state=" + state + ", line=" + line + ", company=" + company + ", status=" + status + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getReferralCode() {
		return referralCode;
	}

	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
	}

	public String getReferralReason() {
		return referralReason;
	}

	public void setReferralReason(String referralReason) {
		this.referralReason = referralReason;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
