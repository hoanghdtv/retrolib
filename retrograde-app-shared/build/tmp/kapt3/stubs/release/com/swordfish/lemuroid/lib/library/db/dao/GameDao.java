package com.swordfish.lemuroid.lib.library.db.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0013\u001a\u00020\fH\'J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\'J\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H\'J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0015H\'J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u001c\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H\u00a7@\u00a2\u0006\u0002\u0010 J\u0014\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00030\u001bH\'J\u0016\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0002\u0010%J\u0016\u0010#\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006&"}, d2 = {"Lcom/swordfish/lemuroid/lib/library/db/dao/GameDao;", "", "asyncSelectFirstRecents", "", "Lcom/swordfish/lemuroid/lib/library/db/entity/Game;", "limit", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "", "games", "insert", "", "selectByFileUri", "fileUri", "", "selectById", "id", "selectByLastIndexedAtLessThan", "lastIndexedAt", "selectBySystem", "Landroidx/paging/PagingSource;", "systemId", "selectBySystems", "systemIds", "selectFavorites", "selectFirstFavorites", "Lkotlinx/coroutines/flow/Flow;", "selectFirstFavoritesRecents", "selectFirstNotPlayed", "selectFirstUnfavoriteRecents", "selectSystems", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectSystemsWithCount", "Lcom/swordfish/lemuroid/lib/library/db/dao/SystemCount;", "update", "game", "(Lcom/swordfish/lemuroid/lib/library/db/entity/Game;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrograde-app-shared_release"})
@androidx.room.Dao()
public abstract interface GameDao {
    
    @androidx.room.Query(value = "SELECT * FROM games WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object selectById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.swordfish.lemuroid.lib.library.db.entity.Game> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM games WHERE fileUri = :fileUri")
    @org.jetbrains.annotations.Nullable()
    public abstract com.swordfish.lemuroid.lib.library.db.entity.Game selectByFileUri(@org.jetbrains.annotations.NotNull()
    java.lang.String fileUri);
    
    @androidx.room.Query(value = "SELECT * FROM games WHERE lastIndexedAt < :lastIndexedAt")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.swordfish.lemuroid.lib.library.db.entity.Game> selectByLastIndexedAtLessThan(long lastIndexedAt);
    
    @androidx.room.Query(value = "SELECT * FROM games WHERE isFavorite = 1 ORDER BY title ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.paging.PagingSource<java.lang.Integer, com.swordfish.lemuroid.lib.library.db.entity.Game> selectFavorites();
    
    @androidx.room.Query(value = "\n        SELECT * FROM games WHERE lastPlayedAt IS NOT NULL AND isFavorite = 0 ORDER BY lastPlayedAt DESC LIMIT :limit\n        ")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.swordfish.lemuroid.lib.library.db.entity.Game>> selectFirstUnfavoriteRecents(int limit);
    
    @androidx.room.Query(value = "SELECT * FROM games WHERE isFavorite = 1 ORDER BY lastPlayedAt DESC LIMIT :limit")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.swordfish.lemuroid.lib.library.db.entity.Game>> selectFirstFavoritesRecents(int limit);
    
    @androidx.room.Query(value = "SELECT * FROM games WHERE lastPlayedAt IS NOT NULL ORDER BY lastPlayedAt DESC LIMIT :limit")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object asyncSelectFirstRecents(int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.swordfish.lemuroid.lib.library.db.entity.Game>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM games WHERE isFavorite = 1 ORDER BY lastPlayedAt DESC LIMIT :limit")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.swordfish.lemuroid.lib.library.db.entity.Game>> selectFirstFavorites(int limit);
    
    @androidx.room.Query(value = "SELECT * FROM games WHERE lastPlayedAt IS NULL LIMIT :limit")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.swordfish.lemuroid.lib.library.db.entity.Game>> selectFirstNotPlayed(int limit);
    
    @androidx.room.Query(value = "SELECT * FROM games WHERE systemId = :systemId ORDER BY title ASC, id DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.paging.PagingSource<java.lang.Integer, com.swordfish.lemuroid.lib.library.db.entity.Game> selectBySystem(@org.jetbrains.annotations.NotNull()
    java.lang.String systemId);
    
    @androidx.room.Query(value = "SELECT * FROM games WHERE systemId IN (:systemIds) ORDER BY title ASC, id DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.paging.PagingSource<java.lang.Integer, com.swordfish.lemuroid.lib.library.db.entity.Game> selectBySystems(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> systemIds);
    
    @androidx.room.Query(value = "SELECT DISTINCT systemId FROM games ORDER BY systemId ASC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object selectSystems(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> $completion);
    
    @androidx.room.Query(value = "SELECT count(*) count, systemId systemId FROM games GROUP BY systemId")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.swordfish.lemuroid.lib.library.db.dao.SystemCount>> selectSystemsWithCount();
    
    @androidx.room.Insert()
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.Long> insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.swordfish.lemuroid.lib.library.db.entity.Game> games);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.util.List<com.swordfish.lemuroid.lib.library.db.entity.Game> games);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.entity.Game game, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    java.util.List<com.swordfish.lemuroid.lib.library.db.entity.Game> games);
}