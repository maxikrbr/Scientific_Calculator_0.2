package com.example.scientific_calculator_02

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var binding: Activity

    lateinit var topMenu: TextView
    lateinit var outputScreen: TextView
    lateinit var buttonAC: Button
    lateinit var buttonC: Button
    lateinit var openParenthesis: Button
    lateinit var closeParenthesis: Button
    lateinit var buttonCos: Button
    lateinit var buttonSin: Button
    lateinit var buttonLn: Button
    lateinit var buttonTan: Button
    lateinit var buttonLog: Button
    lateinit var buttonFact: Button
    lateinit var buttonSquare: Button
    lateinit var buttonSqrt: Button
    lateinit var buttonDiv: Button
    lateinit var buttonInv: Button
    lateinit var buttonPlus: Button
    lateinit var buttonMinus: Button
    lateinit var buttonEquals: Button
    lateinit var buttonMult: Button
    lateinit var buttonZero: Button
    lateinit var buttonOne: Button
    lateinit var buttonTwo: Button
    lateinit var buttonThree: Button
    lateinit var buttonFour: Button
    lateinit var buttonFive: Button
    lateinit var buttonSix: Button
    lateinit var buttonSeven: Button
    lateinit var buttonEight: Button
    lateinit var buttonNine: Button
    lateinit var buttonPi: Button
    lateinit var buttonComma: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        topMenu = findViewById(R.id.topMenu)
        outputScreen = findViewById(R.id.outputScreen)
        buttonAC = findViewById(R.id.buttonAC)
        buttonC = findViewById(R.id.buttonC)
        openParenthesis = findViewById(R.id.openParenthesis)
        closeParenthesis = findViewById(R.id.closeParenthesis)
        buttonCos = findViewById(R.id.buttonCos)
        buttonSin = findViewById(R.id.buttonSin)
        buttonLn = findViewById(R.id.buttonLn)
        buttonTan = findViewById(R.id.buttonTan)
        buttonLog = findViewById(R.id.buttonLog)
        buttonFact = findViewById(R.id.buttonFact)
        buttonSquare = findViewById(R.id.buttonSquare)
        buttonSqrt = findViewById(R.id.buttonSqrt)
        buttonDiv = findViewById(R.id.buttonDiv)
        buttonInv = findViewById(R.id.buttonInv)
        buttonPlus = findViewById(R.id.buttonPlus)
        buttonMinus = findViewById(R.id.buttonMinus)
        buttonEquals = findViewById(R.id.buttonEquals)
        buttonMult = findViewById(R.id.buttonMult)
        buttonZero = findViewById(R.id.buttonZero)
        buttonOne = findViewById(R.id.buttonOne)
        buttonTwo = findViewById(R.id.buttonTwo)
        buttonThree = findViewById(R.id.buttonThree)
        buttonFour = findViewById(R.id.buttonFour)
        buttonFive = findViewById(R.id.buttonFive)
        buttonSix = findViewById(R.id.buttonSix)
        buttonSeven = findViewById(R.id.buttonSeven)
        buttonEight = findViewById(R.id.buttonEight)
        buttonNine = findViewById(R.id.buttonNine)
        buttonPi = findViewById(R.id.buttonPi)
        buttonComma = findViewById(R.id.buttonComma)

        buttonZero.setOnClickListener {
            outputScreen.text = (outputScreen.text.toString() + "0")
        }

        buttonOne.setOnClickListener {
            outputScreen.text = (outputScreen.text.toString() + "1")
        }

        buttonTwo.setOnClickListener {
            outputScreen.text = (outputScreen.text.toString() + "2")
        }

        buttonThree.setOnClickListener {
            outputScreen.text = (outputScreen.text.toString() + "3")
        }

        buttonFour.setOnClickListener {
            outputScreen.text = (outputScreen.text.toString() + "4")
        }

        buttonFive.setOnClickListener {
            outputScreen.text = (outputScreen.text.toString() + "5")
        }

        buttonSix.setOnClickListener {
            outputScreen.text = (outputScreen.text.toString() + "6")
        }

        buttonSeven.setOnClickListener {
            outputScreen.text = (outputScreen.text.toString() + "7")
        }

        buttonEight.setOnClickListener {
            outputScreen.text = (outputScreen.text.toString() + "8")
        }

        buttonNine.setOnClickListener {
            outputScreen.text = (outputScreen.text.toString() + "9")
        }

        buttonComma.setOnClickListener {
            outputScreen.text = (outputScreen.text.toString() + ".")
        }

        buttonPlus.setOnClickListener {
            outputScreen.text = (outputScreen.text.toString() + "+")
        }

        buttonMinus.setOnClickListener {
            outputScreen.text = (outputScreen.text.toString() + "-")
        }

        openParenthesis.setOnClickListener {
            outputScreen.text = (outputScreen.text.toString() + "(")
        }

        closeParenthesis.setOnClickListener {
            outputScreen.text = (outputScreen.text.toString() + ")")
        }

        buttonPi.setOnClickListener {
            outputScreen.text = (outputScreen.text.toString() + "3.14159")
        }

        buttonSin.setOnClickListener {
            outputScreen.text = (outputScreen.text.toString() + "sin")
        }

        buttonCos.setOnClickListener {
            outputScreen.text = (outputScreen.text.toString() + "cos")
        }

        buttonTan.setOnClickListener {
            outputScreen.text = (outputScreen.text.toString() + "tan")
        }

        buttonInv.setOnClickListener {
            outputScreen.text = (outputScreen.text.toString() + "^" + "(-1)")
        }

        buttonLn.setOnClickListener {
            outputScreen.text = (outputScreen.text.toString() + "ln")
        }

        buttonLog.setOnClickListener {
            outputScreen.text = (outputScreen.text.toString() + "log")
        }

        buttonMult.setOnClickListener {
            val str: String = outputScreen.text.toString()
            if(!str.get(index = str.length - 1).equals("*")) {
                outputScreen.text = (outputScreen.text.toString() + "*")
            }
        }

        buttonSqrt.setOnClickListener {
            if (outputScreen.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
            } else {
                val str: String = outputScreen.text.toString()
                val r = Math.sqrt(str.toDouble())
                val result = r.toString()
                outputScreen.setText(result)
            }
        }

        buttonEquals.setOnClickListener {
            val str: String = outputScreen.text.toString()
            val result: Double = evaluate(str)
            val r = result.toString()
            outputScreen.setText(r)
        }

        buttonAC.setOnClickListener {
            outputScreen.setText("")
        }

        buttonC.setOnClickListener {
            var str: String = outputScreen.text.toString()
            if(!str.equals("")) {
                str = str.substring(0, str.length - 1)
                outputScreen.text = str
            }
        }

        buttonSquare.setOnClickListener {
            if (outputScreen.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
            } else {
                val d: Double = outputScreen.getText().toString().toDouble()
                val square = d * d
                outputScreen.setText(square.toString())
            }
        }

        buttonFact.setOnClickListener {
            if(outputScreen.text.toString().isEmpty()){
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
            } else {
                val value: Double = outputScreen.text.toString().toDouble()
                val fact: Double = factorial(value)
                outputScreen.setText(fact.toString())
            }
        }
    }

    fun factorial(n: Double): Double {
        return if (n == 1.0 || n == 0.0) 1.0 else n * factorial(n - 1)
    }

    fun evaluate(str: String): Double {
        return object: Any() {
            var pos = -1
            var ch = 0

            fun nextChar(){
                ch = if (++pos < str.length) str[pos].code else -1
            }

            fun eat(charToEat: Int): Boolean {
                while (ch == ' '.code) nextChar()
                if (ch == charToEat) {
                    nextChar()
                    return true
                }
                return false
            }

            fun parse(): Double {
                nextChar()
                val x = parseExpression()
                if (pos < str.length) throw RuntimeException("Unexpected: " + ch.toChar())
                return x
            }

            fun parseExpression(): Double {
                var x = parseTerm()
                while (true) {
                    if (eat('+'.code)) x += parseTerm() // addition
                    else if (eat('-'.code)) x -= parseTerm() // subtraction
                    else return x
                }
            }

            fun parseTerm(): Double {
                var x = parseFactor()
                while (true) {
                    if (eat('*'.code)) x *= parseFactor() // multiplication
                    else if (eat('/'.code)) x /= parseFactor() // division
                    else return x
                }
            }

            fun parseFactor(): Double {
                //on below line we are checking for addition
                // and subtraction and performing unary operations.
                if (eat('+'.code)) return parseFactor() // unary plus
                if (eat('-'.code)) return -parseFactor() // unary minus
                var x: Double
                val startPos = pos
                if (eat('('.code)) { // parentheses
                    x = parseExpression()
                    eat(')'.code)
                } else if (ch >= '0'.code && ch <= '9'.code || ch == '.'.code) {
                    // numbers
                    while (ch >= '0'.code && ch <= '9'.code || ch == '.'.code) nextChar()
                    // on below line we are getting sub string from our string using start and pos.
                    x = str.substring(startPos, pos).toDouble()
                } else if (ch >= 'a'.code && ch <= 'z'.code) {
                    // on below function we are checking for the operator in our expression.
                    while (ch >= 'a'.code && ch <= 'z'.code) nextChar()
                    val func = str.substring(startPos, pos)
                    // calling a method to parse our factor.
                    x = parseFactor()
                    // on below line we are checking for square root.
                    x =
                        if (func == "sqrt") Math.sqrt(x)
                        // on below line we are checking for sin function
                        // and calculating sin function using Math class.
                        else if (func == "sin") Math.sin(
                            Math.toRadians(x)
                            // on below line we are calculating the cos value
                        ) else if (func == "cos") Math.cos(
                            Math.toRadians(x)
                            // on below line we are calculating
                            // the tan value of our expression.
                        ) else if (func == "tan")
                            Math.tan(Math.toRadians(x))
                        // on below line we are calculating
                        // log value of the expression.
                        else if (func == "log")
                            Math.log10(x)
                        // on below line we are calculating
                        // ln value of expression.
                        else if (func == "ln") Math.log(x)
                        // f we get any error then
                        // we simply return the exception.
                        else throw RuntimeException(
                            "Unknown function: $func"
                        )
                } else {
                    // if the condition not satisfy then we are returning the exception
                    throw RuntimeException("Unexpected: " + ch.toChar())
                }
                // on below line we are calculating the power of the expression.
                if (eat('^'.code)) x = Math.pow(x, parseFactor()) // exponentiation
                return x
            }
            // at last calling a parse for our expression.
        }.parse()

    }


    }