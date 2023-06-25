package BackEndProject;

import BackEndProject.container.Container;
import BackEndProject.method.Calculation;
import BackEndProject.method.Start;

import java.util.ArrayList;
import java.util.Scanner;


public class Test {

    public static void main(String[] args) {

        //Creating objects
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

        ArrayList<Double> totalWeightList = new ArrayList<>();

        totalWeightList.add(obj1.totalWeightOfItem(obj1.getWeightOfItem(),obj1.getQuantityOfItem()));
        totalWeightList.add(obj2.totalWeightOfItem(obj2.getWeightOfItem(),obj2.getQuantityOfItem()));
        totalWeightList.add(obj3.totalWeightOfItem(obj3.getWeightOfItem(),obj3.getQuantityOfItem()));
        totalWeightList.add(obj4.totalWeightOfItem(obj4.getWeightOfItem(),obj4.getQuantityOfItem()));

        double sumWeight = 0;
        for (int i = 0; i < totalWeightList.size();i++)
            sumWeight += totalWeightList.get(i);
        System.out.println("Total weight of all items is: " + sumWeight + " kg");
        System.out.println("---------------------------------------------------------------------");
        //////////////////////////////////////////////////////////////////////

        //////////////////////////////////////////////////////////////////////
        ArrayList<Double> totalVolumeList = new ArrayList<>();

        totalVolumeList.add(obj1.totalVolumeOfItem(obj1.getSizeOfItem1(),obj1.getSizeOfItem2(),obj1.getSizeOfItem3(),obj1.getQuantityOfItem()));
        totalVolumeList.add(obj2.totalVolumeOfItem(obj1.getSizeOfItem1(),obj1.getSizeOfItem2(),obj1.getSizeOfItem3(),obj1.getQuantityOfItem()));
        totalVolumeList.add(obj3.totalVolumeOfItem(obj1.getSizeOfItem1(),obj1.getSizeOfItem2(),obj1.getSizeOfItem3(),obj1.getQuantityOfItem()));
        totalVolumeList.add(obj4.totalVolumeOfItem(obj1.getSizeOfItem1(),obj1.getSizeOfItem2(),obj1.getSizeOfItem3(),obj1.getQuantityOfItem()));

        double sumVolume = 0;
        for (int i = 0; i < totalVolumeList.size();i++)
            sumVolume += totalVolumeList.get(i);
        System.out.println("Total volume of all items is : " + sumVolume + " cubic meter");
        System.out.println("---------------------------------------------------------------------");


        // Adding all items in List
        ArrayList<Object> allItemsList = new ArrayList<>();
        allItemsList.add(obj1.addItems());
        allItemsList.add(obj2.addItems());
        allItemsList.add(obj3.addItems());
        allItemsList.add(obj4.addItems());
        System.out.println(allItemsList);
        System.out.println("---------------------------------------------------------------------");



        Start objects = new Start(sumVolume, containerSmall.calcVolumeOfContainer(), containerBig.calcVolumeOfContainer());
        objects.bestShipping(sumVolume, containerSmall.calcVolumeOfContainer(), containerBig.calcVolumeOfContainer());
        objects.shippingPrice(sumVolume, containerSmall.calcVolumeOfContainer(), containerBig.calcVolumeOfContainer());


    }




}
