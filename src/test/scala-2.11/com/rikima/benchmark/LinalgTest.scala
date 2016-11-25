package com.rikima.benchmark

import java.util.Random

import org.junit.Test

import breeze.linalg.{DenseMatrix, DenseVector}

import cern.colt.matrix.linalg.Algebra
import cern.colt.matrix.{DoubleFactory1D, DoubleFactory2D}

import org.la4j.Matrix
import org.la4j.vector.dense.BasicVector

import org.nd4j.linalg.factory.Nd4j

/**
  * Created by a14350 on 2016/11/25.
  */
class LinalgTest {

  val rand = new Random()

  val rows = 1000
  val cols = 10 * 10000


  @Test
  def testMultiplication(): Unit = {

    val w = DenseMatrix.rand[Double](rows,cols)
    val x = DenseVector.rand[Double](cols)


    var t = System.currentTimeMillis()
    (0 until 100).foreach {
      case i =>
        val wtx = w * x
      //println(wtx)
    }
    t = System.currentTimeMillis() - t
    println(s"process time: $t [ms]")
  }


  @Test
  def testMMul(): Unit = {

    val w = Nd4j.randn(rows, cols)
    val x = Nd4j.randn(cols, 1)

    var t = System.currentTimeMillis()
    (0 until 100).foreach {
      case i =>
        val wtx = w.mmul(x)
    }
    t = System.currentTimeMillis() - t
    println(s"process time: $t [ms]")
  }


  @Test
  def testColt(): Unit = {

    val w = DoubleFactory2D.dense.random(rows, cols)
    val x = DoubleFactory1D.dense.random(cols)

    val algebra = new Algebra()
    var t = System.currentTimeMillis()
    (0 until 100).foreach {
      case i =>
        val wtx = algebra.mult(w, x)
    }
    t = System.currentTimeMillis() - t
    println(s"process time: $t [ms]")
  }


  @Test
  def testLa4j(): Unit = {
    val w = Matrix.random(rows, cols, rand)
    val x = BasicVector.random(cols, rand)

    var t = System.currentTimeMillis()
    (0 until 100).foreach {
      case i =>
        val wtx = w.multiply(x)
    }
    t = System.currentTimeMillis() - t
    println(s"process time: $t [ms]")
  }

}
