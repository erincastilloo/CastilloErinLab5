package erin.castillo.com.castilloerinlab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Activity 1");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LIFECYCLE", "OnStart() has been executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LIFECYCLE", "OnResume() has been executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LIFECYCLE", "OnPause() has been executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LIFECYCLE", "OnStop() has been executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LIFECYCLE", "OnRestart() has been executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LIFECYCLE", "OnDestroy() has been executed");
    }
    public void process(View v){
        Intent i = null, chooser=null;
        if (v.getId()==R.id.btnActivity2){
            i = new Intent(this, MainActivity2.class);
            startActivity(i);
        }
        else if (v.getId()==R.id.btnMap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.595217, 120.969494"));
            chooser = Intent.createChooser(i, "Choose Application For Maps");
            startActivity(chooser);
        }
    }
}
