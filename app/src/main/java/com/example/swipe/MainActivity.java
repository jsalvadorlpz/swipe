package com.example.swipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.daimajia.swipe.SwipeLayout;

public class MainActivity extends AppCompatActivity {

    private SwipeLayout funcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        funcion = findViewById(R.id.funcionalidad);
        funcion.setShowMode(SwipeLayout.ShowMode.PullOut);
        funcion.addDrag(SwipeLayout.DragEdge.Left,funcion.findViewById(R.id.linear_sol));

        funcion.findViewById(R.id.Leido).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Liedo presionado",Toast.LENGTH_SHORT).show();
            }
        });
    }
}