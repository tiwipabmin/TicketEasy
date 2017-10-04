package kmitl.temporary.ticketeasy.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import kmitl.temporary.ticketeasy.Main2Activity;
import kmitl.temporary.ticketeasy.R;
import kmitl.temporary.ticketeasy.SeatSelectionActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class MovieFragment extends Fragment {

    private ImageView iv_movie;
    private Button btn_time1, btn_time2, btn_time3, btn_time4, btn_time5;
    private Intent intent;


    public MovieFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_movie, container, false);
        bindWidget(rootView);
        setWidgetEventListener();
        return rootView;
    }

    private void bindWidget(View rootView){

        iv_movie = rootView.findViewById(R.id.iv_movie);

        btn_time1 = rootView.findViewById(R.id.btn_time1);
        btn_time2 = rootView.findViewById(R.id.btn_time2);
        btn_time3 = rootView.findViewById(R.id.btn_time3);
        btn_time4 = rootView.findViewById(R.id.btn_time4);
        btn_time5 = rootView.findViewById(R.id.btn_time5);
    }

    private void setWidgetEventListener(){
        btn_time1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getActivity(), SeatSelectionActivity.class);
                intent.putExtra("time", btn_time1.getText().toString());
                startActivity(intent);
            }
        });

        btn_time2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getActivity(), SeatSelectionActivity.class);
                intent.putExtra("time", btn_time2.getText().toString());
                startActivity(intent);
            }
        });

        btn_time3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getActivity(), SeatSelectionActivity.class);
                intent.putExtra("time", btn_time3.getText().toString());
                startActivity(intent);
            }
        });

        btn_time4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getActivity(), SeatSelectionActivity.class);
                intent.putExtra("time", btn_time4.getText().toString());
                startActivity(intent);
            }
        });

        btn_time5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getActivity(), SeatSelectionActivity.class);
                intent.putExtra("time", btn_time5.getText().toString());
                startActivity(intent);
            }
        });
    }

    public static MovieFragment newInstance() {

        Bundle args = new Bundle();
        MovieFragment fragment = new MovieFragment();
        fragment.setArguments(args);
        return fragment;
    }

}
