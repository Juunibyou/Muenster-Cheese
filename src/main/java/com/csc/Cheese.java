package com.csc;

public class Cheese {
  private String milktreatment;
  private boolean organic;
  private double moisture;
  private String milktype;

  public Cheese(String milktreatment, boolean organic, double moisture, String milktype){
    this.milktreatment = milktreatment;
    this.organic = organic;
    this.moisture = moisture;
    this.milktype = milktype;
  }

  //Accessor
  public String getmilktreatment(){
    return milktreatment;
  }
  public boolean getorganic(){
    return organic;
  }
  public double getmoisture(){
    return moisture;
  }
  public String getmilktype(){
    return milktype;
  }

}
