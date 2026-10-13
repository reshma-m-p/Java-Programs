package org.loop;

public class TestSimpleWhile {
    public static void main(String[] args) {
        int number=1;
        while(number<=10){
            System.out.print(number);
            number++;
        }

        System.out.println("\nDecreasing order");
        int num=10;
        while(num>=1){
            System.out.print(num+" ");
            num--;
        }

    }
}
