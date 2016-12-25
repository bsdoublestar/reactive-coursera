package com.bsdoublestar.frp

/**
  * Created by bsdoublestar on 12/25/16.
  */
object NoSignal extends Signal[Nothing](???) {
  override def computeValue() = ()
}
