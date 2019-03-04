package fr.gestionformation.api.utils;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class GenericRestController<T> {
	
	RestService<T> serv;
	
	public GenericRestController(RestService<T> serv) {
		this.serv = serv;
	}
	
	@GetMapping
	public List<T> getAll() {
		return serv.findAll();
	}
	
	@GetMapping("/{id}")
	public T findById(@PathVariable Long id) {
		return serv.findById(id).orElseGet(()-> null);
	}
	
	@PostMapping
	public T save(@RequestBody T json) {
		return serv.save(json);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		serv.deleteById(id);
	}

}
