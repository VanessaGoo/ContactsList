package sg.edu.rp.c346.contactslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import sg.edu.rp.c346.contactslist.R;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;

    ArrayList<ContactList> contactLists;

    CustomAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.listView);

        contactLists = new ArrayList<>();

        ContactList list1 = new ContactList("Mary", +65, 65442334);
        ContactList list2 = new ContactList("Ken", +65, 97442437);

        contactLists.add(list1);
        contactLists.add(list2);

        caContact = new CustomAdapter(this, R.layout.contactlist, contactLists);

        lvContact.setAdapter(caContact);
    }
}