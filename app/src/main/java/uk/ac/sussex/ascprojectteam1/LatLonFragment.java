package uk.ac.sussex.ascprojectteam1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by User on 04/10/2016.
 */

public class LatLonFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savesInstanceState)
    {
        View view = inflater.inflate(R.layout.lat_lon_fragment,
                                     container,
                                     false);
        return view;
    }
}
