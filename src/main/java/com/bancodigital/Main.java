package com.bancodigital;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

  public static void main(String[] args) {
      Cliente venilton = new Cliente();
      venilton.setNome("Regislaine");

      Conta cc = new ContaCorrente(venilton);
      Conta poupanca = new ContaPoupanca(venilton);

      cc.depositar(100);
     // cc.transferir(100, poupanca);

      cc.imprimirExtrato();
      poupanca.imprimirExtrato();
  }
}