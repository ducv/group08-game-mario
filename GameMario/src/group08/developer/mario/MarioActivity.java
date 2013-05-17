package group08.developer.mario;

import group08.developer.mario.main.HelpActivity;
import group08.developer.mario.main.StartActivity;
import group08.developer.mario.main.OptionActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MarioActivity extends Activity implements OnClickListener {

	private Button start;
	private Button opption;
	private Button help;
	private Button exit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_mario);

		start = (Button) findViewById(R.id.start);
		opption = (Button) findViewById(R.id.opption);
		help = (Button) findViewById(R.id.help);
		exit = (Button) findViewById(R.id.exit);

		start.setOnClickListener(this);
		opption.setOnClickListener(this);
		help.setOnClickListener(this);
		exit.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.mario, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.start:
			Intent start = new Intent(getApplicationContext(),
					StartActivity.class);
			startActivity(start);
			break;
		case R.id.opption:
			Intent opption = new Intent(getApplicationContext(),
					OptionActivity.class);
			startActivity(opption);
			break;
		case R.id.help:
			Intent help = new Intent(getApplicationContext(),
					HelpActivity.class);
			startActivity(help);
			break;
		case R.id.exit:
			finish();
			System.exit(0);
			break;

		default:
			break;
		}

	}

}
