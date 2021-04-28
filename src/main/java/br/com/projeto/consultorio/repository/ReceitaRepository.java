package br.com.projeto.consultorio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.consultorio.model.Receita;

public interface ReceitaRepository extends JpaRepository<Receita, Long> {

}
