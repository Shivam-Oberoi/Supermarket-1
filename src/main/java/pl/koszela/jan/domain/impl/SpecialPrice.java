package pl.koszela.jan.domain.impl;

import pl.koszela.jan.domain.Price;

/**
 * Created on 11.08.2017.
 *
 * @author Jan Koszela
 */
public class SpecialPrice implements Price {

  private int id;
  private int amount;
  private double price;
  private String currency;


  public SpecialPrice(int id, int amount, double price, String currency) {
    this.id = id;
    this.amount = amount;
    this.price = price;
    this.currency = currency;
  }

  public static SpecialPriceBuilder builder() {
    return new SpecialPriceBuilder();
  }

  public int getId() {
    return this.id;
  }

  public int getAmount() {
    return this.amount;
  }

  public double getPrice() {
    return this.price;
  }

  public String getCurrency() {
    return this.currency;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public static class SpecialPriceBuilder {

    private int id;
    private int amount;
    private double price;
    private String currency;

    SpecialPriceBuilder() {
    }

    public SpecialPrice.SpecialPriceBuilder id(int id) {
      this.id = id;
      return this;
    }

    public SpecialPrice.SpecialPriceBuilder amount(int amount) {
      this.amount = amount;
      return this;
    }

    public SpecialPrice.SpecialPriceBuilder price(double price) {
      this.price = price;
      return this;
    }

    public SpecialPrice.SpecialPriceBuilder currency(String currency) {
      this.currency = currency;
      return this;
    }

    public SpecialPrice build() {
      return new SpecialPrice(id, amount, price, currency);
    }

    public String toString() {
      return "pl.koszela.jan.domain.impl.SpecialPrice.SpecialPriceBuilder(id=" + this.id
          + ", amount="
          + this.amount + ", price=" + this.price + ", currency=" + this.currency + ")";
    }
  }
}