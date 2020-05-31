package com.sunshine.lock;

public class TestReentrantReadWriteLock {

  public static void main(String[] args) {
    // 高16位   低16位 怎么使用
      int  shareShift = 16;
    System.out.println((1 << shareShift)-1);
    System.out.println((1 <<shareShift));

  }
}
