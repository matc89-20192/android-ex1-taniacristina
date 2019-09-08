package matc89.exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Criando variveis para textView, Button e EditText
    private TextView mensagem;
    private Button button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Recebendo os elementos do layout
        button = (Button)findViewById(R.id.btnCumprimentar);
        mensagem = (TextView)findViewById(R.id.labelMensagem);
        editText = (EditText)findViewById(R.id.editNome);

        Log.i("ABCD","oncreate");
    }

    // Função click do botão
    public void clicou(View v) {
        // Recebendo o texto digitado e setando no EditText
        String textoDigitado = editText.getText().toString();
        mensagem.setText("Alô, " + textoDigitado + "!");

        Log.i("ABCD","clicou");
    }

    // Salvando valor do texto digitado
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("meutexto", mensagem.getText().toString());
        Log.i("ABCD", "onSaveInstanceState");
    }

    // Restaurando valor do texto digitado
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        String meutexto = savedInstanceState.getString("meutexto");
        mensagem.setText(meutexto);

        Log.i("ABCD", "onRestoreInstanceState");
    }


}
