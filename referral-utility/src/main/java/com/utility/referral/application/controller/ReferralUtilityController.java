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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.utility.referral.application.model.Referral;
import com.utility.referral.application.repository.ReferralUtilityRepository;

@RestController
@RequestMapping("/referral-service")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class ReferralUtilityController {

	@Autowired
	private ReferralUtilityRepository repository;

	@GetMapping("/fetchReferral/{id}")
	public Optional<Referral> fetchReferral(@PathVariable String id) {
		return repository.findById(id);
	}

	@PostMapping("/createRef")
	public void createReferral(@RequestBody Referral referral) {
		repository.save(referral);

	}

	@GetMapping("/getAllReferrals")
	public List<Referral> getAllReferrals() {
		return repository.findAll();
	}

	@GetMapping("/getReferralsForProduct/{state}/{line}/{company}")
	public List<Referral> getReferralForProduct(@PathVariable String state, @PathVariable String line,
			@PathVariable String company) {
		return repository.findByStateAndLineAndCompany(state, line, company);
	}

	@DeleteMapping("/deleteReferral/{id}")
	@CrossOrigin(origins = "*",methods =RequestMethod.DELETE)
	public List<Referral> deleteReferral(@PathVariable String id) {
		repository.deleteById(id);
		return repository.findAll();

	}

	@DeleteMapping("/deleteAllReferral")
	public void deleteAllReferral() {
		repository.deleteAll();
	}
}
