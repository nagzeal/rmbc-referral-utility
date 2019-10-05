package com.utility.referral.application.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

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
	
}
