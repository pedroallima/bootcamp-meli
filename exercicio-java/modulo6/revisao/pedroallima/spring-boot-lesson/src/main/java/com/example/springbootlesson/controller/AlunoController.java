package com.example.springbootlesson.controller;
import java.net.URI;

import com.example.springbootlesson.dto.AlunoDto;
import com.example.springbootlesson.entity.Aluno;
import com.example.springbootlesson.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;


@RestController
@RequestMapping("/alunos")
public class AlunoController {

	@Autowired
	private AlunoService alunoService; //injeção de dependencia + inversão de controle
	
	@PostMapping("/cadastra")
	public ResponseEntity<AlunoDto> cadastra(@RequestBody AlunoDto alunoDto, UriComponentsBuilder uriBuilder) {
		Aluno aluno = alunoDto.converte();
		Aluno alunoCadastrado = alunoService.cadastra(aluno);
		
		URI uri = uriBuilder.path("/alunos/{id}").buildAndExpand(alunoCadastrado.getId()).toUri();
		return ResponseEntity.created(uri).body(AlunoDto.converte(alunoCadastrado));
		
	}

	@GetMapping("/{id}")
	public AlunoDto obtemAluno(@PathVariable("id") Long id) {
		Aluno aluno = alunoService.get(id);
		AlunoDto dto = null;
		if(aluno != null) {
			dto = AlunoDto.converte(aluno);
		}
		return dto;
	}
	
	@GetMapping("/ping")
	public String ping() {
		return "pong";
	}
	
}
