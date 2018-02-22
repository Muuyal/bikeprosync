package com.muuyal.bikeprosync.dto.sale;

public class GestionixsalesorderResponse {
    private Integer branch_id;
    private String date;
    private Double subtotal;
    private Double total;
    private Double exchange_rate;
    private String currency;
    private boolean inventory_lock;
    private String[] concepts = new String[2];

    public Integer getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(Integer branch_id) {
        this.branch_id = branch_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getExchange_rate() {
        return exchange_rate;
    }

    public void setExchange_rate(Double exchange_rate) {
        this.exchange_rate = exchange_rate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean isInventory_lock() {
        return inventory_lock;
    }

    public void setInventory_lock(boolean inventory_lock) {
        this.inventory_lock = inventory_lock;
    }

    public String[] getConcepts() {
        return concepts;
    }

    public void setConcepts(String[] concepts) {
        this.concepts = concepts;
    }
}


