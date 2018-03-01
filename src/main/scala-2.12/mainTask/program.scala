package mainTask

import breeze.linalg._
import breeze.linalg.DenseMatrix
import breeze.linalg. {csvread, csvwrite}
import java.io._

/*
* Вхідні дані для виразу подати такими способами:
 задати явно або за певними правилами
 згенерувати за допомогою генератора випадкових чисел
 зчитати з CSV файлу (breeze.linealg. {csvread, csvwrite})

  C^T/rank(A)
*/

object MatrixOperation extends App{
//  Creating matrix for first variant
  val pathToFile = "E:\\Files\\DevelopeProjects\\Scala\\Khomenko\\Laba1\\src\\main\\scala-2.12\\mainTask\\mtx.csv"

  var C = DenseMatrix((1.0,2.0,3.0),(11.0,12.0,13.0),(21.0,22.0,23.0))
  var A = DenseMatrix((1.0,2.0,3.0),(11.0,12.0,13.0),(21.0,22.0,23.0),(0.0,0.0,0.0))
  var Result = C.t / rank(A).toDouble

  println(s"C =\n$C\n")
  println(s"A =\n$A\n")
  println(s"Result =\n$Result\n")

  C = DenseMatrix.rand[Double](5,5)
  A = DenseMatrix.rand[Double](5,5)
  Result = C.t / rank(A).toDouble

  println(s"C =\n$C\n")
  println(s"A =\n$A\n")
  println(s"Result =\n$Result\n")

  C=csvread(new File(pathToFile), ';')
  A=csvread(new File(pathToFile), ';')
  Result = C.t / rank(A).toDouble

  println(s"C =\n$C\n")
  println(s"A =\n$A\n")
  println(s"Result =\n$Result\n")
}
