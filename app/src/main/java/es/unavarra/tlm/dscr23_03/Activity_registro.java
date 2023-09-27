package es.unavarra.tlm.dscr23_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;


public class Activity_registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


        EditText usuario = findViewById(R.id.user_name);
        EditText password = findViewById(R.id.password);


        Button button = (Button) findViewById(R.id.boton_crear);
        button.setOnClickListener(new OpenActivityCrear(this, usuario, password));

        //EditText usuario = findViewById(id.user_name);
        //usuario.setOnTouchListener(new TouchListener(this));

        Log.d("myActivity", "setNombre: 123");

    }

}