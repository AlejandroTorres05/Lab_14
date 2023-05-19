package com.example.lab14.dataBase;

import com.example.lab14.model.Movement;

import java.util.ArrayList;

public class AllMovements {

    private ArrayList<Movement> movements;

    private AllMovements (){
        this.movements = new ArrayList<>();
    }

    private static AllMovements instance = null;

    public static AllMovements getInstance (){
        if (instance == null)
            instance = new AllMovements();
        return instance;
    }

    public void add (Movement movement){
        this.movements.add(movement);
    }

    private ArrayList<Movement> getAll (){

        ArrayList<Movement> arrayList = new ArrayList<>();

        for (int i = this.movements.size()-1; i >= 0; i--){
            arrayList.add(this.movements.get(i));
        }

        return arrayList;
    }

    private ArrayList<Movement> getIncomes (){

        ArrayList<Movement> incomes = new ArrayList<>();

        for (int i = movements.size() -1; i >= 0; i --){
            if (this.movements.get(i).getType().equals("INGRESO")){
                incomes.add(this.movements.get(i));
            }
        }
        return incomes;
    }

    private ArrayList<Movement> getBills (){

        ArrayList<Movement> bills = new ArrayList<>();

        for (int i = this.movements.size()-1; i >= 0; i --){
            if (this.movements.get(i).getType().equals("GASTO")){
                bills.add(this.movements.get(i));
            }
        }
        return bills;
    }

    public ArrayList<Movement> getList (int option){

        switch (option){
            case 1:
                return getAll();
            case 2:
                return getIncomes();
            case 3:
                return getBills();
            default:
                return null;
        }
    }

    public double totalBalance (){
        double balance = 0;

        for (int i = 0; i < this.movements.size(); i ++){

            double temp = this.movements.get(i).getAmount();

            if (this.movements.get(i).getType().equals("GASTO")){
                temp *= -1;
            }

            balance += temp;
        }

        return balance;
    }
}
