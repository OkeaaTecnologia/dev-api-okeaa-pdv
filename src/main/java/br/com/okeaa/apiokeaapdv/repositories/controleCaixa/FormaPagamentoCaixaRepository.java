package br.com.okeaa.apiokeaapdv.repositories.controleCaixa;

import br.com.okeaa.apiokeaapdv.controllers.response.controleCaixa.FormaPagamentoCaixa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FormaPagamentoCaixaRepository extends JpaRepository<FormaPagamentoCaixa, Long> {




}
