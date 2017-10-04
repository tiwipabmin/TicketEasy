package kmitl.temporary.ticketeasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import kmitl.temporary.ticketeasy.fragment.MovieFragment;

public class MainActivity extends AppCompatActivity {

    private TextView tv_labelCinema;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = getIntent();
        getSupportFragmentManager().beginTransaction().add(R.id.movieFragment, new MovieFragment()).commit();

        bindWidget();
        setWidgetEventListener();

        tv_labelCinema.setText(intent.getStringExtra("cinema"));
    }

    private void bindWidget(){
        tv_labelCinema = (TextView) findViewById(R.id.tv_labelCinema);
    }

    private void setWidgetEventListener(){

    }
}
