package com.thread;


/**
 * Created by khan on 9/6/17.
 */
class FirstThread extends Thread {
  private int count = 0;
  private int id;

  @Override
  public void run() {
    try {
      for(int i =0;i<5;i++){
        System.out.println(id+ "=  and thread running .. ="+ i);
        sleep(1000);
      }
    }catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  FirstThread(){
    this.id= ++count;
    this.start();
  }
}
