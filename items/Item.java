package BackEndProject.items;

public class Item {
    //Super Class
    //Attributes
    private String nameOfItem;
    private double sizeOfItem1;
    private double sizeOfItem2;
    private double sizeOfItem3;
    private double weightOfItem;
    private int quantityOfItem;




    //Constructor
    public Item() {
    }

    public Item(String nameOfItem, double sizeOfItem1, double sizeOfItem2,
                double sizeOfItem3, double weightOfItem, int quantityOfItem) {
        this.nameOfItem = nameOfItem;
        this.sizeOfItem1 = sizeOfItem1;
        this.sizeOfItem2 = sizeOfItem2;
        this.sizeOfItem3 = sizeOfItem3;
        this.weightOfItem = weightOfItem;
        this.quantityOfItem = quantityOfItem;
    }

    //Getter and Setter
    public String getNameOfItem() {
        return nameOfItem;
    }

    public void setNameOfItem(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }

    public double getSizeOfItem1() {
        return sizeOfItem1;
    }

    public void setSizeOfItem1(double sizeOfItem1) {
        this.sizeOfItem1 = sizeOfItem1;
    }

    public double getSizeOfItem2() {
        return sizeOfItem2;
    }

    public void setSizeOfItem2(double sizeOfItem2) {
        this.sizeOfItem2 = sizeOfItem2;
    }

    public double getSizeOfItem3() {
        return sizeOfItem3;
    }

    public void setSizeOfItem3(double sizeOfItem3) {
        this.sizeOfItem3 = sizeOfItem3;
    }

    public double getWeightOfItem() {
        return weightOfItem;
    }

    public void setWeightOfItem(double weightOfItem) {
        this.weightOfItem = weightOfItem;
    }

    public int getQuantityOfItem(){
        return quantityOfItem;
    }

    public void setQuantityOfItem(int quantityOfItem){
        this.quantityOfItem = quantityOfItem;
    }


    //Methods
    public void printInfo(){
        System.out.println("The name of item: "
                        + this.nameOfItem
                        + "\nThe size of item: "
                        + this.sizeOfItem1 + "cm, "
                        + this.sizeOfItem2 + "cm, "
                        + this.sizeOfItem3 + "cm"
                        + "\nThe weight of item: "
                        + this.weightOfItem
                        + "\nThe quantity of item is: "
                        + + this.quantityOfItem
                );
    }


    public double calculateVolumeOfItem() {
        double solution = (this.sizeOfItem1 * this.sizeOfItem2 * this.sizeOfItem3) * 0.000001;
        System.out.println("The volume of item: " + this.nameOfItem + " " + solution + " meter cube");
        return solution;
    }

//    public double findWeight(){
//
//        double solution = this.quantityOfItem * this.weightOfItem;
//        System.out.println("The weight of item is:" + solution);
//        return solution;
//    }


}


