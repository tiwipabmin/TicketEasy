package kmitl.temporary.ticketeasy;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BillActivity extends AppCompatActivity {

    private ArrayList<Integer> listSeat;
    private Intent intent, mainIntent;

    TextView seatView;
    TextView priceView;
    TextView timeView;
    TextView nameView;
    TextView cinemaView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);

        mainIntent = getIntent();

        bindWidget();
        setData();

    }

    private void bindWidget(){
        seatView = (TextView) findViewById(R.id.seat);
        priceView = (TextView) findViewById(R.id.price);
        timeView = (TextView) findViewById(R.id.textView3);
        nameView = (TextView) findViewById(R.id.tv_nameMovie);
        cinemaView = (TextView) findViewById(R.id.textView);
        imageView = (ImageView) findViewById(R.id.iv_movie);
    }

    public void setData() {
        listSeat = getIntent().getIntegerArrayListExtra("seat");
        String seat = "";
        int price = 0;
        for(int x=0;x<listSeat.size();x++){
            if(x>0) seat += ", A"+listSeat.get(x);
            else seat += "A"+listSeat.get(x);
            price += 200;
        }
        seatView.setText(seat);
        priceView.setText(String.valueOf(price));

        timeView.setText(mainIntent.getStringExtra("time"));
        nameView.setText(mainIntent.getStringExtra("movie"));
        cinemaView.setText(mainIntent.getStringExtra("cinema"));
        imageView.setImageResource(mainIntent.getIntExtra("image", R.drawable.android));


    }

    public void onClickMCash(View view) {
        intent = new Intent(BillActivity.this, FinishActivity.class);
        startActivity(intent);

    }
}
