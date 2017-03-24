# Dagger2 AndroidInjection of a BaseActivity
Reference project to show the issue with the new AndroidInjection of Dagger2 and the use of extended activities

A `BaseActivity` with a `BasePresenter` injected through the `AndriondInjection.inject`;

Then a `MainActivity` extends the `BaseActivity`.

Launching the MainActivity will raise this exception:

`Caused by: java.lang.IllegalArgumentException: No injector factory bound for Class<net.dragora.daggerandroidinjectorsuperclass.MainActivity>. Injector factories were bound for supertypes of net.dragora.daggerandroidinjectorsuperclass.MainActivity: [net.dragora.daggerandroidinjectorsuperclass.BaseActivity]. Did you mean to bind an injector factory for the subtype?`


The related issue in the dagger2 repository: https://github.com/google/dagger/issues/653
