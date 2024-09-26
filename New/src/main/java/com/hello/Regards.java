package com.hello;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "regards", eager = true)
@RequestScoped
public class Regards {
   private String regards = "Have a Good Day!";
	
   public String getRegards() {
      return regards;
   }
   public void setRegards(String regards) {
      this.regards = regards;
   }
}