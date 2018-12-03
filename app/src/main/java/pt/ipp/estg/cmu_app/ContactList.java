package pt.ipp.estg.cmu_app;

import java.util.ArrayList;

public class ContactList {
    private String mName;
    private boolean mOnline;

    public ContactList(String name, boolean online) {
        mName = name;
        mOnline = online;
    }

    public String getName() {
        return mName;
    }

    public boolean isOnline() {
        return mOnline;
    }

    private static int lastContactId = 0;

    public static ArrayList<ContactList> createContactsList(int numContacts) {
        ArrayList<ContactList> contacts = new ArrayList<>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new ContactList("Person " + ++lastContactId, i <= numContacts / 2));
        }

        return contacts;
    }
}