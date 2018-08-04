package com.sda.kwiaciarnia;

class Florist {
    public Florist() {
    PriceList pl = PriceList.getInstance();
    pl.set("róża", 10);
    pl.set("bez", 12);
    pl.set("piwonia", 8);}
}