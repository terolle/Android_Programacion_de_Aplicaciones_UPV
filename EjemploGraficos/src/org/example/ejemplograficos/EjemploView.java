package org.example.ejemplograficos;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;

public class EjemploView extends View {
	private ShapeDrawable miImagen;
	
	public EjemploView (Context context) {
		super(context);
		setBackgroundResource(R.drawable.degradado);
		miImagen  = new ShapeDrawable(new OvalShape());
		miImagen.getPaint().setColor(0xff0000ff);
		miImagen.setBounds(10, 10, 310, 60);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		miImagen.draw(canvas);
	}
}
