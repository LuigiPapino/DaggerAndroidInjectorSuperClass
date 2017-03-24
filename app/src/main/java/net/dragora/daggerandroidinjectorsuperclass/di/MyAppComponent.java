package net.dragora.daggerandroidinjectorsuperclass.di;

import dagger.Component;
import javax.inject.Singleton;
import net.dragora.daggerandroidinjectorsuperclass.MyApplication;

/**
 * Created by luigipapino on 24/03/2017.
 */
@Singleton
@Component(modules = ActivityModule.class)
public interface MyAppComponent {

  void inject(MyApplication application);
}
