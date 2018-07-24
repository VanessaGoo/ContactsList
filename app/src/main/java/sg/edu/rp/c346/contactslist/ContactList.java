package sg.edu.rp.c346.contactslist;

/**
 * Created by 17010336 on 24/7/2018.
 */

public class ContactList {
    private String name;
    private int code;
    private int num;

    public ContactList(String name, int code, int num) {
        this.name = name;
        this.code = code;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ContactList{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", num=" + num +
                '}';
    }
}
