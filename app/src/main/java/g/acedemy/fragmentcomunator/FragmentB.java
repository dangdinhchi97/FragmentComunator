package g.acedemy.fragmentcomunator;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentB extends Fragment {
    TextView tvb;
    EditText etb;
    Button btnb;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_b,container,false);
        tvb= (TextView) view.findViewById(R.id.tvfmb);
        etb= (EditText)view. findViewById(R.id.etfmb);
        btnb= (Button)view. findViewById(R.id.btnfmb);
        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               TextView tva= (TextView)getActivity(). findViewById(R.id.tvfma);
               tva.setText(etb.getText().toString());
            }
        });
        return view;
    }
}
