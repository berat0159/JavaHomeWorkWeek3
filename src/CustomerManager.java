public class CustomerManager {

    private Customer customer;
    public CustomerManager(Customer customer){
        this.customer=customer;
    }


    public void calculate(){
        System.out.println("Hesaplandı:");
    }
    public void save(){
        System.out.println("kaydedildi:");
    }
}
