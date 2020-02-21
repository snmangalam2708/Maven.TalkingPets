package io.zipcoder.polymorphism;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pets do you have");
        int a = sc.nextInt();
        sc.nextLine();
        List<Pet> petsList = new ArrayList<Pet>(a);
        System.out.println(a);
        System.out.println("\n");

        for (int i = 0; i < a; i++) {

            String kind = sc.nextLine();
            System.out.println("What kind of pet it is? ");
            System.out.println(kind);
            System.out.println("What is pets name");
            String name = sc.nextLine();
            System.out.println(name);

            if (kind.equals("Dog")) {
                Pet dog = new Dog();
                dog.setName(name);
                petsList.add(dog);
                System.out.println("What does it do to speak? ");
                dog.speak();
                System.out.println("\n");
            } else if (kind.equals("Cat")) {
                Pet cat = new Cat();
                cat.setName(name);
                petsList.add(cat);
                System.out.println("What does it do to speak? ");
                cat.speak();
                System.out.println("\n");
            } else if (kind.equals("Parrot")) {
                Pet parrot = new Parrot();
                parrot.setName(name);
                petsList.add(parrot);
                System.out.println("What does it do to speak? ");
                parrot.speak();
                System.out.println("\n");
            }
        }
    }
}
