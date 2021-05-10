package day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        i++; //increment ->only work for 1
        System.out.println("i = " + i);
        i++;
        i++;
        ++i;// also we can use like this
        ++i;
        System.out.println("i = " + i);

        int linesOfCode = 15;
        System.out.println("linesOfCode = " + linesOfCode);
        //increase linesOfCode by 1 , 3 diffrent ways that we learnt today.
        linesOfCode = linesOfCode + 1;
        linesOfCode += 1;
        linesOfCode++;//most commmon way yani en cok kullanilan bicim
        ++linesOfCode;
//        ++linesOfCode++; or +linesOfCodes+; ERROR.those are won't work.'
        // all above variable doing samething. all add one to variable.
        System.out.println("linesOfCode = " + linesOfCode);

        //4 DIFFRENT WAYS OF DECREASING BY 1
        linesOfCode = linesOfCode - 1;
        linesOfCode -= 1;
        linesOfCode--;//most commmon way yani en cok kullanilan bicim ->POSTDECREMENT
        --linesOfCode;//PREDECREMENT
        System.out.println("linesOfCode = " + linesOfCode);

        char letter = 'a';
        System.out.println("letter = " + letter);
        //LONG WAY DOESN'T WORK FOR VARIABLE CHAR
        letter++;//CHANGE TO NEXT CHARACTER IN ASCII.between to letter have only 1 difference t means if you have 1 it shows you next letter.ASCII.
        System.out.println("letter = " + letter);//output:b
        letter++;
        ++letter;
        System.out.println("letter = " + letter);
        letter--;
        System.out.println("letter = " + letter);
        letter++; letter++; letter++; //we can write like this too.
        System.out.println("letter = " + letter);





    }
}
