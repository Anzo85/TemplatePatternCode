/**
 * Created by anzo0316 on 9/30/2016.
 */
public class JavaProgramm extends CreatProgrammCode {


    @Override
    void codeCreation() {
        System.out.println("class HelloWorld {\n" +
                "    public static void main(String[] args) {\n" +
                "        System.out.println(\"Hello World!\");\n" +
                "    }\n" +
                "}");
    }

    @Override
    void debugging() {
        System.out.println(" ************************* \n" +
                "Bug hasn't been found");
    }

    @Override
    void compile() {
        System.out.println("Compile has been complete !");
    }

    @Override
    void testing() {
        System.out.println(" Tests have been passed !");
    }

    @Override
    void start() {
        System.out.println("Java Program starts\n\n");
    }
}
