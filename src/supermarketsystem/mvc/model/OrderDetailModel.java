/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketsystem.mvc.model;

/**
 *
 * @author thari
 */
public class OrderDetailModel {
    
    private String orderId;
    private String itemId;
    private Integer qty;
    private Double discount;

    public OrderDetailModel() {
    }

    public OrderDetailModel(String orderId, String itemId, Integer qty, Double discount) {
        this.orderId = orderId;
        this.itemId = itemId;
        this.qty = qty;
        this.discount = discount;
    }

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the itemId
     */
    public String getItemCOde() {
        return itemId;
    }

    /**
     * @param itemId the itemId to set
     */
    public void setItemCOde(String itemId) {
        this.itemId = itemId;
    }

    /**
     * @return the qty
     */
    public Integer getOrderQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setOrderQty(Integer qty) {
        this.qty = qty;
    }

    /**
     * @return the discount
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OrderDetailModel{" + "orderId=" + orderId + ", itemId=" + itemId + ", qty=" + qty + ", discount=" + discount + '}';
    }
    
    
    
}