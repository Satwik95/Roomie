package com.example.satwik.roomie;

import android.graphics.Bitmap;
import android.media.Image;

/**
 * Created by Daniel on 31-03-2017.
 */
public class Item {

    private String imageURI;
    private String itemName;
    private String itemPrice;
    private String itemQuant;
    private String addedBy;

    public Item()
    {

    }



    public Item(String imageURI, String itemName, String itemPrice, String itemQuant, String addedBy)
    {
        this.imageURI=imageURI;
        this.itemName=itemName;
        this.itemPrice=itemPrice;
        this.itemQuant=itemQuant;

        this.addedBy=addedBy;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public String getImageURI() {
        return imageURI;
    }

    public void setImageURI(String imageURI) {
        this.imageURI = imageURI;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemQuant() {
        return itemQuant;
    }

    public void setItemQuant(String itemQuant) {
        this.itemQuant = itemQuant;
    }
}
