package com.example.juaco.tomadedatos;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Date;
import java.util.Calendar;

public class TomaDatosMain extends Activity {

private EditText et1;
private StringBuilder mydate= new StringBuilder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toma_datos_main);


        Button botonDato = (Button)findViewById(R.id.btn_dato);
        final Date horaActual= new Date();
         et1 = (EditText)findViewById(R.id.et1);


    botonDato.setEnabled(true);
    botonDato.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {



                    //mydate.append(java.text.DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime())).append('\n') ;



          ImpListado(v);
        }
    });


    }

    public void ImpListado(View v)
    {
        //String result = java.text.DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime())+'\n';

         mydate.append(java.text.DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime())).append('\n');
        et1.setText(mydate);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_toma_datos_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




}
