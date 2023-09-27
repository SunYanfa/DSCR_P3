package es.unavarra.tlm.dscr23_03;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class OpenActivityCrear implements View.OnClickListener {

    private final Activity activity;
    private final EditText usuario;
    Activity_registro registro = new Activity_registro();
    String nombre, password;

    public OpenActivityCrear(Activity activity, EditText usuario) {
        this.activity=activity;this.usuario= usuario;
    }
    @Override
    public void onClick(View view) {
        Intent intent= new Intent (this.activity, Activity_Cuenta.class);

        String usuario = this.usuario.getText().toString();
        registro.setNombre();
        nombre= registro.getNombre();
        Log.d("myActivity", "El input: "+nombre);
        if (nombre == null){
            Log.d("myActivity", "onClick: algun campo esta vacio");
        } else {
            Log.d("myActivity", "onClick: no hay campo vacio");
            this.activity.startActivity(intent);

        }
    }



    //public String verValor(View view){
      //  EditText usuario =  findViewById(R.id.user_name);
        //String nombre= usuario.getText().toString();
        //Log.d("nombre", nombre);

        //return nombre;
    //}
}
