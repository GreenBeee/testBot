package com.botscrew.bot.model.button.addition;

public class PaymentSummary {

    private String currency;
    private Boolean is_test_payment;
    private PaymentType payment_type;
    private String merchant_name;
    private String[] requested_user_info;
    private Product[] price_list;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Boolean getIs_test_payment() {
        return is_test_payment;
    }

    public void setIs_test_payment(Boolean is_test_payment) {
        this.is_test_payment = is_test_payment;
    }

    public PaymentType getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(PaymentType payment_type) {
        this.payment_type = payment_type;
    }

    public String getMerchant_name() {
        return merchant_name;
    }

    public void setMerchant_name(String merchant_name) {
        this.merchant_name = merchant_name;
    }

    public String[] getRequested_user_info() {
        return requested_user_info;
    }

    public void setRequested_user_info(String[] requested_user_info) {
        this.requested_user_info = requested_user_info;
    }

    public Product[] getPrice_list() {
        return price_list;
    }

    public void setPrice_list(Product[] price_list) {
        this.price_list = price_list;
    }

    public PaymentSummary() {

    }

    public PaymentSummary(String currency, Boolean is_test_payment, PaymentType payment_type, String merchant_name, String[] requested_user_info, Product[] price_list) {

        this.currency = currency;
        this.is_test_payment = is_test_payment;
        this.payment_type = payment_type;
        this.merchant_name = merchant_name;
        this.requested_user_info = requested_user_info;
        this.price_list = price_list;
    }

    private enum PaymentType{
        FIXED_AMOUNT,
        FLEXIBLE_AMOUNT
    }
}
