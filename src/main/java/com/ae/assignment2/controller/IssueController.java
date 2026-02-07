package com.ae.assignment2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ae.assignment2.model.Issue;
import com.ae.assignment2.service.IssueService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("issues")
@RestController
public class IssueController {

	@Autowired
	private IssueService issueService;

	@GetMapping
	public Flux<Issue> getAll() {
		System.out.println("All the issues information");
		return issueService.getAll();
	}

	@GetMapping("{id}")
	public Mono<Issue> findById(@PathVariable("id") final String id) {
		System.out.println("One issue information based on the given ID");
		return issueService.getById(id);
	}

	@PutMapping("{id}")
	public Mono<Issue> updateById(@PathVariable("id") final String id, @RequestBody final Issue issue) {
		System.out.println("Updating an issue Info");
		return issueService.update(id, issue);
	}

	@PostMapping
	public Mono<Issue> save(@RequestBody final Issue issue) {
		System.out.println("Added issue Info: " + issue.getIssueId() + " - BookId: " + issue.getBookId()
				+ " - MemberId: " + issue.getMembId() + " - Due: " + issue.getDueDate());
		return issueService.save(issue);
	}

}
