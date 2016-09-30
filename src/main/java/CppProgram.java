/**
 * Created by anzo0316 on 9/30/2016.
 */
public class CppProgram extends CreatProgrammCode {


    @Override
    void codeCreation() {
        System.out.println("" +
                "#include <iostream>\n" +
                "#include <conio.h>\n" +
                "\n" +
                "using namespace std;\n" +
                "\n" +
                "int main ()\n" +
                "{\n" +
                "    cout << \"Hello world!!!\\n\";\n" +
                "    _getch();\n" +
                "    return 0;\n" +
                "}");
    }

    @Override
    void debugging() {
        System.out.println(" *************************" +
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
        System.out.println("C++ Program starts\n\n");
    }
}
