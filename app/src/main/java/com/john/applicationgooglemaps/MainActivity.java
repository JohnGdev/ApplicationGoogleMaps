package com.john.applicationgooglemaps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
    //declaração de variável
//    GoogleMap: É o tipo da variável. GoogleMap é uma classe fornecida pela API do Google Maps para Android, que representa um mapa no qual você pode exibir informações geográficas.
//
//    myMap: É o nome da variável. Você pode escolher qualquer nome que desejar para a variável, desde que siga as regras de nomenclatura em Java.
    private GoogleMap myMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

        myMap = googleMap;

        LatLng baGuanambi = new LatLng(-14.302435, -42.695379);

        myMap.addMarker(new MarkerOptions().position(baGuanambi).title("IF Baiano Guanambi"));

        myMap.moveCamera(CameraUpdateFactory.newLatLng(baGuanambi));
//Podemos também mudar a cor do marcador
//        MarkerOptions options = new MarkerOptions().position(baGuanambi).title("IF Baiano Guanambi");
//        options.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
//        myMap.addMarker(options);

    }
}