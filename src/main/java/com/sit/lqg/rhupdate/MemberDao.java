package com.sit.lqg.rhupdate;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MemberDao {
    @Select ("select * FROM yanlord_production.yanlord_account where member_id = ( select id FROM yanlord_production.yanlord_member where code like #{MemberCode}")
    Member findByCode ( @Param("MemberCode") String MemberCode );
}
