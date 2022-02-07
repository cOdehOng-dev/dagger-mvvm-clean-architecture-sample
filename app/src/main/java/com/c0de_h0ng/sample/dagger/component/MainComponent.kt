package com.c0de_h0ng.sample.dagger.component

import com.c0de_h0ng.sample.MainActivity
import com.c0de_h0ng.sample.dagger.module.MainModule
import dagger.Component

/**
 * Created by c0de_h0ng on 2022/02/07.
 */
@Component(
    modules = [MainModule::class]
)
interface MainComponent {
    fun inject(activity: MainActivity)
}