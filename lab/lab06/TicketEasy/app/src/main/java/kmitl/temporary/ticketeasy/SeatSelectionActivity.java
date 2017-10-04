package kmitl.temporary.ticketeasy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.util.HashMap;
import java.util.Map;

public class SeatSelectionActivity extends AppCompatActivity {
    private Map<String, Integer> map = new HashMap<String, Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat_selection);
        Button seat1 = (Button) findViewById(R.id.seat_1);
        Button seat2 = (Button) findViewById(R.id.seat_2);

    }
    public void onSelect(){

    }

}
