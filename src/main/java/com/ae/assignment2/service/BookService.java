package com.ae.assignment2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ae.assignment2.model.Book;
import com.ae.assignment2.repository.BookRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepo;

	public Flux<Book> getAll() {
		return bookRepo.findAll().switchIfEmpty(Flux.empty());
	}

	public Mono<Book> getById(final String id) {
		return bookRepo.findById(id);
	}

	public Mono<Book> update(final String id, final Book book) {
		return bookRepo.save(book);
	}

	public Mono<Book> save(final Book book) {
		return bookRepo.save(book);
	}

}