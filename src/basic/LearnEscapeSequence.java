package basic;

public class LearnEscapeSequence {

    //Escape Sequence

    public static void main(String[] args) {
        System.out.println("This is QA Engineering class");
        System.out.println("This is QA \tEngineering class"); // \t = creates space
        System.out.println("This is QA Engineering class\b1"); // \b = delete 1 char backwards
        System.out.println("This is QA Engineering \nclass"); // \n = next line
        System.out.println("This is QA \'Engineering\'class"); // \' = puts the word inside ' and '
        System.out.println("This is QA \"Engineering\" class"); // \" = puts the word inside " and "
        System.out.println("This is QA Engineering \\class"); // \\ = puts a \ infront of the word
        System.out.println("This is QA \rEngineering class");// \r = next line
        System.out.println("This is QA \fEngineering class");// \f = try on IntelliJ

    }

}
