package tabian.com.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ListView mListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);
        mListView = (ListView) findViewById(R.id.listView);

        ArrayList<Card> list = new ArrayList<>();

        list.add(new Card("drawable://" + R.drawable.arizona_dessert, "Arizona Dessert"));
        list.add(new Card("drawable://" + R.drawable.bamf1, "Bamf"));
        list.add(new Card("drawable://" + R.drawable.colorado_mountains, "Colorado Mountains"));
        list.add(new Card("drawable://" + R.drawable.cork, "Cork"));
        list.add(new Card("drawable://" + R.drawable.davenport_california, "DavenPort California"));
        list.add(new Card("drawable://" + R.drawable.denmark_austrailia, "Denmark Austrailia"));
        list.add(new Card("drawable://" + R.drawable.foggy_iceland, "Foggy Iceland"));
        list.add(new Card("drawable://" + R.drawable.havasu_falls, "Havasu Falls"));
        list.add(new Card("drawable://" + R.drawable.hawaii_rainforest, "Hawaii RainForest"));
        list.add(new Card("drawable://" + R.drawable.newfoundland_ice, "NewFoundLand Ice"));
        list.add(new Card("drawable://" + R.drawable.oregon_greens, "Oregon Greens"));
        list.add(new Card("drawable://" + R.drawable.smokey_mountain, "Smokey Mountain"));
        list.add(new Card("drawable://" + R.drawable.yosemite, "Yosemite"));

        CustomListAdapter adapter = new CustomListAdapter(this, R.layout.activity_main, list);
        mListView.setAdapter(adapter);

    }
}
