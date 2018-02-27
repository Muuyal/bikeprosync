package com.muuyal.bikeprosync.dto.sale;

public class GestionixsalesorderRequest {
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

    public class RMEmitter {
        private String commercial_name;
        private String address;

        public String getCommercial_name() {
            return commercial_name;
        }

        public void setCommercial_name(String commercial_name) {
            this.commercial_name = commercial_name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public class RMClient {
        private String commercial_name;
        private String address;

        public String getCommercial_name() {
            return commercial_name;
        }

        public void setCommercial_name(String commercial_name) {
            this.commercial_name = commercial_name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public class RMGeneral_Financial_Information {
        private String method;
        private String others;

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public String getOthers() {
            return others;
        }

        public void setOthers(String others) {
            this.others = others;
        }
    }

    public class RMBranchOffice {
        private String type;
        private String name;
        private String description;
        private String address;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public class RMGeneral_Concept {
        private Integer tax_withheld;
        private Double total;
        private String type;

        public Integer getTax_withheld() {
            return tax_withheld;
        }

        public void setTax_withheld(Integer tax_withheld) {
            this.tax_withheld = tax_withheld;
        }

        public Double getTotal() {
            return total;
        }

        public void setTotal(Double total) {
            this.total = total;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public class RMGeneral_Tax {
        private String description;
        private Double total;
        private String type;
        private Integer id;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Double getTotal() {
            return total;
        }

        public void setTotal(Double total) {
            this.total = total;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
    }

    public class RMGeneral_Discount {
        private Double total;

        public Double getTotal() {
            return total;
        }

        public void setTotal(Double total) {
            this.total = total;
        }
    }

    public class RMGeneral_Customs {
        private String name;
        private String number;
        private String date;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }
}
