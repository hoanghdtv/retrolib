package com.swordfish.lemuroid.lib.preferences;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\n"}, d2 = {"Lcom/swordfish/lemuroid/lib/preferences/SharedPreferencesHelper;", "", "()V", "getLegacySharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "getSharedPreferences", "getSharedPreferencesDataStore", "Lcom/swordfish/lemuroid/common/preferences/SharedPreferencesDataStore;", "retrograde-app-shared_debug"})
public final class SharedPreferencesHelper {
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.lemuroid.lib.preferences.SharedPreferencesHelper INSTANCE = null;
    
    private SharedPreferencesHelper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.swordfish.lemuroid.common.preferences.SharedPreferencesDataStore getSharedPreferencesDataStore(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Default shared preferences does not work with multi-process. It's currently used only for
     * stored directory which are only read in the main process.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public final android.content.SharedPreferences getLegacySharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}