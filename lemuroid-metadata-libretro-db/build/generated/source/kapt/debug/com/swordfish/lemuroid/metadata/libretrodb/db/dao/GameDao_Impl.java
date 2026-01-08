package com.swordfish.lemuroid.metadata.libretrodb.db.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import com.swordfish.lemuroid.metadata.libretrodb.db.entity.LibretroRom;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class GameDao_Impl implements GameDao {
  private final RoomDatabase __db;

  public GameDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public Object findByName(final String romName,
      final Continuation<? super List<LibretroRom>> $completion) {
    final String _sql = "SELECT * FROM games WHERE romName LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (romName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, romName);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<LibretroRom>>() {
      @Override
      @Nullable
      public List<LibretroRom> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfSystem = CursorUtil.getColumnIndexOrThrow(_cursor, "system");
          final int _cursorIndexOfRomName = CursorUtil.getColumnIndexOrThrow(_cursor, "romName");
          final int _cursorIndexOfDeveloper = CursorUtil.getColumnIndexOrThrow(_cursor, "developer");
          final int _cursorIndexOfCrc32 = CursorUtil.getColumnIndexOrThrow(_cursor, "crc32");
          final int _cursorIndexOfSerial = CursorUtil.getColumnIndexOrThrow(_cursor, "serial");
          final List<LibretroRom> _result = new ArrayList<LibretroRom>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final LibretroRom _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpSystem;
            if (_cursor.isNull(_cursorIndexOfSystem)) {
              _tmpSystem = null;
            } else {
              _tmpSystem = _cursor.getString(_cursorIndexOfSystem);
            }
            final String _tmpRomName;
            if (_cursor.isNull(_cursorIndexOfRomName)) {
              _tmpRomName = null;
            } else {
              _tmpRomName = _cursor.getString(_cursorIndexOfRomName);
            }
            final String _tmpDeveloper;
            if (_cursor.isNull(_cursorIndexOfDeveloper)) {
              _tmpDeveloper = null;
            } else {
              _tmpDeveloper = _cursor.getString(_cursorIndexOfDeveloper);
            }
            final String _tmpCrc32;
            if (_cursor.isNull(_cursorIndexOfCrc32)) {
              _tmpCrc32 = null;
            } else {
              _tmpCrc32 = _cursor.getString(_cursorIndexOfCrc32);
            }
            final String _tmpSerial;
            if (_cursor.isNull(_cursorIndexOfSerial)) {
              _tmpSerial = null;
            } else {
              _tmpSerial = _cursor.getString(_cursorIndexOfSerial);
            }
            _item = new LibretroRom(_tmpId,_tmpName,_tmpSystem,_tmpRomName,_tmpDeveloper,_tmpCrc32,_tmpSerial);
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
  public Object findByFileName(final String romName,
      final Continuation<? super LibretroRom> $completion) {
    final String _sql = "SELECT * FROM games WHERE romName = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (romName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, romName);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<LibretroRom>() {
      @Override
      @Nullable
      public LibretroRom call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfSystem = CursorUtil.getColumnIndexOrThrow(_cursor, "system");
          final int _cursorIndexOfRomName = CursorUtil.getColumnIndexOrThrow(_cursor, "romName");
          final int _cursorIndexOfDeveloper = CursorUtil.getColumnIndexOrThrow(_cursor, "developer");
          final int _cursorIndexOfCrc32 = CursorUtil.getColumnIndexOrThrow(_cursor, "crc32");
          final int _cursorIndexOfSerial = CursorUtil.getColumnIndexOrThrow(_cursor, "serial");
          final LibretroRom _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpSystem;
            if (_cursor.isNull(_cursorIndexOfSystem)) {
              _tmpSystem = null;
            } else {
              _tmpSystem = _cursor.getString(_cursorIndexOfSystem);
            }
            final String _tmpRomName;
            if (_cursor.isNull(_cursorIndexOfRomName)) {
              _tmpRomName = null;
            } else {
              _tmpRomName = _cursor.getString(_cursorIndexOfRomName);
            }
            final String _tmpDeveloper;
            if (_cursor.isNull(_cursorIndexOfDeveloper)) {
              _tmpDeveloper = null;
            } else {
              _tmpDeveloper = _cursor.getString(_cursorIndexOfDeveloper);
            }
            final String _tmpCrc32;
            if (_cursor.isNull(_cursorIndexOfCrc32)) {
              _tmpCrc32 = null;
            } else {
              _tmpCrc32 = _cursor.getString(_cursorIndexOfCrc32);
            }
            final String _tmpSerial;
            if (_cursor.isNull(_cursorIndexOfSerial)) {
              _tmpSerial = null;
            } else {
              _tmpSerial = _cursor.getString(_cursorIndexOfSerial);
            }
            _result = new LibretroRom(_tmpId,_tmpName,_tmpSystem,_tmpRomName,_tmpDeveloper,_tmpCrc32,_tmpSerial);
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
  public Object findByCRC(final String crc, final Continuation<? super LibretroRom> $completion) {
    final String _sql = "SELECT * FROM games WHERE crc32 = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (crc == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, crc);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<LibretroRom>() {
      @Override
      @Nullable
      public LibretroRom call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfSystem = CursorUtil.getColumnIndexOrThrow(_cursor, "system");
          final int _cursorIndexOfRomName = CursorUtil.getColumnIndexOrThrow(_cursor, "romName");
          final int _cursorIndexOfDeveloper = CursorUtil.getColumnIndexOrThrow(_cursor, "developer");
          final int _cursorIndexOfCrc32 = CursorUtil.getColumnIndexOrThrow(_cursor, "crc32");
          final int _cursorIndexOfSerial = CursorUtil.getColumnIndexOrThrow(_cursor, "serial");
          final LibretroRom _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpSystem;
            if (_cursor.isNull(_cursorIndexOfSystem)) {
              _tmpSystem = null;
            } else {
              _tmpSystem = _cursor.getString(_cursorIndexOfSystem);
            }
            final String _tmpRomName;
            if (_cursor.isNull(_cursorIndexOfRomName)) {
              _tmpRomName = null;
            } else {
              _tmpRomName = _cursor.getString(_cursorIndexOfRomName);
            }
            final String _tmpDeveloper;
            if (_cursor.isNull(_cursorIndexOfDeveloper)) {
              _tmpDeveloper = null;
            } else {
              _tmpDeveloper = _cursor.getString(_cursorIndexOfDeveloper);
            }
            final String _tmpCrc32;
            if (_cursor.isNull(_cursorIndexOfCrc32)) {
              _tmpCrc32 = null;
            } else {
              _tmpCrc32 = _cursor.getString(_cursorIndexOfCrc32);
            }
            final String _tmpSerial;
            if (_cursor.isNull(_cursorIndexOfSerial)) {
              _tmpSerial = null;
            } else {
              _tmpSerial = _cursor.getString(_cursorIndexOfSerial);
            }
            _result = new LibretroRom(_tmpId,_tmpName,_tmpSystem,_tmpRomName,_tmpDeveloper,_tmpCrc32,_tmpSerial);
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
  public Object findBySerial(final String serial,
      final Continuation<? super LibretroRom> $completion) {
    final String _sql = "SELECT * FROM games WHERE serial = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (serial == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, serial);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<LibretroRom>() {
      @Override
      @Nullable
      public LibretroRom call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfSystem = CursorUtil.getColumnIndexOrThrow(_cursor, "system");
          final int _cursorIndexOfRomName = CursorUtil.getColumnIndexOrThrow(_cursor, "romName");
          final int _cursorIndexOfDeveloper = CursorUtil.getColumnIndexOrThrow(_cursor, "developer");
          final int _cursorIndexOfCrc32 = CursorUtil.getColumnIndexOrThrow(_cursor, "crc32");
          final int _cursorIndexOfSerial = CursorUtil.getColumnIndexOrThrow(_cursor, "serial");
          final LibretroRom _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpSystem;
            if (_cursor.isNull(_cursorIndexOfSystem)) {
              _tmpSystem = null;
            } else {
              _tmpSystem = _cursor.getString(_cursorIndexOfSystem);
            }
            final String _tmpRomName;
            if (_cursor.isNull(_cursorIndexOfRomName)) {
              _tmpRomName = null;
            } else {
              _tmpRomName = _cursor.getString(_cursorIndexOfRomName);
            }
            final String _tmpDeveloper;
            if (_cursor.isNull(_cursorIndexOfDeveloper)) {
              _tmpDeveloper = null;
            } else {
              _tmpDeveloper = _cursor.getString(_cursorIndexOfDeveloper);
            }
            final String _tmpCrc32;
            if (_cursor.isNull(_cursorIndexOfCrc32)) {
              _tmpCrc32 = null;
            } else {
              _tmpCrc32 = _cursor.getString(_cursorIndexOfCrc32);
            }
            final String _tmpSerial;
            if (_cursor.isNull(_cursorIndexOfSerial)) {
              _tmpSerial = null;
            } else {
              _tmpSerial = _cursor.getString(_cursorIndexOfSerial);
            }
            _result = new LibretroRom(_tmpId,_tmpName,_tmpSystem,_tmpRomName,_tmpDeveloper,_tmpCrc32,_tmpSerial);
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

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
