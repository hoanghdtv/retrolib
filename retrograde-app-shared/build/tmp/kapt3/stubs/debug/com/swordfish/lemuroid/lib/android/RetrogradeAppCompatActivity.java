package com.swordfish.lemuroid.lib.android;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011H\u0016R$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/swordfish/lemuroid/lib/android/RetrogradeAppCompatActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Ldagger/android/HasFragmentInjector;", "Ldagger/android/support/HasSupportFragmentInjector;", "()V", "frameworkFragmentInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroid/app/Fragment;", "getFrameworkFragmentInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setFrameworkFragmentInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "supportFragmentInjector", "Landroidx/fragment/app/Fragment;", "getSupportFragmentInjector", "setSupportFragmentInjector", "fragmentInjector", "Ldagger/android/AndroidInjector;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "retrograde-app-shared_debug"})
public abstract class RetrogradeAppCompatActivity extends androidx.appcompat.app.AppCompatActivity implements dagger.android.HasFragmentInjector, dagger.android.support.HasSupportFragmentInjector {
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> supportFragmentInjector;
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<android.app.Fragment> frameworkFragmentInjector;
    
    public RetrogradeAppCompatActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> getSupportFragmentInjector() {
        return null;
    }
    
    public final void setSupportFragmentInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<android.app.Fragment> getFrameworkFragmentInjector() {
        return null;
    }
    
    public final void setFrameworkFragmentInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<android.app.Fragment> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public dagger.android.AndroidInjector<androidx.fragment.app.Fragment> supportFragmentInjector() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public dagger.android.AndroidInjector<android.app.Fragment> fragmentInjector() {
        return null;
    }
}