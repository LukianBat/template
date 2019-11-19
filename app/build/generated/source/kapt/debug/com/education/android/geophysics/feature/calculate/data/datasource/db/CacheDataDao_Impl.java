package com.education.android.geophysics.feature.calculate.data.datasource.db;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.education.android.geophysics.feature.calculate.domain.model.DataModel;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CacheDataDao_Impl implements CacheDataDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DataModel> __insertionAdapterOfDataModel;

  public CacheDataDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDataModel = new EntityInsertionAdapter<DataModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `DataModel` (`id`) VALUES (?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DataModel value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public Completable addData(final DataModel dataModel) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDataModel.insert(dataModel);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Single<DataModel> getDataById(final long id) {
    final String _sql = "SELECT * FROM datamodel WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return RxRoom.createSingle(new Callable<DataModel>() {
      @Override
      public DataModel call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final DataModel _result;
          if(_cursor.moveToFirst()) {
            _result = new DataModel();
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _result.setId(_tmpId);
          } else {
            _result = null;
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
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
}
