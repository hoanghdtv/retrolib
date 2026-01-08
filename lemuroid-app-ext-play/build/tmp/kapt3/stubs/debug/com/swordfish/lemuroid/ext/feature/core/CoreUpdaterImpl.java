package com.swordfish.lemuroid.ext.feature.core;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0002\u0010\u0010J \u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0082@\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J$\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u001cH\u0096@\u00a2\u0006\u0002\u0010\u001dJ$\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u001cH\u0082@\u00a2\u0006\u0002\u0010\u001dJ.\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\u0006\u0010\u0019\u001a\u00020\u001aH\u0082@\u00a2\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0015H\u0002J&\u0010#\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u001cH\u0082@\u00a2\u0006\u0002\u0010$J\u001e\u0010%\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0082@\u00a2\u0006\u0002\u0010&R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/swordfish/lemuroid/ext/feature/core/CoreUpdaterImpl;", "Lcom/swordfish/lemuroid/lib/core/CoreUpdater;", "directoriesManager", "Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;", "retrofit", "Lretrofit2/Retrofit;", "(Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;Lretrofit2/Retrofit;)V", "api", "Lcom/swordfish/lemuroid/lib/core/CoreUpdater$CoreManagerApi;", "kotlin.jvm.PlatformType", "cancelPendingInstall", "", "installManager", "Lcom/google/android/play/core/splitinstall/SplitInstallManager;", "sessionId", "", "(Lcom/google/android/play/core/splitinstall/SplitInstallManager;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelPendingInstalls", "currentSession", "(Lcom/google/android/play/core/splitinstall/SplitInstallManager;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "computePlayModuleName", "", "it", "Lcom/swordfish/lemuroid/lib/library/CoreID;", "downloadCores", "context", "Landroid/content/Context;", "coreIDs", "", "(Landroid/content/Context;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "installAssets", "installCores", "(Lcom/google/android/play/core/splitinstall/SplitInstallManager;Ljava/util/List;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "log", "message", "requestCoresInstall", "(Lcom/google/android/play/core/splitinstall/SplitInstallManager;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "waitForCompletion", "(ILcom/google/android/play/core/splitinstall/SplitInstallManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lemuroid-app-ext-play_debug"})
public final class CoreUpdaterImpl implements com.swordfish.lemuroid.lib.core.CoreUpdater {
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager = null;
    private final com.swordfish.lemuroid.lib.core.CoreUpdater.CoreManagerApi api = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG_LOG = "CoreUpdaterImpl";
    private static final boolean VERBOSE = true;
    private static final int RETRY_ATTEMPTS = 5;
    private static final long RETRY_DELAY = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.lemuroid.ext.feature.core.CoreUpdaterImpl.Companion Companion = null;
    
    public CoreUpdaterImpl(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager, @org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object downloadCores(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.swordfish.lemuroid.lib.library.CoreID> coreIDs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object installCores(com.google.android.play.core.splitinstall.SplitInstallManager installManager, java.util.List<? extends com.swordfish.lemuroid.lib.library.CoreID> coreIDs, android.content.Context context, kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    private final java.lang.String computePlayModuleName(com.swordfish.lemuroid.lib.library.CoreID it) {
        return null;
    }
    
    private final java.lang.Object waitForCompletion(int sessionId, com.google.android.play.core.splitinstall.SplitInstallManager installManager, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object requestCoresInstall(com.google.android.play.core.splitinstall.SplitInstallManager installManager, java.util.List<? extends com.swordfish.lemuroid.lib.library.CoreID> coreIDs, kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    private final java.lang.Object installAssets(android.content.Context context, java.util.List<? extends com.swordfish.lemuroid.lib.library.CoreID> coreIDs, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object cancelPendingInstalls(com.google.android.play.core.splitinstall.SplitInstallManager installManager, java.lang.Integer currentSession, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object cancelPendingInstall(com.google.android.play.core.splitinstall.SplitInstallManager installManager, int sessionId, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void log(java.lang.String message) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006\f"}, d2 = {"Lcom/swordfish/lemuroid/ext/feature/core/CoreUpdaterImpl$Companion;", "", "()V", "RETRY_ATTEMPTS", "", "RETRY_DELAY", "Lkotlin/time/Duration;", "J", "TAG_LOG", "", "VERBOSE", "", "lemuroid-app-ext-play_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}