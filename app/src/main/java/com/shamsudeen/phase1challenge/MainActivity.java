package com.shamsudeen.phase1challenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    setTitle("Alc 4 Phase 1");
  }

  public void aboutAlc(View view) {
    startActivity(new Intent(this, AboutAlcActivity.class));
  }

  public void myProfile(View view) {
    startActivity(new Intent(this, MyProfileActivity.class));
  }
}
