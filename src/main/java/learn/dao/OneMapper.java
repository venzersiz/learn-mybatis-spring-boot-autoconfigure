package learn.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OneMapper {

    @Select("SELECT 1")
    int find1();
}
