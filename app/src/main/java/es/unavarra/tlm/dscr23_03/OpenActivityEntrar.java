package es.unavarra.tlm.dscr23_03;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import es.unavarra.tlm.dscr23_03.Activity_Entrar;

public class OpenActivityEntrar implements View.OnClickListener{
    private final Activity activity;

    public OpenActivityEntrar(Activity activity) {
        this.activity=activity;
    }
    @Override
    public void onClick(View view) {
            Intent intent= new Intent (this.activity, Activity_Entrar.class);
            this.activity.startActivity(intent);

    }
}
