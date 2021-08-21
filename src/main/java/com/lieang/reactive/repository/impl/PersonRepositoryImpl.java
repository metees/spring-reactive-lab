package com.lieang.reactive.repository.impl;

import com.lieang.reactive.domain.Person;
import com.lieang.reactive.repository.PersonRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class PersonRepositoryImpl implements PersonRepository {

	@Override
	public Mono<Person> getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<Person> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
