package com.coderscampus.arraylist;

public class CustomArrayListApp {
    public static void main(String[] args) {
        example2();
        System.out.println();
        example1();
    }

    private static void example2() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        String[] nameArray = {
                "Bonjour - ",
                "Monsieur Gallaccio!",
                "Merci d'avoir commenté",
                "mon travail",
                "aujourd'hui.",
                "J'ai hâte",
                "de lire",
                "vos commentaires,",
                "dès que",
                "vous serez prêt."
        };

        CustomList<String> names = new CustomArrayList<>();
        for (String s : nameArray) {
            names.add(s);
        }
        for (int i = 0; i < names.getSize(); i++) {
            System.out.println(names.get(i));

        }
        System.out.println(names.getSize());
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    private static void example1() {
        CustomList<Integer> numbers = new CustomArrayList<>();
        // Add objects to CustomArrayList
        for (int i = 1; i <= 40; i++) {
            numbers.add(i);
        }
        // Get object at index in CustomArrayList
        for (int i = 0; i < numbers.getSize(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println(numbers.getSize());
        // Access the last element correctly
        System.out.println(numbers.get(numbers.getSize() - 1));
    }
}
