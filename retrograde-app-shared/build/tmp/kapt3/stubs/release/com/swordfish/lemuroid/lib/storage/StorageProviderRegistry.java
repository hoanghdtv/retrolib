package com.swordfish.lemuroid.lib.storage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/swordfish/lemuroid/lib/storage/StorageProviderRegistry;", "", "context", "Landroid/content/Context;", "providers", "", "Lcom/swordfish/lemuroid/lib/storage/StorageProvider;", "(Landroid/content/Context;Ljava/util/Set;)V", "enabledProviders", "", "getEnabledProviders", "()Ljava/lang/Iterable;", "prefs", "Landroid/content/SharedPreferences;", "getProviders", "()Ljava/util/Set;", "providersByScheme", "", "", "getProvider", "game", "Lcom/swordfish/lemuroid/lib/library/db/entity/Game;", "Companion", "retrograde-app-shared_release"})
public final class StorageProviderRegistry {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<com.swordfish.lemuroid.lib.storage.StorageProvider> providers = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREF_NAME = "storage_providers";
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, com.swordfish.lemuroid.lib.storage.StorageProvider> providersByScheme = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences prefs = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.lemuroid.lib.storage.StorageProviderRegistry.Companion Companion = null;
    
    public StorageProviderRegistry(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.swordfish.lemuroid.lib.storage.StorageProvider> providers) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<com.swordfish.lemuroid.lib.storage.StorageProvider> getProviders() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Iterable<com.swordfish.lemuroid.lib.storage.StorageProvider> getEnabledProviders() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.swordfish.lemuroid.lib.storage.StorageProvider getProvider(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.entity.Game game) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/swordfish/lemuroid/lib/storage/StorageProviderRegistry$Companion;", "", "()V", "PREF_NAME", "", "retrograde-app-shared_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}