package g.acedemy.fragmentcomunator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tvmain;

Button btnmain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvmain= (TextView) findViewById(R.id.tvmain);
        btnmain= (Button) findViewById(R.id.btnmain);

        btnmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentA fragmentA= (FragmentA)getFragmentManager().findFragmentById(R.id.fma);
                        fragmentA.Chageby_tva("Change by content fragment a");
            }
        });
    }
}
