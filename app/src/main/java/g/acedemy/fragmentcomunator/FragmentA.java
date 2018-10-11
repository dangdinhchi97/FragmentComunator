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

public class FragmentA extends Fragment {
TextView tva;
EditText eta;
Button btna;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_a,container,false);
        tva= (TextView) view.findViewById(R.id.tvfma);
        eta= (EditText)view. findViewById(R.id.etfma);
        btna= (Button)view. findViewById(R.id.btnfma);
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               TextView tvmain= (TextView)getActivity(). findViewById(R.id.tvmain);
               tvmain.setText(eta.getText().toString());
            }
        });
        return view;
    }
    public void Chageby_tva(String content){
        tva.setText(content);
    }
}
