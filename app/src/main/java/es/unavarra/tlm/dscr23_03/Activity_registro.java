package es.unavarra.tlm.dscr23_03;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import es.unavarra.tlm.dscr23_03.R.id;

public class Activity_registro extends AppCompatActivity {

    public String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);




        Button button = (Button) findViewById(R.id.boton_crear);
        button.setOnClickListener(new OpenActivityCrear(this));

        //EditText usuario = findViewById(id.user_name);
        //usuario.setOnTouchListener(new TouchListener(this));

        Log.d("myActivity", "setNombre: 123");




    }

    public void setNombre (){
        String username= verValor();
        this.nombre = username;
        Log.d("myActivity", "setNombre: "+nombre);
    }

    public String getNombre(){
        return nombre;
    }
    public String verValor (){
        EditText usuario =  findViewById(R.id.user_name);
        String nombre= usuario.getText().toString();
        Log.d("nombre", nombre);

        return nombre;
    }
}