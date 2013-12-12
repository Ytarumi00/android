package jp.eclipsebook;

import android.os.Bundle;

import android.app.Activity;
//import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void doAction(View view){
		TextView text1 = (TextView)this.findViewById(R.id.text1);
		text1.setText("OK!");
	}
}