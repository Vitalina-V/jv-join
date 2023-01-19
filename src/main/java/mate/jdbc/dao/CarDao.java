package mate.jdbc.dao;

import java.util.List;
import mate.jdbc.model.Car;

public interface CarDao {
    Car creare(Car car);

    Car get(Long id);

    boolean delete(Long carId);

    Car update(Car car);

    List<Car> getAll();

    List<Car> getAllByDriver(Long driverId);
}
