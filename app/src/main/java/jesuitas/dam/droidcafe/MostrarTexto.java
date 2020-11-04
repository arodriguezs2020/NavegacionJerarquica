package jesuitas.dam.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MostrarTexto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_texto);
        Intent intent = getIntent();
        String texto = intent.getStringExtra("Texto");
        TextView text = findViewById(R.id.textView);
        text.setText(texto);
    }
}