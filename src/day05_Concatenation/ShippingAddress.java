package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        String name ="Nesibe Ozer",
         buildingNumber ="67",
         streetName ="Floresstraat",
         city ="Haarlem",
         state ="Netherlands",
         zipCode ="2103 XX";
        String address = name + "\n" + buildingNumber + "  " + streetName + "\n"
                + city + " , " + state + "  " + zipCode ;
        System.out.println(address);
        //System.out.println(name + "\n" + buildingNumber + "  " + streetName + "\n" + city + " , " + state + "  " + zipCode );




    }
}
