package com.swordfish.lemuroid.lib.storage.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000bH\u0002J\u0016\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/swordfish/lemuroid/lib/storage/local/DocumentFileParser;", "", "()V", "MAX_CHECKED_ENTRIES", "", "MAX_SIZE_CRC32", "SINGLE_ARCHIVE_THRESHOLD", "", "findGameEntry", "Ljava/util/zip/ZipEntry;", "openedInputStream", "Ljava/util/zip/ZipInputStream;", "fileSize", "", "isGameEntry", "", "entry", "parseCompressedGame", "Lcom/swordfish/lemuroid/lib/storage/StorageFile;", "baseStorageFile", "Lcom/swordfish/lemuroid/lib/storage/BaseStorageFile;", "zipInputStream", "parseDocumentFile", "context", "Landroid/content/Context;", "parseStandardFile", "parseZipFile", "retrograde-app-shared_debug"})
public final class DocumentFileParser {
    private static final int MAX_CHECKED_ENTRIES = 3;
    private static final double SINGLE_ARCHIVE_THRESHOLD = 0.9;
    private static final int MAX_SIZE_CRC32 = 1000000000;
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.lemuroid.lib.storage.local.DocumentFileParser INSTANCE = null;
    
    private DocumentFileParser() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.swordfish.lemuroid.lib.storage.StorageFile parseDocumentFile(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.storage.BaseStorageFile baseStorageFile) {
        return null;
    }
    
    private final com.swordfish.lemuroid.lib.storage.StorageFile parseZipFile(android.content.Context context, com.swordfish.lemuroid.lib.storage.BaseStorageFile baseStorageFile) {
        return null;
    }
    
    private final com.swordfish.lemuroid.lib.storage.StorageFile parseCompressedGame(com.swordfish.lemuroid.lib.storage.BaseStorageFile baseStorageFile, java.util.zip.ZipEntry entry, java.util.zip.ZipInputStream zipInputStream) {
        return null;
    }
    
    private final com.swordfish.lemuroid.lib.storage.StorageFile parseStandardFile(android.content.Context context, com.swordfish.lemuroid.lib.storage.BaseStorageFile baseStorageFile) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.zip.ZipEntry findGameEntry(@org.jetbrains.annotations.NotNull()
    java.util.zip.ZipInputStream openedInputStream, long fileSize) {
        return null;
    }
    
    private final boolean isGameEntry(java.util.zip.ZipEntry entry, long fileSize) {
        return false;
    }
}