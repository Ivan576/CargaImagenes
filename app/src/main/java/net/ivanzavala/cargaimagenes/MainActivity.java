package net.ivanzavala.cargaimagenes;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import net.ivanzavala.cargaimagenes.data.RequestIma;
import net.ivanzavala.cargaimagenes.model.ImagenC;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<ImagenC> heroesArrayList;
    RequestIma objImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        objImage = new RequestIma(this);
        objImage.heroesRequests();
    }
}