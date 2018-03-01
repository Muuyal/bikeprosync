package com.muuyal.bikeprosync.dto.inventory;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WoocommerceInventoryResponse {

    private Long id;
    private String name;
    private String slug;
    private String permalink;
    private String date_created;
    private String date_odified;
    private String type;
    private String status;
    private String catalog_visibility;
    private String description;
    private String short_description;
    private String price;
    private String regular_price;
    private String sale_price;
    private String date_on_sale_from;
    private String date_on_sale_to;
    private String price_html;
    private Boolean on_sale;
    private Boolean purchasable;
    private Integer total_sales;
    private Boolean virtual;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public String getDate_odified() {
        return date_odified;
    }

    public void setDate_odified(String date_odified) {
        this.date_odified = date_odified;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCatalog_visibility() {
        return catalog_visibility;
    }

    public void setCatalog_visibility(String catalog_visibility) {
        this.catalog_visibility = catalog_visibility;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShort_description() {
        return short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRegular_price() {
        return regular_price;
    }

    public void setRegular_price(String regular_price) {
        this.regular_price = regular_price;
    }

    public String getSale_price() {
        return sale_price;
    }

    public void setSale_price(String sale_price) {
        this.sale_price = sale_price;
    }

    public String getDate_on_sale_from() {
        return date_on_sale_from;
    }

    public void setDate_on_sale_from(String date_on_sale_from) {
        this.date_on_sale_from = date_on_sale_from;
    }

    public String getDate_on_sale_to() {
        return date_on_sale_to;
    }

    public void setDate_on_sale_to(String date_on_sale_to) {
        this.date_on_sale_to = date_on_sale_to;
    }

    public String getPrice_html() {
        return price_html;
    }

    public void setPrice_html(String price_html) {
        this.price_html = price_html;
    }

    public Boolean getOn_sale() {
        return on_sale;
    }

    public void setOn_sale(Boolean on_sale) {
        this.on_sale = on_sale;
    }

    public Boolean getPurchasable() {
        return purchasable;
    }

    public void setPurchasable(Boolean purchasable) {
        this.purchasable = purchasable;
    }

    public Integer getTotal_sales() {
        return total_sales;
    }

    public void setTotal_sales(Integer total_sales) {
        this.total_sales = total_sales;
    }

    public Boolean getVirtual() {
        return virtual;
    }

    public void setVirtual(Boolean virtual) {
        this.virtual = virtual;
    }

    @Override
    public String toString(){
        return "Product{" +
                "id='" +  id + "\'" +
                ", name=" + name +
                ", purchasable=" + purchasable +
                ", description=" + description +
                "}";
    }

}
