package net.dragora.daggerandroidinjectorsuperclass.di;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import net.dragora.daggerandroidinjectorsuperclass.BaseActivity;

/**
 * Created by luigipapino on 24/03/2017.
 */

@Subcomponent
public interface BaseActivitySubComponent extends AndroidInjector<BaseActivity>{
  @Subcomponent.Builder
  abstract class Builder extends AndroidInjector.Builder<BaseActivity> {
  }
}
