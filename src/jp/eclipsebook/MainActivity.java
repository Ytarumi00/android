package jp.eclipsebook;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.*;
import android.widget.*;
import android.widget.Toast;

public class MainActivity extends Activity {

	private TextView text1;
	private EditText edit1;
	private Button btn1;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		final Activity activity = this;
		//ListViewの作成
		LinearLayout layout = new LinearLayout(this);
		layout.setOrientation(LinearLayout.VERTICAL);
		this.setContentView(layout);
		//TextView作成
		text1 = new TextView(this);
		text1.setText("dynamic widget!");
		text1.setTextSize(30);
		layout.addView(text1);
		//EditText作成
		edit1 = new EditText(this);
		edit1.setTextSize(30);
		layout.addView(edit1);
		//Button作成
		btn1 = new Button(this);
		btn1.setText("click");
		layout.addView(btn1);
		//Buttonのイベント設定
		btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast toast = Toast.makeText(activity, "you typed: " + edit1.getText(), Toast.LENGTH_SHORT);
				toast.show();
			}
		});
	}
}