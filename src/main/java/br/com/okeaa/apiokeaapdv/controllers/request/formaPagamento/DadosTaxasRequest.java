package br.com.okeaa.apiokeaapdv.controllers.request.formaPagamento;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
//@Entity
//@Table(name = "TB_CATEGORIA_RESPONSE")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DadosTaxasRequest {

    @JsonProperty("id")
    public String id;

    @JsonProperty("valoraliquota")
    public BigDecimal valoraliquota;

    @JsonProperty("valorfixo")
    public BigDecimal valorfixo;

    @JsonProperty("prazo")
    public BigDecimal prazo;

}
