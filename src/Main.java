public class Main {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i ++){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i < 11; i ++){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 15; i >= 0; i --){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 15; i > -1; i --){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= 15; i ++){
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for (int i = 1; i <= 15; i += 2){
            System.out.print(i + " ");
        }
        System.out.println();


        for (int count = 5; count < 10; count++) {
            System.out.print(count + " ");
        }

        for (int i = 20; i >= 0; i = i - 3) {
            System.out.print(i + " ");
        }

        int sum = 0;
        int x = 5;
        for (int i = 0; i < 10 + x; i += 2) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("-----------------------------------");

        //number 2

        //a
        int count1 = 5;
        while (count1 < 10){
            System.out.print(count1 + " ");
            count1 ++;
        }
        System.out.println();

        //b
        int count2 = 20;
        while (count2 >= 0){
            System.out.print(count2 + " ");
            count2 -= 3;
        }
        System.out.println();

        //c
        for (int i = 0; i <= 100; i += 5){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 10; i <= 50; i += 5){
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.println("-----------------------------------");
        for (int i = 4; i < 12; i ++){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 4; i <= 11; i ++){
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.println("-----------------------------------");
        for (int i = 4; i <= 14; i += 2){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 4; i <= 14; i ++){
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("-----------------------------------");
        for (int i = 6; i <= 100; i += 6){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i <= 100; i += 6){
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        int x1 = 10;
        for (int i = 0; i < x; i++) {
            System.out.println(i);
            x1--;
        }


        int num = 100;
        for (int count = 1; count <= num; count++)
        {
            System.out.print(num + " ");
            num = num / 2;
        }

        System.out.println("-----------------------------------");


        System.out.println("-----------------------------------");
        StringLoops loops = new StringLoops();
        System.out.println(loops.countCharacters("a", "Apple and banana"));
        System.out.println(loops.countCharacters("A", "Apple and banana"));
        System.out.println(loops.countCharacters("!", "Hello! Nice day!"));
        System.out.println(loops.reverseString("hello!"));
        System.out.println(loops.reverseString("Apples and bananas"));

    }
}
