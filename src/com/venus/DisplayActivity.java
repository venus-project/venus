package com.venus;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by zhaoxin on 15/3/19.
 */
public class DisplayActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        InitActivityView();

    }

    private void InitActivityView() {
        Intent intent = getIntent();
        Bundle bData = intent.getExtras();
        Bitmap bitmap = (Bitmap) bData.get("data");

        ((ImageView) findViewById(R.id.display_image)).setImageBitmap(bitmap);

        Button back = (Button)findViewById(R.id.back_button);

        back.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("display_word", "the picture has been displayed!");
            }
        });
    }
}