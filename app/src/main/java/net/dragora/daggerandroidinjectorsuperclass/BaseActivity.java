package net.dragora.daggerandroidinjectorsuperclass;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import dagger.android.AndroidInjection;
import javax.inject.Inject;

/**
 * Created by luigipapino on 24/03/2017.
 */

public class BaseActivity extends AppCompatActivity {

  @Inject
  BasePresenter presenter;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    AndroidInjection.inject(this);
    super.onCreate(savedInstanceState);
    presenter.init(this);
  }
}
