package com.example.drapp;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUpTabFragment extends Fragment {

    EditText em;

    EditText ps;
    EditText rps;

    Button su;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    ProgressDialog progressDialog;
    FirebaseAuth mAuth;
    FirebaseUser mUser;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup root=(ViewGroup) inflater. inflate(R. layout.signup_tab_fragment, container,  false);


        em=root.findViewById(R. id.email);

        ps=root.findViewById(R.id.passw);
        rps=root.findViewById(R.id.repassw);
        su=root.findViewById(R.id.sign);
        progressDialog=new ProgressDialog(getActivity());
        mAuth=FirebaseAuth.getInstance();
        mUser=mAuth.getCurrentUser();


        em.setTranslationX(800);

        ps.setTranslationX(800);
        rps.setTranslationX(800);
        su.setTranslationX(800);


        em.setAlpha(0);

        ps.setAlpha(0);
        rps.setAlpha(0);
        su.setAlpha(0);


        em.animate().translationX(0).alpha (1). setDuration(800). setStartDelay(300). start();

        ps.animate(). translationX(0).alpha(1).setDuration(800). setStartDelay(600).start();
        rps. animate().translationX(0).alpha(1).setDuration(800). setStartDelay(700). start();
        su. animate().translationX(0).alpha(1).setDuration(800). setStartDelay(900). start();



        su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                perForAuth();
            }
        });

        return root;


    }

    private void perForAuth() {
        String email=em.getText().toString();
        String password=ps.getText().toString();
        String cpassword=rps.getText().toString();
        if (!email.matches(emailPattern)){
            em.setError("Enter Correct E-mail");

        }else if(password.isEmpty() || password.length()<6){
            ps.setError("Please Enter Correct Password");

        }else if(!password.matches(cpassword)){
            rps.setError("Incorrect Password");

        }else{
            progressDialog.setMessage("Please wait while Registering ...");
            progressDialog.setTitle("Registration");
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.show();

            mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        progressDialog.dismiss();
                        sendUserToNextActivity2();
                        Toast.makeText(getActivity(), "Registration Successful", Toast.LENGTH_SHORT).show();
                    }else{
                        progressDialog.dismiss();
                        Toast.makeText(getActivity(), ""+task.getException(), Toast.LENGTH_SHORT).show();

                    }
                }
            });
        }

    }

    private void sendUserToNextActivity2() {
        Intent intent=new Intent(getActivity(), loginActivity.class);
        intent.setFlags (Intent. FLAG_ACTIVITY_CLEAR_TASK| Intent. FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        ((Activity) getActivity()).overridePendingTransition(0, 0);
    }


    }
