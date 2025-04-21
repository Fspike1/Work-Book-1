package Workshops;

public class AddressBuilder {
    public static void main(String[] args) {
        StringBuilder addressInfo = new StringBuilder();


        //create a StringBuilder object
        String fullName = "Grover Smith";
        String billingStreet = "123 Main Street";
        String billingState = "TX";
        String billingCity = "Middleton";
        String billingZip = "75111";

        String shippingStreet = "456 big Sy Blvd";
        String shippingCity = "Outer Rim";
        String shippingState = "TX";
        String shippingZip = "75333";

        addressInfo.append(fullName).append("\n");
        addressInfo.append("Billing Address:\n");
        addressInfo.append(billingStreet).append("\n");
        addressInfo.append(billingCity).append(", ").append(billingState).append(" ").append(billingZip).append("\n");
        addressInfo.append("Shipping Address:\n");
        addressInfo.append(shippingStreet).append("\n");
        addressInfo.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip);

        // Print
        System.out.println(addressInfo.toString());
    }
}


