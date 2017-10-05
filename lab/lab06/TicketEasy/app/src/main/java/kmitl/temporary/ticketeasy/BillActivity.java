package kmitl.temporary.ticketeasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class BillActivity extends AppCompatActivity {

    private ArrayList<Integer> listSeat;
    private String seat = "";
    private int price = 0;
    private Button btn_time1, btn_time2, btn_time3, btn_time4, btn_time5;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
        TextView seat = (TextView) findViewById(R.id.seat);
        TextView price = (TextView) findViewById(R.id.price);
        setData();
        seat.setText(this.seat);
        price.setText(this.price+"");

    }

    public void setData() {
        listSeat = getIntent().getIntegerArrayListExtra("seat");
        for(int x=0;x<listSeat.size();x++){
            if(x>0) seat += ", A"+listSeat.get(x);
            else seat += "A"+listSeat.get(x);
            price += 200;
        }



    }


    public void onClickMCash(View view) {
        intent = new Intent(BillActivity.this, FinishActivity.class);
        startActivity(intent);

    }
}
