package alex.com.task01;

import java.util.*;

public class NewListAndNewSet {
    public static List createList(int count, int min, int max) {

        List<Number> list = new LinkedList<>();
        for (int i = 0; i <= count; i++)
            list.add((int) (Math.random() * (max - min) + min));
        return list;
    }

    public static Set createSet(int count, int max, int min) {
        Set<Number> mySet = new HashSet<>();
        for (int i = 0; i <= count; i++)
            mySet.add((int) (Math.random() * (max - min) + min));
        if (count > max - min)
            throw new ArithmeticException("Диапазон значений меньше чем количество значений для генерации");
        return mySet;

    }

    public static void main(String[] args) {
        List<Number> list = createList(10, 2, 5);

        Iterator<Number> it = list.iterator();
        while (it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println();
        Set<Number> mySet = createSet(10, 40, 3);
        System.out.println(mySet);
    }

}
