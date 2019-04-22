package fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.e.test_fragment.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {
    Button btnCalculate;
    EditText etRadius;


    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first,container,false);
        etRadius=view.findViewById(R.id.etradius);
        btnCalculate=view.findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radius=Integer.parseInt(etRadius.getText().toString());
                double result = (3.14*radius*radius);
                Toast.makeText(getActivity(),"Area is : "+result,Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}