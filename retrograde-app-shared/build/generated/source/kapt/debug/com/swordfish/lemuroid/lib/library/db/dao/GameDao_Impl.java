package com.swordfish.lemuroid.lib.library.db.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.paging.PagingSource;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.swordfish.lemuroid.lib.library.db.entity.Game;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class GameDao_Impl implements GameDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Game> __insertionAdapterOfGame;

  private final EntityDeletionOrUpdateAdapter<Game> __deletionAdapterOfGame;

  private final EntityDeletionOrUpdateAdapter<Game> __updateAdapterOfGame;

  public GameDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGame = new EntityInsertionAdapter<Game>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `games` (`id`,`fileName`,`fileUri`,`title`,`systemId`,`developer`,`coverFrontUrl`,`lastIndexedAt`,`lastPlayedAt`,`isFavorite`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Game entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getFileName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getFileName());
        }
        if (entity.getFileUri() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getFileUri());
        }
        if (entity.getTitle() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getTitle());
        }
        if (entity.getSystemId() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getSystemId());
        }
        if (entity.getDeveloper() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getDeveloper());
        }
        if (entity.getCoverFrontUrl() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getCoverFrontUrl());
        }
        statement.bindLong(8, entity.getLastIndexedAt());
        if (entity.getLastPlayedAt() == null) {
          statement.bindNull(9);
        } else {
          statement.bindLong(9, entity.getLastPlayedAt());
        }
        final int _tmp = entity.isFavorite() ? 1 : 0;
        statement.bindLong(10, _tmp);
      }
    };
    this.__deletionAdapterOfGame = new EntityDeletionOrUpdateAdapter<Game>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `games` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Game entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfGame = new EntityDeletionOrUpdateAdapter<Game>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `games` SET `id` = ?,`fileName` = ?,`fileUri` = ?,`title` = ?,`systemId` = ?,`developer` = ?,`coverFrontUrl` = ?,`lastIndexedAt` = ?,`lastPlayedAt` = ?,`isFavorite` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Game entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getFileName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getFileName());
        }
        if (entity.getFileUri() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getFileUri());
        }
        if (entity.getTitle() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getTitle());
        }
        if (entity.getSystemId() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getSystemId());
        }
        if (entity.getDeveloper() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getDeveloper());
        }
        if (entity.getCoverFrontUrl() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getCoverFrontUrl());
        }
        statement.bindLong(8, entity.getLastIndexedAt());
        if (entity.getLastPlayedAt() == null) {
          statement.bindNull(9);
        } else {
          statement.bindLong(9, entity.getLastPlayedAt());
        }
        final int _tmp = entity.isFavorite() ? 1 : 0;
        statement.bindLong(10, _tmp);
        statement.bindLong(11, entity.getId());
      }
    };
  }

  @Override
  public List<Long> insert(final List<Game> games) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final List<Long> _result = __insertionAdapterOfGame.insertAndReturnIdsList(games);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final List<Game> games) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfGame.handleMultiple(games);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Object update(final Game game, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfGame.handle(game);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public void update(final List<Game> games) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfGame.handleMultiple(games);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Object selectById(final int id, final Continuation<? super Game> $completion) {
    final String _sql = "SELECT * FROM games WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Game>() {
      @Override
      @Nullable
      public Game call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "fileName");
          final int _cursorIndexOfFileUri = CursorUtil.getColumnIndexOrThrow(_cursor, "fileUri");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSystemId = CursorUtil.getColumnIndexOrThrow(_cursor, "systemId");
          final int _cursorIndexOfDeveloper = CursorUtil.getColumnIndexOrThrow(_cursor, "developer");
          final int _cursorIndexOfCoverFrontUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "coverFrontUrl");
          final int _cursorIndexOfLastIndexedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastIndexedAt");
          final int _cursorIndexOfLastPlayedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastPlayedAt");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final Game _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpFileName;
            if (_cursor.isNull(_cursorIndexOfFileName)) {
              _tmpFileName = null;
            } else {
              _tmpFileName = _cursor.getString(_cursorIndexOfFileName);
            }
            final String _tmpFileUri;
            if (_cursor.isNull(_cursorIndexOfFileUri)) {
              _tmpFileUri = null;
            } else {
              _tmpFileUri = _cursor.getString(_cursorIndexOfFileUri);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpSystemId;
            if (_cursor.isNull(_cursorIndexOfSystemId)) {
              _tmpSystemId = null;
            } else {
              _tmpSystemId = _cursor.getString(_cursorIndexOfSystemId);
            }
            final String _tmpDeveloper;
            if (_cursor.isNull(_cursorIndexOfDeveloper)) {
              _tmpDeveloper = null;
            } else {
              _tmpDeveloper = _cursor.getString(_cursorIndexOfDeveloper);
            }
            final String _tmpCoverFrontUrl;
            if (_cursor.isNull(_cursorIndexOfCoverFrontUrl)) {
              _tmpCoverFrontUrl = null;
            } else {
              _tmpCoverFrontUrl = _cursor.getString(_cursorIndexOfCoverFrontUrl);
            }
            final long _tmpLastIndexedAt;
            _tmpLastIndexedAt = _cursor.getLong(_cursorIndexOfLastIndexedAt);
            final Long _tmpLastPlayedAt;
            if (_cursor.isNull(_cursorIndexOfLastPlayedAt)) {
              _tmpLastPlayedAt = null;
            } else {
              _tmpLastPlayedAt = _cursor.getLong(_cursorIndexOfLastPlayedAt);
            }
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _result = new Game(_tmpId,_tmpFileName,_tmpFileUri,_tmpTitle,_tmpSystemId,_tmpDeveloper,_tmpCoverFrontUrl,_tmpLastIndexedAt,_tmpLastPlayedAt,_tmpIsFavorite);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Game selectByFileUri(final String fileUri) {
    final String _sql = "SELECT * FROM games WHERE fileUri = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (fileUri == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, fileUri);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "fileName");
      final int _cursorIndexOfFileUri = CursorUtil.getColumnIndexOrThrow(_cursor, "fileUri");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfSystemId = CursorUtil.getColumnIndexOrThrow(_cursor, "systemId");
      final int _cursorIndexOfDeveloper = CursorUtil.getColumnIndexOrThrow(_cursor, "developer");
      final int _cursorIndexOfCoverFrontUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "coverFrontUrl");
      final int _cursorIndexOfLastIndexedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastIndexedAt");
      final int _cursorIndexOfLastPlayedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastPlayedAt");
      final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
      final Game _result;
      if (_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpFileName;
        if (_cursor.isNull(_cursorIndexOfFileName)) {
          _tmpFileName = null;
        } else {
          _tmpFileName = _cursor.getString(_cursorIndexOfFileName);
        }
        final String _tmpFileUri;
        if (_cursor.isNull(_cursorIndexOfFileUri)) {
          _tmpFileUri = null;
        } else {
          _tmpFileUri = _cursor.getString(_cursorIndexOfFileUri);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpSystemId;
        if (_cursor.isNull(_cursorIndexOfSystemId)) {
          _tmpSystemId = null;
        } else {
          _tmpSystemId = _cursor.getString(_cursorIndexOfSystemId);
        }
        final String _tmpDeveloper;
        if (_cursor.isNull(_cursorIndexOfDeveloper)) {
          _tmpDeveloper = null;
        } else {
          _tmpDeveloper = _cursor.getString(_cursorIndexOfDeveloper);
        }
        final String _tmpCoverFrontUrl;
        if (_cursor.isNull(_cursorIndexOfCoverFrontUrl)) {
          _tmpCoverFrontUrl = null;
        } else {
          _tmpCoverFrontUrl = _cursor.getString(_cursorIndexOfCoverFrontUrl);
        }
        final long _tmpLastIndexedAt;
        _tmpLastIndexedAt = _cursor.getLong(_cursorIndexOfLastIndexedAt);
        final Long _tmpLastPlayedAt;
        if (_cursor.isNull(_cursorIndexOfLastPlayedAt)) {
          _tmpLastPlayedAt = null;
        } else {
          _tmpLastPlayedAt = _cursor.getLong(_cursorIndexOfLastPlayedAt);
        }
        final boolean _tmpIsFavorite;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
        _tmpIsFavorite = _tmp != 0;
        _result = new Game(_tmpId,_tmpFileName,_tmpFileUri,_tmpTitle,_tmpSystemId,_tmpDeveloper,_tmpCoverFrontUrl,_tmpLastIndexedAt,_tmpLastPlayedAt,_tmpIsFavorite);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Game> selectByLastIndexedAtLessThan(final long lastIndexedAt) {
    final String _sql = "SELECT * FROM games WHERE lastIndexedAt < ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, lastIndexedAt);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "fileName");
      final int _cursorIndexOfFileUri = CursorUtil.getColumnIndexOrThrow(_cursor, "fileUri");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfSystemId = CursorUtil.getColumnIndexOrThrow(_cursor, "systemId");
      final int _cursorIndexOfDeveloper = CursorUtil.getColumnIndexOrThrow(_cursor, "developer");
      final int _cursorIndexOfCoverFrontUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "coverFrontUrl");
      final int _cursorIndexOfLastIndexedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastIndexedAt");
      final int _cursorIndexOfLastPlayedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastPlayedAt");
      final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
      final List<Game> _result = new ArrayList<Game>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final Game _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpFileName;
        if (_cursor.isNull(_cursorIndexOfFileName)) {
          _tmpFileName = null;
        } else {
          _tmpFileName = _cursor.getString(_cursorIndexOfFileName);
        }
        final String _tmpFileUri;
        if (_cursor.isNull(_cursorIndexOfFileUri)) {
          _tmpFileUri = null;
        } else {
          _tmpFileUri = _cursor.getString(_cursorIndexOfFileUri);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpSystemId;
        if (_cursor.isNull(_cursorIndexOfSystemId)) {
          _tmpSystemId = null;
        } else {
          _tmpSystemId = _cursor.getString(_cursorIndexOfSystemId);
        }
        final String _tmpDeveloper;
        if (_cursor.isNull(_cursorIndexOfDeveloper)) {
          _tmpDeveloper = null;
        } else {
          _tmpDeveloper = _cursor.getString(_cursorIndexOfDeveloper);
        }
        final String _tmpCoverFrontUrl;
        if (_cursor.isNull(_cursorIndexOfCoverFrontUrl)) {
          _tmpCoverFrontUrl = null;
        } else {
          _tmpCoverFrontUrl = _cursor.getString(_cursorIndexOfCoverFrontUrl);
        }
        final long _tmpLastIndexedAt;
        _tmpLastIndexedAt = _cursor.getLong(_cursorIndexOfLastIndexedAt);
        final Long _tmpLastPlayedAt;
        if (_cursor.isNull(_cursorIndexOfLastPlayedAt)) {
          _tmpLastPlayedAt = null;
        } else {
          _tmpLastPlayedAt = _cursor.getLong(_cursorIndexOfLastPlayedAt);
        }
        final boolean _tmpIsFavorite;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
        _tmpIsFavorite = _tmp != 0;
        _item = new Game(_tmpId,_tmpFileName,_tmpFileUri,_tmpTitle,_tmpSystemId,_tmpDeveloper,_tmpCoverFrontUrl,_tmpLastIndexedAt,_tmpLastPlayedAt,_tmpIsFavorite);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public PagingSource<Integer, Game> selectFavorites() {
    final String _sql = "SELECT * FROM games WHERE isFavorite = 1 ORDER BY title ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new LimitOffsetPagingSource<Game>(_statement, __db, "games") {
      @Override
      @NonNull
      protected List<Game> convertRows(@NonNull final Cursor cursor) {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
        final int _cursorIndexOfFileName = CursorUtil.getColumnIndexOrThrow(cursor, "fileName");
        final int _cursorIndexOfFileUri = CursorUtil.getColumnIndexOrThrow(cursor, "fileUri");
        final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(cursor, "title");
        final int _cursorIndexOfSystemId = CursorUtil.getColumnIndexOrThrow(cursor, "systemId");
        final int _cursorIndexOfDeveloper = CursorUtil.getColumnIndexOrThrow(cursor, "developer");
        final int _cursorIndexOfCoverFrontUrl = CursorUtil.getColumnIndexOrThrow(cursor, "coverFrontUrl");
        final int _cursorIndexOfLastIndexedAt = CursorUtil.getColumnIndexOrThrow(cursor, "lastIndexedAt");
        final int _cursorIndexOfLastPlayedAt = CursorUtil.getColumnIndexOrThrow(cursor, "lastPlayedAt");
        final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(cursor, "isFavorite");
        final List<Game> _result = new ArrayList<Game>(cursor.getCount());
        while (cursor.moveToNext()) {
          final Game _item;
          final int _tmpId;
          _tmpId = cursor.getInt(_cursorIndexOfId);
          final String _tmpFileName;
          if (cursor.isNull(_cursorIndexOfFileName)) {
            _tmpFileName = null;
          } else {
            _tmpFileName = cursor.getString(_cursorIndexOfFileName);
          }
          final String _tmpFileUri;
          if (cursor.isNull(_cursorIndexOfFileUri)) {
            _tmpFileUri = null;
          } else {
            _tmpFileUri = cursor.getString(_cursorIndexOfFileUri);
          }
          final String _tmpTitle;
          if (cursor.isNull(_cursorIndexOfTitle)) {
            _tmpTitle = null;
          } else {
            _tmpTitle = cursor.getString(_cursorIndexOfTitle);
          }
          final String _tmpSystemId;
          if (cursor.isNull(_cursorIndexOfSystemId)) {
            _tmpSystemId = null;
          } else {
            _tmpSystemId = cursor.getString(_cursorIndexOfSystemId);
          }
          final String _tmpDeveloper;
          if (cursor.isNull(_cursorIndexOfDeveloper)) {
            _tmpDeveloper = null;
          } else {
            _tmpDeveloper = cursor.getString(_cursorIndexOfDeveloper);
          }
          final String _tmpCoverFrontUrl;
          if (cursor.isNull(_cursorIndexOfCoverFrontUrl)) {
            _tmpCoverFrontUrl = null;
          } else {
            _tmpCoverFrontUrl = cursor.getString(_cursorIndexOfCoverFrontUrl);
          }
          final long _tmpLastIndexedAt;
          _tmpLastIndexedAt = cursor.getLong(_cursorIndexOfLastIndexedAt);
          final Long _tmpLastPlayedAt;
          if (cursor.isNull(_cursorIndexOfLastPlayedAt)) {
            _tmpLastPlayedAt = null;
          } else {
            _tmpLastPlayedAt = cursor.getLong(_cursorIndexOfLastPlayedAt);
          }
          final boolean _tmpIsFavorite;
          final int _tmp;
          _tmp = cursor.getInt(_cursorIndexOfIsFavorite);
          _tmpIsFavorite = _tmp != 0;
          _item = new Game(_tmpId,_tmpFileName,_tmpFileUri,_tmpTitle,_tmpSystemId,_tmpDeveloper,_tmpCoverFrontUrl,_tmpLastIndexedAt,_tmpLastPlayedAt,_tmpIsFavorite);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  @Override
  public Flow<List<Game>> selectFirstUnfavoriteRecents(final int limit) {
    final String _sql = "\n"
            + "        SELECT * FROM games WHERE lastPlayedAt IS NOT NULL AND isFavorite = 0 ORDER BY lastPlayedAt DESC LIMIT ?\n"
            + "        ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, limit);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"games"}, new Callable<List<Game>>() {
      @Override
      @NonNull
      public List<Game> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "fileName");
          final int _cursorIndexOfFileUri = CursorUtil.getColumnIndexOrThrow(_cursor, "fileUri");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSystemId = CursorUtil.getColumnIndexOrThrow(_cursor, "systemId");
          final int _cursorIndexOfDeveloper = CursorUtil.getColumnIndexOrThrow(_cursor, "developer");
          final int _cursorIndexOfCoverFrontUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "coverFrontUrl");
          final int _cursorIndexOfLastIndexedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastIndexedAt");
          final int _cursorIndexOfLastPlayedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastPlayedAt");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final List<Game> _result = new ArrayList<Game>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Game _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpFileName;
            if (_cursor.isNull(_cursorIndexOfFileName)) {
              _tmpFileName = null;
            } else {
              _tmpFileName = _cursor.getString(_cursorIndexOfFileName);
            }
            final String _tmpFileUri;
            if (_cursor.isNull(_cursorIndexOfFileUri)) {
              _tmpFileUri = null;
            } else {
              _tmpFileUri = _cursor.getString(_cursorIndexOfFileUri);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpSystemId;
            if (_cursor.isNull(_cursorIndexOfSystemId)) {
              _tmpSystemId = null;
            } else {
              _tmpSystemId = _cursor.getString(_cursorIndexOfSystemId);
            }
            final String _tmpDeveloper;
            if (_cursor.isNull(_cursorIndexOfDeveloper)) {
              _tmpDeveloper = null;
            } else {
              _tmpDeveloper = _cursor.getString(_cursorIndexOfDeveloper);
            }
            final String _tmpCoverFrontUrl;
            if (_cursor.isNull(_cursorIndexOfCoverFrontUrl)) {
              _tmpCoverFrontUrl = null;
            } else {
              _tmpCoverFrontUrl = _cursor.getString(_cursorIndexOfCoverFrontUrl);
            }
            final long _tmpLastIndexedAt;
            _tmpLastIndexedAt = _cursor.getLong(_cursorIndexOfLastIndexedAt);
            final Long _tmpLastPlayedAt;
            if (_cursor.isNull(_cursorIndexOfLastPlayedAt)) {
              _tmpLastPlayedAt = null;
            } else {
              _tmpLastPlayedAt = _cursor.getLong(_cursorIndexOfLastPlayedAt);
            }
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item = new Game(_tmpId,_tmpFileName,_tmpFileUri,_tmpTitle,_tmpSystemId,_tmpDeveloper,_tmpCoverFrontUrl,_tmpLastIndexedAt,_tmpLastPlayedAt,_tmpIsFavorite);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Game>> selectFirstFavoritesRecents(final int limit) {
    final String _sql = "SELECT * FROM games WHERE isFavorite = 1 ORDER BY lastPlayedAt DESC LIMIT ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, limit);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"games"}, new Callable<List<Game>>() {
      @Override
      @NonNull
      public List<Game> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "fileName");
          final int _cursorIndexOfFileUri = CursorUtil.getColumnIndexOrThrow(_cursor, "fileUri");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSystemId = CursorUtil.getColumnIndexOrThrow(_cursor, "systemId");
          final int _cursorIndexOfDeveloper = CursorUtil.getColumnIndexOrThrow(_cursor, "developer");
          final int _cursorIndexOfCoverFrontUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "coverFrontUrl");
          final int _cursorIndexOfLastIndexedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastIndexedAt");
          final int _cursorIndexOfLastPlayedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastPlayedAt");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final List<Game> _result = new ArrayList<Game>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Game _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpFileName;
            if (_cursor.isNull(_cursorIndexOfFileName)) {
              _tmpFileName = null;
            } else {
              _tmpFileName = _cursor.getString(_cursorIndexOfFileName);
            }
            final String _tmpFileUri;
            if (_cursor.isNull(_cursorIndexOfFileUri)) {
              _tmpFileUri = null;
            } else {
              _tmpFileUri = _cursor.getString(_cursorIndexOfFileUri);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpSystemId;
            if (_cursor.isNull(_cursorIndexOfSystemId)) {
              _tmpSystemId = null;
            } else {
              _tmpSystemId = _cursor.getString(_cursorIndexOfSystemId);
            }
            final String _tmpDeveloper;
            if (_cursor.isNull(_cursorIndexOfDeveloper)) {
              _tmpDeveloper = null;
            } else {
              _tmpDeveloper = _cursor.getString(_cursorIndexOfDeveloper);
            }
            final String _tmpCoverFrontUrl;
            if (_cursor.isNull(_cursorIndexOfCoverFrontUrl)) {
              _tmpCoverFrontUrl = null;
            } else {
              _tmpCoverFrontUrl = _cursor.getString(_cursorIndexOfCoverFrontUrl);
            }
            final long _tmpLastIndexedAt;
            _tmpLastIndexedAt = _cursor.getLong(_cursorIndexOfLastIndexedAt);
            final Long _tmpLastPlayedAt;
            if (_cursor.isNull(_cursorIndexOfLastPlayedAt)) {
              _tmpLastPlayedAt = null;
            } else {
              _tmpLastPlayedAt = _cursor.getLong(_cursorIndexOfLastPlayedAt);
            }
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item = new Game(_tmpId,_tmpFileName,_tmpFileUri,_tmpTitle,_tmpSystemId,_tmpDeveloper,_tmpCoverFrontUrl,_tmpLastIndexedAt,_tmpLastPlayedAt,_tmpIsFavorite);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object asyncSelectFirstRecents(final int limit,
      final Continuation<? super List<Game>> $completion) {
    final String _sql = "SELECT * FROM games WHERE lastPlayedAt IS NOT NULL ORDER BY lastPlayedAt DESC LIMIT ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, limit);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Game>>() {
      @Override
      @NonNull
      public List<Game> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "fileName");
          final int _cursorIndexOfFileUri = CursorUtil.getColumnIndexOrThrow(_cursor, "fileUri");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSystemId = CursorUtil.getColumnIndexOrThrow(_cursor, "systemId");
          final int _cursorIndexOfDeveloper = CursorUtil.getColumnIndexOrThrow(_cursor, "developer");
          final int _cursorIndexOfCoverFrontUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "coverFrontUrl");
          final int _cursorIndexOfLastIndexedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastIndexedAt");
          final int _cursorIndexOfLastPlayedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastPlayedAt");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final List<Game> _result = new ArrayList<Game>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Game _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpFileName;
            if (_cursor.isNull(_cursorIndexOfFileName)) {
              _tmpFileName = null;
            } else {
              _tmpFileName = _cursor.getString(_cursorIndexOfFileName);
            }
            final String _tmpFileUri;
            if (_cursor.isNull(_cursorIndexOfFileUri)) {
              _tmpFileUri = null;
            } else {
              _tmpFileUri = _cursor.getString(_cursorIndexOfFileUri);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpSystemId;
            if (_cursor.isNull(_cursorIndexOfSystemId)) {
              _tmpSystemId = null;
            } else {
              _tmpSystemId = _cursor.getString(_cursorIndexOfSystemId);
            }
            final String _tmpDeveloper;
            if (_cursor.isNull(_cursorIndexOfDeveloper)) {
              _tmpDeveloper = null;
            } else {
              _tmpDeveloper = _cursor.getString(_cursorIndexOfDeveloper);
            }
            final String _tmpCoverFrontUrl;
            if (_cursor.isNull(_cursorIndexOfCoverFrontUrl)) {
              _tmpCoverFrontUrl = null;
            } else {
              _tmpCoverFrontUrl = _cursor.getString(_cursorIndexOfCoverFrontUrl);
            }
            final long _tmpLastIndexedAt;
            _tmpLastIndexedAt = _cursor.getLong(_cursorIndexOfLastIndexedAt);
            final Long _tmpLastPlayedAt;
            if (_cursor.isNull(_cursorIndexOfLastPlayedAt)) {
              _tmpLastPlayedAt = null;
            } else {
              _tmpLastPlayedAt = _cursor.getLong(_cursorIndexOfLastPlayedAt);
            }
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item = new Game(_tmpId,_tmpFileName,_tmpFileUri,_tmpTitle,_tmpSystemId,_tmpDeveloper,_tmpCoverFrontUrl,_tmpLastIndexedAt,_tmpLastPlayedAt,_tmpIsFavorite);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<Game>> selectFirstFavorites(final int limit) {
    final String _sql = "SELECT * FROM games WHERE isFavorite = 1 ORDER BY lastPlayedAt DESC LIMIT ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, limit);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"games"}, new Callable<List<Game>>() {
      @Override
      @NonNull
      public List<Game> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "fileName");
          final int _cursorIndexOfFileUri = CursorUtil.getColumnIndexOrThrow(_cursor, "fileUri");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSystemId = CursorUtil.getColumnIndexOrThrow(_cursor, "systemId");
          final int _cursorIndexOfDeveloper = CursorUtil.getColumnIndexOrThrow(_cursor, "developer");
          final int _cursorIndexOfCoverFrontUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "coverFrontUrl");
          final int _cursorIndexOfLastIndexedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastIndexedAt");
          final int _cursorIndexOfLastPlayedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastPlayedAt");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final List<Game> _result = new ArrayList<Game>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Game _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpFileName;
            if (_cursor.isNull(_cursorIndexOfFileName)) {
              _tmpFileName = null;
            } else {
              _tmpFileName = _cursor.getString(_cursorIndexOfFileName);
            }
            final String _tmpFileUri;
            if (_cursor.isNull(_cursorIndexOfFileUri)) {
              _tmpFileUri = null;
            } else {
              _tmpFileUri = _cursor.getString(_cursorIndexOfFileUri);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpSystemId;
            if (_cursor.isNull(_cursorIndexOfSystemId)) {
              _tmpSystemId = null;
            } else {
              _tmpSystemId = _cursor.getString(_cursorIndexOfSystemId);
            }
            final String _tmpDeveloper;
            if (_cursor.isNull(_cursorIndexOfDeveloper)) {
              _tmpDeveloper = null;
            } else {
              _tmpDeveloper = _cursor.getString(_cursorIndexOfDeveloper);
            }
            final String _tmpCoverFrontUrl;
            if (_cursor.isNull(_cursorIndexOfCoverFrontUrl)) {
              _tmpCoverFrontUrl = null;
            } else {
              _tmpCoverFrontUrl = _cursor.getString(_cursorIndexOfCoverFrontUrl);
            }
            final long _tmpLastIndexedAt;
            _tmpLastIndexedAt = _cursor.getLong(_cursorIndexOfLastIndexedAt);
            final Long _tmpLastPlayedAt;
            if (_cursor.isNull(_cursorIndexOfLastPlayedAt)) {
              _tmpLastPlayedAt = null;
            } else {
              _tmpLastPlayedAt = _cursor.getLong(_cursorIndexOfLastPlayedAt);
            }
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item = new Game(_tmpId,_tmpFileName,_tmpFileUri,_tmpTitle,_tmpSystemId,_tmpDeveloper,_tmpCoverFrontUrl,_tmpLastIndexedAt,_tmpLastPlayedAt,_tmpIsFavorite);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Game>> selectFirstNotPlayed(final int limit) {
    final String _sql = "SELECT * FROM games WHERE lastPlayedAt IS NULL LIMIT ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, limit);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"games"}, new Callable<List<Game>>() {
      @Override
      @NonNull
      public List<Game> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "fileName");
          final int _cursorIndexOfFileUri = CursorUtil.getColumnIndexOrThrow(_cursor, "fileUri");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSystemId = CursorUtil.getColumnIndexOrThrow(_cursor, "systemId");
          final int _cursorIndexOfDeveloper = CursorUtil.getColumnIndexOrThrow(_cursor, "developer");
          final int _cursorIndexOfCoverFrontUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "coverFrontUrl");
          final int _cursorIndexOfLastIndexedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastIndexedAt");
          final int _cursorIndexOfLastPlayedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastPlayedAt");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final List<Game> _result = new ArrayList<Game>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Game _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpFileName;
            if (_cursor.isNull(_cursorIndexOfFileName)) {
              _tmpFileName = null;
            } else {
              _tmpFileName = _cursor.getString(_cursorIndexOfFileName);
            }
            final String _tmpFileUri;
            if (_cursor.isNull(_cursorIndexOfFileUri)) {
              _tmpFileUri = null;
            } else {
              _tmpFileUri = _cursor.getString(_cursorIndexOfFileUri);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpSystemId;
            if (_cursor.isNull(_cursorIndexOfSystemId)) {
              _tmpSystemId = null;
            } else {
              _tmpSystemId = _cursor.getString(_cursorIndexOfSystemId);
            }
            final String _tmpDeveloper;
            if (_cursor.isNull(_cursorIndexOfDeveloper)) {
              _tmpDeveloper = null;
            } else {
              _tmpDeveloper = _cursor.getString(_cursorIndexOfDeveloper);
            }
            final String _tmpCoverFrontUrl;
            if (_cursor.isNull(_cursorIndexOfCoverFrontUrl)) {
              _tmpCoverFrontUrl = null;
            } else {
              _tmpCoverFrontUrl = _cursor.getString(_cursorIndexOfCoverFrontUrl);
            }
            final long _tmpLastIndexedAt;
            _tmpLastIndexedAt = _cursor.getLong(_cursorIndexOfLastIndexedAt);
            final Long _tmpLastPlayedAt;
            if (_cursor.isNull(_cursorIndexOfLastPlayedAt)) {
              _tmpLastPlayedAt = null;
            } else {
              _tmpLastPlayedAt = _cursor.getLong(_cursorIndexOfLastPlayedAt);
            }
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item = new Game(_tmpId,_tmpFileName,_tmpFileUri,_tmpTitle,_tmpSystemId,_tmpDeveloper,_tmpCoverFrontUrl,_tmpLastIndexedAt,_tmpLastPlayedAt,_tmpIsFavorite);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public PagingSource<Integer, Game> selectBySystem(final String systemId) {
    final String _sql = "SELECT * FROM games WHERE systemId = ? ORDER BY title ASC, id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (systemId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, systemId);
    }
    return new LimitOffsetPagingSource<Game>(_statement, __db, "games") {
      @Override
      @NonNull
      protected List<Game> convertRows(@NonNull final Cursor cursor) {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
        final int _cursorIndexOfFileName = CursorUtil.getColumnIndexOrThrow(cursor, "fileName");
        final int _cursorIndexOfFileUri = CursorUtil.getColumnIndexOrThrow(cursor, "fileUri");
        final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(cursor, "title");
        final int _cursorIndexOfSystemId = CursorUtil.getColumnIndexOrThrow(cursor, "systemId");
        final int _cursorIndexOfDeveloper = CursorUtil.getColumnIndexOrThrow(cursor, "developer");
        final int _cursorIndexOfCoverFrontUrl = CursorUtil.getColumnIndexOrThrow(cursor, "coverFrontUrl");
        final int _cursorIndexOfLastIndexedAt = CursorUtil.getColumnIndexOrThrow(cursor, "lastIndexedAt");
        final int _cursorIndexOfLastPlayedAt = CursorUtil.getColumnIndexOrThrow(cursor, "lastPlayedAt");
        final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(cursor, "isFavorite");
        final List<Game> _result = new ArrayList<Game>(cursor.getCount());
        while (cursor.moveToNext()) {
          final Game _item;
          final int _tmpId;
          _tmpId = cursor.getInt(_cursorIndexOfId);
          final String _tmpFileName;
          if (cursor.isNull(_cursorIndexOfFileName)) {
            _tmpFileName = null;
          } else {
            _tmpFileName = cursor.getString(_cursorIndexOfFileName);
          }
          final String _tmpFileUri;
          if (cursor.isNull(_cursorIndexOfFileUri)) {
            _tmpFileUri = null;
          } else {
            _tmpFileUri = cursor.getString(_cursorIndexOfFileUri);
          }
          final String _tmpTitle;
          if (cursor.isNull(_cursorIndexOfTitle)) {
            _tmpTitle = null;
          } else {
            _tmpTitle = cursor.getString(_cursorIndexOfTitle);
          }
          final String _tmpSystemId;
          if (cursor.isNull(_cursorIndexOfSystemId)) {
            _tmpSystemId = null;
          } else {
            _tmpSystemId = cursor.getString(_cursorIndexOfSystemId);
          }
          final String _tmpDeveloper;
          if (cursor.isNull(_cursorIndexOfDeveloper)) {
            _tmpDeveloper = null;
          } else {
            _tmpDeveloper = cursor.getString(_cursorIndexOfDeveloper);
          }
          final String _tmpCoverFrontUrl;
          if (cursor.isNull(_cursorIndexOfCoverFrontUrl)) {
            _tmpCoverFrontUrl = null;
          } else {
            _tmpCoverFrontUrl = cursor.getString(_cursorIndexOfCoverFrontUrl);
          }
          final long _tmpLastIndexedAt;
          _tmpLastIndexedAt = cursor.getLong(_cursorIndexOfLastIndexedAt);
          final Long _tmpLastPlayedAt;
          if (cursor.isNull(_cursorIndexOfLastPlayedAt)) {
            _tmpLastPlayedAt = null;
          } else {
            _tmpLastPlayedAt = cursor.getLong(_cursorIndexOfLastPlayedAt);
          }
          final boolean _tmpIsFavorite;
          final int _tmp;
          _tmp = cursor.getInt(_cursorIndexOfIsFavorite);
          _tmpIsFavorite = _tmp != 0;
          _item = new Game(_tmpId,_tmpFileName,_tmpFileUri,_tmpTitle,_tmpSystemId,_tmpDeveloper,_tmpCoverFrontUrl,_tmpLastIndexedAt,_tmpLastPlayedAt,_tmpIsFavorite);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  @Override
  public PagingSource<Integer, Game> selectBySystems(final List<String> systemIds) {
    final StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT * FROM games WHERE systemId IN (");
    final int _inputSize = systemIds.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(") ORDER BY title ASC, id DESC");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (String _item : systemIds) {
      if (_item == null) {
        _statement.bindNull(_argIndex);
      } else {
        _statement.bindString(_argIndex, _item);
      }
      _argIndex++;
    }
    return new LimitOffsetPagingSource<Game>(_statement, __db, "games") {
      @Override
      @NonNull
      protected List<Game> convertRows(@NonNull final Cursor cursor) {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
        final int _cursorIndexOfFileName = CursorUtil.getColumnIndexOrThrow(cursor, "fileName");
        final int _cursorIndexOfFileUri = CursorUtil.getColumnIndexOrThrow(cursor, "fileUri");
        final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(cursor, "title");
        final int _cursorIndexOfSystemId = CursorUtil.getColumnIndexOrThrow(cursor, "systemId");
        final int _cursorIndexOfDeveloper = CursorUtil.getColumnIndexOrThrow(cursor, "developer");
        final int _cursorIndexOfCoverFrontUrl = CursorUtil.getColumnIndexOrThrow(cursor, "coverFrontUrl");
        final int _cursorIndexOfLastIndexedAt = CursorUtil.getColumnIndexOrThrow(cursor, "lastIndexedAt");
        final int _cursorIndexOfLastPlayedAt = CursorUtil.getColumnIndexOrThrow(cursor, "lastPlayedAt");
        final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(cursor, "isFavorite");
        final List<Game> _result = new ArrayList<Game>(cursor.getCount());
        while (cursor.moveToNext()) {
          final Game _item_1;
          final int _tmpId;
          _tmpId = cursor.getInt(_cursorIndexOfId);
          final String _tmpFileName;
          if (cursor.isNull(_cursorIndexOfFileName)) {
            _tmpFileName = null;
          } else {
            _tmpFileName = cursor.getString(_cursorIndexOfFileName);
          }
          final String _tmpFileUri;
          if (cursor.isNull(_cursorIndexOfFileUri)) {
            _tmpFileUri = null;
          } else {
            _tmpFileUri = cursor.getString(_cursorIndexOfFileUri);
          }
          final String _tmpTitle;
          if (cursor.isNull(_cursorIndexOfTitle)) {
            _tmpTitle = null;
          } else {
            _tmpTitle = cursor.getString(_cursorIndexOfTitle);
          }
          final String _tmpSystemId;
          if (cursor.isNull(_cursorIndexOfSystemId)) {
            _tmpSystemId = null;
          } else {
            _tmpSystemId = cursor.getString(_cursorIndexOfSystemId);
          }
          final String _tmpDeveloper;
          if (cursor.isNull(_cursorIndexOfDeveloper)) {
            _tmpDeveloper = null;
          } else {
            _tmpDeveloper = cursor.getString(_cursorIndexOfDeveloper);
          }
          final String _tmpCoverFrontUrl;
          if (cursor.isNull(_cursorIndexOfCoverFrontUrl)) {
            _tmpCoverFrontUrl = null;
          } else {
            _tmpCoverFrontUrl = cursor.getString(_cursorIndexOfCoverFrontUrl);
          }
          final long _tmpLastIndexedAt;
          _tmpLastIndexedAt = cursor.getLong(_cursorIndexOfLastIndexedAt);
          final Long _tmpLastPlayedAt;
          if (cursor.isNull(_cursorIndexOfLastPlayedAt)) {
            _tmpLastPlayedAt = null;
          } else {
            _tmpLastPlayedAt = cursor.getLong(_cursorIndexOfLastPlayedAt);
          }
          final boolean _tmpIsFavorite;
          final int _tmp;
          _tmp = cursor.getInt(_cursorIndexOfIsFavorite);
          _tmpIsFavorite = _tmp != 0;
          _item_1 = new Game(_tmpId,_tmpFileName,_tmpFileUri,_tmpTitle,_tmpSystemId,_tmpDeveloper,_tmpCoverFrontUrl,_tmpLastIndexedAt,_tmpLastPlayedAt,_tmpIsFavorite);
          _result.add(_item_1);
        }
        return _result;
      }
    };
  }

  @Override
  public Object selectSystems(final Continuation<? super List<String>> $completion) {
    final String _sql = "SELECT DISTINCT systemId FROM games ORDER BY systemId ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<String>>() {
      @Override
      @NonNull
      public List<String> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final String _item;
            if (_cursor.isNull(0)) {
              _item = null;
            } else {
              _item = _cursor.getString(0);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<SystemCount>> selectSystemsWithCount() {
    final String _sql = "SELECT count(*) count, systemId systemId FROM games GROUP BY systemId";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"games"}, new Callable<List<SystemCount>>() {
      @Override
      @NonNull
      public List<SystemCount> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCount = 0;
          final int _cursorIndexOfSystemId = 1;
          final List<SystemCount> _result = new ArrayList<SystemCount>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final SystemCount _item;
            final int _tmpCount;
            _tmpCount = _cursor.getInt(_cursorIndexOfCount);
            final String _tmpSystemId;
            if (_cursor.isNull(_cursorIndexOfSystemId)) {
              _tmpSystemId = null;
            } else {
              _tmpSystemId = _cursor.getString(_cursorIndexOfSystemId);
            }
            _item = new SystemCount(_tmpSystemId,_tmpCount);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
