package id.anandita.fragmentapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.SupportMenuInflater;

public class FragmentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedIntanceState){
        super.onCreate(savedIntanceState);
        setContentView(R.layout.activity_fragment);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionItemSelected(MenuItem item){
        int.id = item.getItemId();
        if(id== R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

