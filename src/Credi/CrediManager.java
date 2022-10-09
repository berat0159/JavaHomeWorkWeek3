package Credi;

public class CrediManager {

    private BaseCredi baseCredi;
    public CrediManager(BaseCredi baseCredi){
        this.baseCredi=baseCredi;
    }

    public void Calculate(){


        baseCredi.calculate();



    }
}
