package com.botscrew.bot.model.button;

import com.botscrew.bot.model.button.addition.PaymentSummary;

public class ButtonBuy extends Button {

    private final String type = "payment";
    private String title;
    private String payload;
    private PaymentSummary payment_summary;

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public PaymentSummary getPayment_summary() {
        return payment_summary;
    }

    public void setPayment_summary(PaymentSummary payment_summary) {
        this.payment_summary = payment_summary;
    }

    public ButtonBuy() {

    }

    public ButtonBuy(String title, String payload, PaymentSummary payment_summary) {

        this.title = title;
        this.payload = payload;
        this.payment_summary = payment_summary;
    }
}
