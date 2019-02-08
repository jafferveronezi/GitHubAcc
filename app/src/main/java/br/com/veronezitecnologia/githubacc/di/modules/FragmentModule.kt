package br.com.veronezitecnologia.githubacc.di.modules

import br.com.veronezitecnologia.githubacc.ui.userprofile.UserProfileFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun contributeUserProfileFragment(): UserProfileFragment

}
