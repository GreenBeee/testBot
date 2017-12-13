package com.botscrew.bot.model.button.addition;

public class Product {
    private String label;
    private String amount;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Product() {

    }

    public Product(String label, String amount) {

        this.label = label;
        this.amount = amount;
    }
}
