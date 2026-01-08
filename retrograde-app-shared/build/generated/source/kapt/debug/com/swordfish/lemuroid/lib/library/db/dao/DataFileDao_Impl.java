package com.swordfish.lemuroid.lib.library.db.dao;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.swordfish.lemuroid.lib.library.db.entity.DataFile;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class DataFileDao_Impl implements DataFileDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DataFile> __insertionAdapterOfDataFile;

  private final EntityDeletionOrUpdateAdapter<DataFile> __deletionAdapterOfDataFile;

  public DataFileDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDataFile = new EntityInsertionAdapter<DataFile>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `datafiles` (`id`,`gameId`,`fileName`,`fileUri`,`lastIndexedAt`,`path`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DataFile entity) {
        statement.bindLong(1, entity.getId());
        statement.bindLong(2, entity.getGameId());
        if (entity.getFileName() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getFileName());
        }
        if (entity.getFileUri() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getFileUri());
        }
        statement.bindLong(5, entity.getLastIndexedAt());
        if (entity.getPath() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getPath());
        }
      }
    };
    this.__deletionAdapterOfDataFile = new EntityDeletionOrUpdateAdapter<DataFile>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `datafiles` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DataFile entity) {
        statement.bindLong(1, entity.getId());
      }
    };
  }

  @Override
  public void insert(final DataFile dataFile) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDataFile.insert(dataFile);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final List<DataFile> dataFiles) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDataFile.insert(dataFiles);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final List<DataFile> dataFiles) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfDataFile.handleMultiple(dataFiles);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<DataFile> selectDataFilesForGame(final int gameId) {
    final String _sql = "SELECT * FROM datafiles where gameId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, gameId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfGameId = CursorUtil.getColumnIndexOrThrow(_cursor, "gameId");
      final int _cursorIndexOfFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "fileName");
      final int _cursorIndexOfFileUri = CursorUtil.getColumnIndexOrThrow(_cursor, "fileUri");
      final int _cursorIndexOfLastIndexedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastIndexedAt");
      final int _cursorIndexOfPath = CursorUtil.getColumnIndexOrThrow(_cursor, "path");
      final List<DataFile> _result = new ArrayList<DataFile>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final DataFile _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final int _tmpGameId;
        _tmpGameId = _cursor.getInt(_cursorIndexOfGameId);
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
        final long _tmpLastIndexedAt;
        _tmpLastIndexedAt = _cursor.getLong(_cursorIndexOfLastIndexedAt);
        final String _tmpPath;
        if (_cursor.isNull(_cursorIndexOfPath)) {
          _tmpPath = null;
        } else {
          _tmpPath = _cursor.getString(_cursorIndexOfPath);
        }
        _item = new DataFile(_tmpId,_tmpGameId,_tmpFileName,_tmpFileUri,_tmpLastIndexedAt,_tmpPath);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<DataFile> selectByLastIndexedAtLessThan(final long lastIndexedAt) {
    final String _sql = "SELECT * FROM datafiles WHERE lastIndexedAt < ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, lastIndexedAt);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfGameId = CursorUtil.getColumnIndexOrThrow(_cursor, "gameId");
      final int _cursorIndexOfFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "fileName");
      final int _cursorIndexOfFileUri = CursorUtil.getColumnIndexOrThrow(_cursor, "fileUri");
      final int _cursorIndexOfLastIndexedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastIndexedAt");
      final int _cursorIndexOfPath = CursorUtil.getColumnIndexOrThrow(_cursor, "path");
      final List<DataFile> _result = new ArrayList<DataFile>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final DataFile _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final int _tmpGameId;
        _tmpGameId = _cursor.getInt(_cursorIndexOfGameId);
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
        final long _tmpLastIndexedAt;
        _tmpLastIndexedAt = _cursor.getLong(_cursorIndexOfLastIndexedAt);
        final String _tmpPath;
        if (_cursor.isNull(_cursorIndexOfPath)) {
          _tmpPath = null;
        } else {
          _tmpPath = _cursor.getString(_cursorIndexOfPath);
        }
        _item = new DataFile(_tmpId,_tmpGameId,_tmpFileName,_tmpFileUri,_tmpLastIndexedAt,_tmpPath);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
