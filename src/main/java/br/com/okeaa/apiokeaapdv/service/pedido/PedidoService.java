package br.com.okeaa.apiokeaapdv.service.pedido;

import br.com.okeaa.apiokeaapdv.controllers.request.pedido.JsonRequestPedido;
import br.com.okeaa.apiokeaapdv.controllers.response.pedido.JsonResponsePedido;
import br.com.okeaa.apiokeaapdv.controllers.request.pedido.JsonRequestPedido;
import br.com.okeaa.apiokeaapdv.controllers.response.pedido.JsonResponsePedido;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface PedidoService {

    JsonResponsePedido getAllPedido();

    JsonResponsePedido getPedidoByIdPedido(@PathVariable("numero") String numero);

    JsonRequestPedido createPedido(@RequestBody String xmlPedido);

    JsonRequestPedido updatePedido(@RequestBody String xmlPedido, @PathVariable("numero") String numero);
}