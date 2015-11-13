package com.bradleege.mapboxcustommarkerexample;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.annotations.Sprite;
import com.mapbox.mapboxsdk.annotations.SpriteFactory;
import com.mapbox.mapboxsdk.constants.Style;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.views.MapView;

public class MainActivity extends AppCompatActivity {

    private MapView mapView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapView = (MapView) findViewById(R.id.mapboxMapView);
        mapView.setStyleUrl(Style.EMERALD);
        mapView.setCenterCoordinate(new LatLng(-33.97753, 18.52982));
        mapView.setZoomLevel(8);

        SpriteFactory spriteFactory = new SpriteFactory(mapView);
        Drawable drawable = ContextCompat.getDrawable(this, R.mipmap.ic_directions_boat_black_18dp);
        Sprite icon = spriteFactory.fromDrawable(drawable);

        mapView.addMarker(new MarkerOptions()
                .position(new LatLng(-33.8500000, 18.4158234))
                .title("Cape Town Harbour")
                .icon(icon));

        mapView.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    public void onPause()  {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }
}
