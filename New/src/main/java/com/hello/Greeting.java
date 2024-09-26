package com.hello;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "greeting", eager = true)
@RequestScoped
public class Greeting {
   @ManagedProperty(value = "#{regards}")
   private Regards regardsBean;
   private String regards;
   
   public Greeting() {
      System.out.println("Have a Good Day! started");   
   }
   
   public String getRegards() {
      
      if(regardsBean != null) {
    	  regards = regardsBean.getRegards();
      }       
      return regards;
   }
   
   public void setRegardsBean(Regards regards) {
      this.regardsBean = regards;
   }
}