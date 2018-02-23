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
}

public class RMEmitter {
    address (RMGeneral_Address): Dirección del emisor ,
}

public class RMClient {
    commercial_name (string): Nombre comercial del cliente POST/PUT: Enviar el nombre comercial del cliente GET: Contendrá el nombre comercial asignado para el cliente ,
    address (RMGeneral_Address): Dirección del cliente ,
}

public class RMGeneral_Financial_Information {
    method (string): Metodo por el cual se efectúa el movimiento financiero: cash (Efectivo) transference (Transferencia) credit_card (Tarjeta de credito) debit_card (Tarjeta de débito) american_express (Tarjeta American Express) check (Cheque) electronic_wallet (Monedero electrónico) electronic_money (Dinero electrónico) vouchers (Vales) service_card (Tarjeta de servicios)
    others (Otros) not_apply (No aplica) ,
}

public class RMBranchOffice {
    type (string): Tipo de sucursal ,
    name (string): Nombre de la sucursal ,
    description (string): Abreviación de la sucursal ,
    address (RMGeneral_Address): The address of the emitter ,
}

public class RMGeneral_Concept {
    tax_withheld (number): Total de los impuestos retenidos POST/PUT: Es obligatorio enviarlo, se aceptan hasta 2 decimales, si se envían más se procederá a hacer el redondeo, si no se cuenta con ningún impuesto retenido enviar como 0 GET: Contiene el valor del impuesto trasladado asignado al concepto ,
    total (number): Importe total del concepto, se obtiene de la siguiente manera Subtotal - Descuento + Impuestos POST/PUT: Es obligatorio enviarlo, se aceptan hasta 2 decimales, si se envían más se procederá a hacer el redondeo GET: Contiene el valor del total asignado al concepto ,
    type (string): Tipo de concepto POST/PUT: Solamente se aceptarán los valors product o service, en caso de no enviarlo se notificará que es oglibatorio que se defina GET: Contiene el valor del tipo asignado al concepto ,
}

public class RMGeneral_Tax {
    description (string): Descripción del impuesto Retenidos: Cedular, Cinco_Al_Millar, ISN, ISR, IVA Trasladados: IEPS, ISH, IVA POST/PUT: Se validará contra esta lista, en caso de que no pase la validación se enviara una notificación GET: Contiene el valor asignado a la descripción del impuesto ,
    total (number): El total del impuesto POST/PUT: Enviar con hasta dos decimales, en caso contrario se procederá a hacer el redondeo GET: Contiene el valor del total asignado al total del impuesto ,
    type (string): El tipo del impuesto POST/PUT: Valores permitidos: (transferred, withheld, transferred_fixed), si no cumple con estas características se procederá a notificar GET: Contiene el valor del tipo asignado al impuesto ,
    id (integer): Id único del impuesto POST/PUT: Es el identificador del impuesto, es importante resaltar que este valor se tomará en cuenta a la hora de hacer la validación del calculo de dependencias GET: Contiene el valor del identificador asignado al impuesto ,
}

public class RMGeneral_Discount {
    total (number): Total del descuento POST/PUT: Se enviará el total del descuento GET: Contiene el valor asignado al total del descuento
}

