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
public class ThirdFragment extends Fragment {
    Button btnCalculate;
    EditText etnum;


    public ThirdFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third, container, false);
        etnum=view.findViewById(R.id.etnum);
        btnCalculate=view.findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number=Integer.parseInt(etnum.getText().toString());
                if (number%2==0) {
                    Toast.makeText(getActivity(), +number + " is even", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getActivity(),+number+" is odd",Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }

}