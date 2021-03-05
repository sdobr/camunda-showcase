package de.ite.camunda.showcase.util;

public final class Util {

  private Util() {

  }

  public static void waitSeconds(Integer seconds) throws InterruptedException {
    synchronized (Thread.currentThread()) {
      Thread.currentThread().wait(seconds * 1000);
    }
  }
}
