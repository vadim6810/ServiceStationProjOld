package com.carservice.tender;

import com.carservice.vehicle.CarManufacture;
import com.carservice.vehicle.TypeVehicle;

import java.lang.String;

/**
 * Created by Legat on 8/29/2016.
 */
public class Tender {
    Integer id;
    Integer idClient;
    String tenderDescription;
    Date date;
    String typeVehicle;
    CarManufacture carManufacture;
    boolean tenderState;
}

    public List<Tender> getTenderByClient(int idClient){
        return idClient;
    }
    public List<Tender> getTenderForContractor(String rangeWork, String typeVehicle,String carManufacture){
        return idClient;
    }
    public void addTender(){

    }
    public void removeTender(){

    }
    public void changeTender(){

    }
