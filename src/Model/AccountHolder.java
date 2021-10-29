package Model;

public class AccountHolder {
    protected int ID;
    protected String address;

    private static int currentID = 1;

    public String name;
    public AccountHolder(int ID, String address) {
        this.ID = ID;
        this.address = address;
    }

    public static int nextID() {
        return currentID++;
    }
}
