package SwimmingStudents;

import SwimmingStudents.*;

import java.lang.Math;

public class Pay {

  private double dblPay;

  public Pay(double Pay) {
    this.dblPay = Pay;
  }

  public double getPay() {
    return Math.round(dblPay * 100.0) / 100.0;
  }
}