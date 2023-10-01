package es.unavarra.tlm.dscr23_03;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.EditText;

import es.unavarra.tlm.dscr23_03.MainActivity;

public class OpenActivity_Salir implements View.OnClickListener{
    private final Activity activity;
    private final String usuario;

    public OpenActivity_Salir(Activity activity, String usuario) {
        this.activity = activity;
        this.usuario=usuario;
    }

    @Override
    public void onClick(View view) {

        Intent intent= new Intent (this.activity, MainActivity.class);

        SharedPreferences settings = activity.getSharedPreferences("Config",0);
        SharedPreferences.Editor editor = settings.edit();
        editor.remove("username");
        editor.commit();

        this.activity.startActivity(intent);

    }
}
