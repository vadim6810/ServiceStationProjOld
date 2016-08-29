package com.carservice.tender;

import com.carservice.vehicle.CarManufacture;
import com.carservice.vehicle.TypeVehicle;

/**
 * Created by Legat on 8/29/2016.
 */
public class Tender {
    Integer id;
    Integer idClient;
    String tenderDescription;
    TypeVehicle typeVehicle;
    CarManufacture carManufacture;
    boolean tenderState;
}
