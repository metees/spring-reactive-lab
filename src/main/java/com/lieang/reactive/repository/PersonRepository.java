package com.lieang.reactive.repository;

import com.lieang.reactive.domain.Person;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonRepository {

	Mono<Person> getById(Integer id);
	
	Flux<Person> getAll();

}
