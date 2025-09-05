package com.lqhuy03.jfp.oop.l03_access_modifiers;

class Cop {
    private int gun; // Private variable

    public int getGun(){
        return gun;  // The private variable is directly accessible over here!
    }
}
