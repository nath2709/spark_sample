package com.latentview.interview

import org.apache.spark.sql.SparkSession

object HelloSpark {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local").appName("HelloSpark").getOrCreate()
    println("hello Spark")
    spark.stop()

  }
}
