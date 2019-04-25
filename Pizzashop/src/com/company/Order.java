package com.company;
import java.util.ArrayList;
public class Order {



    private String orderMenuItem;
    private String orderMenuNum;

    //Constructor Method
    public Order(String _orderMenuItem, String _orderMenuNum){

        this.orderMenuItem = _orderMenuItem;
        this.orderMenuNum = _orderMenuNum;
    }


    //Setters and Getters



    public String getOrderMenuItem() {
        return orderMenuItem;
    }

    public void setOrderMenuItem(String _orderMenuItem) {
        this.orderMenuItem = _orderMenuItem;
    }

    public String getOrderMenuNum() {
        return orderMenuNum;
    }

    public void setOrderMenuNum(String _orderMenuNum) {
        this.orderMenuNum = _orderMenuNum;
    }

    public static void PrintOrder(ArrayList<Order> oList) {
        for (Order order : oList) {

            System.out.println( order.getOrderMenuItem() );
            System.out.println( order.getOrderMenuNum());



        }

    }
}