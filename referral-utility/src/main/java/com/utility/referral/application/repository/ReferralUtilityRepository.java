package com.utility.referral.application.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.utility.referral.application.model.Referral;

public interface ReferralUtilityRepository extends MongoRepository<Referral, String>{

	Optional<Referral> findByReferralCode(String referralCode);
	
	List<Referral> findByStateAndLineAndCompany(String state, String line, String company);
	
	List findAllById(String string);

	List deleteByreferralCode(String referralCode);
	
}
