package com.swordfish.lemuroid.metadata.libretrodb.db;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/swordfish/lemuroid/metadata/libretrodb/db/LibretroDBManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dbInstance", "Lcom/swordfish/lemuroid/metadata/libretrodb/db/LibretroDatabase;", "getDbInstance", "()Lcom/swordfish/lemuroid/metadata/libretrodb/db/LibretroDatabase;", "dbInstance$delegate", "Lkotlin/Lazy;", "Companion", "lemuroid-metadata-libretro-db_release"})
public final class LibretroDBManager {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DB_NAME = "libretro-db";
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dbInstance$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.lemuroid.metadata.libretrodb.db.LibretroDBManager.Companion Companion = null;
    
    public LibretroDBManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.swordfish.lemuroid.metadata.libretrodb.db.LibretroDatabase getDbInstance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/swordfish/lemuroid/metadata/libretrodb/db/LibretroDBManager$Companion;", "", "()V", "DB_NAME", "", "lemuroid-metadata-libretro-db_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}