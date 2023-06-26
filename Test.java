package SagdiiRahimovHW;

import SagdiiRahimovHW.container.Container;
import SagdiiRahimovHW.method.Calculation;
import SagdiiRahimovHW.method.Start;

import java.util.ArrayList;


abstract class Test {

    public static void main(String[] args) {

        //Creating item objects
        Calculation obj1 = new Calculation("Laptop", 60.0,
                50.0, 50.0,6.5, 100);
        Calculation obj2 = new Calculation("Mouse", 30.0,
                30.0, 20.0, 0.2, 200);
        Calculation obj3 = new Calculation("Desktop", 100.0,
                150.0, 50.0, 20.0, 150);
        Calculation obj4 = new Calculation("LCD", 120.0,
                140.0, 80.0, 2.6, 200);



        //Creating containers objects
        Container containerSmall = new Container("Small Container", 2.59,
                2.43, 6.06, 1000);
        Container containerBig = new Container("Big Container", 2.59,
                2.43, 12.01, 1800);


        //Adding total weight of all items in Arraylist to find sum of weight
        ArrayList<Double> totalWeightList = new ArrayList<>();
        totalWeightList.add(obj1.totalWeightOfItem());
        totalWeightList.add(obj2.totalWeightOfItem());
        totalWeightList.add(obj3.totalWeightOfItem());
        totalWeightList.add(obj4.totalWeightOfItem());

        //For loop to find sum of weight
        double sumWeight = 0;
        for (int i = 0; i < totalWeightList.size();i++)
            sumWeight += totalWeightList.get(i);
        System.out.println("Total weight of all items is: " + sumWeight + " kg" + " <---------");
        System.out.println("---------------------------------------------------------------------");

        //Adding total volume of all items in ArrayList to find sum of volume
        ArrayList<Double> totalVolumeList = new ArrayList<>();
        totalVolumeList.add(obj1.totalVolumeOfItem());
        totalVolumeList.add(obj2.totalVolumeOfItem());
        totalVolumeList.add(obj3.totalVolumeOfItem());
        totalVolumeList.add(obj4.totalVolumeOfItem());

        //For loop to find sum of volume
        double sumVolume = 0;
        for (int i = 0; i < totalVolumeList.size();i++)
            sumVolume += totalVolumeList.get(i);
        System.out.println("Total volume of all items is : " + sumVolume + " cubic meter" + " <---------");
        System.out.println("---------------------------------------------------------------------");


        // Adding all items in List
        ArrayList<Object> allItemsList = new ArrayList<>();
        allItemsList.add(obj1.addItems());
        allItemsList.add(obj2.addItems());
        allItemsList.add(obj3.addItems());
        allItemsList.add(obj4.addItems());
        System.out.println(allItemsList);
        System.out.println("---------------------------------------------------------------------");


        // Create object
        Start objects = new Start(sumVolume, containerSmall.calcVolumeOfContainer(), containerBig.calcVolumeOfContainer());


        //printItem method
        obj1.printItem();
        obj2.printItem();
        obj3.printItem();
        obj4.printItem();

//        //bestShipping method
        objects.bestShipping(sumVolume,sumWeight, containerSmall.calcVolumeOfContainer(), containerBig.calcVolumeOfContainer());
        System.out.println("---------------------------------------------------------------------");

        //shippingPrice method
        objects.shippingPrice(sumVolume, containerSmall.calcVolumeOfContainer(), containerBig.calcVolumeOfContainer());
        System.out.println("---------------------------------------------------------------------");

        //addOrder method
        objects.addOrder(sumVolume, containerSmall.calcVolumeOfContainer(), containerBig.calcVolumeOfContainer());
        System.out.println("---------------------------------------------------------------------");

        //printOrder method
        objects.printOrder(sumVolume, containerSmall.calcVolumeOfContainer(), containerBig.calcVolumeOfContainer());
        System.out.println("---------------------------------------------------------------------");


    }




}
