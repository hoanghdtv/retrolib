package com.swordfish.lemuroid.lib.library.db;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.swordfish.lemuroid.lib.library.db.dao.DataFileDao;
import com.swordfish.lemuroid.lib.library.db.dao.DataFileDao_Impl;
import com.swordfish.lemuroid.lib.library.db.dao.GameDao;
import com.swordfish.lemuroid.lib.library.db.dao.GameDao_Impl;
import com.swordfish.lemuroid.lib.library.db.dao.GameSearchDao;
import com.swordfish.lemuroid.lib.library.db.dao.GameSearchDao_Internal_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class RetrogradeDatabase_Impl extends RetrogradeDatabase {
  private volatile GameDao _gameDao;

  private volatile DataFileDao _dataFileDao;

  private volatile GameSearchDao.Internal _gameSearchDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(9) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `games` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `fileName` TEXT NOT NULL, `fileUri` TEXT NOT NULL, `title` TEXT NOT NULL, `systemId` TEXT NOT NULL, `developer` TEXT, `coverFrontUrl` TEXT, `lastIndexedAt` INTEGER NOT NULL, `lastPlayedAt` INTEGER, `isFavorite` INTEGER NOT NULL)");
        db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_games_id` ON `games` (`id`)");
        db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_games_fileUri` ON `games` (`fileUri`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_games_title` ON `games` (`title`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_games_systemId` ON `games` (`systemId`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_games_lastIndexedAt` ON `games` (`lastIndexedAt`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_games_lastPlayedAt` ON `games` (`lastPlayedAt`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_games_isFavorite` ON `games` (`isFavorite`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `datafiles` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `gameId` INTEGER NOT NULL, `fileName` TEXT NOT NULL, `fileUri` TEXT NOT NULL, `lastIndexedAt` INTEGER NOT NULL, `path` TEXT, FOREIGN KEY(`gameId`) REFERENCES `games`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_datafiles_id` ON `datafiles` (`id`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_datafiles_fileUri` ON `datafiles` (`fileUri`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_datafiles_gameId` ON `datafiles` (`gameId`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_datafiles_lastIndexedAt` ON `datafiles` (`lastIndexedAt`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'adc077d04b235bef6587c8b439086570')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `games`");
        db.execSQL("DROP TABLE IF EXISTS `datafiles`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsGames = new HashMap<String, TableInfo.Column>(10);
        _columnsGames.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("fileName", new TableInfo.Column("fileName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("fileUri", new TableInfo.Column("fileUri", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("systemId", new TableInfo.Column("systemId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("developer", new TableInfo.Column("developer", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("coverFrontUrl", new TableInfo.Column("coverFrontUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("lastIndexedAt", new TableInfo.Column("lastIndexedAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("lastPlayedAt", new TableInfo.Column("lastPlayedAt", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("isFavorite", new TableInfo.Column("isFavorite", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGames = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGames = new HashSet<TableInfo.Index>(7);
        _indicesGames.add(new TableInfo.Index("index_games_id", true, Arrays.asList("id"), Arrays.asList("ASC")));
        _indicesGames.add(new TableInfo.Index("index_games_fileUri", true, Arrays.asList("fileUri"), Arrays.asList("ASC")));
        _indicesGames.add(new TableInfo.Index("index_games_title", false, Arrays.asList("title"), Arrays.asList("ASC")));
        _indicesGames.add(new TableInfo.Index("index_games_systemId", false, Arrays.asList("systemId"), Arrays.asList("ASC")));
        _indicesGames.add(new TableInfo.Index("index_games_lastIndexedAt", false, Arrays.asList("lastIndexedAt"), Arrays.asList("ASC")));
        _indicesGames.add(new TableInfo.Index("index_games_lastPlayedAt", false, Arrays.asList("lastPlayedAt"), Arrays.asList("ASC")));
        _indicesGames.add(new TableInfo.Index("index_games_isFavorite", false, Arrays.asList("isFavorite"), Arrays.asList("ASC")));
        final TableInfo _infoGames = new TableInfo("games", _columnsGames, _foreignKeysGames, _indicesGames);
        final TableInfo _existingGames = TableInfo.read(db, "games");
        if (!_infoGames.equals(_existingGames)) {
          return new RoomOpenHelper.ValidationResult(false, "games(com.swordfish.lemuroid.lib.library.db.entity.Game).\n"
                  + " Expected:\n" + _infoGames + "\n"
                  + " Found:\n" + _existingGames);
        }
        final HashMap<String, TableInfo.Column> _columnsDatafiles = new HashMap<String, TableInfo.Column>(6);
        _columnsDatafiles.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDatafiles.put("gameId", new TableInfo.Column("gameId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDatafiles.put("fileName", new TableInfo.Column("fileName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDatafiles.put("fileUri", new TableInfo.Column("fileUri", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDatafiles.put("lastIndexedAt", new TableInfo.Column("lastIndexedAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDatafiles.put("path", new TableInfo.Column("path", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDatafiles = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysDatafiles.add(new TableInfo.ForeignKey("games", "CASCADE", "NO ACTION", Arrays.asList("gameId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesDatafiles = new HashSet<TableInfo.Index>(4);
        _indicesDatafiles.add(new TableInfo.Index("index_datafiles_id", true, Arrays.asList("id"), Arrays.asList("ASC")));
        _indicesDatafiles.add(new TableInfo.Index("index_datafiles_fileUri", false, Arrays.asList("fileUri"), Arrays.asList("ASC")));
        _indicesDatafiles.add(new TableInfo.Index("index_datafiles_gameId", false, Arrays.asList("gameId"), Arrays.asList("ASC")));
        _indicesDatafiles.add(new TableInfo.Index("index_datafiles_lastIndexedAt", false, Arrays.asList("lastIndexedAt"), Arrays.asList("ASC")));
        final TableInfo _infoDatafiles = new TableInfo("datafiles", _columnsDatafiles, _foreignKeysDatafiles, _indicesDatafiles);
        final TableInfo _existingDatafiles = TableInfo.read(db, "datafiles");
        if (!_infoDatafiles.equals(_existingDatafiles)) {
          return new RoomOpenHelper.ValidationResult(false, "datafiles(com.swordfish.lemuroid.lib.library.db.entity.DataFile).\n"
                  + " Expected:\n" + _infoDatafiles + "\n"
                  + " Found:\n" + _existingDatafiles);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "adc077d04b235bef6587c8b439086570", "2b53e3ec4b791f072dcfe7e777ea63b3");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "games","datafiles");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    final boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `games`");
      _db.execSQL("DELETE FROM `datafiles`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(GameDao.class, GameDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(DataFileDao.class, DataFileDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(GameSearchDao.Internal.class, GameSearchDao_Internal_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public GameDao gameDao() {
    if (_gameDao != null) {
      return _gameDao;
    } else {
      synchronized(this) {
        if(_gameDao == null) {
          _gameDao = new GameDao_Impl(this);
        }
        return _gameDao;
      }
    }
  }

  @Override
  public DataFileDao dataFileDao() {
    if (_dataFileDao != null) {
      return _dataFileDao;
    } else {
      synchronized(this) {
        if(_dataFileDao == null) {
          _dataFileDao = new DataFileDao_Impl(this);
        }
        return _dataFileDao;
      }
    }
  }

  @Override
  protected GameSearchDao.Internal gameSearchDaoInternal() {
    if (_gameSearchDao != null) {
      return _gameSearchDao;
    } else {
      synchronized(this) {
        if(_gameSearchDao == null) {
          _gameSearchDao = new GameSearchDao_Internal_Impl(this);
        }
        return _gameSearchDao;
      }
    }
  }
}
