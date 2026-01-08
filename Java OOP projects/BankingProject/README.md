# Bank Account Management System

## 🏦 Project Overview

A Java-based banking application that simulates basic teller operations. This project demonstrates how to protect sensitive data (like a bank balance) using object-oriented principles.

## 🚀 Key Concepts Learned

1. Data Encapsulation & Security By making the Balance field private, I ensured that no other class can just set the balance to $1,000,000. All changes must go through the DepositMoney and WithDraw methods.

2. State Protection (Conditional Logic) I learned how to write "guard clauses" to protect the object's state.

The Logic: Before subtracting money, the code checks: if((this.Balance - WithdrawalMoney ) < 0 ).

The Benefit: This prevents the account from going into a negative balance, which is a real-world business rule.

3. The this Keyword I practiced using the this keyword in the constructor and methods. This helped me understand how to distinguish between class fields and method parameters when they have the same name.

4. Constructor Initialization This project showed me how to set up an object's initial state as soon as it is created, ensuring an account always has a name, email, and starting balance.