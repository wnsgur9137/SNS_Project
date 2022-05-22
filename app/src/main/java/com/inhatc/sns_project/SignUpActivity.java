package com.inhatc.sns_project;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
<<<<<<< HEAD
import android.widget.Toast;
=======
>>>>>>> main

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUpActivity extends AppCompatActivity {
<<<<<<< HEAD

=======
>>>>>>> main
    private static final String TAG = "SignUpActivity";
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
        setContentView(R.layout.activity_sign_up);

        findViewById(R.id.btnJoin).setOnClickListener(onClickListener);
=======
        setContentView(R.layout.acitivity_sign_up);

        //Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();


        findViewById(R.id.signUpButton).setOnClickListener(onClickListener);
>>>>>>> main
    }

    @Override
    public void onStart() {
        super.onStart();
<<<<<<< HEAD
        FirebaseUser currentUser = mAuth.getCurrentUser();
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnJoin:
                    singUp();
=======
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
    }

    View.OnClickListener onClickListener = new View.OnClickListener(){
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.signUpButton:
                   signUp();
>>>>>>> main
                    break;
            }
        }
    };

<<<<<<< HEAD
    private void singUp() {
        String email = ((EditText)findViewById(R.id.edtEmail)).getText().toString();
        String password = ((EditText)findViewById(R.id.edtPassword)).getText().toString();
        String passwordCheck = ((EditText)findViewById(R.id.edtPasswordCheck)).getText().toString();

        if(email.length() > 0 && password.length() > 0 && passwordCheck.length() > 0) {
            if(password.equals(passwordCheck)) {
                mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Log.d(TAG, "createUserWithEmail:success");
                            startToast("회원가입이 완료되었습니다.");
                            FirebaseUser user = mAuth.getCurrentUser();
                        } else {
                            Log.w(TAG, "createUserWithEmail:failure", task.getException());
                            if(task.getException() != null) {
                                startToast(task.getException().toString());
                            }
                        }
                    }
                });
            } else {
                startToast("비밀번호가 일치하지 않습니다.");
            }
        } else {
            startToast("이메일 또는 비밀번호를 입력해 주세요.");
        }
    }

    private void startToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
=======
    private void signUp(){

        String email = ((EditText)findViewById(R.id.emailEditText)).getText().toString();
        String password = ((EditText)findViewById(R.id.passwordEditText)).getText().toString();


        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            //success ui 로직

                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "createUserWithEmail:failure", task.getException());
                            //fail ui 로직

                        }
                    }
                });

    }
}
>>>>>>> main
