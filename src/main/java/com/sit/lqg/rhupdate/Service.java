package com.sit.lqg.rhupdate;

public interface Service {
    public Member getId(int id);
    boolean findByCode(Member  code);
    boolean findById(int id);
}
