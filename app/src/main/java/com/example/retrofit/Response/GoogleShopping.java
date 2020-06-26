package com.example.retrofit.Response;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;

public class GoogleShopping {
    @SerializedName("title")
    String title;
    @SerializedName("currency")
    String currency;
    @SerializedName("price")
    String price;
    @SerializedName("google_shopping_id")
    String google_shopping_id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getGoogle_shopping_id() {
        return google_shopping_id;
    }

    public void setGoogle_shopping_id(String google_shopping_id) {
        this.google_shopping_id = google_shopping_id;
    }

    public GoogleShopping(String title, String currency, String price, String google_shopping_id) {
        this.title = title;
        this.price = price;
        this.currency = currency;
        this.google_shopping_id = google_shopping_id;
    }
}