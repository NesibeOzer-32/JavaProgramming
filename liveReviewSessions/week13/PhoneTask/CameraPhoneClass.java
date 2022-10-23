package week13.PhoneTask;

public class CameraPhoneClass extends Phone {
    public int imageSize,memorySize;

    public CameraPhoneClass(String brand, String model, String size, double price,
                            String color, int imageSize, int memorySize) {
        super(brand, model, size, price, color);

        this.imageSize = imageSize;
        this.memorySize = memorySize;
    }

    public String toString() {
        return "CameraPhoneClass{" +
                "imageSize=" + imageSize +
                ", memorySize=" + memorySize +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public int getImageSize() {
        return imageSize;
    }

    public void setImageSize(int imageSize) {
        this.imageSize = imageSize;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getNumPicture(){
        return memorySize*1000/imageSize;



    }
}
/*
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