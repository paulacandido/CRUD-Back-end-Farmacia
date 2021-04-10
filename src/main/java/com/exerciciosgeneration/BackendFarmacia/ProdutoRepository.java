package com.exerciciosgeneration.BackendFarmacia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel,Long> {
	public List<ProdutoModel> findAllByNomeContainingIgnoreCase(String nome);
}