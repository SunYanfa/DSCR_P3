package es.unavarra.tlm.dscr23_03;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
        Intent intent= new Intent (this.activity, MainActivity.class);

        String user_name = this.usuario.getText().toString();
        String user_pass = this.password.getText().toString();

        //Log.d("myActivity", "El input: <"+ user_name+">");

        if (user_name != null && user_name.length() != 0 && user_pass != null && user_pass.length() != 0){
            int duracion= Toast.LENGTH_LONG;
            Toast aviso_cuentaCreada=Toast.makeText(this.activity,"Tu cuenta "+user_name+" se ha creado correctamente",duracion);
            aviso_cuentaCreada.show();
            //Log.d("myActivity", "onClick: no hay campo vacio");
            this.activity.startActivity(intent);

        } else {
            if (user_name.length()==0){
                int duracion= Toast.LENGTH_LONG;
                Toast aviso_faltaUsuario=Toast.makeText(this.activity,"Falta rellenar el campo de usuario",duracion);
                aviso_faltaUsuario.show();
            } else{
                int duracion= Toast.LENGTH_LONG;
                Toast aviso_faltaContraseña=Toast.makeText(this.activity,"Falta rellenar el campo de contraseña",duracion);
                aviso_faltaContraseña.show();
            }

           // Log.d("myActivity", "onClick: algun campo esta vacio");
        }
    }



    //public String verValor(View view){
      //  EditText usuario =  findViewById(R.id.user_name);
        //String nombre= usuario.getText().toString();
        //Log.d("nombre", nombre);

        //return nombre;
    //}
}
