package es.unavarra.tlm.dscr23_03;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class OpenActivityRegistro implements View.OnClickListener {

    private final Activity activity;

    public OpenActivityRegistro(Activity activity) {
        this.activity=activity;
    }
    @Override
    public void onClick(View view) {
        Intent intent= new Intent (this.activity, Activity_registro.class);
        this.activity.startActivity(intent);
    }
}
