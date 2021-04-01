package jp.co.sanyo.katoacsmonitor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import jp.co.sanyo.katoacsmonitor.ui.ACSMonitorFragment;
import jp.co.sanyo.katoacsmonitor.ui.OutriggerOverhangFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (savedInstanceState == null) {
            //Fragment1へ画面遷移
            ACSMonitorFragment ACSMonitorFragment = new ACSMonitorFragment();
            // FragmentManagerからFragmentTransactionを作成
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.container, ACSMonitorFragment);
            transaction.commit();
        }
        findViewById(R.id.bt_1).setOnClickListener(this);
        findViewById(R.id.bt_2).setOnClickListener(this);
        findViewById(R.id.bt_3).setOnClickListener(this);
        findViewById(R.id.bt_4).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.bt_1) {
            //Fragment1へ画面遷移
            ACSMonitorFragment ACSMonitorFragment = new ACSMonitorFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            // BackStackを設定
            fragmentTransaction.addToBackStack(null);
            // データをfragment1に渡す
            Bundle bundle = new Bundle();
            bundle.putString ("max_load", "50.0kg");
            bundle.putString ("hand_load", "25.0kg");
            bundle.putString ("boom_length", "0.0m");
            bundle.putString ("boom_angle", "30°");
            bundle.putString ("work_radius", "5.0m");
            ACSMonitorFragment.setArguments(bundle);
            fragmentTransaction.replace(R.id.container, ACSMonitorFragment);
            fragmentTransaction.commit();
        } else if (i == R.id.bt_2) {
            // Fragemnt02 インスタンス生成
            OutriggerOverhangFragment outriggerOverhangFragment = new OutriggerOverhangFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            // BackStackを設定
            fragmentTransaction.addToBackStack(null);
            Bundle bundle = new Bundle();
            bundle.putString ("max1", "MAX");
            bundle.putString ("max2", "MAX");
            bundle.putString ("max3", "MAX");
            bundle.putString ("max4", "MAX");
            outriggerOverhangFragment.setArguments(bundle);
            fragmentTransaction.replace(R.id.container, outriggerOverhangFragment);
            fragmentTransaction.commit();
        } else if (i == R.id.bt_3) {

        } else if (i == R.id.bt_4) {

        }
    }
}