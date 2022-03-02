package qubits.utils;

import org.apache.spark.sql.Encoder;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SQLContext;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;
import qubits.models.Measurement;

public class SparkClient {
  SparkSession spark;
  SQLContext sparkSql;
  Encoder<Measurement> measurementEncoder;

  public SparkClient() {
    spark = SparkSession
        .builder()
        .appName("App")
        .master("local[*]")
        .getOrCreate();
    sparkSql = spark.sqlContext();
    Encoder<Measurement> measurementEncoder = Encoders.bean(Measurement.class);
  }

  public void processFile(String filePath) {
    Dataset<Measurement> data = sparkSql
        .read()
        .option("header", "true")
        .csv(filePath)
        .as(measurementEncoder)
        .cache();
    var cnt = data.count();
    System.out.println(cnt);
  }
}
