package com.ae.assignment2.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.ae.assignment2.model.Issue;

@Repository
public interface IssueRepository extends ReactiveMongoRepository<Issue, String> {

}
