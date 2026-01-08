package com.swordfish.lemuroid.lib.core.assetsmanager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\u0007J&\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/swordfish/lemuroid/lib/core/assetsmanager/NoAssetsManager;", "Lcom/swordfish/lemuroid/lib/library/CoreID$AssetsManager;", "()V", "clearAssets", "", "directoriesManager", "Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;", "(Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveAssetsIfNeeded", "coreUpdaterApi", "Lcom/swordfish/lemuroid/lib/core/CoreUpdater$CoreManagerApi;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Lcom/swordfish/lemuroid/lib/core/CoreUpdater$CoreManagerApi;Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;Landroid/content/SharedPreferences;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrograde-app-shared_release"})
public final class NoAssetsManager implements com.swordfish.lemuroid.lib.library.CoreID.AssetsManager {
    
    public NoAssetsManager() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object clearAssets(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object retrieveAssetsIfNeeded(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.core.CoreUpdater.CoreManagerApi coreUpdaterApi, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}