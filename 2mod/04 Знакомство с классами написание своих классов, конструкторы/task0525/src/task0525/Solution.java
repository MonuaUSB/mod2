package task0525;

/* 
По аналогии с классом Duck (утка) создай классы Cat (кошка) и Dog (собака).
Подумай, что должен возвращать метод toString в классах Cat и Dog?
В методе main создай по два объекта каждого класса и выведи их на экран.
Объекты класса Duck уже созданы и выводятся на экран.


Requirements:
1. Создай класс Cat(кошка).
2. Создай класс Dog(собака).
3. У класса Cat должен быть верно реализован метод toString.
4. У класса Dog должен быть верно реализован метод toString.
5. В методе main создай два объекта типа Cat.
6. В методе main создай два объекта типа Dog.
7. Выведи все созданные объекты на экран.*/

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        //напишите тут ваш код
        cat cat1 = new cat();
        cat cat2 = new cat();
        System.out.println(cat1);
        System.out.println(cat2);

        dog dog1 = new dog();
        dog dog2 = new dog();
        System.out.println(dog1);
        System.out.println(dog2);

    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }
    public static class cat {
        public String toString() {return "cat";}
    }
    public static class dog {
        public String toString() {return "dog";}
    }

    //напишите тут ваш код
}
