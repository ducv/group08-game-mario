package group08.developer.mario.main;

import group08.developer.mario.MarioActivity;
import group08.developer.mario.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class StartActivity extends Activity implements OnClickListener {

	private Button mainMenu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_start);

		mainMenu = (Button) findViewById(R.id.mainmenu);
		mainMenu.setOnClickListener(this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.mainmenu:
			Intent main = new Intent(getApplicationContext(),
					MarioActivity.class);
			startActivity(main);
			break;

		default:
			break;
		}

	}

}
