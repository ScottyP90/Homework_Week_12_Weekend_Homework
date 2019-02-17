package Shop;

import Interface.ISell;

import java.util.ArrayList;

public class Store {

    private String shopName;
    private ArrayList<ISell> inventory;

    public Store(String shopName) {
        this.shopName = shopName;
        this.inventory = new ArrayList<ISell>();
    }

    public String getShopName() {
        return shopName;
    }

    public int getInventory() {
        return inventory.size();
    }

    public void addToInventory(ISell item){
        this.inventory.add(item);
    }

    public void removeFromInventory(ISell item){
        if(inventory.contains(item)){
            this.inventory.remove(item);
        }
    }

    public double allStockMarkup(){
        double totalMarkup = 0.00;
        for (ISell item:this.inventory) {
            totalMarkup += item.markUp();
        }
        return totalMarkup;
    }
}
