package task2;

public class Test {
    public static void main(String[] args) {

        InterfaceMyArrayList<Integer> list = new MyArrayListImpl<>();



        list.add(0);        // метод добавления элемента
        list.add(1);
        list.add(7);
        System.out.println(list.get(2)); //индексатор для получения значения элемента по указанному индексу
        list.add(2, 10);
        System.out.println("size = " + list.size()); // для получения общего количества элементов






    }
}
