package com.latentview.interview

import org.apache.spark.sql.SparkSession
import org.scalatest._
import matchers.should._
import org.scalatest.funsuite.AnyFunSuite


class HelloSparkTest  extends AnyFunSuite  with Matchers {

  test("test spark master application Name"){
    val testAppName = "hello spark app"
    val spark = SparkSession
      .builder()
      .master("local")
      .appName(testAppName)
      .getOrCreate()
    spark.sparkContext.appName should be(testAppName)
  }
}
