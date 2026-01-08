package com.swordfish.lemuroid.lib.library.db.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/swordfish/lemuroid/lib/library/db/dao/GameSearchDao;", "", "internalDao", "Lcom/swordfish/lemuroid/lib/library/db/dao/GameSearchDao$Internal;", "(Lcom/swordfish/lemuroid/lib/library/db/dao/GameSearchDao$Internal;)V", "search", "Landroidx/paging/PagingSource;", "", "Lcom/swordfish/lemuroid/lib/library/db/entity/Game;", "query", "", "CALLBACK", "Internal", "MIGRATION", "retrograde-app-shared_release"})
public final class GameSearchDao {
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.lemuroid.lib.library.db.dao.GameSearchDao.Internal internalDao = null;
    
    public GameSearchDao(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.dao.GameSearchDao.Internal internalDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.paging.PagingSource<java.lang.Integer, com.swordfish.lemuroid.lib.library.db.entity.Game> search(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/swordfish/lemuroid/lib/library/db/dao/GameSearchDao$CALLBACK;", "Landroidx/room/RoomDatabase$Callback;", "()V", "onCreate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "retrograde-app-shared_release"})
    public static final class CALLBACK extends androidx.room.RoomDatabase.Callback {
        @org.jetbrains.annotations.NotNull()
        public static final com.swordfish.lemuroid.lib.library.db.dao.GameSearchDao.CALLBACK INSTANCE = null;
        
        private CALLBACK() {
            super();
        }
        
        @java.lang.Override()
        public void onCreate(@org.jetbrains.annotations.NotNull()
        androidx.sqlite.db.SupportSQLiteDatabase db) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\b"}, d2 = {"Lcom/swordfish/lemuroid/lib/library/db/dao/GameSearchDao$Internal;", "", "rawSearch", "Landroidx/paging/PagingSource;", "", "Lcom/swordfish/lemuroid/lib/library/db/entity/Game;", "query", "Landroidx/sqlite/db/SupportSQLiteQuery;", "retrograde-app-shared_release"})
    @androidx.room.Dao()
    public static abstract interface Internal {
        
        @androidx.room.RawQuery(observedEntities = {com.swordfish.lemuroid.lib.library.db.entity.Game.class})
        @org.jetbrains.annotations.NotNull()
        public abstract androidx.paging.PagingSource<java.lang.Integer, com.swordfish.lemuroid.lib.library.db.entity.Game> rawSearch(@org.jetbrains.annotations.NotNull()
        androidx.sqlite.db.SupportSQLiteQuery query);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/swordfish/lemuroid/lib/library/db/dao/GameSearchDao$MIGRATION;", "Landroidx/room/migration/Migration;", "()V", "migrate", "", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "retrograde-app-shared_release"})
    public static final class MIGRATION extends androidx.room.migration.Migration {
        @org.jetbrains.annotations.NotNull()
        public static final com.swordfish.lemuroid.lib.library.db.dao.GameSearchDao.MIGRATION INSTANCE = null;
        
        private MIGRATION() {
            super(0, 0);
        }
        
        @java.lang.Override()
        public void migrate(@org.jetbrains.annotations.NotNull()
        androidx.sqlite.db.SupportSQLiteDatabase database) {
        }
    }
}