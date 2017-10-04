package kmitl.temporary.ticketeasy;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by tiwip on 10/4/2017.
 */

public class CustomAdapter extends BaseAdapter {

    private Context mContext;
    private String[] cinemaName;

    public CustomAdapter(Context context, String[] cinemaName) {
        this.mContext= context;
        this.cinemaName = cinemaName;
    }

    @Override
    public int getCount() {
        return cinemaName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater mInflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(view == null)
            view = mInflater.inflate(R.layout.listview_row, parent, false);

        TextView tv_labelCinema = (TextView) view.findViewById(R.id.tv_nameCinema);
        tv_labelCinema.setText(cinemaName[position]);

        return view;
    }
}
