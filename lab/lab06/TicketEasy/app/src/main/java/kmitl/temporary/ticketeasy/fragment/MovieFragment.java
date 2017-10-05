package kmitl.temporary.ticketeasy.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import kmitl.temporary.ticketeasy.R;
import kmitl.temporary.ticketeasy.SeatSelectionActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class MovieFragment extends Fragment {

    private ImageView iv_movie;
    private Button btn_time1, btn_time2, btn_time3, btn_time4, btn_time5;
    private Intent intent;
    private TextView tv_nameMovie;
    private String movie;
    private String cinema;
    private int image;


    public MovieFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        movie = getArguments().getString("movie", "error");
        cinema = getArguments().getString("cinema", "error");
        image = getArguments().getInt("image", R.drawable.android);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_movie, container, false);
        bindWidget(rootView);
        setWidgetEventListener();

        if(movie != null) {
            tv_nameMovie.setText(movie);
        }

        iv_movie.setImageResource(image);

        return rootView;
    }

    private void bindWidget(View rootView){

        iv_movie = rootView.findViewById(R.id.iv_movie);

        btn_time1 = rootView.findViewById(R.id.btn_time1);
        btn_time2 = rootView.findViewById(R.id.btn_time2);
        btn_time3 = rootView.findViewById(R.id.btn_time3);
        btn_time4 = rootView.findViewById(R.id.btn_time4);
        btn_time5 = rootView.findViewById(R.id.btn_time5);

        tv_nameMovie = rootView.findViewById(R.id.tv_nameMovie);
    }

    private void setWidgetEventListener(){
        btn_time1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getActivity(), SeatSelectionActivity.class);
                intent.putExtra("time", btn_time1.getText().toString());
                intent.putExtra("movie", movie);
                intent.putExtra("image", image);
                intent.putExtra("cinema", cinema);
                startActivity(intent);
            }
        });

        btn_time2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getActivity(), SeatSelectionActivity.class);
                intent.putExtra("time", btn_time2.getText().toString());
                intent.putExtra("movie", movie);
                intent.putExtra("image", image);
                intent.putExtra("cinema", cinema);
                startActivity(intent);
            }
        });

        btn_time3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getActivity(), SeatSelectionActivity.class);
                intent.putExtra("time", btn_time3.getText().toString());
                intent.putExtra("movie", movie);
                intent.putExtra("image", image);
                intent.putExtra("cinema", cinema);
                startActivity(intent);
            }
        });

        btn_time4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getActivity(), SeatSelectionActivity.class);
                intent.putExtra("time", btn_time4.getText().toString());
                intent.putExtra("movie", movie);
                intent.putExtra("image", image);
                intent.putExtra("cinema", cinema);
                startActivity(intent);
            }
        });

        btn_time5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getActivity(), SeatSelectionActivity.class);
                intent.putExtra("time", btn_time5.getText().toString());
                intent.putExtra("movie", movie);
                intent.putExtra("image", image);
                intent.putExtra("cinema", cinema);
                startActivity(intent);
            }
        });
    }

    public static MovieFragment newInstance(String movie, String cinema, int image) {
        Bundle args = new Bundle();
        MovieFragment fragment = new MovieFragment();
        args.putString("movie", movie);
        args.putString("cinema", cinema);
        args.putInt("image", image);
        fragment.setArguments(args);
        return fragment;
    }

}
