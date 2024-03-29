package com.example.laultimachance;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Cuenta#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cuenta extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Cuenta() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Cuenta.
     */
    // TODO: Rename and change types and number of parameters
    public static Cuenta newInstance(String param1, String param2) {
        Cuenta fragment = new Cuenta();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cuenta, container, false);


        Button btnPedidos = (Button) view.findViewById(R.id.button_pedidos);
        btnPedidos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent toMisPedidos = new Intent(getActivity(), MisPedidos.class);
                startActivity(toMisPedidos);
            }
        });

        Button btnCuentas = (Button) view.findViewById(R.id.button_cuentas);
        btnCuentas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent toCuentas = new Intent(getActivity(), FormasDePago.class);
                startActivity(toCuentas);
            }
        });

        Button btnLogOut = (Button) view.findViewById(R.id.button_logOut);
        btnLogOut.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent toLogin = new Intent(getActivity(), Login.class);
                startActivity(toLogin);
            }
        });

        Button btnCambioContrasenia = (Button) view.findViewById(R.id.button_CambioContrasenia);
        btnCambioContrasenia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent toForgotPassword = new Intent(getActivity(), forgotpassword.class);
                startActivity(toForgotPassword);
            }
        });


        return view;
    }

}