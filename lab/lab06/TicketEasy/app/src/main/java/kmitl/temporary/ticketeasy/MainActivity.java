package kmitl.temporary.ticketeasy;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kmitl.temporary.ticketeasy.fragment.MovieFragment;

public class MainActivity extends AppCompatActivity {

    private Button btn_chooseCinema;
    private AlertDialog.Builder chooseCinema;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.movieFragment, new MovieFragment()).commit();

        chooseCinema = new AlertDialog.Builder(this);
        chooseCinema.setItems(R.array.cinema, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                switch (which){
                    case 0: btn_chooseCinema.setText("Seacon");
                        break;
                    case 1: btn_chooseCinema.setText("Siam");
                        break;
                    default: break;
                }
            }
        });

        bindWidget();
        setWidgetEventListener();
    }

    private void bindWidget(){
        btn_chooseCinema = (Button) findViewById(R.id.btn_chooseCinema);
    }

    private void setWidgetEventListener(){
        btn_chooseCinema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseCinema.create();
                chooseCinema.show();
            }
        });
    }
}
