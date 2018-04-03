package pl.sternik.dk.sklep.src.main.java.pl.sternik.dk;

public class Order {
    double amount;
    Platnosc platnosc;

    public Order (Platnosc type) {
        platnosc = type;
    }

    public boolean payForOrder(){
        return platnosc.zaplac(amount);
    }

    public boolean payForOrder(Platnosc platnosc1){
        return platnosc.zaplac(amount);
    }

    public static void main (String[] args){
        Order order = new Order(new Karta());
        order.payForOrder();
    }
}
