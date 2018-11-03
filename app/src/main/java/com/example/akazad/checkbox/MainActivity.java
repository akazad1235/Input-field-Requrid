package com.example.akazad.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.akazad.checkbox.poju.Person;

import static java.lang.StringBuilder.*;

public class MainActivity extends AppCompatActivity {

    private EditText nameEt, phoneEt, emailEt, cityEt;
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEt=findViewById(R.id.nameId);
        phoneEt=findViewById(R.id.phoneId);
        emailEt=findViewById(R.id.emailId);
        cityEt=findViewById(R.id.cityId);
        textView1=findViewById(R.id.resultId);
        textView1.setText("Hello Android");

    }

    public void ChangeText(View view) {
           String name= nameEt.getText().toString();
           String phone= phoneEt.getText().toString();
           String email= emailEt.getText().toString();
           String city= cityEt.getText().toString();
          // textView1.setText("Value is "+text);
        if (name.isEmpty()){

            nameEt.setError("Please Enter your valid name");
            return;

        }
        if (phone.isEmpty()){

            phoneEt.setError("Please provide a valid positive number");
            return;

        }
        if (email.isEmpty()){

            emailEt.setError("Please provide a valid email address");
            return;

        }
        if (city.isEmpty()){

            cityEt.setError("Please provide a city");
            return;

        }
        Person person=new Person(name, phone, email, city);
        textView1.setText(person.toString());
        nameEt.setText("");
        phoneEt.setText("");
        emailEt.setText("");
        cityEt.setText("");
        Toast.makeText(getApplicationContext(), name.toString(), Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), phone.toString(), Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), email.toString(), Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), city.toString(), Toast.LENGTH_LONG).show();
    }
}
