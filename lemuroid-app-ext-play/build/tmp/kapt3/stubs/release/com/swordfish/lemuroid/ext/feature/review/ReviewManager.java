package com.swordfish.lemuroid.ext.feature.review;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0002\u0010\u0011R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/swordfish/lemuroid/ext/feature/review/ReviewManager;", "", "()V", "reviewInfo", "Lcom/google/android/play/core/review/ReviewInfo;", "reviewManager", "Lcom/google/android/play/core/review/ReviewManager;", "initialize", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchReviewFlow", "activity", "Landroid/app/Activity;", "sessionTimeMillis", "", "(Landroid/app/Activity;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lemuroid-app-ext-play_release"})
public final class ReviewManager {
    @org.jetbrains.annotations.Nullable()
    private com.google.android.play.core.review.ReviewManager reviewManager;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.play.core.review.ReviewInfo reviewInfo;
    private static final long MIN_GAME_SESSION_LENGTH = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.lemuroid.ext.feature.review.ReviewManager.Companion Companion = null;
    
    public ReviewManager() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object initialize(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object launchReviewFlow(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, long sessionTimeMillis, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/swordfish/lemuroid/ext/feature/review/ReviewManager$Companion;", "", "()V", "MIN_GAME_SESSION_LENGTH", "", "lemuroid-app-ext-play_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}