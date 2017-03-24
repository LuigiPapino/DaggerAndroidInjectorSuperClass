package net.dragora.daggerandroidinjectorsuperclass.di;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import net.dragora.daggerandroidinjectorsuperclass.BaseActivity;

/**
 * Created by luigipapino on 24/03/2017.
 */

@Module(subcomponents = BaseActivitySubComponent.class)
abstract class ActivityModule {
  @Binds
  @IntoMap
  @ActivityKey(BaseActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindMainActivityInjectorFactory(
      BaseActivitySubComponent.Builder builder);
}
