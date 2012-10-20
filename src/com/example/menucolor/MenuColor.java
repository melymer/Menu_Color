package com.example.menucolor;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MenuColor extends Activity {

	TextView men;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_color);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    
    public boolean onOptionsItemSelected(MenuItem item) {
    	men = (TextView) findViewById (R.id.color);
        switch (item.getItemId()) {
        case R.id.amarillo: men.setTextColor(Color.YELLOW); break;
        case R.id.azul: men.setTextColor(Color.BLUE); break;
        case R.id.rojo: men.setTextColor(Color.RED); break;
        case R.id.about: Toast.makeText(this,"Programador: GAVA",Toast.LENGTH_SHORT).show(); break;	
        }
        return true;
    }
}
