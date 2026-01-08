package com.swordfish.lemuroid.lib.savesync;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0004H&J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007J\b\u0010\r\u001a\u00020\u0004H&J\b\u0010\u000e\u001a\u00020\u0004H&J\u0012\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u0010H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0013H&J\u001c\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018H\u00a6@\u00a2\u0006\u0002\u0010\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/swordfish/lemuroid/lib/savesync/SaveSyncManager;", "", "()V", "computeSavesSpace", "", "computeStatesSpace", "core", "Lcom/swordfish/lemuroid/lib/library/CoreID;", "getConfigInfo", "getDisplayNameForCore", "context", "Landroid/content/Context;", "coreID", "getLastSyncInfo", "getProvider", "getSettingsActivity", "Ljava/lang/Class;", "Landroid/app/Activity;", "isConfigured", "", "isSupported", "sync", "", "cores", "", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrograde-app-shared_release"})
public abstract class SaveSyncManager {
    
    public SaveSyncManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getProvider();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Class<? extends android.app.Activity> getSettingsActivity();
    
    public abstract boolean isSupported();
    
    public abstract boolean isConfigured();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getLastSyncInfo();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getConfigInfo();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object sync(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.swordfish.lemuroid.lib.library.CoreID> cores, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String computeSavesSpace();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String computeStatesSpace(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.CoreID core);
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayNameForCore(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.CoreID coreID) {
        return null;
    }
}