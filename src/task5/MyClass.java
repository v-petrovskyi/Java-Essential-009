package task5;

public class MyClass {
    public static void main(String[] args) {
        Animal dog =  factoryMethod("dog");
        dog.voice();
        Animal cat =  factoryMethod("cat");
        cat.voice();
    }

    static Animal factoryMethod(String type){
        if (type.equalsIgnoreCase("dog")){
        return new Dog();
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        } else {
            throw new RuntimeException("non-existent type");
        }
    }

}
