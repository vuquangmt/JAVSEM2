package chuaAssignment4;

public abstract class Phone {
    public abstract void insertPhone(String name, String phone);

    public abstract void removePhone(String name);
    public abstract void updatePone(String name, String oldPhone, String newPhone);
    public abstract void searchPhone(String name);
    public abstract void sort();
}