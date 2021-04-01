package jp.co.sanyo.katoacsmonitor.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import jp.co.sanyo.katoacsmonitor.R;

public class ACSMonitorFragment extends Fragment {

    public ACSMonitorFragment(){}

    // FragmentのViewを生成して返す
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_acs_monitor,
                container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle args = getArguments();
        if(args != null ){
            String sMaxLoad = args.getString("max_load");
            String sHandLoad = args.getString("hand_load");
            String sBoomLength = args.getString("boom_length");
            String sBoomAngle = args.getString("boom_angle");
            String sWorkRadius = args.getString("work_radius");
            TextView tv_maxLoad = view.findViewById(R.id.tv_max_load);
            TextView tv_handLoad = view.findViewById(R.id.tv_hang_load);
            TextView tv_boomLength = view.findViewById(R.id.tv_boom_length);
            TextView tv_boomAngle = view.findViewById(R.id.tv_boom_angle);
            TextView tv_workRadius = view.findViewById(R.id.tv_work_radius);
            tv_maxLoad.setText(sMaxLoad);
            tv_handLoad.setText(sHandLoad);
            tv_boomLength.setText(sBoomLength);
            tv_boomAngle.setText(sBoomAngle);
            tv_workRadius.setText(sWorkRadius);
        }

        // BackStackで１つ戻す
//        Button pop01 = view.findViewById(R.id.pop_01);
//        pop01.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                FragmentManager fragmentManager = getFragmentManager();
//                if(fragmentManager != null) {
//                    fragmentManager.popBackStack();
//                }
//            }
//        });
    }
}
