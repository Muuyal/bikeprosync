package com.muuyal.bikeprosync.dto.inventory;

public class GestionixinventoryResponse {

    private Integer stock_quantity;
    private boolean in_stock;
    private double on_sale;
    private Double price;
    private Double regular_price;
    private Double sale_pric;
    private String status;

    public Integer getStock_quantity() {
        return stock_quantity;
    }

    public void setStock_quantity(Integer stock_quantity) {
        this.stock_quantity = stock_quantity;
    }

    public boolean isIn_stock() {
        return in_stock;
    }

    public void setIn_stock(boolean in_stock) {
        this.in_stock = in_stock;
    }

    public double getOn_sale() {
        return on_sale;
    }

    public void setOn_sale(double on_sale) {
        this.on_sale = on_sale;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRegular_price() {
        return regular_price;
    }

    public void setRegular_price(Double regular_price) {
        this.regular_price = regular_price;
    }

    public Double getSale_pric() {
        return sale_pric;
    }

    public void setSale_pric(Double sale_pric) {
        this.sale_pric = sale_pric;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
