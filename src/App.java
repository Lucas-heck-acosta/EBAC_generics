public class App {

    public static void main(String[] args)
    {
        CarList<Car> lista = new CarList<>();
        lista.addCar(new Civic());
        lista.addCar(new HRV());
        lista.addCar(new Corolla());

        lista.printList();
    }
}
