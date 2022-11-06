package br.pessoa;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    void validarCalculoDaIdade() {
        Pessoa pessoa = new Pessoa("Julia", LocalDateTime.of(2020, 1, 1, 15, 0, 0));
        Assertions.assertEquals(2, pessoa.getIdade());


    }



}