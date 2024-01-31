package br.com.okeaa.apiokeaapdv.repositories.controleCaixa;

import br.com.okeaa.apiokeaapdv.controllers.response.controleCaixa.ControleCaixa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ControleCaixaRepository extends JpaRepository<ControleCaixa, Long> {

    List<ControleCaixa> findAll();

    Optional<ControleCaixa> findById(String id);

    Optional<ControleCaixa> findByIdLojaAndSituacao(String idLoja, String situacao);

    void deleteById(String id);

    Optional<ControleCaixa> findFirstByOrderByDataAberturaDesc();

    @Query("SELECT DISTINCT c FROM ControleCaixa c WHERE c.id = :id")
    Optional<ControleCaixa> findDistinctControleCaixaById(@Param("id") String id);
}
