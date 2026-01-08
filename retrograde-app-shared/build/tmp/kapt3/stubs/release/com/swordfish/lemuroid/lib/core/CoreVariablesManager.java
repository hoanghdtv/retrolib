package com.swordfish.lemuroid.lib.core;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0002\u0010\u0013J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@\u00a2\u0006\u0002\u0010\u0013R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/swordfish/lemuroid/lib/core/CoreVariablesManager;", "", "sharedPreferences", "Ldagger/Lazy;", "Landroid/content/SharedPreferences;", "(Ldagger/Lazy;)V", "convertCoreVariablesToMap", "", "", "coreVariables", "", "Lcom/swordfish/lemuroid/lib/core/CoreVariable;", "convertMapToCoreVariables", "variablesMap", "getOptionsForCore", "systemID", "Lcom/swordfish/lemuroid/lib/library/SystemID;", "systemCoreConfig", "Lcom/swordfish/lemuroid/lib/library/SystemCoreConfig;", "(Lcom/swordfish/lemuroid/lib/library/SystemID;Lcom/swordfish/lemuroid/lib/library/SystemCoreConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveCustomCoreVariables", "Companion", "retrograde-app-shared_release"})
public final class CoreVariablesManager {
    @org.jetbrains.annotations.NotNull()
    private final dagger.Lazy<android.content.SharedPreferences> sharedPreferences = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String RETRO_OPTION_PREFIX = "cv";
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.lemuroid.lib.core.CoreVariablesManager.Companion Companion = null;
    
    public CoreVariablesManager(@org.jetbrains.annotations.NotNull()
    dagger.Lazy<android.content.SharedPreferences> sharedPreferences) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOptionsForCore(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.SystemID systemID, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.SystemCoreConfig systemCoreConfig, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.swordfish.lemuroid.lib.core.CoreVariable>> $completion) {
        return null;
    }
    
    private final java.util.List<com.swordfish.lemuroid.lib.core.CoreVariable> convertMapToCoreVariables(java.util.Map<java.lang.String, java.lang.String> variablesMap) {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.String> convertCoreVariablesToMap(java.util.List<com.swordfish.lemuroid.lib.core.CoreVariable> coreVariables) {
        return null;
    }
    
    private final java.lang.Object retrieveCustomCoreVariables(com.swordfish.lemuroid.lib.library.SystemID systemID, com.swordfish.lemuroid.lib.library.SystemCoreConfig systemCoreConfig, kotlin.coroutines.Continuation<? super java.util.List<com.swordfish.lemuroid.lib.core.CoreVariable>> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/swordfish/lemuroid/lib/core/CoreVariablesManager$Companion;", "", "()V", "RETRO_OPTION_PREFIX", "", "computeOriginalKey", "sharedPreferencesKey", "systemID", "computeSharedPreferenceKey", "retroVariableName", "computeSharedPreferencesPrefix", "retrograde-app-shared_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String computeSharedPreferenceKey(@org.jetbrains.annotations.NotNull()
        java.lang.String retroVariableName, @org.jetbrains.annotations.NotNull()
        java.lang.String systemID) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String computeOriginalKey(@org.jetbrains.annotations.NotNull()
        java.lang.String sharedPreferencesKey, @org.jetbrains.annotations.NotNull()
        java.lang.String systemID) {
            return null;
        }
        
        private final java.lang.String computeSharedPreferencesPrefix(java.lang.String systemID) {
            return null;
        }
    }
}