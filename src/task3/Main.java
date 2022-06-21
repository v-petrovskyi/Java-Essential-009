package task3;

public class Main {
    public static void main(String[] args) {
        MyDictionary<String, String> dictionary = new MyDictionary<>();
        dictionary.add("sunshine","сонячна погода");
        dictionary.add("lightning","блискавка");
        dictionary.add("puddles","калюжі");
        dictionary.add("hailstones","град");
        dictionary.add("raindrops","краплі дощу");
        System.out.println("puddles - " + dictionary.get("puddles"));
        System.out.println("кількість слів у словнику: " + dictionary.getLength());

    }
}
