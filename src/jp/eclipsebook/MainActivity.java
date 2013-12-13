package jp.eclipsebook;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.*;
import android.widget.*;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		final Activity activity = this;
		CheckBox check1 = (CheckBox)this.findViewById(R.id.checkBox1);
		check1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				Toast toast = Toast.makeText(activity, "you checked: " + isChecked, Toast.LENGTH_SHORT);
				toast.show();
				
			}
		});
	}
}