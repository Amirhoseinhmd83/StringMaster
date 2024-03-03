public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {

        String[] word = sentence.split(" ");
        if (number > word.length) {
            return (" Number = " + number + " is out Of Bound");//عدد وارد شده خارج محدوده!!
        } else {
            return word[number - 1];//آرایه ها از اندیس صفر شروع میشوند برای همین -1 را قرار دادیم
        }
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {
        int odd = 0;
        int even = 0;
        int result = 0;
        if (searchForEven) {
            for (int i = 0;  number.length() > i ; i++) {
                switch (number.charAt(i)) {
                    case '0': case '2': case '4': case '6': case '8':
                        even++;
                }
                result = even;
            }

        } else {
            for(  int i = 0;  number.length() > i ; i++) {
                switch (number.charAt(i)) {
                    case '1': case '3': case '5': case '7': case '9':
                        odd++;
                }
                result = odd;
            }

        }
        return result;
    }


    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {
        return null;
    }
}
