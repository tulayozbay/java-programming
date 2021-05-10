package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testng, maven, cucumber";
        //first comma
        System.out.println(technologies.indexOf(","));//4 --> because first , begins  th line. line starts 01234...
        //last comma
        System.out.println(technologies.lastIndexOf(","));//40-->it is going to find last comma with lastIndexOf
        //for middle one, we need to loop-->IMPORTANT
        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index " + indexOfJava);//0-->because java intex start 0 as above

        int idxOfCss = technologies.indexOf("css");
        System.out.println("css is at index " + idxOfCss);//12--> because it placed on 12. yukardanda sayabilirsin

        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber is at index " + indexOfCucumber);//42

        int indexOfSql = technologies.indexOf("sql");//not present / cannot find it
        System.out.println("sql is at index " + indexOfSql);//-1 --> because eit is cannot find it-technologies not contain sql

        //technologies containd "maven" ?
        if (technologies.contains("maven")) {
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }

        if (technologies.indexOf("maven") > -1) {
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }

    }
}
