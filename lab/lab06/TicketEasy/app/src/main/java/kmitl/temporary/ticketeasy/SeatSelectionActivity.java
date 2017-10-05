package kmitl.temporary.ticketeasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeatSelectionActivity extends AppCompatActivity {
    private ArrayList<Button> listSeat;
    private ArrayList<Integer> listStatus;
    private ArrayList<Integer> listSelect;
    private Intent intent, intent_main;
    private String time;
    private TextView tv_movie, tv_cinema;
    private ImageView iv_movie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat_selection);
        listSeat = new ArrayList<Button>();
        listStatus = new ArrayList<Integer>();
        listSelect = new ArrayList<Integer>();
        bindWidget();
        setButton();
        setTime();

        intent_main = getIntent();

        for(int x=0; x<listSeat.size();x++){
            listStatus.add(0);
            final int position = x;
            listSeat.get(x).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onSelect(position);
                }
            });
        }

        tv_movie.setText(intent_main.getStringExtra("movie"));
        tv_cinema.setText(intent_main.getStringExtra("cinema"));

        iv_movie.setImageResource(intent_main.getIntExtra("image", R.drawable.android));

    }

    private void bindWidget(){

        tv_movie = (TextView) findViewById(R.id.textNameMovie);
        tv_cinema = (TextView) findViewById(R.id.textView15);

        iv_movie = (ImageView) findViewById(R.id.imageMovie);
    }

    public void onSelect(int position){
        if(listStatus.get(position) == 0){
            listSeat.get(position).setBackgroundResource(R.drawable.seat_selected);
            listStatus.set(position, 1);
        }else{
            listSeat.get(position).setBackgroundResource(R.drawable.seat_unselected);
            listStatus.set(position, 0);
        }
    }


    public void onComfirm(View view) {
        for(int x=0;x<listSeat.size();x++) {
            if (listStatus.get(x) == 1) {
                listSelect.add(x + 1);
            }
        }
        intent = new Intent(SeatSelectionActivity.this, BillActivity.class);
        intent.putExtra("movie", intent_main.getStringExtra("movie"));
        intent.putExtra("cinema", intent_main.getStringExtra("cinema"));

        intent.putExtra("seat", listSelect);
        intent.putExtra("time", time);
        startActivity(intent);


    }
    public void setButton(){
        Button seat1 = (Button) findViewById(R.id.seat_1);
        Button seat2 = (Button) findViewById(R.id.seat_2);
        Button seat3 = (Button) findViewById(R.id.seat_3);
        Button seat4 = (Button) findViewById(R.id.seat_4);
        Button seat5 = (Button) findViewById(R.id.seat_5);
        Button seat6 = (Button) findViewById(R.id.seat_6);
        Button seat7 = (Button) findViewById(R.id.seat_7);
        Button seat8 = (Button) findViewById(R.id.seat_8);
        Button seat9 = (Button) findViewById(R.id.seat_9);
        Button seat10 = (Button) findViewById(R.id.seat_10);

        listSeat.add(seat1);
        listSeat.add(seat2);
        listSeat.add(seat3);
        listSeat.add(seat4);
        listSeat.add(seat5);
        listSeat.add(seat6);
        listSeat.add(seat7);
        listSeat.add(seat8);
        listSeat.add(seat9);
        listSeat.add(seat10);
    }

    public void setTime() {
        TextView time = (TextView) findViewById(R.id.textTimeMovie);
        this.time = getIntent().getStringExtra("time");
        time.setText(this.time.toString());

    }
}
