package kmitl.temporary.ticketeasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BillActivity extends AppCompatActivity {

    private String data;
    private Button btn_time1, btn_time2, btn_time3, btn_time4, btn_time5;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);

    }

    public void setData() {
        this.data = getIntent().getStringExtra("Data");
    }


    public void onClickMCash(View view) {
        intent = new Intent(BillActivity.this, FinishActivity.class);
        if((data != null))
            intent.putExtra("Data", data);
        startActivity(intent);

    }
}
