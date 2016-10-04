package uk.ac.sussex.ascprojectteam1;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by User on 04/10/2016.
 */

public class LocationActivity extends FragmentActivity
{
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this Fragment
        return inflater.inflate(R.layout.activity_location, container, false);
    }
}


