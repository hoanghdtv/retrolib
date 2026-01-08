package com.swordfish.lemuroid.lib.library;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J*\u0010\n\u001a\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004J*\u0010\u0012\u001a\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J*\u0010\u0013\u001a\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J*\u0010\u0014\u001a\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u00a8\u0006\u0015"}, d2 = {"Lcom/swordfish/lemuroid/lib/library/StorageFilesMerger;", "", "()V", "extractBinFiles", "", "", "storageProvider", "Lcom/swordfish/lemuroid/lib/storage/StorageProvider;", "uri", "Landroid/net/Uri;", "mergeBinCueFiles", "", "allFiles", "", "Lcom/swordfish/lemuroid/lib/storage/BaseStorageFile;", "mergeDataFiles", "Lcom/swordfish/lemuroid/lib/storage/GroupedStorageFiles;", "files", "mergeM3UPlaylists", "removeInvalidBinCuePairs", "removeInvalidM3UPlaylists", "retrograde-app-shared_release"})
public final class StorageFilesMerger {
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.lemuroid.lib.library.StorageFilesMerger INSTANCE = null;
    
    private StorageFilesMerger() {
        super();
    }
    
    /**
     * Merge files which belong to the same game. This includes bin/cue files and m3u playlists.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.swordfish.lemuroid.lib.storage.GroupedStorageFiles> mergeDataFiles(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.storage.StorageProvider storageProvider, @org.jetbrains.annotations.NotNull()
    java.util.List<com.swordfish.lemuroid.lib.storage.BaseStorageFile> files) {
        return null;
    }
    
    private final void removeInvalidM3UPlaylists(java.util.Map<com.swordfish.lemuroid.lib.storage.BaseStorageFile, java.util.List<com.swordfish.lemuroid.lib.storage.BaseStorageFile>> allFiles, com.swordfish.lemuroid.lib.storage.StorageProvider storageProvider) {
    }
    
    private final void mergeM3UPlaylists(java.util.Map<com.swordfish.lemuroid.lib.storage.BaseStorageFile, java.util.List<com.swordfish.lemuroid.lib.storage.BaseStorageFile>> allFiles, com.swordfish.lemuroid.lib.storage.StorageProvider storageProvider) {
    }
    
    private final void removeInvalidBinCuePairs(java.util.Map<com.swordfish.lemuroid.lib.storage.BaseStorageFile, java.util.List<com.swordfish.lemuroid.lib.storage.BaseStorageFile>> allFiles, com.swordfish.lemuroid.lib.storage.StorageProvider storageProvider) {
    }
    
    private final void mergeBinCueFiles(java.util.Map<com.swordfish.lemuroid.lib.storage.BaseStorageFile, java.util.List<com.swordfish.lemuroid.lib.storage.BaseStorageFile>> allFiles, com.swordfish.lemuroid.lib.storage.StorageProvider storageProvider) {
    }
    
    private final java.util.List<java.lang.String> extractBinFiles(com.swordfish.lemuroid.lib.storage.StorageProvider storageProvider, android.net.Uri uri) {
        return null;
    }
}