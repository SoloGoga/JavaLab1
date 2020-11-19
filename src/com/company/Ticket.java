package com.company;

public class Ticket {

    private int PlaceNumber;
    private Owner Owner;
    private String CarModel;
    private boolean PaidMonth;
    public boolean NowInTheParking;

    private void SetOwner(Owner owner){
        Owner = owner;
    }

    public Owner GetOwner(){
        return Owner;
    }

    private void SetPlaceNumber(int placeNumber){
        PlaceNumber = placeNumber > 0 && placeNumber < Parking.AMOUNT_OF_PLACE ? placeNumber : -1;
    }

    public int GetPlaceNumber(){
        return PlaceNumber;
    }

    private void SetCarModel(String carModel){
        CarModel = IsCorrect.IsCorrectTitle(carModel) ? carModel : "Incorrect car model";
    }

    public String GetCarModel(){
        return CarModel;
    }

    private void SetPaidMonth(boolean flag){
        PaidMonth = flag;
    }

    public boolean GetPaidMonth(){
        return PaidMonth;
    }

    private void SetNowInTheParking(boolean flag){
        NowInTheParking = flag;
    }

    public Ticket(Owner owner, String carModel, boolean paidMonth, boolean nowInTheParking){
        if(++Parking.AMOUNT_OF_CAR < Parking.AMOUNT_OF_PLACE) {
            SetOwner(owner);
            SetPlaceNumber(Parking.AMOUNT_OF_CAR);
            SetCarModel(carModel);
            SetPaidMonth(paidMonth);
            SetNowInTheParking(nowInTheParking);
        }
        else
            System.out.println("No parking spaces.");
    }

    @Override
    public String toString() {
        return Owner + "\nParking place number: " + PlaceNumber
                     + ",\nCar model: " + CarModel
                     + ",\nMonth payment: " + PaidMonth
                     + ",\nIn the parking: " + NowInTheParking + ".\n";
    }
}
