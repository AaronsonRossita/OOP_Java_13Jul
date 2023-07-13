package users;

public class UserRegular extends User{

    private PaymentMethod paymentMethod;

    public UserRegular(String name, String email, String login, String password, Address address, PaymentMethod paymentMethod) {
        super(name, email, login, password, address);
        this.paymentMethod = paymentMethod;
    }

    @Override
    public void sendEmail() {
        System.out.println("Thank you user " + this.getName() + " for subscribing");
    }

}
