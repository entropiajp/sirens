package jp.entropia.sirens.dao;

import jp.entropia.sirens.ConfigAutowireable;
import jp.entropia.sirens.entity.Song;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao
@ConfigAutowireable
public interface SongDao {

    /**
     * @param id
     * @return the Song entity
     */
    @Select
    Song selectById(Integer id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Song entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Song entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Song entity);
}