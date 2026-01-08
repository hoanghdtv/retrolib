package com.swordfish.lemuroid.lib.core;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 %2\u00020\u0001:\u0002%&B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u001b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001bJ\u001e\u0010 \u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#H\u0086@\u00a2\u0006\u0002\u0010$R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR#\u0010\u000e\u001a\n \u000f*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/swordfish/lemuroid/lib/core/CoresSelection;", "", "sharedPreferencesFactory", "Ldagger/Lazy;", "Landroid/content/SharedPreferences;", "desmumeMigrationHandler", "Lcom/swordfish/lemuroid/lib/migration/DesmumeMigrationHandler;", "(Ldagger/Lazy;Lcom/swordfish/lemuroid/lib/migration/DesmumeMigrationHandler;)V", "flowSharedPreferences", "Lcom/fredporciuncula/flow/preferences/FlowSharedPreferences;", "getFlowSharedPreferences", "()Lcom/fredporciuncula/flow/preferences/FlowSharedPreferences;", "flowSharedPreferences$delegate", "Lkotlin/Lazy;", "sharedPreferences", "kotlin.jvm.PlatformType", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences$delegate", "getCoreConfigForSystem", "Lcom/swordfish/lemuroid/lib/library/SystemCoreConfig;", "system", "Lcom/swordfish/lemuroid/lib/library/GameSystem;", "(Lcom/swordfish/lemuroid/lib/library/GameSystem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDefaultCoreForSystem", "", "getSelectedCoreConfigForSystem", "Lkotlinx/coroutines/flow/Flow;", "getSelectedCoreNameForSystem", "getSelectedCores", "", "Lcom/swordfish/lemuroid/lib/core/CoresSelection$SelectedCore;", "updateCoreConfigForSystem", "", "coreID", "Lcom/swordfish/lemuroid/lib/library/CoreID;", "(Lcom/swordfish/lemuroid/lib/library/GameSystem;Lcom/swordfish/lemuroid/lib/library/CoreID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "SelectedCore", "retrograde-app-shared_release"})
public final class CoresSelection {
    @org.jetbrains.annotations.NotNull()
    private final dagger.Lazy<android.content.SharedPreferences> sharedPreferencesFactory = null;
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.lemuroid.lib.migration.DesmumeMigrationHandler desmumeMigrationHandler = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy sharedPreferences$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy flowSharedPreferences$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CORE_SELECTION_BINDING_PREFERENCE_BASE_KEY = "pref_key_core_selection";
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.lemuroid.lib.core.CoresSelection.Companion Companion = null;
    
    public CoresSelection(@org.jetbrains.annotations.NotNull()
    dagger.Lazy<android.content.SharedPreferences> sharedPreferencesFactory, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.migration.DesmumeMigrationHandler desmumeMigrationHandler) {
        super();
    }
    
    private final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    private final com.fredporciuncula.flow.preferences.FlowSharedPreferences getFlowSharedPreferences() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.swordfish.lemuroid.lib.core.CoresSelection.SelectedCore>> getSelectedCores() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateCoreConfigForSystem(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.GameSystem system, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.CoreID coreID, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCoreConfigForSystem(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.GameSystem system, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.swordfish.lemuroid.lib.library.SystemCoreConfig> $completion) {
        return null;
    }
    
    private final kotlinx.coroutines.flow.Flow<com.swordfish.lemuroid.lib.library.SystemCoreConfig> getSelectedCoreConfigForSystem(com.swordfish.lemuroid.lib.library.GameSystem system) {
        return null;
    }
    
    private final kotlinx.coroutines.flow.Flow<java.lang.String> getSelectedCoreNameForSystem(com.swordfish.lemuroid.lib.library.GameSystem system) {
        return null;
    }
    
    private final java.lang.String getDefaultCoreForSystem(com.swordfish.lemuroid.lib.library.GameSystem system) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/swordfish/lemuroid/lib/core/CoresSelection$Companion;", "", "()V", "CORE_SELECTION_BINDING_PREFERENCE_BASE_KEY", "", "computeSystemPreferenceKey", "systemID", "Lcom/swordfish/lemuroid/lib/library/SystemID;", "retrograde-app-shared_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String computeSystemPreferenceKey(@org.jetbrains.annotations.NotNull()
        com.swordfish.lemuroid.lib.library.SystemID systemID) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/swordfish/lemuroid/lib/core/CoresSelection$SelectedCore;", "", "system", "Lcom/swordfish/lemuroid/lib/library/GameSystem;", "coreConfig", "Lcom/swordfish/lemuroid/lib/library/SystemCoreConfig;", "(Lcom/swordfish/lemuroid/lib/library/GameSystem;Lcom/swordfish/lemuroid/lib/library/SystemCoreConfig;)V", "getCoreConfig", "()Lcom/swordfish/lemuroid/lib/library/SystemCoreConfig;", "getSystem", "()Lcom/swordfish/lemuroid/lib/library/GameSystem;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "retrograde-app-shared_release"})
    public static final class SelectedCore {
        @org.jetbrains.annotations.NotNull()
        private final com.swordfish.lemuroid.lib.library.GameSystem system = null;
        @org.jetbrains.annotations.NotNull()
        private final com.swordfish.lemuroid.lib.library.SystemCoreConfig coreConfig = null;
        
        public SelectedCore(@org.jetbrains.annotations.NotNull()
        com.swordfish.lemuroid.lib.library.GameSystem system, @org.jetbrains.annotations.NotNull()
        com.swordfish.lemuroid.lib.library.SystemCoreConfig coreConfig) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.swordfish.lemuroid.lib.library.GameSystem getSystem() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.swordfish.lemuroid.lib.library.SystemCoreConfig getCoreConfig() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.swordfish.lemuroid.lib.library.GameSystem component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.swordfish.lemuroid.lib.library.SystemCoreConfig component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.swordfish.lemuroid.lib.core.CoresSelection.SelectedCore copy(@org.jetbrains.annotations.NotNull()
        com.swordfish.lemuroid.lib.library.GameSystem system, @org.jetbrains.annotations.NotNull()
        com.swordfish.lemuroid.lib.library.SystemCoreConfig coreConfig) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}