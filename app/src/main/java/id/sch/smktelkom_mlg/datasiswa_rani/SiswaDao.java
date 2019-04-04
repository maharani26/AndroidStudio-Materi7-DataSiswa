package id.sch.smktelkom_mlg.datasiswa_rani;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface SiswaDao {
    @Query("SELECT * FROM SiswaModel")
    List<SiswaModel> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(SiswaModel siswaModel);

    @Delete
    void deleteUsers(SiswaModel siswaModel);

    @Update
    void update(SiswaModel siswaModel);
}