/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul;



/**
 *
 * @author navis
 */
public class CommonDetail implements SuperModel{
    private String oid;
    private String tid;
    private String chefId;
    private String customerName;
    private String telephone;
    private int qty;
    private double timeDuration;
    private String time;
    private String date;

    public CommonDetail() {
    }

    public CommonDetail(String oid, String tid, String customerName, String telephone, int qty) {
        this.oid = oid;
        this.tid = tid;
        this.customerName = customerName;
        this.telephone = telephone;
        this.qty = qty;
    }

 

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getChefId() {
        return chefId;
    }

    public void setChefId(String chefId) {
        this.chefId = chefId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(double timeDuration) {
        this.timeDuration = timeDuration;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

   
    
    
    

   
    
    
    
    
}
