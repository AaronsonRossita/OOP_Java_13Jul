package users;

public class UserVip extends User{

    private int discount;

    public UserVip(String name, String email, String login, String password, Address address, int discount) {
        super(name, email, login, password, address);
        this.discount = discount;
    }

    @Override
    public void sendEmail() {
        System.out.println(" Thank you so much " + this.getName() + " for being VIP");
    }
}
