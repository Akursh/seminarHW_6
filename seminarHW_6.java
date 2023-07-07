/**Разработать программу, имитирующую поведение коллекции HashSet. В программе содать метод add добавляющий элемент, метод toString возвращающий строку с элементами множества *и метод позволяющий читать элементы по индексу.
*Реализовать все методы из семинара.
Формат данных Integer.
*/

import java.util.HashMap;
import java.util.Iterator;

public class seminarHW_6 {
    private static HashMap<Integer, Object> hMap = new HashMap<>();
    private static final Object OBJ = new Object();
    public static void main(String[] args) {
        addToHMap(1);
        addToHMap(7);
        addToHMap(6);
        addToHMap(13); 
        addToHMap(44);
        addToHMap(10);
        addToHMap(45);
        addToHMap(68);
        addToHMap(7);
        addToHMap(41);
        System.out.println(isEmpty());

        printConsole();
        System.out.println();
        try {
            System.out.println(printOneEl(20));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addToHMap(Integer number){
        hMap.put(number, OBJ);   
    } 


    private static boolean isEmpty(){
        return hMap.isEmpty();
    }


    private static void printConsole(){
        Iterator<Integer> iterator = hMap.keySet().iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }


    private static int printOneEl(int index){
        return (Integer)hMap.keySet().toArray()[index];
    }      
}