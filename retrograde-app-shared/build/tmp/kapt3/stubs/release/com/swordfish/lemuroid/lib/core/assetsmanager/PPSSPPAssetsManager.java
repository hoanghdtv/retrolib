package com.swordfish.lemuroid.lib.core.assetsmanager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0082@\u00a2\u0006\u0002\u0010\u0007J,\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0002\u0010\u0010J&\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0014J\u001e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0002\u0010\u0017\u00a8\u0006\u0019"}, d2 = {"Lcom/swordfish/lemuroid/lib/core/assetsmanager/PPSSPPAssetsManager;", "Lcom/swordfish/lemuroid/lib/library/CoreID$AssetsManager;", "()V", "clearAssets", "", "directoriesManager", "Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;", "(Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAssetsDirectory", "Ljava/io/File;", "handleSuccess", "response", "Lretrofit2/Response;", "Ljava/util/zip/ZipInputStream;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;Lretrofit2/Response;Landroid/content/SharedPreferences;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveAssetsIfNeeded", "coreUpdaterApi", "Lcom/swordfish/lemuroid/lib/core/CoreUpdater$CoreManagerApi;", "(Lcom/swordfish/lemuroid/lib/core/CoreUpdater$CoreManagerApi;Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;Landroid/content/SharedPreferences;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatedRequested", "", "(Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;Landroid/content/SharedPreferences;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "retrograde-app-shared_release"})
public final class PPSSPPAssetsManager implements com.swordfish.lemuroid.lib.library.CoreID.AssetsManager {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PPSSPP_ASSETS_VERSION = "1.15";
    @org.jetbrains.annotations.NotNull()
    private static final android.net.Uri PPSSPP_ASSETS_URL = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PPSSPP_ASSETS_VERSION_KEY = "ppsspp_assets_version_key";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PPSSPP_ASSETS_FOLDER_NAME = "PPSSPP";
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.lemuroid.lib.core.assetsmanager.PPSSPPAssetsManager.Companion Companion = null;
    
    public PPSSPPAssetsManager() {
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
    
    private final java.lang.Object handleSuccess(com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager, retrofit2.Response<java.util.zip.ZipInputStream> response, android.content.SharedPreferences sharedPreferences, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object updatedRequested(com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager, android.content.SharedPreferences sharedPreferences, kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    private final java.lang.Object getAssetsDirectory(com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager, kotlin.coroutines.Continuation<? super java.io.File> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/swordfish/lemuroid/lib/core/assetsmanager/PPSSPPAssetsManager$Companion;", "", "()V", "PPSSPP_ASSETS_FOLDER_NAME", "", "PPSSPP_ASSETS_URL", "Landroid/net/Uri;", "getPPSSPP_ASSETS_URL", "()Landroid/net/Uri;", "PPSSPP_ASSETS_VERSION", "PPSSPP_ASSETS_VERSION_KEY", "retrograde-app-shared_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.net.Uri getPPSSPP_ASSETS_URL() {
            return null;
        }
    }
}