package jp.eclipsebook;

/*import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;*/
import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		final Activity activity = this;
		RadioGroup group1 = (RadioGroup)this.findViewById(R.id.radioGroup1);
		group1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				RadioButton btn = (RadioButton)findViewById(checkedId);
				Toast toast = Toast.makeText(activity, "you checd: " + btn.getText(), Toast.LENGTH_SHORT);
				toast.show();
				toa
				
			}
		});
	}
}