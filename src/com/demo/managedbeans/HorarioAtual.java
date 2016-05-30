package com.demo.managedbeans;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class HorarioAtual {

  public String getHorario() {
    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
    return "Atualizado em " + sdf.format(new Date());
  }
}
