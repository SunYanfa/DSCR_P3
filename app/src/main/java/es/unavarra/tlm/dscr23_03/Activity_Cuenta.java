package es.unavarra.tlm.dscr23_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_Cuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta);

        SharedPreferences settings = this.getSharedPreferences("Config", 0);
        String username = settings.getString("username", "");
        TextView bienvenida= findViewById(R.id.bienvenida_cuenta);
        bienvenida.setText("Hola "+username);

        Button button = (Button) findViewById(R.id.boton_salir);
        button.setOnClickListener(new OpenActivity_Salir(this, username));

    }
}