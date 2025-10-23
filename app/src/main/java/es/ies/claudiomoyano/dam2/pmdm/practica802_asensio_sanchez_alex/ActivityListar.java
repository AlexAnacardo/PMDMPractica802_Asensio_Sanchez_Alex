package es.ies.claudiomoyano.dam2.pmdm.practica802_asensio_sanchez_alex;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ActivityListar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.listar_usuarios);

        ListView listViewUsuarios = findViewById(R.id.listadoUsuarios);

        ArrayList<Usuario> usuarios = (ArrayList<Usuario>) getIntent().getSerializableExtra("usuarios");

        UserAdapter adapter = new UserAdapter(this, usuarios);

        listViewUsuarios.setAdapter(adapter);
    }
}
