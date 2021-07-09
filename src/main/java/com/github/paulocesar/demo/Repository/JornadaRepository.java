package com.github.paulocesar.demo.Repository;

import com.github.paulocesar.demo.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
