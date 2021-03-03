package com.example.midproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.midproject1.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityLoginBinding binding;
    private String username = "felicia@bncc.com";
    private String password = "midproject";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == binding.btnLogin.getId()){
            String getUsername = binding.etUsernameLogin.getText().toString();
            String getPassword = binding.etPasswordLogin.getText().toString();

            if(getUsername.isEmpty()){
                binding.etUsernameLogin.setError("Please fill the username");
            }else if(getPassword.isEmpty()){
                binding.etPasswordLogin.setError("Please fill the password");
            }else if(getUsername.equals(username) && getPassword.equals(password)){
                Intent moveToRegistrationActivity = new Intent(this, RegristrationActivity.class);
                startActivity(moveToRegistrationActivity);
            }else{
                Toast.makeText(this,"Wrong username or password", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
