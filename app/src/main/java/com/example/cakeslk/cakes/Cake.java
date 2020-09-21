package com.example.cakeslk.cakes;

import android.os.Parcel;
import android.os.Parcelable;

public class Cake implements Parcelable {

    public int CakeId;
    public String CakeName;
    public String Flavour;
    public String Description;
    public double Price;

    public Cake(){

    }

    public Cake(String cakeName, String flavour, double price, String description) {
        CakeName = cakeName;
        Flavour = flavour;
        Description = description;
        Price = price;
    }

    public int getCakeId() {
        return CakeId;
    }

    public void setCakeId(int cakeId) {
        CakeId = cakeId;
    }

    public String getCakeName() {
        return CakeName;
    }

    public void setCakeName(String cakeName) {
        CakeName = cakeName;
    }

    public String getFlavour() {
        return Flavour;
    }

    public void setFlavour(String flavour) {
        Flavour = flavour;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    protected Cake (Parcel parcel){
        CakeId=parcel.readInt();
        CakeName=parcel.readString();
        Flavour=parcel.readString();
        Price=parcel.readDouble();
        Description=parcel.readString();
    }

    @Override
    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(CakeId);
        dest.writeString(CakeName);
        dest.writeString(Flavour);
        dest.writeDouble(Price);
        dest.writeString(Description);

    }

    public static final Parcelable.Creator<Cake> CREATOR = new Parcelable.Creator<Cake>() {
        @Override
        public Cake createFromParcel(Parcel in) {
            return new Cake(in);
        }

        @Override
        public Cake[] newArray(int size) {
            return new Cake[size];
        }
    };
}

