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
        // Операции над массивом
        catsList.add( new Cats("Бегемот 2")); // Добавление элемента в динамический массив
        catsList.remove(1); // Удаление элемента у которого индекс равен 1
        Cats cat1 = catsList.get(0); // Взятие элемента по индексу
        System.out.println(cat1); // Вывод элемента по индексу
        System.out.println( "Вывод индекса: " + catsList.indexOf(cat1)); // Вывод индекса элемента

        catsList.add(2,cat1); // Вставка элемента в указанный индекс
        catsList.set(2,new Cats("Меня сюда вставили")); // Вставка элемента в указанный индекс

        //Удаление всех элементов массива
        //catsList.removeAll(catsList); // Удаление всего массива
        catsList.removeAll(Arrays.asList(cat1,catsList.get(3))); // Удаление опреленного элемента массива
        //----------------------------------------
        System.out.println(catsList.toString()); //
        //-----------------------------------------
        System.out.println(catsList.size()); // Длинна массива

    }
}
