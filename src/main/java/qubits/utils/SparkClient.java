package qubits.utils;

import org.apache.spark.sql.Row;
import org.apache.spark.sql.SQLContext;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;
import qubits.models.Measurement;

public class SparkClient {
  SparkSession spark;
  SQLContext sparkSql;

  public SparkClient() {
    spark = SparkSession
        .builder()
        .appName("App")
        .master("local[*]")
        .getOrCreate();
    sparkSql = spark.sqlContext();
  }

  public void processFile(String filePath) {
    Dataset<Row> data = sparkSql
        .read()
        .option("header", "true")
        .csv(filePath)
        .cache();
  }
}
