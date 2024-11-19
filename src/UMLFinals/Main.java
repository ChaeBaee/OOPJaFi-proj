package UMLFinals;

public class Main {
    public static void main(String[] args) {
        Apparels app1 = new Shorts("Large", "Blue", "Nigga", 1500.0, true, 10, Shorts.MaterialUsed.CANVAS, Shorts.ShortsStyle.SIXPOCKETS);
        Apparels app2 = new Shirt ("XX Large", "Blue", "Niggas", 1200.0, true, 10, Shirt.MaterialUsed.LINEN, Shirt.ShirtStyle.RELAXEDFIT);
        Apparels app3 = new Pants ("XX Small", "Blue", "Niggas", 1600.0, true, 10, Pants.MaterialUsed.CORDUROY, Pants.PantsStyle.CORDUROY_PANTS);

        Customer customer1 = new Customer("Luis", "Luis", 23, "Luis St,", "Luis@Luis.com", "09981235684");

        Order order1 = new Order(2, 6000, customer1, app1);
        Order order2 = new Order(2, 6000, customer1, app1);
        Order order3 = new Order(2, 6000, customer1, app1);

        System.out.println(order1.computeOrder());
        System.out.println(app1.getStock());
        app1.display();
        System.out.println("-----------------------------");
        System.out.println(order2.computeOrder());
        System.out.println(app1.getStock());
        app2.display();
        System.out.println("-----------------------------");
        System.out.println(order3.computeOrder());
        System.out.println(app1.getStock());
        app3.display();
//        System.out.println(order2.computeOrder());
//        System.out.println(app1.getStock());

    }
}
