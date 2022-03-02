package qubits;

import qubits.utils.SparkClient;

public class App {
  public static void main(String[] args) {
    var filePath = "/home/mstafa/Downloads/archive/measurements.csv";
    var sparkClient = new SparkClient();
    sparkClient.processFile(filePath);
  }
}
