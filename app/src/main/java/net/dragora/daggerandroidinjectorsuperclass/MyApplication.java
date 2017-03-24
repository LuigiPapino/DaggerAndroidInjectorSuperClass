package net.dragora.daggerandroidinjectorsuperclass;

import android.app.Activity;
import android.app.Application;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasDispatchingActivityInjector;
import javax.inject.Inject;
import net.dragora.daggerandroidinjectorsuperclass.di.DaggerMyAppComponent;
import net.dragora.daggerandroidinjectorsuperclass.di.MyAppComponent;

/**
 * Created by luigipapino on 24/03/2017.
 */

public class MyApplication extends Application implements HasDispatchingActivityInjector {
  private static MyAppComponent appComponent;
  @Inject
  DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

  @Override
  public DispatchingAndroidInjector<Activity> activityInjector() {
    return dispatchingAndroidInjector;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    appComponent = DaggerMyAppComponent.builder().build();
    appComponent.inject(this);
  }
}
