package com.utility.referral.application.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.utility.referral.application.model.Referral;
import com.utility.referral.application.repository.ReferralUtilityRepository;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ReferralUtilityController {
	
	@Autowired
	private ReferralUtilityRepository repository;
	
	@GetMapping("/fetchReferral/{referralCode}")
	public Optional<Referral> fetchReferral(@PathVariable String referralCode) {
		return repository.findByReferralCode(referralCode);
	}
	
	@PostMapping("/createRef")
	public void createReferral(@RequestBody Referral referral) {
		Referral myReferral = repository.save(referral);
		System.out.println("Referral Created Successfully..."+myReferral.toString());

	}
	
	@GetMapping("/getAllReferrals")
	public List<Referral> getAllReferrals(){
		return repository.findAll();
	}
	
	@GetMapping("/getReferralsForProduct/{state}/{line}/{company}")
	public List<Referral> getReferralForProduct(@PathVariable String state,@PathVariable String line,@PathVariable String company){
		return repository.findByStateAndLineAndCompany(state, line, company);
	}
	
	@DeleteMapping("/deleteReferral/{id}")
	public void deleteReferral(@PathVariable String id) {
		repository.deleteById(id);
	}

}
