package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText pant;
    public double operan1, operan2, res;
    int ope;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pant=(EditText)findViewById(R.id.caja);
    }
//Código para activar botones
    public void btn1 (View v){
        String cap= pant.getText().toString();
        cap=cap+"1";
        pant.setText(cap);
    }

    public void btn2 (View v){
        String cap= pant.getText().toString();
        cap=cap+"2";
        pant.setText(cap);

    }
    public void btn3 (View v){
        String cap= pant.getText().toString();
        cap=cap+"3";
        pant.setText(cap);

    }
    public void btn4 (View v){
        String cap= pant.getText().toString();
        cap=cap+"4";
        pant.setText(cap);

    }
    public void btn5 (View v){
        String cap= pant.getText().toString();
        cap=cap+"5";
        pant.setText(cap);

    }
    public void btn6 (View v){
        String cap= pant.getText().toString();
        cap=cap+"6";
        pant.setText(cap);

    }
    public void btn7 (View v){
        String cap= pant.getText().toString();
        cap=cap+"7";
        pant.setText(cap);

    }
    public void btn8 (View v){
        String cap= pant.getText().toString();
        cap=cap+"8";
        pant.setText(cap);
    }

    public void btn9 (View v){
        String cap= pant.getText().toString();
        cap=cap+"9";
        pant.setText(cap);
    }
    public void btn0 (View v){
        String cap= pant.getText().toString();
        cap=cap+"0";
        pant.setText(cap);
    }

    //Código para operaciones básicas

    public void suma(View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("");
        ope=1;
    }

    public void resta(View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("");
        ope=2;
    }
    public void multiplicacion (View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("");
        ope=3;
    }

    public void division (View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("");
        ope=4;
    }
//Código para funciones trigonométricas
    public void sin (View v){
        try{ String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("Sin (" +operan1+")");
        ope=5;
    }

    public void cos (View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("Cos (" +operan1+")");
        ope=6;
    }

    public void tan (View v){
        try{ String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("Tan (" +operan1+")");
        ope=7;

    }

    //Código para boton igual y obtener resultados

    public void igual (View v){
        try{
            String aux2= pant.getText().toString();
            operan2= Double.parseDouble(aux2);
        }catch(NumberFormatException nfe){};
        pant.setText("");

        if (ope==1){
            res=operan1+operan2;

        }else if (ope==2){
            res=operan1-operan2;

        }else if (ope==3){
            res=operan1*operan2;

        }else if (ope==4){
            if(operan2==0){
                pant.setText("Numero no se puede dividir para 0");
            }else{
                res= operan1/operan2;
            }

        }else if(ope==5){
            double rad=Math.toRadians(operan1);
            res= (Math.sin(rad));

        }else if(ope==6){
            double rad=Math.toRadians(operan1);
            res= (Math.cos(rad));

        }else if(ope==7){
            double rad=Math.toRadians(operan1);
            res= (Math.tan(rad));
        }
        pant.setText(""+res);
        operan1=res;
    }
    //Código para eliminar números de la caja
    public void borrar (View v){
        if (!pant.getText().toString().equals("")){
            pant.setText(pant.getText().subSequence(0,pant.getText().length()-1)+"");
        }
    }
}