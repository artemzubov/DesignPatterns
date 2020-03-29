package ru.spb.zubov.creational.builderClassic;

import ru.spb.zubov.creational.builderClassic.components.Engine;
import ru.spb.zubov.creational.builderClassic.components.GPSNavigator;
import ru.spb.zubov.creational.builderClassic.components.Transmission;
import ru.spb.zubov.creational.builderClassic.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setCarType(CarType carType);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
