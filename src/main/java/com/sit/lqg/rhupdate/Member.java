package com.sit.lqg.rhupdate;

import org.apache.ibatis.type.Alias;

@Alias ( value = "yanlord_member")
public class Member {
    private int id;
    private String name;
    private String code;
    private boolean status;
    private long mobile;

    public long getMobile ( ) {
        return mobile;
    }

    public void setMobile ( long mobile ) {
        this.mobile=mobile;
    }

    public int getId ( ) {
        return id;
    }

    public void setId ( int id ) {
        this.id=id;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name=name;
    }

    public String getCode ( ) {
        return code;
    }

    public void setCode ( String code ) {
        this.code=code;
    }

    public boolean isStatus ( ) {
        return status;
    }

    public void setStatus ( boolean status ) {
        this.status=status;
    }
}
