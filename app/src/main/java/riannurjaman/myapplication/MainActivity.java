package riannurjaman.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.riannurjaman_menu, menu);
        return true;
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.kontak) {
            Toast.makeText(getApplicationContext(), "muncul kontak", Toast.LENGTH_LONG).show();
        }
        if (id == R.id.pesan) {
            Toast.makeText(getApplicationContext(), "muncul pesan", Toast.LENGTH_LONG).show();
        }
        if (id == R.id.berkas) {
            Toast.makeText(getApplicationContext(), "muncul berkas", Toast.LENGTH_LONG).show();
        }
        if (id == R.id.galeri) {
            Toast.makeText(getApplicationContext(), "muncul galeri", Toast.LENGTH_LONG).show();
        }
        if (id == R.id.pengaturan) {
            Toast.makeText(getApplicationContext(), "muncul pengaturan", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
