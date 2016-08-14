package com.gabrielcunha.socialbooks.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielcunha.socialbooks.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long> {

}
