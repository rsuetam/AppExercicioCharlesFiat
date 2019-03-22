package com.example.heito.amr;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    public void saibaMais(View view) {
        Intent it = new Intent(MainActivity.this, SegundaTela.class);
        startActivity(it);
    }

    public void Compartilhar(View view) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        String texto = "https://www.fiat.com.br";
        sendIntent.putExtra(Intent.EXTRA_TEXT, texto);
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }

    public void Site(View view) {

        //informando qual URL que deve acessar
        Uri uri = Uri.parse("https://www.fiat.com.br");
        //Chamando o navegador padrão
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        //Inicinado navegador
        startActivity(intent);
    }

    public void Ligar(View view) {

        String telefone = "+5508007071000";

        Uri uri = Uri.parse("tel:"+telefone);
        Intent intent = new Intent(Intent.ACTION_DIAL,uri);

        startActivity(intent);
    }
}
