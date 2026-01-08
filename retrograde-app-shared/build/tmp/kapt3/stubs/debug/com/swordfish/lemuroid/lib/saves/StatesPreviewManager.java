package com.swordfish.lemuroid.lib.saves;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J0\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J.\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/swordfish/lemuroid/lib/saves/StatesPreviewManager;", "", "directoriesManager", "Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;", "(Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;)V", "getPreviewFile", "Ljava/io/File;", "fileName", "", "coreName", "getPreviewForSlot", "Landroid/graphics/Bitmap;", "game", "Lcom/swordfish/lemuroid/lib/library/db/entity/Game;", "coreID", "Lcom/swordfish/lemuroid/lib/library/CoreID;", "index", "", "size", "(Lcom/swordfish/lemuroid/lib/library/db/entity/Game;Lcom/swordfish/lemuroid/lib/library/CoreID;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSlotScreenshotName", "setPreviewForSlot", "", "bitmap", "(Lcom/swordfish/lemuroid/lib/library/db/entity/Game;Landroid/graphics/Bitmap;Lcom/swordfish/lemuroid/lib/library/CoreID;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "retrograde-app-shared_debug"})
public final class StatesPreviewManager {
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager = null;
    private static final float PREVIEW_SIZE_DP = 96.0F;
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.lemuroid.lib.saves.StatesPreviewManager.Companion Companion = null;
    
    public StatesPreviewManager(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPreviewForSlot(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.entity.Game game, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.CoreID coreID, int index, int size, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super android.graphics.Bitmap> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setPreviewForSlot(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.entity.Game game, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.CoreID coreID, int index, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    private final java.io.File getPreviewFile(java.lang.String fileName, java.lang.String coreName) {
        return null;
    }
    
    private final java.lang.String getSlotScreenshotName(com.swordfish.lemuroid.lib.library.db.entity.Game game, int index) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/swordfish/lemuroid/lib/saves/StatesPreviewManager$Companion;", "", "()V", "PREVIEW_SIZE_DP", "", "getPREVIEW_SIZE_DP", "()F", "retrograde-app-shared_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final float getPREVIEW_SIZE_DP() {
            return 0.0F;
        }
    }
}