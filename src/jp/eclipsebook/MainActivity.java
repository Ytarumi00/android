package jp.eclipsebook;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.*;
import android.widget.*;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void doAction(View view){
		EditText edit1 = (EditText)this.findViewById(R.id.editText1);
		Editable str = edit1.getText();
		Toast toast = Toast.makeText(this, "you typed: " + str, Toast.LENGTH_SHORT);
		toast.show();
	}
}