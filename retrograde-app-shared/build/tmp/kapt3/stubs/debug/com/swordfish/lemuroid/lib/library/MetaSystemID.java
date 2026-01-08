package com.swordfish.lemuroid.lib.library;

/**
 * Meta systems represents a collection of systems which appear the same to the user. It's currently
 * only for Arcade (without separating FBNeo, MAME2000 or MAME2003).
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0086\u0081\u0002\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001$B%\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u0003R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#\u00a8\u0006%"}, d2 = {"Lcom/swordfish/lemuroid/lib/library/MetaSystemID;", "", "titleResId", "", "imageResId", "systemIDs", "", "Lcom/swordfish/lemuroid/lib/library/SystemID;", "(Ljava/lang/String;IIILjava/util/List;)V", "getImageResId", "()I", "getSystemIDs", "()Ljava/util/List;", "getTitleResId", "color", "NES", "SNES", "GENESIS", "GB", "GBC", "GBA", "N64", "SMS", "PSP", "NDS", "GG", "ATARI2600", "PSX", "ARCADE", "ATARI7800", "LYNX", "PC_ENGINE", "NGP", "WS", "DOS", "NINTENDO_3DS", "Companion", "retrograde-app-shared_debug"})
public enum MetaSystemID {
    /*public static final*/ NES /* = new NES(0, 0, null) */,
    /*public static final*/ SNES /* = new SNES(0, 0, null) */,
    /*public static final*/ GENESIS /* = new GENESIS(0, 0, null) */,
    /*public static final*/ GB /* = new GB(0, 0, null) */,
    /*public static final*/ GBC /* = new GBC(0, 0, null) */,
    /*public static final*/ GBA /* = new GBA(0, 0, null) */,
    /*public static final*/ N64 /* = new N64(0, 0, null) */,
    /*public static final*/ SMS /* = new SMS(0, 0, null) */,
    /*public static final*/ PSP /* = new PSP(0, 0, null) */,
    /*public static final*/ NDS /* = new NDS(0, 0, null) */,
    /*public static final*/ GG /* = new GG(0, 0, null) */,
    /*public static final*/ ATARI2600 /* = new ATARI2600(0, 0, null) */,
    /*public static final*/ PSX /* = new PSX(0, 0, null) */,
    /*public static final*/ ARCADE /* = new ARCADE(0, 0, null) */,
    /*public static final*/ ATARI7800 /* = new ATARI7800(0, 0, null) */,
    /*public static final*/ LYNX /* = new LYNX(0, 0, null) */,
    /*public static final*/ PC_ENGINE /* = new PC_ENGINE(0, 0, null) */,
    /*public static final*/ NGP /* = new NGP(0, 0, null) */,
    /*public static final*/ WS /* = new WS(0, 0, null) */,
    /*public static final*/ DOS /* = new DOS(0, 0, null) */,
    /*public static final*/ NINTENDO_3DS /* = new NINTENDO_3DS(0, 0, null) */;
    private final int titleResId = 0;
    private final int imageResId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.swordfish.lemuroid.lib.library.SystemID> systemIDs = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.lemuroid.lib.library.MetaSystemID.Companion Companion = null;
    
    MetaSystemID(int titleResId, int imageResId, java.util.List<? extends com.swordfish.lemuroid.lib.library.SystemID> systemIDs) {
    }
    
    public final int getTitleResId() {
        return 0;
    }
    
    public final int getImageResId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.swordfish.lemuroid.lib.library.SystemID> getSystemIDs() {
        return null;
    }
    
    public final int color() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<com.swordfish.lemuroid.lib.library.MetaSystemID> getEntries() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/swordfish/lemuroid/lib/library/MetaSystemID$Companion;", "", "()V", "fromSystemID", "Lcom/swordfish/lemuroid/lib/library/MetaSystemID;", "systemID", "Lcom/swordfish/lemuroid/lib/library/SystemID;", "retrograde-app-shared_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.swordfish.lemuroid.lib.library.MetaSystemID fromSystemID(@org.jetbrains.annotations.NotNull()
        com.swordfish.lemuroid.lib.library.SystemID systemID) {
            return null;
        }
    }
}