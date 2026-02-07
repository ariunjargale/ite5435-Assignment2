package com.ae.assignment2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ae.assignment2.model.Member;
import com.ae.assignment2.service.MemberService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("members")
@RestController
public class MemberController {

	@Autowired
	private MemberService memberService;

	@GetMapping
	public Flux<Member> getAll() {
		System.out.println("All the members information");
		return memberService.getAll();
	}

	@GetMapping("{id}")
	public Mono<Member> findById(@PathVariable("id") final String id) {
		System.out.println("One member information based on the given ID");
		return memberService.getById(id);
	}

	@PutMapping("{id}")
	public Mono<Member> updateById(@PathVariable("id") final String id, @RequestBody final Member member) {
		System.out.println("Updating a member Info");
		return memberService.update(id, member);
	}

	@PostMapping
	public Mono<Member> save(@RequestBody final Member member) {
		System.out.println(
				"Added member Info: " + member.getMembId() + " - " + member.getName() + " - " + member.getMembType());
		return memberService.save(member);
	}

}
