package ru.synergy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cats[] cat = new Cats[3]; //Создание массива для трех элементов
        //------------------------------------------

        cat[0] = new Cats("Томас");
        cat[1] = new Cats("Бегемот");
        cat[2] = new Cats("Филипп Маркович");
        //------------------------------------------
        //cat[1] = null;
        System.out.println(Arrays.toString(cat));
        //------------------------------------------
        // Динамический массив
        ArrayList<Cats> catsList = new ArrayList(); // Создание динамического массива
        for(Cats cats : cat){ // Создание цикла который берет значения из массива
            // И закидывает их в динамический
            catsList.add(cats); // Добавление элементов в динамический массив
        }
        //-----------------------------------------
        catsList.add( new Cats("Бегемот 2")); // Добавление элемента в динамический массив
        System.out.println(catsList.toString()); //
        //-----------------------------------------

    }
}
