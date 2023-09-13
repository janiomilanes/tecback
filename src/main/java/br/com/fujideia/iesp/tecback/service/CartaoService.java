package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Cartao;
import br.com.fujideia.iesp.tecback.model.Usuario;
import br.com.fujideia.iesp.tecback.model.dto.UsuarioDTO;
import br.com.fujideia.iesp.tecback.repository.CartaoRepository;
import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CartaoService {

    @Autowired
    private CartaoRepository cartaoRepository;

    public Cartao salvar(Cartao cartao){

        return cartaoRepository.save(cartao);
    }

    public Cartao alterar(Cartao cartao){
        if(Objects.nonNull(cartao.getId())){
            cartao = cartaoRepository.save(cartao);
        }else{
            throw new NotFoundException();
        }
        return cartao;
    }
}
