package org.agoncal.fascicle.quarkus.load;

public class BookStoreLoad {

  public static void main(String[] args) {
    Thread bookScenario = new Thread(new ScenarioBook());
    bookScenario.start();
    Thread numberScenario = new Thread(new ScenarioNumber());
    numberScenario.start();
  }
}
