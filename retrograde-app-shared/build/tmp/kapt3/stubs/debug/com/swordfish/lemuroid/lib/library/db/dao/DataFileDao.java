package com.swordfish.lemuroid.lib.library.db.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\'J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\u000bH\'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/swordfish/lemuroid/lib/library/db/dao/DataFileDao;", "", "delete", "", "dataFiles", "", "Lcom/swordfish/lemuroid/lib/library/db/entity/DataFile;", "insert", "dataFile", "selectByLastIndexedAtLessThan", "lastIndexedAt", "", "selectDataFilesForGame", "gameId", "", "retrograde-app-shared_debug"})
@androidx.room.Dao()
public abstract interface DataFileDao {
    
    @androidx.room.Query(value = "SELECT * FROM datafiles where gameId = :gameId")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.swordfish.lemuroid.lib.library.db.entity.DataFile> selectDataFilesForGame(int gameId);
    
    @androidx.room.Query(value = "SELECT * FROM datafiles WHERE lastIndexedAt < :lastIndexedAt")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.swordfish.lemuroid.lib.library.db.entity.DataFile> selectByLastIndexedAtLessThan(long lastIndexedAt);
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.entity.DataFile dataFile);
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.swordfish.lemuroid.lib.library.db.entity.DataFile> dataFiles);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.util.List<com.swordfish.lemuroid.lib.library.db.entity.DataFile> dataFiles);
}