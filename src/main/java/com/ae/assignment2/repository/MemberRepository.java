package com.ae.assignment2.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.ae.assignment2.model.Member;

@Repository
public interface MemberRepository extends ReactiveMongoRepository<Member, String> {

}
