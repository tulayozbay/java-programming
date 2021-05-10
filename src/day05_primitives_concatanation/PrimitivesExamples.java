package day05_primitives_concatanation;

public class PrimitivesExamples {
    public static void main(String[] args){
        //***** WHOLE NUMBER/INTEGER TYPES *****
        byte byteValue=100;
        short shortValue=3200;
        int intValue=1234567890;
        long longValue=1234567891L;
        //***** DECIMAL NUMBERS/FLOATING POINT TYPES *****
        float floatValue=2345.55F;
        double doubleValue=45582652554645945.25545;  //4558265.25D; also valid but not necessary
        //***** CHARACTER TYPE *****
        char charValue='a';  // you can put only one character in the single quote.
        //***** boolean-> true/false *****
        boolean booleanValue=true; //or boolean booleanValue=false;

        //PRINT VALUABLE VALUE

        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(charValue);
        System.out.println(booleanValue);
    }
}
