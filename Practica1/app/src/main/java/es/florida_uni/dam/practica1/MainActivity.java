package es.florida_uni.dam.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final static String TAG = "SYP-practica1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        instalarManejadores();
    }

    private void instalarManejadores(){
        Button btnTareaCostosa = (Button) findViewById(R.id.btnTareaCostosa);
        Button btnSaludar = (Button) findViewById(R.id.btnSaludar);

        // Manejador del botón de saludar
        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Log.i(TAG, "Saludando");
                Toast.makeText(
                        MainActivity.this, "Hola", Toast.LENGTH_SHORT
                ).show();
            }
        });

        // Manejador del botón que ejecuta la tarea costosa
        btnTareaCostosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Log.i(TAG, "Ejecutando tarea muy costosa");
                ejecutarTareaMuyCostosa();
            }
        });
    }

    // TODO: Ejecutar la tarea muy costosa de forma asíncrona
    private void ejecutarTareaMuyCostosa(){
        /*
        //Este es el código que debe ejecutarse de forma que no interrumpa la aplicación
        try {
            for(int i=0;i<10;i++) Thread.sleep(1000);
        }catch(InterruptedException e){}
        */
    }
}
