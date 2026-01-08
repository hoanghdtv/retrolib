package com.swordfish.lemuroid.metadata.libretrodb.db.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/swordfish/lemuroid/metadata/libretrodb/db/dao/GameDao;", "", "findByCRC", "Lcom/swordfish/lemuroid/metadata/libretrodb/db/entity/LibretroRom;", "crc", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findByFileName", "romName", "findByName", "", "findBySerial", "serial", "lemuroid-metadata-libretro-db_debug"})
@androidx.room.Dao()
public abstract interface GameDao {
    
    @androidx.room.Query(value = "SELECT * FROM games WHERE romName LIKE :romName")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findByName(@org.jetbrains.annotations.NotNull()
    java.lang.String romName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.swordfish.lemuroid.metadata.libretrodb.db.entity.LibretroRom>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM games WHERE romName = :romName LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findByFileName(@org.jetbrains.annotations.NotNull()
    java.lang.String romName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.swordfish.lemuroid.metadata.libretrodb.db.entity.LibretroRom> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM games WHERE crc32 = :crc LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findByCRC(@org.jetbrains.annotations.NotNull()
    java.lang.String crc, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.swordfish.lemuroid.metadata.libretrodb.db.entity.LibretroRom> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM games WHERE serial = :serial LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findBySerial(@org.jetbrains.annotations.NotNull()
    java.lang.String serial, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.swordfish.lemuroid.metadata.libretrodb.db.entity.LibretroRom> $completion);
}