package com.example.midproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.midproject1.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.btnTipeKendaraan.setOnClickListener(this);
        binding.btnSubmit.setOnClickListener(this);
        binding.btnTestDrive.setOnClickListener(this);
        binding.btnSubmitLast.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == binding.btnTipeKendaraan.getId()){
            String Kendaraan = binding.etTipeKendaraan.getText().toString().toLowerCase();
            if(Kendaraan.equals("mobil")){
                binding.tvTypeMobil.setVisibility(View.VISIBLE);
                binding.tvTypeMotor.setVisibility(View.GONE);
                binding.etTypeMobil.setVisibility(View.VISIBLE);
                binding.etTypeMotor.setVisibility(View.GONE);
                binding.btnSubmit.setVisibility(View.VISIBLE);
                binding.tvEntertainment.setVisibility(View.VISIBLE);
                binding.etEntertainment.setVisibility(View.VISIBLE);
                binding.tvHelm.setVisibility(View.GONE);
                binding.etHelm.setVisibility(View.GONE);

            }else if(Kendaraan.equals("motor")){
                binding.tvTypeMotor.setVisibility(View.VISIBLE);
                binding.tvTypeMobil.setVisibility(View.GONE);
                binding.etTypeMotor.setVisibility(View.VISIBLE);
                binding.etTypeMobil.setVisibility(View.GONE);
                binding.btnSubmit.setVisibility(View.VISIBLE);
                binding.tvEntertainment.setVisibility(View.GONE);
                binding.etEntertainment.setVisibility(View.GONE);
                binding.tvHelm.setVisibility(View.VISIBLE);
                binding.etHelm.setVisibility(View.VISIBLE);
            }else{
                binding.etTipeKendaraan.setError("Tipe Kendaraan yang diinput salah");
            }
        }else if(v.getId() == binding.btnSubmit.getId()){
            String Kendaraan = binding.etTipeKendaraan.getText().toString().toLowerCase();
            String brand = binding.etBrand.getText().toString();
            String name = binding.etName.getText().toString();
            String license = binding.etLicense.getText().toString();
            String speed = binding.etSpeed.getText().toString();
            String gas = binding.etGas.getText().toString();
            String wheel = binding.etWheel.getText().toString();
            String tipeMobil = binding.etTypeMobil.getText().toString();
            String entertainment = binding.etEntertainment.getText().toString();
            String tipeMotor = binding.etTypeMotor.getText().toString();
            String helm = binding.etHelm.getText().toString();
            if(Kendaraan.equals("mobil")){
                if(brand.isEmpty()){
                    binding.etBrand.setError("Please fill in the Brand");
                }else if(name.isEmpty()){
                    binding.etName.setError("Please fill in the Name");
                }else if(license.isEmpty()){
                    binding.etLicense.setError("Please fill in the License");
                }else if(speed.isEmpty()){
                    binding.etSpeed.setError("Please fill in the Top Speed");
                }else if(gas.isEmpty()){
                    binding.etGas.setError("Please fill in the Gas Capacity");
                }else if(wheel.isEmpty()){
                    binding.etWheel.setError("Please fill in the Wheel");
                }else if(tipeMobil.isEmpty()){
                    binding.etTypeMobil.setError("Please fill in the Type");
                }else if(!"suv".equals(tipeMobil.toLowerCase())&&!"supercar".equals(tipeMobil.toLowerCase())&&!"minivan".equals(tipeMobil.toLowerCase())){
                    binding.etTypeMobil.setError("Wrong Type of car");

                }else if(entertainment.isEmpty()){
                    binding.etEntertainment.setError("Please fill in the Entertainment System Amount");
                }else{
                    binding.tvTypeAnswer.setText(tipeMobil);
                    binding.tvEntertainmentAnswer.setText(entertainment);
                    String ResultName = "Car " + name;
                    binding.resultName.setText(ResultName);
                    binding.tvBrandAnswer.setText(brand);
                    binding.tvLicenseAnswer.setText(license);
                    binding.tvSpeedAnswer.setText(speed);
                    binding.tvGasAnswer.setText(gas);
                    binding.tvWheelAnswer.setText(wheel);
                    binding.tvNameAnswer.setText(name);
                    binding.resultName.setVisibility(View.VISIBLE);
                    binding.btnTestDrive.setVisibility(View.VISIBLE);
                    binding.tvBrandAns.setVisibility(View.VISIBLE);
                    binding.tvNameAns.setVisibility(View.VISIBLE);
                    binding.tvLicenseAns.setVisibility(View.VISIBLE);
                    binding.tvTypeAns.setVisibility(View.VISIBLE);
                    binding.tvGasAns.setVisibility(View.VISIBLE);
                    binding.tvSpeedAns.setVisibility(View.VISIBLE);
                    binding.tvWheelAns.setVisibility(View.VISIBLE);
                    binding.tvBrandAnswer.setVisibility(View.VISIBLE);
                    binding.tvNameAnswer.setVisibility(View.VISIBLE);
                    binding.tvLicenseAnswer.setVisibility(View.VISIBLE);
                    binding.tvTypeAnswer.setVisibility(View.VISIBLE);
                    binding.tvGasAnswer.setVisibility(View.VISIBLE);
                    binding.tvSpeedAnswer.setVisibility(View.VISIBLE);
                    binding.tvWheelAnswer.setVisibility(View.VISIBLE);
                    binding.tvHelmAns.setVisibility(View.GONE);
                    binding.tvHelmAnswer.setVisibility(View.GONE);
                    binding.tvEntertainmentAns.setVisibility(View.VISIBLE);
                    binding.tvEntertainmentAnswer.setVisibility(View.VISIBLE);
                }

            }else if(Kendaraan.equals("motor")){
                if(brand.isEmpty()){
                    binding.etBrand.setError("Please fill in the Brand");
                }else if(name.isEmpty()){
                    binding.etName.setError("Please fill in the Name");
                }else if(license.isEmpty()){
                    binding.etLicense.setError("Please fill in the License");
                }else if(speed.isEmpty()){
                    binding.etSpeed.setError("Please fill in the Top Speed");
                }else if(gas.isEmpty()){
                    binding.etGas.setError("Please fill in the Gas Capacity");
                }else if(wheel.isEmpty()){
                    binding.etWheel.setError("Please fill in the Wheel");
                }else if(tipeMotor.isEmpty()){
                    binding.etTypeMotor.setError("Please fill in the Type");
                }else if(!tipeMotor.toLowerCase().equals("manual")&&!tipeMotor.toLowerCase().equals("automatic")){
                    binding.etTypeMotor.setError("Wrong Type of motorcycle");

                }else if(helm.isEmpty()){
                    binding.etHelm.setError("Please fill in the Helmet Amount");
                }else {
                    String ResultName = "Motorcycle " + name;
                    binding.resultName.setText(ResultName);
                    binding.tvTypeAnswer.setText(tipeMotor);
                    binding.tvHelmAnswer.setText(helm);
                    binding.tvBrandAnswer.setText(brand);
                    binding.tvLicenseAnswer.setText(license);
                    binding.tvSpeedAnswer.setText(speed);
                    binding.tvGasAnswer.setText(gas);
                    binding.tvWheelAnswer.setText(wheel);
                    binding.tvNameAnswer.setText(name);
                    binding.resultName.setVisibility(View.VISIBLE);
                    binding.btnTestDrive.setVisibility(View.VISIBLE);
                    binding.tvBrandAns.setVisibility(View.VISIBLE);
                    binding.tvNameAns.setVisibility(View.VISIBLE);
                    binding.tvLicenseAns.setVisibility(View.VISIBLE);
                    binding.tvTypeAns.setVisibility(View.VISIBLE);
                    binding.tvGasAns.setVisibility(View.VISIBLE);
                    binding.tvSpeedAns.setVisibility(View.VISIBLE);
                    binding.tvWheelAns.setVisibility(View.VISIBLE);
                    binding.tvBrandAnswer.setVisibility(View.VISIBLE);
                    binding.tvNameAnswer.setVisibility(View.VISIBLE);
                    binding.tvLicenseAnswer.setVisibility(View.VISIBLE);
                    binding.tvTypeAnswer.setVisibility(View.VISIBLE);
                    binding.tvGasAnswer.setVisibility(View.VISIBLE);
                    binding.tvSpeedAnswer.setVisibility(View.VISIBLE);
                    binding.tvWheelAnswer.setVisibility(View.VISIBLE);
                    binding.tvEntertainmentAns.setVisibility(View.GONE);
                    binding.tvEntertainmentAnswer.setVisibility(View.GONE);
                    binding.tvHelmAns.setVisibility(View.VISIBLE);
                    binding.tvHelmAnswer.setVisibility(View.VISIBLE);

                }
            }
        }else if(v.getId() == binding.btnTestDrive.getId()){
            String Kendaraan = binding.etTipeKendaraan.getText().toString().toLowerCase();
            if(Kendaraan.equals("mobil")){
                String tipeMobil = binding.etTypeMobil.getText().toString().toLowerCase();
                String ent = binding.etEntertainment.getText().toString();
                if(tipeMobil.equals("supercar")){
                    String isi = "Boosting!";
                    Toast.makeText(this, isi, Toast.LENGTH_SHORT).show();
                }else{
                    String isi = "Turning on entertainment system... (" + ent + ")";
                    Toast.makeText(this, isi, Toast.LENGTH_SHORT).show();
                }
                binding.tvPrice.setVisibility(View.GONE);
                binding.etPrice.setVisibility(View.GONE);
                binding.btnSubmitLast.setVisibility(View.GONE);
            }else if(Kendaraan.equals("motor")){
                String name = binding.etName.getText().toString();
                String isi = name + " is standing!";
                Toast.makeText(this,isi, Toast.LENGTH_SHORT).show();
                binding.tvPrice.setVisibility(View.VISIBLE);
                binding.etPrice.setVisibility(View.VISIBLE);
                binding.btnSubmitLast.setVisibility(View.VISIBLE);
            }
        }else if(v.getId() == binding.btnSubmitLast.getId()){
            String harga = binding.etPrice.getText().toString();
            binding.priceAns.setText(harga);
            binding.priceAns.setVisibility(View.VISIBLE);
        }
    }
}