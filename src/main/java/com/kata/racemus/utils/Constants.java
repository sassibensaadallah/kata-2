package com.kata.racemus.utils;

import java.util.ArrayList;
import java.util.List;

public class Constants {
    private static final List<String> LIST=new ArrayList<String>();
    private static int maxX;
    private static int maxY;
    private static int minX=0;
    private static int minY=0;

    public static void addElementToLIST(String element){
        LIST.add(element);
    }
    public static String getElementFromLIST(int index){
        return LIST.get(index);
    }
    public static List getLIST(){
        return LIST;
    }
    public static int getMaxX() {
        return maxX;
    }

    public static int getMaxY() {
        return maxY;
    }

    public static int getMinX() {
        return minX;
    }

    public static int getMinY() {
        return minY;
    }

    public static void setMaxX(int maxX) {
        Constants.maxX = maxX;
    }

    public static void setMaxY(int maxY) {
        Constants.maxY = maxY;
    }

    public static void setMinX(int minX) {
        Constants.minX = minX;
    }

    public static void setMinY(int minY) {
        Constants.minY = minY;
    }
}
