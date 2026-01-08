package com.swordfish.lemuroid.lib.injection;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a&\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005j\u0002`\u0007\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u00060\bj\u0002`\t0\u0004H\'J \u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u00060\bj\u0002`\t0\u0004H\'\u00a8\u0006\f"}, d2 = {"Lcom/swordfish/lemuroid/lib/injection/AndroidWorkerInjectionModule;", "", "()V", "workerInjectorFactories", "", "Ljava/lang/Class;", "Landroidx/work/ListenableWorker;", "Lcom/swordfish/lemuroid/lib/injection/Worker;", "Ldagger/android/AndroidInjector$Factory;", "Lcom/swordfish/lemuroid/lib/injection/WorkerFactory;", "workerInjectorFactoriesWithStringKeys", "", "retrograde-app-shared_release"})
public abstract class AndroidWorkerInjectionModule {
    
    public AndroidWorkerInjectionModule() {
        super();
    }
    
    @dagger.multibindings.Multibinds()
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<java.lang.Class<? extends androidx.work.ListenableWorker>, dagger.android.AndroidInjector.Factory<? extends androidx.work.ListenableWorker>> workerInjectorFactories();
    
    @dagger.multibindings.Multibinds()
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<java.lang.String, dagger.android.AndroidInjector.Factory<? extends androidx.work.ListenableWorker>> workerInjectorFactoriesWithStringKeys();
}