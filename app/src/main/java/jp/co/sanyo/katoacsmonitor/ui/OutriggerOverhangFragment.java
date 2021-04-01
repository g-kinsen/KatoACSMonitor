package jp.co.sanyo.katoacsmonitor.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import jp.co.sanyo.katoacsmonitor.R;

public class OutriggerOverhangFragment extends Fragment {

    public OutriggerOverhangFragment(){}

    // FragmentのViewを生成して返す
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_outrigger_overhang,
                container, false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle args = getArguments();
        if(args != null ){
            String m1 = args.getString("max1");
            String m2 = args.getString("max2");
            String m3 = args.getString("max3");
            String m4 = args.getString("max4");
            TextView tv1 = view.findViewById(R.id.tv_max1);
            TextView tv2 = view.findViewById(R.id.tv_max2);
            TextView tv3 = view.findViewById(R.id.tv_max3);
            TextView tv4 = view.findViewById(R.id.tv_max4);
            tv1.setText(m1);
            tv2.setText(m2);
            tv3.setText(m3);
            tv4.setText(m4);
        }
    }
}
