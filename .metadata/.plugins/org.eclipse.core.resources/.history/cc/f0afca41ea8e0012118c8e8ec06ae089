package org.example.ejemplograficos;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

public class EjemploGraficosActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new EjemploView(this));
	}

	public class EjemploView extends View {
		Paint pincel;
		Path trazo;

		public EjemploView (Context context) {
			super(context);
			pincel = new Paint();
			trazo = new Path();
		}

		@Override
		protected void onDraw(Canvas canvas) {
//	1		pincel.setColor(Color.BLUE);
//	1		pincel.setStrokeWidth(8);
//	1		pincel.setStyle(Style.STROKE);
//	1		canvas.drawCircle(150, 150, 100, pincel);
//	1		pincel.setColor(getResources().getColor(R.color.color_circulo));
//	1		canvas.drawCircle(150, 250, 100, pincel);
//	2		trazo.addCircle(150, 150, 100, Direction.CW);
			trazo.moveTo(50, 100);
			trazo.cubicTo(60,70, 150,65, 200,110);
			trazo.lineTo(300,200);
			canvas.drawColor(Color.WHITE);
			pincel.setColor(Color.BLUE);
			pincel.setStrokeWidth(8);
			pincel.setStyle(Style.STROKE);
			canvas.drawPath(trazo, pincel);
			pincel.setStrokeWidth(1);
			pincel.setStyle(Style.FILL);
			pincel.setTextSize(20);
			pincel.setTypeface(Typeface.SANS_SERIF);
			canvas.drawTextOnPath("Desarrollo de aplicaciones para móviles con Android",
					trazo, 10, -40, pincel);
		}
	}
}

