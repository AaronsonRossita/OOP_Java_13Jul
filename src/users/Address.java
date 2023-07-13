package users;

public class Address {

    private String city;
    private String street;
    private int streetNumber;
    private int aptNumber;

    public Address(String city, String street, int streetNumber, int aptNumber) {
        this.city = city;
        this.street = street;
        this.streetNumber = streetNumber;
        this.aptNumber = aptNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public int getAptNumber() {
        return aptNumber;
    }

    public void setAptNumber(int aptNumber) {
        this.aptNumber = aptNumber;
    }
}
