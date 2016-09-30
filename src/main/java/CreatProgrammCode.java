/**
 * Created by anzo0316 on 9/30/2016.
 */
public abstract class CreatProgrammCode {


    abstract void codeCreation();

    abstract void debugging();

    abstract void compile();

    abstract void testing();

    abstract void start();

    final void deploy() {

        this.codeCreation();
        this.debugging();
        this.compile();
        this.testing();
        this.start();
    }


}
