package course.examples.contactslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    ListView listview;
    SimpleAdapter adapter;
    Button button1,button2;
    List<Map<String,Object>> arrayList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new SimpleAdapter(this,getData(),R.layout.item,new String[]{"ContactsName","CheckBox"},new int[]{R.id.ContactsName,R.id.cb});
        listview = (ListView) findViewById(R.id.mylist);
        listview.setAdapter(adapter);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

    }

    private List<Map<String,Object>>getData(){
        Map<String,Object> map= new HashMap();
        map.put("ContactsName","Hi");
        map.put("CheckBox",R.id.cb);
        arrayList.add(map);

        map= new HashMap();
        map.put("ContactsName","Hello");
        map.put("CheckBox",R.id.cb);
        arrayList.add(map);
        return  arrayList;
    }
}
