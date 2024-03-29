package week13.PhoneTask;

public class Phone {
    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public void call(){
        System.out.println(brand +" is calling");
    }

    public int getNumPicture() {
        return 0;
    }
}
/*
 Assume the existence of a Phone class that is a super class for CameraPhone class.

Define a subclass, CameraPhone that contains two instance variables:
an integer named imageSize,
representing the size in megapixels (for simplicity assume a pixel takes up one byte--
thus megapixels equals megabytes) of each picture (i.e., 2 means each image is composed of 2 megapixels),and
an integer named memorySize, representing the number of gigabytes in the camera's memory
(i.e., 4 means 4 Gigabytes of memory).
There is a constructor that accepts two integer parameters corresponding to the above two
instance variables and which are used to initialize the respective instance variables.
There is also a method named numPictures that returns (as an integer) the number of pictures
the camera's memory can hold. Don't forget that a gigabyte is 1,000 megabytes.
     */