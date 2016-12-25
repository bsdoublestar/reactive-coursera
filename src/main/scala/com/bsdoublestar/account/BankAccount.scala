package com.bsdoublestar.account

import com.bsdoublestar.frp._

/**
  * Created by bsdoublestar on 12/25/16.
  */
class BankAccount {
  private val balance = Var(0)

  def currentBalance = balance()

  def deposit(amount: Int): Unit = {
    if (amount > 0) {
      val b = balance()
      balance() = b + amount
    }
  }

  def withdraw(amount: Int): Unit = {
    val b = balance()
    if (amount > 0 && amount <= b) {
      balance() = b - amount
    }
    else
      throw new Error("Insufficient funds")
  }
}
