package SagdiiRahimovHW.method;



import SagdiiRahimovHW.items.Item;

import java.util.ArrayList;


public class Calculation extends Item {
    //Sub Class which inherit from Item class
    //Attributes
    private String nameOfItem;
    private double sizeOfItem1;
    private double sizeOfItem2;
    private double sizeOfItem3;
    private double weightOfItem;
    private int quantityOfItem;


    //Constructor
    public Calculation() {
    }

    public Calculation(String nameOfItem, double sizeOfItem1, double sizeOfItem2, double sizeOfItem3, double weightOfItem, int quantityOfItem) {
        super(nameOfItem, sizeOfItem1, sizeOfItem2, sizeOfItem3, weightOfItem, quantityOfItem);
        this.nameOfItem = nameOfItem;
        this.sizeOfItem1 = sizeOfItem1;
        this.sizeOfItem2 = sizeOfItem2;
        this.sizeOfItem3 = sizeOfItem3;
        this.weightOfItem = weightOfItem;
        this.quantityOfItem = quantityOfItem;
    }

    //Getter and Setter
    @Override
    public String getNameOfItem() {
        return nameOfItem;
    }

    @Override
    public void setNameOfItem(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }

    @Override
    public double getSizeOfItem1() {
        return sizeOfItem1;
    }

    @Override
    public void setSizeOfItem1(double sizeOfItem1) {
        this.sizeOfItem1 = sizeOfItem1;
    }

    @Override
    public double getSizeOfItem2() {
        return sizeOfItem2;
    }

    @Override
    public void setSizeOfItem2(double sizeOfItem2) {
        this.sizeOfItem2 = sizeOfItem2;
    }

    @Override
    public double getSizeOfItem3() {
        return sizeOfItem3;
    }

    @Override
    public void setSizeOfItem3(double sizeOfItem3) {
        this.sizeOfItem3 = sizeOfItem3;
    }

    @Override
    public double getWeightOfItem() {
        return weightOfItem;
    }

    @Override
    public void setWeightOfItem(double weightOfItem) {
        this.weightOfItem = weightOfItem;
    }

    @Override
    public int getQuantityOfItem() {
        return quantityOfItem;
    }

    @Override
    public void setQuantityOfItem(int quantityOfItem) {
        this.quantityOfItem = quantityOfItem;
    }



    // Methods
    // totalVolume method
    public double totalVolumeOfItem(){
        double sol = ((this.sizeOfItem1 * this.sizeOfItem2 * this.sizeOfItem3) * 0.000001) * this.quantityOfItem;
        System.out.println("Total volume of item " + this.nameOfItem + " is: " + sol + " cube meter");
        return sol;
    }

    // totalWeight method
    public double totalWeightOfItem(){
        double solution = this.quantityOfItem * this.weightOfItem;
        System.out.println("The weight of item " + this.nameOfItem + " is: " + solution +" kg");
        return solution;
    }

    // bestShipping method
    public void bestShipping(double totalVolume, double totalWeight,double smallContainerVolume,
                             double bigContainerVolume) {

        int bigContainer = 0;
        int smallContainer = 0;

        while (totalVolume > 0 && totalWeight > 0) {
            if (totalVolume > bigContainerVolume) {
                bigContainer += 1;
                totalVolume -= bigContainerVolume;
            } else if (totalVolume >= smallContainerVolume ) {
                smallContainer += 1;
                totalVolume -= smallContainerVolume;
            }
            else{
                smallContainer += 1;
                totalVolume = 0;
            }

        }

        System.out.println(bigContainer + " big containers");
        System.out.println(smallContainer + " small containers");
    }

    // shippingPrice method
    public double shippingPrice(double sumVolume, double smallContainerVolume, double bigContainerVolume){
        double bigContainer = 0;
        double smallContainer = 0;
        while (bigContainerVolume < sumVolume){
            bigContainer += 1800;
            sumVolume -= bigContainerVolume;
            }
        if (smallContainerVolume > sumVolume && sumVolume < smallContainerVolume ){
            smallContainer += 1000;
        }
        else if (totalWeightOfItem() < 500){
            smallContainer += 1200;
        }


        double totalPrice = bigContainer + smallContainer;
        System.out.println("Shipping price is: " + totalPrice + " Euro");
        return totalPrice;
    }

    //addItems method
    public Object addItems(){
        ArrayList <Object> listOfItem = new ArrayList<>();
        listOfItem.add(this.nameOfItem);
        listOfItem.add(this.sizeOfItem1);
        listOfItem.add(this.sizeOfItem2);
        listOfItem.add(this.sizeOfItem3);
        listOfItem.add(this.weightOfItem);
        listOfItem.add(this.quantityOfItem);
        System.out.println(listOfItem);
        return listOfItem;
    }


    // addOrder method
    public double addOrder(double sumVolume,double smallContainerVolume, double bigContainerVolume){
        ArrayList<Double> myTotalPrice = new ArrayList<>();
        double bigContainer = 0;
        double smallContainer = 0;
        while (bigContainerVolume < sumVolume){
            bigContainer += 1;
            sumVolume -= bigContainerVolume;
            if (smallContainer > sumVolume){
                smallContainer += 1;
            }
            else if (sumVolume < smallContainerVolume){
                smallContainer += 1;
            }
        }
        double totalPrice = (bigContainer * 1800) + (smallContainer * 1000);
        myTotalPrice.add(totalPrice);
        myTotalPrice.add(bigContainer);
        myTotalPrice.add(smallContainer);
        System.out.println("Shipping price is: " + totalPrice + " Euro");
        return totalPrice;

    }

    // printItem method
    public void printItem(){
        System.out.println("The name of item is: " + this.nameOfItem
                + "\nThe size of item: " + this.sizeOfItem1
                + "\nThe size of item: " + this.sizeOfItem2
                + "\nThe size of item: " + this.sizeOfItem3
                + "\nThe weight of item: " + this.weightOfItem
                + " kg"
                + "\nThe quantity of item: " + this.quantityOfItem
        );
        System.out.println("---------------------------------------");
    }

    // printOrder method
    public void printOrder(double sumVolume,double smallContainerVolume, double bigContainerVolume){
        double bigContainer = 0;
        double smallContainer = 0;
        while (bigContainerVolume < sumVolume){
            bigContainer += 1;
            sumVolume -= bigContainerVolume;
            if (smallContainer > sumVolume){
                smallContainer += 1;
            }
            else if (sumVolume < smallContainerVolume){
                smallContainer += 1;
            }
        }
        double totalPrice = (bigContainer * 1800) + (smallContainer * 1000);
        System.out.println("Your order: " + bigContainer + " big containers " + "and " + smallContainer + " small containers");
        System.out.println("Shipping price is: " + totalPrice + " Euro");
    }
}
