package home.liq7.testndk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import home.liqi.ndkdemo.NativeMethods;

public class MainActivity extends AppCompatActivity {
    private TextView aaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aaa = (TextView) findViewById(R.id.aaa);
        aaa.setText(NativeMethods.printInfo());
    }
}
