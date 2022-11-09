import java.util.Locale;

public class StringLoops
{
    // default constructor; no instance variables
    public StringLoops() { }

    /* Returns the number of times "character" appears in "searchString"
       This should be NON-case sensitive!

       Examples:
       - if character = "a" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "A" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2

        DO THIS WITH A FOR LOOP!
      */
    public int countCharacters(String character, String searchString) {
        String newStr = searchString.toLowerCase();
        int count = 0;
        String chara = character.toLowerCase();
        for (int i = 0; i < newStr.length(); i ++){
            if (newStr.substring(i, i + 1).equals(chara) ){
                count ++;
            }
        }
        return count;
    }

    /* Returns the original string reversed

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString(String origString) {
        String newStr = "";
        for (int i = origString.length() - 1; i >= 0; i--){
            newStr += origString.substring(i, i + 1);
        }
        return newStr;
    }


    public String reverseString2(String origString) {
        String newStr = "";
        for (int i = 0; i < origString.length(); i++){
            String character = origString.substring(i,i+1);
            newStr = character + newStr;
        }
        return newStr;
    }

    /* Returns a String with all instances of "searchString" removed from "origString";
       matches should be case sensitive (i.e. no need to worry about lowercase)

     - if searchString = "an" and origString = "canned beans and bananas",
       this method returns "Apples d bas"
     - if searchString = "tat" and origString = "Ratatattat",
       this method returns "Raat"
     - if searchString = "lower" and origString = "sunflower",
       this method returns "sunf"
     - if searchString = "haha" and origString = "Hahahahaha",
       this method returns "Ha" (case sensitive, so leading "Haha" isn’t a match)
     - if searchString = "HAHA" and origString = "Hahahahaha",
       this method returns "Hahahahaha" (no matches due to case)
     - if searchString = "rain" and origString = "it’s the brain drain pain train",
       this method returns "it’s the b d pain t"
     - if searchString = "lol" and origString = "lolololol",
       this method returns "ool"
     - if searchString = "was" and origString = "I was about to call you, wasn’t I?",
       this method returns "I  about to call you, n’t I?"
     - if searchString = "but" and origString = "I was about to call you, wasn’t I?",
       this method returns "I was about to call you, wasn’t I?" (no matches)
     - if searchString = "AB" and origString = "ABABABABABC",
       this method returns "C"
     - if searchString = "AB" and origString = "AAAAABBBBBC",
       this method returns "C"
    */
    public String removeString(String searchString, String origString) {
        int lenSerStr = searchString.length();
            int loc = origString.indexOf(searchString);
            while(origString.contains(searchString)){
                origString = origString.substring(0, loc) + origString.substring(loc + lenSerStr);

                loc = origString.indexOf(searchString);
            }
        return origString;
    }

    /* Prints all integers from fromNum through toNum, separated by
     a commas and a space, on a single line;
     there should NOT be a comma after the final number.
     If fromNum == toNum, print just the number and no comma.
     If fromNum > toNum, the numbers should be printed in descending order.
     After all numbers are printed, move the cursor to the next line.

     Examples:
     - if fromNum = 0 and toNum = 5, this method should print: 0, 1, 2, 3, 4, 5
     - if fromNum = -3 and toNum = 2, this method should print: -3, -2, -1, 0, 2
     - if fromNum = 8 and toNum = 1, this method should print: 8, 7, 6, 5, 4, 3, 2, 1
     - if fromNum = 4 and toNum = 4, this method should print: 4
     - if fromNum = 0 and toNum = 0, this method should print: 0
    */
    public void commaSeparated(int fromNum, int toNum) {
        if (fromNum == toNum){
            System.out.println(fromNum);
        } else if (fromNum > toNum){
            String str = "";
            for (int i = fromNum; i >= toNum; i--) {
                if (i != toNum) {
                    str += i + ", ";
                } else {
                    str += i;
                }
            }
            System.out.println(str);
        }
        else {
            String str = "";
            for (int i = fromNum; i <= toNum; i++) {
                if (i != toNum) {
                    str += i + ", ";
                } else {
                    str += i;
                }
            }
            System.out.println(str);
        }
    }

    /* Returns true if myString is a palindrome, i.e. the characters read the same
    forwards and backwards, and false otherwise. Don't worry about case.
    NOTE!  Spaces should be disregarded when determining if it's a palindrome.
    "no lemon no melon" is a palindrome!

     Examples:
     - myString = "mom", return true
     - myString = "dad", return true
     - myString = "bob", return true
     - myString = "noon", return true
     - myString = "deed", return true
     - myString = "12321", return true
     - myString = "aaaaaaa", return true
     - myString = "baaabaaab", return true
     - myString = "civic", return true
     - myString = "kayak", return true
     - myString = "racecar", return true
     - myString = "my gym", return true
     - myString = "step on no pets", return true
     - myString = "45TTGTT54", return true
     - myString = "no lemon no melon", return true
     - myString = "a nut for a jar of tuna", return true
     - myString = "! 1 2 3 4 M 6M4321!", return true
     - myString = "was it a car or a cat i saw", return true
     - myString = "a man a plan a canal panama", return true
     - myString = "mod", return false
     - myString = "dang", return false
     - myString = "boo", return false
     - myString = "noonish", return false
     - myString = "indeed", return false
     - myString = "1234432", return false
     - myString = "civics", return false
     - myString = "kayaks", return false
     - myString = "racing car", return false
     - myString = "my gyms", return false
     - myString = "step on pets", return false
     - myString = "1 3 2 4 3 2 1", return false
     - myString = "AAADAA", return false
     - myString = "BaaBaaaB", return false
    */
    public boolean isPalindrome(String myString) {
        String strNoSpace = myString.replace(" ", "");
        String strReversed = reverseString(strNoSpace);
        return strReversed.equals(strNoSpace);
    }



}


