package ru.synergy;

import java.util.*;

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
        catsList.add( new Cats("Бегемот")); // Добавление элемента в динамический массив
        //catsList.remove(1); // Удаление элемента у которого индекс равен 1
        Cats cat1 = catsList.get(0); // Взятие элемента по индексу
        System.out.println(cat1); // Вывод элемента по индексу
        System.out.println( "Вывод индекса: " + catsList.indexOf(cat1)); // Вывод индекса элемента

        catsList.add(2,cat1); // Вставка элемента в указанный индекс
        catsList.set(2,new Cats("Меня сюда вставили")); // Вставка элемента в указанный индекс

        //Удаление всех элементов массива
        //catsList.removeAll(catsList); // Удаление всего массива
        //catsList.removeAll(Arrays.asList(cat1,catsList.get(3))); // Удаление опреленного элемента массива
        //----------------------------------------
        System.out.println(catsList.toString()); //
        //-----------------------------------------
        System.out.println(catsList.size()); // Длинна массива

        //------------------------------------------------------------
        // LinkedList
        LinkedList<String> Bio = new LinkedList<>(); // Создание  ссылочного массива
        //------------------------------------------
        String str1 = "Hi World";
        String str2 = "My name is Dmitry";
        String str3 = "I love java/py";
        //------------------------------------------
        Bio.add(str1); // Добавление элемента в массив
        Bio.add(str2);
        Bio.add(str3);
        //------------------------------------------
        System.out.println(Bio);
        Bio.remove(1);  // Удаление элемента под индексом 1
        System.out.println(Bio);
        //-------------------------------------------
        LinkedList<Cars> cars = new LinkedList<Cars>();
        Cars ferrari = new Cars("Ferarri Spyder");
        Cars buggati = new Cars("Veyron");
        Cars mercedes = new Cars("Benz");
        cars.addAll(Arrays.asList(ferrari,buggati,mercedes));
        System.out.println(cars);
        //--------------------------------------------------
        cars.addFirst(new Cars("Ford GT40")); // Добавление в начало
        cars.addLast(new Cars("Fiat")); // Добавление в конец
        System.out.println(cars);
        cars.pollFirst(); // Взятие значения с концами
        System.out.println(cars);
        //---------------------------------------------------------
      /*  //ArrayList vs LinkedList
        List<Integer> list = new LinkedList<Integer>(); // Создание  ссылочного массива

        for (int i =0; i<5000000;i++){
            list.add(new Integer(i)); //Заполнение массива числами
        }
        long start = System.currentTimeMillis(); //Время выполнения в миллисекундах(За сколько миллисекунд заполнился массив)
        for (int i =0; i<100;i++){
            list.add(2000000,Integer.MAX_VALUE); // Заполнение массива пока индекс не будет равен 2000000
        }
        //--------------------------------------------------------------------------------------
        //Вывод времени выполнения
        System.out.println("LinkedList time in millis: " + (System.currentTimeMillis() -start));
        //---------------------------------------------------------------------------------------
        List<Integer> listarray = new ArrayList<Integer>(); //Создание  обычного массива

        for (int i =0; i<5000000;i++){
            listarray.add(new Integer(i));
        }
        start = System.currentTimeMillis();
        for (int i =0; i<100;i++){
            listarray.add(2000000,Integer.MAX_VALUE); // Заполнение массива пока индекс не будет равен 2000000
        }
        System.out.println("ArrayList time in millis: " + (System.currentTimeMillis() -start));*/
        //-------------------------------------------------------------------------------------
        // Set
        Set<String> states = new HashSet<>(); // Создание set'a принимающий строку
        //Добавление элементов в set
        states.add("Germany");
        states.add("Italy");
        states.add("France");
        //--------------------------------------------
        // Проверка, был ли добавлен элемент Italy
        boolean isAdded = states.add("Italy");
        System.out.println("Italy is Added: "  + isAdded);
        //--------------------------------------------
        System.out.println("Set contains: " + states.size()); // Вывод количества элементов в set'e

        System.out.println(states);

        states.remove("France"); // Удаление происходит только с указанием того что надо удалить(без индексов)
        System.out.println(states);
        //-----------------------------------------------------------
        HashSet<Cats> catsHashSet = new HashSet<>(catsList); // Создание set'a принимающий список с котами
        System.out.println(catsHashSet); // Вывод списка с котами без повтора
        //--------------------------------------------------------------------------
        //Tree Set
        TreeSet<Cats> catsTreeSet = new TreeSet<>(catsList); // Ошибкуа говорящая о том что из объекта неподходящего для дерева была попытка создать дерево объектов
        // А также то класс ru.synergy не использует методы из Comparable?
        System.out.println(catsTreeSet);
    }
}
