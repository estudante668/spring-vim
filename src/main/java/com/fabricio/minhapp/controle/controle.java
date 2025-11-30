package com.fabricio.minhapp.controle;

import java.util.concurrent.atomic.AtomicLong;
import com.fabricio.minhapp.modelo.OlaMundo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controle {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/olamundo")
	public OlaMundo om(@RequestParam(defaultValue = "World") String nome) {
		return new OlaMundo(counter.incrementAndGet(), String.format(template, nome));
	}
}
