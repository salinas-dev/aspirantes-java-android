package com.salinas.aspirante;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.salinas.aspirante.model.aspirante;

public class MainActivity extends AppCompatActivity {

    //Se declaran tres variables miembro:
    // "editTextNombre" (tipo EditText),
    // "editTextPromedio" (tipo EditText),
    // "spinnerTipoBachillerato" (tipo Spinner)
    // "buttonAceptar" (tipo Button).
    EditText editTextNombre, editTextPromedio;
    Spinner spinnerTipoBachillerato;
    Button buttonAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se inicializan las variables miembro con sus
        //respectivos widgets de la interfaz gráfica de usuario.
        editTextNombre = findViewById(R.id.editTextNombre);
        editTextPromedio = findViewById(R.id.editTextPromedio);
        spinnerTipoBachillerato = findViewById(R.id.spinnerTipoBachillerato);
        buttonAceptar = findViewById(R.id.buttonAceptar);

        //Se define un escucha de eventos para el botón "buttonAceptar".
        //Cuando se hace clic en el botón,
        //se ejecuta el código dentro del método "onClick".

        //En el cuerpo del método "onClick", se obtienen los valores de
        //los campos de entrada "editTextNombre",
        //"editTextPromedio" y "spinnerTipoBachillerato". Luego,
        //se crea un objeto "aspirante" con estos valores.



        buttonAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = editTextNombre.getText().toString();
                double promedio = Double.parseDouble(editTextPromedio.getText().toString());
                String tipoBachillerato = spinnerTipoBachillerato.getSelectedItem().toString();



                //se llama al método "Aceptado" del objeto "aspirante"
                //y se asigna el resultado a la variable "resultado".
                //
                //Si el resultado es verdadero, se asigna la cadena "aceptado";
                //de lo contrario, se asigna la cadena "rechazado".

                //Por último, se muestra un mensaje emergente (Toast)
                //que muestra el valor de la variable "resultado".

                aspirante aspirante = new aspirante(nombre, promedio, tipoBachillerato);
                String resultado = aspirante.Aceptado() ? "aceptado" : "rechazado";
                Toast.makeText(MainActivity.this, resultado, Toast.LENGTH_SHORT).show();
            }
        });
    }
}