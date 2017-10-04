package kmitl.temporary.ticketeasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeatSelectionActivity extends AppCompatActivity {
    private ArrayList<Button> listSeat;
    private ArrayList<Integer> listStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat_selection);
        listSeat = new ArrayList<Button>();
        listStatus = new ArrayList<Integer>();
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



}
