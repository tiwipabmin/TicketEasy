package kmitl.temporary.ticketeasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CinemaActivity extends AppCompatActivity {

    private ListView mListCinema;
    private String[] cinema = {"Seacon", "Siam", "Emquartier"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinema);

        CustomAdapter customAdapter = new CustomAdapter(this, cinema);

        bindWidget();
        setWidgetEventListener();

        mListCinema.setAdapter(customAdapter);
    }

    private void bindWidget(){
        mListCinema = (ListView) findViewById(R.id.list_cinema);
    }

    private void setWidgetEventListener(){
        mListCinema.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(CinemaActivity.this, MainActivity.class);
                intent.putExtra("cinema", cinema[position]);
                startActivity(intent);
            }
        });
    }
}
