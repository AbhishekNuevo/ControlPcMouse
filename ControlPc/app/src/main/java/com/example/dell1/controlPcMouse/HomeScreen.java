package com.example.dell1.controlPcMouse;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * Created by dell1 on 20-May-17.
 */

public class HomeScreen extends Activity {



    String TAG= "ControlPc";
    EditText ip,port;Button btn_connect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        ip=(EditText)findViewById(R.id.ip);
        port=(EditText)findViewById(R.id.port);
        btn_connect=(Button) findViewById(R.id.btn_connect);


        btn_connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Constants.SERVER_IP=ip.getText().toString();
                Constants.SERVER_PORT=Integer.parseInt(port.getText().toString());


                if(Constants.SERVER_IP!=null & Constants.SERVER_PORT!=0) {
                    Intent intent= new Intent(HomeScreen.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }else {
                    Toast.makeText(getApplicationContext(),"Enter Server Ip and port no.",Toast.LENGTH_LONG).show();
                }

            }
        });
    }


}