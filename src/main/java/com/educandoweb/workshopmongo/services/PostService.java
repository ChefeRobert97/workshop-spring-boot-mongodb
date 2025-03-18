package com.educandoweb.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.workshopmongo.domain.Post;
import com.educandoweb.workshopmongo.repository.PostRepository;
import com.educandoweb.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;
	
	
	public Optional<Post> findById(String id) {
		Optional<Post> user = repository.findById(id);
		if (user ==null) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		return user;
	}
	
	public List<Post> findByTitle(String text) {
		return repository.findByTitleContainingIgnoreCase(text);
	}
}
