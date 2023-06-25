package BackEndProject.container;

public class Container {
        //Attributes
        private String nameOfContainer;
        private double height;
        private double wide;
        private double length;
        private double shippingCost;


        //Constructor
        public Container() {
        }

        public Container(String nameOfContainer, double height, double wide,
                         double length, double shippingCost) {
            this.nameOfContainer = nameOfContainer;
            this.height = height;
            this.wide = wide;
            this.length = length;
            this.shippingCost = shippingCost;
        }

        //Getter and Setter
        public double getShippingCost() {
            return shippingCost;
        }

        public void setShippingCost(double shippingCost) {
            this.shippingCost = shippingCost;
        }

        public String getNameOfContainer(){
            return  nameOfContainer;
        }

        public void setNameOfContainer(String nameOfContainer) {
            this.nameOfContainer = nameOfContainer;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getWide() {
            return wide;
        }

        public void setWide(double wide) {
            this.wide = wide;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }


        //Methods
        public double printContainerInfo(){
            System.out.println("The type of container is: " + this.nameOfContainer
                    + "\nThe height of container: " + this.height + " meter"
                    + "\nThe wide is: " + this.wide + " meter"
                    + "\nThe length is: " + this.length + " meter"
                    + "\nThe shipping cost: " + this.shippingCost
                    + " Euro"
            );
            System.out.println("-----------------------------");
            return 0;
        }

        public double calcVolumeOfContainer(){
            double sol = length * wide * height;
//            System.out.println("The volume of " + this.nameOfContainer + " " + sol + " cubic metre");

            return sol;
        }





    }

