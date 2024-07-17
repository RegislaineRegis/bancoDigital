package com.bancodigital;

import java.util.List;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Banco {

  private String nome;
  private List<Conta> contas;
}
