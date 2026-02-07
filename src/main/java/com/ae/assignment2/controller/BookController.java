package com.ae.assignment2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ae.assignment2.model.Book;
import com.ae.assignment2.service.BookService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("books")
@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping
	public Flux<Book> getAll() {
		System.out.println("All the books information");
		return bookService.getAll();
	}

	@GetMapping("{id}")
	public Mono<Book> findById(@PathVariable("id") final String id) {
		System.out.println("One book information based on the given ID");
		return bookService.getById(id);
	}

	@PutMapping("{id}")
	public Mono<Book> updateById(@PathVariable("id") final String id, @RequestBody final Book book) {
		System.out.println("Updating a book Info");
		return bookService.update(id, book);
	}

	@PostMapping
	public Mono<Book> save(@RequestBody final Book book) {
		System.out.println("Added book Info: " + book.getBookId() + " - " + book.getTitle() + " - " + book.getAuthor()
				+ " - " + book.getPrice());
		return bookService.save(book);
	}

}