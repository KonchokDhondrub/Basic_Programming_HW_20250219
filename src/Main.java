import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

//  Задача 1
//  Дан List строк содержащий имена пользователей. Необходимо написать метод, который
//  выводит его на экран в обратном порядке, начиная с последнего имени.

public class Main {
    public static void main(String[] args) {
        //  Задача 1
        List<String> namesList = List.of("Jack1", "Jack2", "Jack3", "Jack4", "Jack5");
        printReversed(namesList);

        //  Задача 2
        List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> list2 = List.of(5, 2, 3, 8);
        System.out.println(System.lineSeparator() + compareLists(list1, list2));

        //  Задача 3
        IterableString iterableString = new IterableString("jack john jeff");
        System.out.println(System.lineSeparator() + iterableString);
        System.out.println("-------------------------");
        System.out.println("Печатаем текст по словам:");
        for (String str : iterableString) {
            System.out.println(str);
        }
    }

    public static void printReversed(List<String> names) {
        ListIterator<String> iterator = names.listIterator(names.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    public static List<Boolean> compareLists(List<Integer> list1, List<Integer> list2) {
        List<Boolean> result = new ArrayList<>();
        Iterator<Integer> inter1 = list1.iterator();
        Iterator<Integer> inter2 = list2.iterator();

        while (inter1.hasNext() && inter2.hasNext() ) {
            result.add(inter1.next().equals(inter2.next()));
        }

        return result;
    }

    public static void remove( List<String> namesList, String delete){
        Iterator<String> iterator = namesList.iterator();
        for (int i = 0; i < namesList.size(); i++){
            if (namesList.get(i).equals(delete)){
                namesList.remove(namesList.get(i));
                i--;
            }
        }
    }
    public static void print(List<Integer> list){
        for (Integer i : list){
            System.out.println(i);
        }
    }
    public static void printWithGet(List<Integer> list){
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}