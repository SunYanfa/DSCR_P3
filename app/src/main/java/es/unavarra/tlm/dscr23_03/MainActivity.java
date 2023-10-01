package es.unavarra.tlm.dscr23_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_registro = (Button)findViewById(R.id.boton_registro);
        button_registro.setOnClickListener(new OpenActivityRegistro(this));

        Button button_entrar = (Button)findViewById(R.id.boton_entrar);
        button_entrar.setOnClickListener(new OpenActivityEntrar(this));

       // finish();
    }
}