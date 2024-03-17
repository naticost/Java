package com.exemplo.pontuacao;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import usuarios.RegistroPontos;
import usuarios.Usuario;

public class TesteRegistroPontos {
    @Test
    public void pontosCriarTopico() {
        Usuario u = new Usuario();
        u.nome = "Guerra";
        CalculadoraBonus cb = new CalculadoraBonus();
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 5);
    }
    @Test
    public void pontosCriarVIP() {
        Usuario u = new Usuario();
        u.nome = "Guerra";
        u.vip= true;
        CalculadoraBonus cb = new CalculadoraBonus();
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 25);
    }
    @Test
    public void pontosCriarTopicoBonusDoDia() {
        Usuario u = new Usuario();
        u.nome = "Guerra";
        CalculadoraBonus cb = new CalculadoraBonus();
        cb.bonusDoDia=3;
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 15);
    }
    @Test
    public void pontosCriarTopicoVIPBonusDoDia() {
        Usuario u = new Usuario();
        u.nome = "Guerra";
        u.vip=true;
        CalculadoraBonus cb = new CalculadoraBonus();
        cb.bonusDoDia=2;
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 50);
    }
    
}
