package com.example.midproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.midproject1.databinding.ActivityRegristrationBinding;

public class RegristrationActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivityRegristrationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegristrationBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.btnRegis.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == binding.btnRegis.getId()){
            String getUsername = binding.etUsername.getText().toString();
            String getPassword = binding.etPasswordRegistration.getText().toString();
            String getEmail = binding.etEmail.getText().toString();
            String confirm = binding.etConfirmpass.getText().toString();
            if(getUsername.isEmpty()){
                binding.etUsername.setError("Please fill the username");
            }else if(getEmail.isEmpty()){
                binding.etEmail.setError("Please fill the email");
            }else if(getPassword.isEmpty()){
                binding.etPasswordRegistration.setError("Please fill the password");
            }else if(!confirm.equals(getPassword)){
                binding.etConfirmpass.setError("Password Confirmation Wrong");
            } else{
                Intent moveToHomeActivity = new Intent(this, HomeActivity.class);
                startActivity(moveToHomeActivity);
            }
        }
    }
}