package com.mycompany.controller;

import com.mycompany.loja.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import java.util.ArrayList;
import java.util.Arrays;

public class AcessoControllerTest {
    private AcessoController acessoController;
    
    public AcessoControllerTest() {
    }
    
    @Before
    public void before(){
        acessoController = new AcessoController(new ArrayList<>());
    }

    // Testes - CADASTRAR
    
    @Test
    public void testCadastrarAcessoCompleto() {
        Opcao opcao = Opcao.CADASTRO;
        Funcionario funcionario = new Gerente();
        
        //Quando
        boolean resultado = acessoController.cadastrarAcesso(opcao, funcionario);
        
        //Então
        Assert.assertTrue(resultado);
    }
    
    @Test
    public void testCadastrarAcessoSemOpcao(){
        Opcao opcao = null;
        Funcionario funcionario = new Gerente();
        
        //Quando
        boolean resultado = acessoController.cadastrarAcesso(opcao, funcionario);
        
        //Então
        Assert.assertFalse(resultado);
    }
    
    @Test
    public void testCadastrarAcessoSemFuncionario(){
        Opcao opcao = Opcao.CADASTRO;
        Funcionario funcionario = null;
        
        //Quando
        boolean resultado = acessoController.cadastrarAcesso(opcao, funcionario);
        
        //Então
        Assert.assertFalse(resultado);
    }

    // Testes - ATUALIZAR
    
    @Test
    public void testAtualizarAcessoAdicionar() {
        Opcao opcao = Opcao.CADASTRO;
        Funcionario funcionario = new Gerente();
        Acesso acesso = new Acesso(opcao);
        acessoController = new AcessoController(new ArrayList<>(Arrays.asList(acesso)));
        
        //Quando
        boolean resultado = acessoController.atualizarAcesso(opcao, funcionario);
        
        //Então
        Assert.assertTrue(resultado);   
    }
    
    @Test
    public void testAtualizarAcessoRemover() {
        Opcao opcao = Opcao.CADASTRO;
        Funcionario funcionario = new Gerente();
        Acesso acesso = new Acesso(opcao, new ArrayList<>(Arrays.asList(funcionario)));
        acessoController  = new AcessoController(new ArrayList<>(Arrays.asList(acesso)));
        
        //Quando
        boolean resultado = acessoController.atualizarAcesso(opcao, funcionario);
        
        //Então
        Assert.assertTrue(resultado);
    }
    
    @Test
    public void testAtualizarAcessoInexistente() {
        Opcao opcao = Opcao.CADASTRO;
        Funcionario funcionario = new Gerente();
        
        //Quando
        boolean resultado = acessoController.atualizarAcesso(opcao, funcionario);
        
        //Então
        Assert.assertFalse(resultado);
    }
    
    @Test
    public void testAtualizarAcessoSemOpcao() {
        Opcao opcao = null;
        Funcionario funcionario = new Gerente();
        Acesso acesso = new Acesso(opcao, new ArrayList<>(Arrays.asList(funcionario)));
        acessoController  = new AcessoController(new ArrayList<>(Arrays.asList(acesso)));
        
        //Quando
        boolean resultado = acessoController.atualizarAcesso(opcao, funcionario);
        
        //Então
        Assert.assertFalse(resultado);
    }
    
    @Test
    public void testAtualizarAcessoSemFuncionario() {
        Opcao opcao = Opcao.CADASTRO;
        Funcionario funcionario = null;
        Acesso acesso = new Acesso(opcao, new ArrayList<>(Arrays.asList(funcionario)));
        acessoController  = new AcessoController(new ArrayList<>(Arrays.asList(acesso)));
        
        //Quando
        boolean resultado = acessoController.atualizarAcesso(opcao, funcionario);
        
        //Então
        Assert.assertFalse(resultado);
    }  
  
}
