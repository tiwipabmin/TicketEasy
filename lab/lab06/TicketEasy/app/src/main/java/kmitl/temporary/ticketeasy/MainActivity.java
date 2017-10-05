package kmitl.temporary.ticketeasy;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import kmitl.temporary.ticketeasy.fragment.MovieFragment;

public class MainActivity extends AppCompatActivity {

    private TextView tv_labelCinema;
    private Intent intent;
    private FragmentManager movie_kingsMan, movie_it;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = getIntent();

        bindWidget();
        setWidgetEventListener();

        movie_kingsMan.beginTransaction().replace(R.id.movie_kingsMan, new MovieFragment().newInstance("Kingsman", intent.getStringExtra("cinema"), R.drawable.movie_kingsman)).commit();
        movie_it.beginTransaction().replace(R.id.movie_it, new MovieFragment().newInstance("It", intent.getStringExtra("cinema"), R.drawable.movie_it)).commit();
        tv_labelCinema.setText(intent.getStringExtra("cinema"));
    }

    private void bindWidget(){
        tv_labelCinema = (TextView) findViewById(R.id.tv_labelCinema);

        movie_kingsMan = getSupportFragmentManager();
        movie_it = getSupportFragmentManager();
    }

    private void setWidgetEventListener(){

    }
}
