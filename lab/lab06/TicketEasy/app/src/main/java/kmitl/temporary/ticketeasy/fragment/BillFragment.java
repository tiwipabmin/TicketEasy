package kmitl.temporary.ticketeasy.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kmitl.temporary.ticketeasy.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BillFragment extends Fragment {

    public BillFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_bill, container, false);

        return rootView;
    }

}
