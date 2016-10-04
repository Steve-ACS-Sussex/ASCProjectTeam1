package uk.ac.sussex.ascprojectteam1;

/**
 * Created by Steve Dixon  on 04/10/2016.  test
 */

public class GPSLocation {
    private double lattitude;
    private double longitude;

    GPSLocation(double lattitude, double longitude) {
        this.lattitude = lattitude;
        this.longitude = longitude;
    }

    public double getLattitude()
    {
        return lattitude;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public void setLattitude(double lattitude)
    {
        this.lattitude = lattitude;
    }

    public void setLongitude(double longitude)
    {
        this.longitude = longitude;
    }
}
