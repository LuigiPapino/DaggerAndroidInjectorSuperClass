package net.dragora.daggerandroidinjectorsuperclass;

import javax.inject.Inject;

/**
 * Created by luigipapino on 24/03/2017.
 */

public class BasePresenter {

  BaseActivity view;

  @Inject
  public BasePresenter() {
  }

  public void init(BaseActivity view){
    this.view = view;
  }
}
