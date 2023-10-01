package es.unavarra.tlm.dscr23_03;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import java.util.function.LongFunction;

public class Activity_Entrar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences settings = this.getSharedPreferences("Config", 0);
        String username = settings.getString("username", "");

        if(username.equals("")){
            setContentView(R.layout.activity_entrar);
            EditText usuario = findViewById(R.id.user_name_iniciar_sesion);
            EditText password = findViewById(R.id.password_iniciar_sesion);

            Button button = (Button) findViewById(R.id.boton_iniciar_sesion);
            button.setOnClickListener(new OpenActivityIniciarSesion(this, usuario, password));

        } else{
            Intent intent= new Intent (this, Activity_Cuenta.class);
            this.startActivity(intent);

        }
    }


}