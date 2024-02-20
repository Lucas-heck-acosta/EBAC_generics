import java.util.ArrayList;
import java.util.List;

public class CarList<T extends Car> {
    private List<T> carList;

    public CarList() {
        carList = new ArrayList<>();
    }

    public void addCar(T car){
        carList.add(car);
    }

    public void printList() {
        for (T car: carList) {
            System.out.println("Carro modelo: " + car.getModelo());
        }
    }
}
