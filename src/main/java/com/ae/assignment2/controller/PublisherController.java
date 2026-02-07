package com.ae.assignment2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ae.assignment2.model.Publisher;
import com.ae.assignment2.service.PublisherService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("publishers")
@RestController
public class PublisherController {

	@Autowired
	private PublisherService publisherService;

	@GetMapping
	public Flux<Publisher> getAll() {
		System.out.println("All the publishers information");
		return publisherService.getAll();
	}

	@GetMapping("{id}")
	public Mono<Publisher> findById(@PathVariable("id") final String id) {
		System.out.println("One publisher information based on the given ID");
		return publisherService.getById(id);
	}

	@PutMapping("{id}")
	public Mono<Publisher> updateById(@PathVariable("id") final String id, @RequestBody final Publisher publisher) {
		System.out.println("Updating a publisher Info");
		return publisherService.update(id, publisher);
	}

	@PostMapping
	public Mono<Publisher> save(@RequestBody final Publisher publisher) {
		System.out.println("Added publisher Info: " + publisher.getPubId() + " - " + publisher.getName() + " - "
				+ publisher.getAddress());
		return publisherService.save(publisher);
	}

}
