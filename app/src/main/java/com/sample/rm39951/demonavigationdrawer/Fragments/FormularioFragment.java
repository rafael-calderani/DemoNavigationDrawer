package com.sample.rm39951.demonavigationdrawer.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.sample.rm39951.demonavigationdrawer.R;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 */
public class FormularioFragment extends Fragment implements View.OnClickListener {

    private EditText etValor2, etValor1;
    private TextView tvResultado;
    private Button btnSoma, btnSubtracao, btnMultiplicacao, btnDivisao;

    public FormularioFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vFormulario = inflater.inflate(R.layout.fragment_formulario, container, false);

        etValor1 = (EditText) vFormulario.findViewById(R.id.txtValor1);
        etValor2 = (EditText) vFormulario.findViewById(R.id.txtValor2);
        btnSoma = (Button) vFormulario.findViewById(R.id.btnSoma);
        btnSubtracao = (Button) vFormulario.findViewById(R.id.btnSubtracao);
        btnMultiplicacao = (Button) vFormulario.findViewById(R.id.btnMultiplicacao);
        btnDivisao = (Button) vFormulario.findViewById(R.id.btnDivisao);
        tvResultado = (TextView) vFormulario.findViewById(R.id.lblResultado);

        btnSoma.setOnClickListener(this);
        btnSubtracao.setOnClickListener(this);
        btnMultiplicacao.setOnClickListener(this);
        btnDivisao.setOnClickListener(this);

        return vFormulario;
    }

    @Override
    public void onClick(View v) {
        int v1 = Integer.parseInt(etValor1.getText().toString());
        int v2 = Integer.parseInt(etValor2.getText().toString());
        int resultado = 0;
        switch (v.getId()) {
            case R.id.btnSoma:
                    resultado = (v1 + v2);
                break;
            case R.id.btnSubtracao:
                resultado = v1 - v2;
                break;
            case R.id.btnMultiplicacao:
                resultado = v1 * v2;
                break;
            case R.id.btnDivisao:
                if(v2 != 0) {
                    resultado = v1 / v2;
                }
                break;
            default:
                break;
        }
        tvResultado.setText(String.valueOf(resultado));
    }

    public void Calcular(View view) {
    }
}
