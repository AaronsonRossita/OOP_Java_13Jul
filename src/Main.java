import animals.Animal;
import animals.Cat;
import animals.Dog;
import users.Address;
import users.PaymentMethod;
import users.UserRegular;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("A",13);
        Dog dog = new Dog("B",13);

//        System.out.println(cat.toString());
//
//        cat.printName();
//        dog.printName();
//
//        cat.printAge();
//        dog.printAge();

        Address address = new Address("TLV","Herzl",90,3);
        UserRegular userRegular = new UserRegular("a","b","c","d",address, PaymentMethod.PAYPAL);

//        userRegular.getAddress().getCity();

//        System.out.println(userRegular.getClass());

        MyGeneric generic = new MyGeneric<>(new Object());
        MyGeneric<String> generic1 = new MyGeneric<>("");
        MyGeneric<Football> generic2 = new MyGeneric<>(new Football(140.0));
        MyGeneric<Animal> generic3 = new MyGeneric<>(cat);
        MyGeneric<Animal> generic4 = new MyGeneric<>(dog);

//        generic2.printClassName();

        MyGeneric<Number> generic5 = new MyGeneric<>(4.0);
        MyGeneric<Integer> generic6 = new MyGeneric<>(4);
        byte b = 127;
        MyGeneric<Byte> generic7 = new MyGeneric<>(b);
        int x = 4;
        Integer y = 4;
        Double d = 5.2;
        Character c = 'c';
        Boolean bool = true;
//        System.out.println(y);

        MyGenericNumber myGenericNumber = new MyGenericNumber(9.2);

        Pair<Integer,String> pair1 = new Pair<>(0,"abc");

        String[] arr = {"abc","def","ghi"};
        int[] arr1 = new int[4];
        //arr[0]
        pair1.getValue();

        ArrayList list1 = new ArrayList<>();
        list1.add(1);
        list1.add("one");
        list1.add(256);
        list1.add(true);
        list1.add(cat);
        System.out.println(list1);

//        list1.remove(0);
//        list1.remove("one");
//
//        System.out.println(list1.contains(256));
//        System.out.println(list1.contains(700));

        ArrayList list2 = (ArrayList)list1.clone();
        System.out.println("list2 = " + list2);

        ArrayList list3 = new ArrayList();
        list3.addAll(list1);
        //list1.clear();



        System.out.println(list1);
        System.out.println("list3 = " + list3);








    }

}