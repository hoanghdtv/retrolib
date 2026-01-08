package com.swordfish.lemuroid.lib.library.db;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\nH$\u00a8\u0006\f"}, d2 = {"Lcom/swordfish/lemuroid/lib/library/db/RetrogradeDatabase;", "Landroidx/room/RoomDatabase;", "()V", "dataFileDao", "Lcom/swordfish/lemuroid/lib/library/db/dao/DataFileDao;", "gameDao", "Lcom/swordfish/lemuroid/lib/library/db/dao/GameDao;", "gameSearchDao", "Lcom/swordfish/lemuroid/lib/library/db/dao/GameSearchDao;", "gameSearchDaoInternal", "Lcom/swordfish/lemuroid/lib/library/db/dao/GameSearchDao$Internal;", "Companion", "retrograde-app-shared_debug"})
@androidx.room.Database(entities = {com.swordfish.lemuroid.lib.library.db.entity.Game.class, com.swordfish.lemuroid.lib.library.db.entity.DataFile.class}, version = 9, exportSchema = true)
public abstract class RetrogradeDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DB_NAME = "retrograde";
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.lemuroid.lib.library.db.RetrogradeDatabase.Companion Companion = null;
    
    public RetrogradeDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.swordfish.lemuroid.lib.library.db.dao.GameDao gameDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.swordfish.lemuroid.lib.library.db.dao.DataFileDao dataFileDao();
    
    @org.jetbrains.annotations.NotNull()
    public final com.swordfish.lemuroid.lib.library.db.dao.GameSearchDao gameSearchDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract com.swordfish.lemuroid.lib.library.db.dao.GameSearchDao.Internal gameSearchDaoInternal();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/swordfish/lemuroid/lib/library/db/RetrogradeDatabase$Companion;", "", "()V", "DB_NAME", "", "retrograde-app-shared_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}