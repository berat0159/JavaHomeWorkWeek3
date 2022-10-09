import Credi.CrediManager;
import Credi.EmekliCredi;
import Credi.TarımCredi;

public class Main {


    public static void main(String[] args) {

        Customer customer=new Customer();
        customer.id=1;
        customer.firstName="berat";
        customer.lastName="erdem";
        customer.city="diyarbakir";

        Person person=new Person();
        person.id=25;
        person.nationalIdentity="france";

        Company company=new Company();
        company.companyName="vestel";
        company.taxNumber="20000";
        company.id=34;

        CustomerManager customerManager=new CustomerManager(new Person());
        customerManager.calculate();


        CrediManager crediManager=new CrediManager(new TarımCredi());
        crediManager.Calculate();


    }
}