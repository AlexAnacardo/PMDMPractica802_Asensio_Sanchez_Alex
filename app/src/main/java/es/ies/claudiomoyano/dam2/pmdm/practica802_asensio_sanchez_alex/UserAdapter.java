package es.ies.claudiomoyano.dam2.pmdm.practica802_asensio_sanchez_alex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.List;

public class UserAdapter extends ArrayAdapter<Usuario> {

    private final Context context;
    private final List<Usuario> usuarios;

    public UserAdapter(@NonNull Context context, @NonNull List<Usuario> usuarios) {
        super(context, android.R.layout.simple_list_item_1, usuarios);
        this.context = context;
        this.usuarios = usuarios;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1, parent, false);
        }

        TextView textView = (TextView) convertView.findViewById(android.R.id.text1);
        Usuario usuario = usuarios.get(position);
        textView.setText(usuario.toString());


        int colorPar = ContextCompat.getColor(context, R.color.usuarioPar);
        int colorImpar = ContextCompat.getColor(context, R.color.usuarioImpar);

        convertView.setBackgroundColor(position % 2 == 0 ? colorPar : colorImpar);



        return convertView;
    }
}
