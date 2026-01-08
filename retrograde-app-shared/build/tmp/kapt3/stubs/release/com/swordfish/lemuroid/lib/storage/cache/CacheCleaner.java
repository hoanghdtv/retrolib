package com.swordfish.lemuroid.lib.storage.cache;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0086@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u0006\u0010\u0010\u001a\u00020\u0004J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/swordfish/lemuroid/lib/storage/cache/CacheCleaner;", "", "()V", "MAX_CACHE_LIMIT", "", "MIN_CACHE_LIMIT", "clean", "", "appContext", "Landroid/content/Context;", "requestedLimit", "(Landroid/content/Context;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanAll", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getClosestCacheLimit", "size", "getDefaultCacheLimit", "getInternalMemorySize", "getSupportedCacheLimits", "", "printSize", "", "retrieveLastAccess", "file", "Ljava/io/File;", "retrograde-app-shared_release"})
public final class CacheCleaner {
    private static final long MIN_CACHE_LIMIT = 0L;
    private static final long MAX_CACHE_LIMIT = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.lemuroid.lib.storage.cache.CacheCleaner INSTANCE = null;
    
    private CacheCleaner() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Long> getSupportedCacheLimits() {
        return null;
    }
    
    public final long getDefaultCacheLimit() {
        return 0L;
    }
    
    private final long getClosestCacheLimit(long size) {
        return 0L;
    }
    
    private final long getInternalMemorySize() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object cleanAll(@org.jetbrains.annotations.NotNull()
    android.content.Context appContext, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object clean(@org.jetbrains.annotations.NotNull()
    android.content.Context appContext, long requestedLimit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.String printSize(android.content.Context appContext, long size) {
        return null;
    }
    
    private final long retrieveLastAccess(java.io.File file) {
        return 0L;
    }
}