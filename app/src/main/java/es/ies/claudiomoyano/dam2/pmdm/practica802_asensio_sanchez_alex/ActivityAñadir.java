package es.ies.claudiomoyano.dam2.pmdm.practica802_asensio_sanchez_alex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityAñadir extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crear_usuario);

        EditText nombre = findViewById(R.id.etNombre);
        EditText apellidos = findViewById(R.id.etApellidos);
        EditText edad = findViewById(R.id.etEdad);
        EditText dni = findViewById(R.id.etDni);
        EditText telefono = findViewById(R.id.etTelefono);

        Button botonAceptar = findViewById(R.id.botonAceptar);

        botonAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityAñadir.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private boolean validarDni(String dni){
        return true;
    }
}
