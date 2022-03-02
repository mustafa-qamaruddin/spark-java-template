package qubits.models;

import java.io.Serializable;

public class Measurement implements Serializable {
  Double distance;
  Double consume;
  Double speed;
  Double temp_inside;
  Double temp_outside;
  String specials;
  String gas_type;
  boolean AC;
  boolean rain;
  boolean sun;
  Double refillLiters;
  String refillGas;

  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public Double getConsume() {
    return consume;
  }

  public void setConsume(Double consume) {
    this.consume = consume;
  }

  public Double getSpeed() {
    return speed;
  }

  public void setSpeed(Double speed) {
    this.speed = speed;
  }

  public Double getTemp_inside() {
    return temp_inside;
  }

  public void setTemp_inside(Double temp_inside) {
    this.temp_inside = temp_inside;
  }

  public Double getTemp_outside() {
    return temp_outside;
  }

  public void setTemp_outside(Double temp_outside) {
    this.temp_outside = temp_outside;
  }

  public String getSpecials() {
    return specials;
  }

  public void setSpecials(String specials) {
    this.specials = specials;
  }

  public String getGas_type() {
    return gas_type;
  }

  public void setGas_type(String gas_type) {
    this.gas_type = gas_type;
  }

  public boolean isAC() {
    return AC;
  }

  public void setAC(boolean AC) {
    this.AC = AC;
  }

  public boolean isRain() {
    return rain;
  }

  public void setRain(boolean rain) {
    this.rain = rain;
  }

  public boolean isSun() {
    return sun;
  }

  public void setSun(boolean sun) {
    this.sun = sun;
  }

  public Double getRefillLiters() {
    return refillLiters;
  }

  public void setRefillLiters(Double refillLiters) {
    this.refillLiters = refillLiters;
  }

  public String getRefillGas() {
    return refillGas;
  }

  public void setRefillGas(String refillGas) {
    this.refillGas = refillGas;
  }
}
