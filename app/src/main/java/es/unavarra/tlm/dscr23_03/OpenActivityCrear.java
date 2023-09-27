package es.unavarra.tlm.dscr23_03;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class OpenActivityCrear implements View.OnClickListener {

    private final Activity activity;
    private final EditText usuario;
    private final EditText password;

    public OpenActivityCrear(Activity activity, EditText usuario, EditText password) {
        this.activity=activity;
        this.usuario= usuario;
        this.password = password;
    }
    @Override
    public void onClick(View view) {
        Intent intent= new Intent (this.activity, Activity_Cuenta.class);

        String user_name = this.usuario.getText().toString();
        String user_pass = this.password.getText().toString();

        Log.d("myActivity", "El input: <"+ user_name+">");

        if (user_name != null && user_name.length() != 0 && user_pass != null && user_pass.length() != 0){

            Log.d("myActivity", "onClick: no hay campo vacio");
            this.activity.startActivity(intent);

        } else {

            Log.d("myActivity", "onClick: algun campo esta vacio");
        }
    }



    //public String verValor(View view){
      //  EditText usuario =  findViewById(R.id.user_name);
        //String nombre= usuario.getText().toString();
        //Log.d("nombre", nombre);

        //return nombre;
    //}
}
