package com.company;

import java.util.ArrayList;
public class Menu {
    private int menuId;
    private String menuItem;
    private double PriceofItem;


    //Constructor Method
    public Menu(int _menuId, String _menuItem,double _PriceofItem){
        this.menuId = _menuId;
        this.menuItem = _menuItem;
        this.PriceofItem = _PriceofItem;


    }

    //Setters and Getters
    public int getmenuId() { return menuId; }
    public void setmenuId(int _menuId) {this.menuId = _menuId;}

    public String getmenuItem() { return menuItem; }
    public void setmenuItem(String _menuItem) {this.menuItem = _menuItem;}

    public double getPriceofItem() { return PriceofItem;}
    public void setPriceofItem(double PriceofItem) {this.PriceofItem = PriceofItem;}



    public static void listMenu(ArrayList<Menu> mList){
        for (Menu menu: mList){
            System.out.println("Pizza Type: " + menu.getmenuItem());
            System.out.println("The Price is:$" +menu.getPriceofItem ()+ " dollars.");


        }
    }
}


