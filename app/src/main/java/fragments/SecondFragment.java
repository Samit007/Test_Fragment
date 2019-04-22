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
public class SecondFragment extends Fragment implements View.OnClickListener{
    private Button btnArea;
    private EditText etRadius;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_second, container, false);

        etRadius=view.findViewById(R.id.etradius);
        btnArea=view.findViewById(R.id.btnCalculate);

        btnArea.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float radius=Float.parseFloat(etRadius.getText().toString());
        float area=3.14f*radius*radius;

        Toast.makeText(getActivity(), "Area of Circle "+ area , Toast.LENGTH_SHORT).show();
    }
}
