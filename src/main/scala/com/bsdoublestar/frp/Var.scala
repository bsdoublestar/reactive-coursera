package com.bsdoublestar.frp

/**
  * Created by bsdoublestar on 12/25/16.
  */
class Var[T](expr: => T) extends Signal[T](expr) {
  override def update(expr: => T): Unit = super.update(expr)
}
object Var {
  def apply[T](expr: => T) = new Var(expr)
}
