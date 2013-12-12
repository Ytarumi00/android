package jp.eclipsebook;


import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.view.View;
import android.widget.*;
//import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Button btn = (Button)this.findViewById(R.id.button1);
		btn.setOnClickListener(
			new View.OnClickListener() {
				public void onClick(View v) {
					TextView text1 = (TextView)findViewById(R.id.text1);
					text1.setText("ok!");
				}
			}
		);
		setContentView(btn);
	}
}
