package idadedecachorro.cursoandroid.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText  cxIdade;
    private Button btnIdade;
    private TextView txtIdade;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


           cxIdade = (EditText) findViewById(R.id.cxId);
           btnIdade = (Button) findViewById((R.id.btnId));
           txtIdade = (TextView) findViewById(R.id.txtRes);



           btnIdade.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   String txtDigitado = cxIdade.getText().toString();

                   if(txtDigitado.isEmpty()){

                          txtIdade.setText("Nenhum Numero Digitado");
                   }else{
                       int vlDigitado = Integer.parseInt(txtDigitado);
                       int resultado  = vlDigitado * 7;

                       txtIdade.setText("A idade do cachorro em anos é:  " + resultado);


                   }
               }
           });
    }
}
