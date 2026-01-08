package com.swordfish.lemuroid.lib.core;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\nJ$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00a6@\u00a2\u0006\u0002\u0010\t\u00a8\u0006\u000b"}, d2 = {"Lcom/swordfish/lemuroid/lib/core/CoreUpdater;", "", "downloadCores", "", "context", "Landroid/content/Context;", "coreIDs", "", "Lcom/swordfish/lemuroid/lib/library/CoreID;", "(Landroid/content/Context;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CoreManagerApi", "retrograde-app-shared_debug"})
public abstract interface CoreUpdater {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object downloadCores(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.swordfish.lemuroid.lib.library.CoreID> coreIDs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lcom/swordfish/lemuroid/lib/core/CoreUpdater$CoreManagerApi;", "", "downloadFile", "Lretrofit2/Response;", "Ljava/io/InputStream;", "url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadZip", "Ljava/util/zip/ZipInputStream;", "retrograde-app-shared_debug"})
    public static abstract interface CoreManagerApi {
        
        @retrofit2.http.GET()
        @retrofit2.http.Streaming()
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Object downloadFile(@retrofit2.http.Url()
        @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super retrofit2.Response<java.io.InputStream>> $completion);
        
        @retrofit2.http.GET()
        @retrofit2.http.Streaming()
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Object downloadZip(@retrofit2.http.Url()
        @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.zip.ZipInputStream>> $completion);
    }
}