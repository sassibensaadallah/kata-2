package com.kata.racemus;

import com.kata.racemus.objects.Orientation;
import com.kata.racemus.objects.Position;
import com.kata.racemus.utils.Constants;
import com.kata.racemus.utils.FileReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class RacemusApplication {

    public static void main(String[] args) {

        SpringApplication.run(RacemusApplication.class, args);
        FileReader.readLineByLine();
        initMax();
        Calculate(Constants.getLIST());

    }
    public static void initMax(){
        String maxIndex =Constants.getElementFromLIST(0);
        Constants.setMaxX(Integer.parseInt(maxIndex.substring(0,1)));
        Constants.setMaxY(Integer.parseInt(maxIndex.substring(2)));
        System.out.println(Constants.getMaxX()+" "+Constants.getMaxY());
    }
    public static String Calculate(List<String> list){
        String retour ="";
        for(int i=1;i<list.size();i=i+2){
            retour += calculatePosition(i,list)+" ";
        }
        System.out.println(retour);
        return retour;
    }
    public static String calculatePosition(int index,List<String> l){
        int x=Integer.parseInt(l.get(index).substring(0,1));
        int y=Integer.parseInt(l.get(index).substring(2,3));
        Orientation orientation=Orientation.valueOf(l.get(index).substring(4));
        Position position =new Position(x,y,orientation);
        for(int i=0 ; i<l.get(index+1).length();++i){
            if (l.get(index+1).charAt(i)=='G'){
                position.turnLeft();
            }else if (l.get(index+1).charAt(i)=='D'){
                position.turnRight();
            }else if (l.get(index+1).charAt(i)=='A'){
                position.avancer();
            }

        }
        return position.toString();
    }

}
