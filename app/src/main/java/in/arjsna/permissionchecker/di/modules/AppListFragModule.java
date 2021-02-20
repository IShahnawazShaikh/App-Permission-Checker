package in.arjsna.permissionchecker.di.modules;

import android.content.Context;
import android.view.LayoutInflater;
import dagger.Module;
import dagger.Provides;
import in.arjsna.permissionchecker.applicationslist.AppListPresenterImpl;
import in.arjsna.permissionchecker.applicationslist.IAppListPresenter;
import in.arjsna.permissionchecker.applicationslist.IAppListView;
import in.arjsna.permissionchecker.di.qualifiers.ActivityContext;
import in.arjsna.permissionchecker.di.scopes.FragmentScope;
import io.reactivex.disposables.CompositeDisposable;

/**
 * developed by team shark
 */
@Module
public class AppListFragModule {
  @Provides CompositeDisposable providesCompositeDisposable() {
    return new CompositeDisposable();
  }

  @FragmentScope
  @Provides IAppListPresenter<IAppListView> providedAppListPresenter(
      AppListPresenterImpl<IAppListView> appListPresenter) {
    return appListPresenter;
  }

  @Provides LayoutInflater provideLayoutInflater(@ActivityContext Context context) {
    return LayoutInflater.from(context);
  }
}
