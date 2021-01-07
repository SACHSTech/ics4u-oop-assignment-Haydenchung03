package SwimmingStudents;

import SwimmingStudents.*;

public class Pay {

  private double dblPay;

  public Pay(double Pay) {
    this.dblPay = Pay;
  }

  public getPay() {
    return Math.round(dblPay * 100.0) / 100.0;
  }
}