package BackEndProject.method;


import BackEndProject.items.Item;

import java.util.ArrayList;


public class Calculation extends Item {
    //Attributes for item
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
    public double totalVolumeOfItem(double size1, double size2, double size3,double quantity){
        size1 = this.sizeOfItem1;
        size2 = this.sizeOfItem2;
        size3 = this.sizeOfItem3;
        quantity = this.quantityOfItem;
        double sol = ((size1 * size2 * size3) * 0.000001) * quantity;
        System.out.println("Total volume of item " + this.nameOfItem + " is: " + sol + " cube meter");
        return sol;
    }

    // totalWeight method
    public double totalWeightOfItem(double totalWeight, double totalQuantity){
        totalWeight = this.weightOfItem;
        totalQuantity = this.quantityOfItem;
        double solution = totalQuantity * totalWeight;
        System.out.println("The weight of item " + this.nameOfItem + " is: " + solution +" kg");
        return solution;
    }

    // bestShipping method
    public double bestShipping(double sumVolume,double smallContainerVolume, double bigContainerVolume){
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
//        System.out.println(bigContainer + " big containers");
//        System.out.println(smallContainer + " small containers");
        return 0 ;
    }

    // shippingPrice
    public double shippingPrice(double sumVolume,double smallContainerVolume, double bigContainerVolume){
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
//        System.out.println("Shipping price is: " + totalPrice + " Euro");
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
//        System.out.println(listOfItem);
        return listOfItem;
    }



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
        System.out.println("Total price" + myTotalPrice );
//        System.out.println("Shipping price is: " + totalPrice + " Euro");
        return totalPrice;

    }

    public void printItem(){
        System.out.println("The name of item is: " + this.nameOfItem
                + "\nThe size of item: " + this.sizeOfItem1
                + "\nThe size of item: " + this.sizeOfItem2
                + "\nThe size of item: " + this.sizeOfItem3
                + "\nThe weight of item: " + this.weightOfItem
                + " gram"
                + "\nThe quantity of item: " + this.quantityOfItem
        );
        System.out.println("---------------------------------------");
    }

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



    //    public double shippingPrice(double sumVolume,double smallContainerVolume, double bigContainerVolume){
//        double smallCon = 0;
//        double bigCon = 0;
//        while (bigContainerVolume < sumVolume){
//            bigCon += 1;
//            sumVolume -= bigContainerVolume;
//            if (smallContainerVolume > sumVolume){
//                smallCon += 1;
//            }
//        }
//        double price = bigCon * 1800  smallCon * 1000;
//        System.out.println(bigCon + " big containers");
//        System.out.println(smallCon + " small containers");
//        return 0;
//    }
//    public void addItems(String name, double size1, double size2,
//                           double size3, double weight, double quantity){
//        name = this.nameOfItem;
//        size1 = this.sizeOfItem1;
//        size2 = this.sizeOfItem2;
//        size3 = this.sizeOfItem3;
//        weight = this.weightOfItem;
//        quantity = this.quantityOfItem;
//        System.out.println("The name of item: " + name +
//                ", size1: " + size1 + ", size2: " + size2
//                + ", size3: " + size3 + ", weight: " + weight
//                        + ", quantity: " + quantity
//                );
//
//    };



    // bestShipping Method
//    public double bestShipping(double sumVolume,double smallContainerVolume, double bigContainerVolume){
//        double smallCon = 0;
//        double bigCon = 0;
//        double reminder = 0;
//        ArrayList<Double> myReminder = new ArrayList<>();
//        if (bigContainerVolume < sumVolume){
//            bigCon += 1;
//            sumVolume -= bigContainerVolume;
//        }
//        else reminder += sumVolume;
//
//        System.out.println("This is reminder" + myReminder);
//
//
//        System.out.println(bigCon + " big containers");
//        System.out.println(smallCon + " small containers");
//        return 0;
//    }

//    public double bestShipping(double totalVolumeObj1,
//                               double totalVolumeObj2, double totalVolumeObj3,
//                               double totalVolumeObj4,double smallContainerVolume, double bigContainerVolume){
//        double sumVolume = totalVolumeObj1 + totalVolumeObj2 + totalVolumeObj3 + totalVolumeObj4;
//
//        double bigContainer = 0;
//        double smallContainer = 0;
//        while (bigContainerVolume < sumVolume){
//            bigContainer += 1;
//            sumVolume -= bigContainerVolume;
//            if (smallContainer > sumVolume){
//                smallContainer += 1;
//            }
//            else if (sumVolume < smallContainerVolume){
//                smallContainer += 1;
//            }
//        }
//        System.out.println(bigContainer + " big containers");
//        System.out.println(smallContainer + " small containers");
//        return 0;
//    }







}
