package com.swordfish.lemuroid.lib.library.db.dao;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.paging.PagingSource;
import androidx.room.RoomDatabase;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.CursorUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.swordfish.lemuroid.lib.library.db.entity.Game;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class GameSearchDao_Internal_Impl implements GameSearchDao.Internal {
  private final RoomDatabase __db;

  public GameSearchDao_Internal_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public PagingSource<Integer, Game> rawSearch(final SupportSQLiteQuery query) {
    return new LimitOffsetPagingSource<Game>(query, __db, "games") {
      @Override
      @NonNull
      protected List<Game> convertRows(@NonNull final Cursor cursor) {
        final List<Game> _result = new ArrayList<Game>(cursor.getCount());
        while (cursor.moveToNext()) {
          final Game _item;
          _item = __entityCursorConverter_comSwordfishLemuroidLibLibraryDbEntityGame(cursor);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private Game __entityCursorConverter_comSwordfishLemuroidLibLibraryDbEntityGame(
      @NonNull final Cursor cursor) {
    final Game _entity;
    final int _cursorIndexOfId = CursorUtil.getColumnIndex(cursor, "id");
    final int _cursorIndexOfFileName = CursorUtil.getColumnIndex(cursor, "fileName");
    final int _cursorIndexOfFileUri = CursorUtil.getColumnIndex(cursor, "fileUri");
    final int _cursorIndexOfTitle = CursorUtil.getColumnIndex(cursor, "title");
    final int _cursorIndexOfSystemId = CursorUtil.getColumnIndex(cursor, "systemId");
    final int _cursorIndexOfDeveloper = CursorUtil.getColumnIndex(cursor, "developer");
    final int _cursorIndexOfCoverFrontUrl = CursorUtil.getColumnIndex(cursor, "coverFrontUrl");
    final int _cursorIndexOfLastIndexedAt = CursorUtil.getColumnIndex(cursor, "lastIndexedAt");
    final int _cursorIndexOfLastPlayedAt = CursorUtil.getColumnIndex(cursor, "lastPlayedAt");
    final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndex(cursor, "isFavorite");
    final int _tmpId;
    if (_cursorIndexOfId == -1) {
      _tmpId = 0;
    } else {
      _tmpId = cursor.getInt(_cursorIndexOfId);
    }
    final String _tmpFileName;
    if (_cursorIndexOfFileName == -1) {
      _tmpFileName = null;
    } else {
      if (cursor.isNull(_cursorIndexOfFileName)) {
        _tmpFileName = null;
      } else {
        _tmpFileName = cursor.getString(_cursorIndexOfFileName);
      }
    }
    final String _tmpFileUri;
    if (_cursorIndexOfFileUri == -1) {
      _tmpFileUri = null;
    } else {
      if (cursor.isNull(_cursorIndexOfFileUri)) {
        _tmpFileUri = null;
      } else {
        _tmpFileUri = cursor.getString(_cursorIndexOfFileUri);
      }
    }
    final String _tmpTitle;
    if (_cursorIndexOfTitle == -1) {
      _tmpTitle = null;
    } else {
      if (cursor.isNull(_cursorIndexOfTitle)) {
        _tmpTitle = null;
      } else {
        _tmpTitle = cursor.getString(_cursorIndexOfTitle);
      }
    }
    final String _tmpSystemId;
    if (_cursorIndexOfSystemId == -1) {
      _tmpSystemId = null;
    } else {
      if (cursor.isNull(_cursorIndexOfSystemId)) {
        _tmpSystemId = null;
      } else {
        _tmpSystemId = cursor.getString(_cursorIndexOfSystemId);
      }
    }
    final String _tmpDeveloper;
    if (_cursorIndexOfDeveloper == -1) {
      _tmpDeveloper = null;
    } else {
      if (cursor.isNull(_cursorIndexOfDeveloper)) {
        _tmpDeveloper = null;
      } else {
        _tmpDeveloper = cursor.getString(_cursorIndexOfDeveloper);
      }
    }
    final String _tmpCoverFrontUrl;
    if (_cursorIndexOfCoverFrontUrl == -1) {
      _tmpCoverFrontUrl = null;
    } else {
      if (cursor.isNull(_cursorIndexOfCoverFrontUrl)) {
        _tmpCoverFrontUrl = null;
      } else {
        _tmpCoverFrontUrl = cursor.getString(_cursorIndexOfCoverFrontUrl);
      }
    }
    final long _tmpLastIndexedAt;
    if (_cursorIndexOfLastIndexedAt == -1) {
      _tmpLastIndexedAt = 0;
    } else {
      _tmpLastIndexedAt = cursor.getLong(_cursorIndexOfLastIndexedAt);
    }
    final Long _tmpLastPlayedAt;
    if (_cursorIndexOfLastPlayedAt == -1) {
      _tmpLastPlayedAt = null;
    } else {
      if (cursor.isNull(_cursorIndexOfLastPlayedAt)) {
        _tmpLastPlayedAt = null;
      } else {
        _tmpLastPlayedAt = cursor.getLong(_cursorIndexOfLastPlayedAt);
      }
    }
    final boolean _tmpIsFavorite;
    if (_cursorIndexOfIsFavorite == -1) {
      _tmpIsFavorite = false;
    } else {
      final int _tmp;
      _tmp = cursor.getInt(_cursorIndexOfIsFavorite);
      _tmpIsFavorite = _tmp != 0;
    }
    _entity = new Game(_tmpId,_tmpFileName,_tmpFileUri,_tmpTitle,_tmpSystemId,_tmpDeveloper,_tmpCoverFrontUrl,_tmpLastIndexedAt,_tmpLastPlayedAt,_tmpIsFavorite);
    return _entity;
  }
}
