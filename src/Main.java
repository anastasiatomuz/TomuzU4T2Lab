public class Main {
    public static void main(String[] args){
//        for (int i = 1; i <= 10; i ++){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        for (int i = 1; i < 11; i ++){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        for (int i = 15; i >= 0; i --){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        for (int i = 15; i > -1; i --){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        for (int i = 1; i <= 15; i ++){
//            if (i % 2 != 0){
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//
//        for (int i = 1; i <= 15; i += 2){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//
//        for (int count = 5; count < 10; count++) {
//            System.out.print(count + " ");
//        }
//
//        for (int i = 20; i >= 0; i = i - 3) {
//            System.out.print(i + " ");
//        }
//
//        int sum = 0;
//        int x = 5;
//        for (int i = 0; i < 10 + x; i += 2) {
//            sum += i;
//        }
//        System.out.println(sum);
//
//        System.out.println("-----------------------------------");
//
//        //number 2
//
//        //a
//        int count1 = 5;
//        while (count1 < 10){
//            System.out.print(count1 + " ");
//            count1 ++;
//        }
//        System.out.println();
//
//        //b
//        int count2 = 20;
//        while (count2 >= 0){
//            System.out.print(count2 + " ");
//            count2 -= 3;
//        }
//        System.out.println();
//
//        //c
//        for (int i = 0; i <= 100; i += 5){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        for (int i = 10; i <= 50; i += 5){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//
//        System.out.println("-----------------------------------");
//        for (int i = 4; i < 12; i ++){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        for (int i = 4; i <= 11; i ++){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//
//        System.out.println("-----------------------------------");
//        for (int i = 4; i <= 14; i += 2){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        for (int i = 4; i <= 14; i ++){
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//
//        System.out.println("-----------------------------------");
//        for (int i = 6; i <= 100; i += 6){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        for (int i = 0; i <= 100; i += 6){
//            if (i != 0) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//
//        int x1 = 10;
//        for (int i = 0; i < x; i++) {
//            System.out.println(i);
//            x1--;
//        }
//
//
//        int num = 100;
//        for (int count = 1; count <= num; count++)
//        {
//            System.out.print(num + " ");
//            num = num / 2;
//        }
//
//        System.out.println("-----------------------------------");
        StringLoops loops = new StringLoops();

//        System.out.println("-----------------------------------");

//        System.out.println(loops.countCharacters("a", "Apple and banana"));
//        System.out.println(loops.countCharacters("A", "Apple and banana"));
//        System.out.println(loops.countCharacters("!", "Hello! Nice day!"));
//        System.out.println(loops.reverseString("hello!"));
//        System.out.println(loops.reverseString("Apples and bananas"));
//
//        System.out.println("-----------------------------------");
//        System.out.println(loops.reverseString2("hello!"));
//        System.out.println(loops.reverseString2("Apples and bananas"));

        System.out.println(loops.isPalindrome("mom"));
        System.out.println(loops.isPalindrome("dad"));
        System.out.println(loops.isPalindrome("bob"));
        System.out.println(loops.isPalindrome("noon"));
        System.out.println(loops.isPalindrome("deed"));
        System.out.println(loops.isPalindrome("12321"));
        System.out.println(loops.isPalindrome("aaaaaaa"));
        System.out.println(loops.isPalindrome("baaabbaaab"));
        System.out.println(loops.isPalindrome("civic"));
        System.out.println(loops.isPalindrome("kayak"));
        System.out.println(loops.isPalindrome("racecar"));
        System.out.println(loops.isPalindrome("my gym"));
        System.out.println(loops.isPalindrome("step on no pets"));
        System.out.println(loops.isPalindrome("45TTTT54"));
        System.out.println(loops.isPalindrome("no lemon no melon"));
        System.out.println(loops.isPalindrome("a nut for a jar of tuna"));
        System.out.println(loops.isPalindrome("! 1 2 3 4 M 6M4321!"));
        System.out.println(loops.isPalindrome("was it a car or a cat i saw"));
        System.out.println(loops.isPalindrome("a man a plan a canal panama"));
        System.out.println("-------");
        System.out.println(loops.isPalindrome("mod"));
        System.out.println(loops.isPalindrome("dang"));
        System.out.println(loops.isPalindrome("boo"));
        System.out.println(loops.isPalindrome("noonish"));
        System.out.println(loops.isPalindrome("indeed"));
        System.out.println(loops.isPalindrome("1234432"));
        System.out.println(loops.isPalindrome("civics"));
        System.out.println(loops.isPalindrome("kayaks"));
        System.out.println(loops.isPalindrome("racing car"));
        System.out.println(loops.isPalindrome("my gyms"));
        System.out.println(loops.isPalindrome("step on pets"));
        System.out.println(loops.isPalindrome("1 3 2 4 3 2 1"));
        System.out.println(loops.isPalindrome("AAADAA"));
        System.out.println(loops.isPalindrome("BaaBaaaB"));


    }
}
