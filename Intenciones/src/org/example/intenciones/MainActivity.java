package org.example.intenciones;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	public void pgWeb(View view) {
		Intent intent = new Intent(Intent.ACTION_WEB_SEARCH,
				Uri.parse("http://www.androidcurso.com/"));
		startActivity(intent);
	}

	public void llamadaTelefono(View view) {
		Intent intent = new Intent(Intent.ACTION_DIAL,
				Uri.parse("tel:962849347"));
		startActivity(intent);
	}

	public void googleMaps(View view) {
		Intent intent = new Intent(Intent.ACTION_VIEW,
				Uri.parse("geo:41.656313,-0.877351"));
		startActivity(intent);
	}

	public void tomarFoto(View view) {
		Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
		startActivity(intent);
	}

	public void mandarCorreo(View view) {
		Intent intent = new Intent(Intent.ACTION_SEND);
		intent.setType("text/plain");
		intent.putExtra(Intent.EXTRA_SUBJECT, "asunto");
		intent.putExtra(Intent.EXTRA_TEXT, "texto del correo");
		intent.putExtra(Intent.EXTRA_EMAIL, 
				new String[] {" jtomas@upv.es" });
		startActivity(intent);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
