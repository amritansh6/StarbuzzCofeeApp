package com.example.myapplication;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public  static final Drink[] drinks={
      new Drink("Latte","A couple of espresso shots with steamed milk",R.mipmap.latte),
      new Drink("cappuchino","Espresso,hot milk,and a steamed milk foam",R.mipmap.capuchino),
      new Drink("Filter","Highest quality beans roasted and brewed fresh",R.mipmap.capuchino)

    };
    private Drink(String name,String description,int imageResourceId){
        this.name=name;
        this.description=description;
        this.imageResourceId= imageResourceId;
        }
        public String getDescription(){
        return description;
        }
        public String getName(){
        return name;
        }
        public int getImageResourceId(){
        return imageResourceId;
        }
        public String toString()
        {
            return this.name;
        }
}

