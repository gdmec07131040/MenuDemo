package cn.edu.gdmec.s07131040.menudemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		// TODO Auto-generated method stub
		
		
		switch (item.getItemId()) {
		case R.id.item1:     
			mytv.setText("��ѡ����help�˵���");
			break;
		case R.id.item2:  
			mytv.setText("��ѡ����login�˵���");
			break;
	case R.id.item3:    
		item.setTitle("��̬���ò˵�����");
		break;	}
		
		return super.onMenuItemSelected(featureId, item);
	}


	TextView mytv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytv = (TextView) findViewById(R.id.textView1);
        mytv.setText("�˵�����");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
