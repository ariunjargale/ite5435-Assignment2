package com.ae.assignment2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ae.assignment2.model.Issue;
import com.ae.assignment2.repository.IssueRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class IssueService {

	@Autowired
	private IssueRepository issueRepo;

	public Flux<Issue> getAll() {
		return issueRepo.findAll().switchIfEmpty(Flux.empty());
	}

	public Mono<Issue> getById(final String id) {
		return issueRepo.findById(id);
	}

	public Mono<Issue> update(final String id, final Issue issue) {
		return issueRepo.save(issue);
	}

	public Mono<Issue> save(final Issue issue) {
		return issueRepo.save(issue);
	}

}
