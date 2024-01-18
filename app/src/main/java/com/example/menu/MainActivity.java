package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.lang.reflect.Method;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        if (menu.getClass().getSimpleName().equals("MenuBuilder")) {
            try {
                Method m = menu.getClass().getDeclaredMethod("setOptionalIconsVisible", Boolean.TYPE);
                m.setAccessible(true);
                m.invoke(menu, true);
            } catch (NoSuchMethodException e) {
                System.err.println("onCreateOptionsMenu");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return true;
    }
    public void onBuyClick(MenuItem item)
    {
        Toast.makeText(getApplicationContext(),"Buy clicked", Toast.LENGTH_LONG).show();
    }
    public void onEmailClick(MenuItem item)
    {
        Toast.makeText(getApplicationContext(),"Email clicked", Toast.LENGTH_LONG).show();
    }
    public void onCallClick(MenuItem item)
    {
        Toast.makeText(getApplicationContext(),"Call clicked", Toast.LENGTH_LONG).show();
    }
    public void onCameraClick(MenuItem item)
    {
        Toast.makeText(getApplicationContext(),"Camera clicked", Toast.LENGTH_LONG).show();
    }
    public void onVideoClick(MenuItem item)
    {
        Toast.makeText(getApplicationContext(),"Video clicked", Toast.LENGTH_LONG).show();
    }
    public void onCopyClick(MenuItem item)
    {
        Toast.makeText(getApplicationContext(),"Copy clicked", Toast.LENGTH_LONG).show();
    }
    public void onPasteClick(MenuItem item)
    {
        Toast.makeText(getApplicationContext(),"Paste clicked", Toast.LENGTH_LONG).show();
    }
    public void onAddClick(MenuItem item)
    {
        Toast.makeText(getApplicationContext(),"Add clicked", Toast.LENGTH_LONG).show();
    }

}