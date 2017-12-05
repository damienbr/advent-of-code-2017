package be.inadevs.advent.of.code

import be.inadevs.advent.of.code.Day3.Direction.*
import java.lang.Math.abs

class Day3 {

    var verticalLimit = 1
    var verticalPosition = 0

    var horizontalLimit = 1
    var horizontalPosition = 0
    var actualDirection = Right

    fun init() {
        verticalLimit = 1
        verticalPosition = 0
        horizontalLimit = 1
        horizontalPosition = 0
        actualDirection = Right
    }

    fun accessMemory(input: Int): Int {
        init()
        for (i in 2..input) {
            actualDirection = move(actualDirection)
            println("situation is  v=$verticalPosition, h=$horizontalPosition direction is $actualDirection")
        }

        return abs(horizontalPosition) + abs(verticalPosition)
    }

    fun move(actualDirection: Direction): Direction {
        val nextDirection: Direction
        println("move $actualDirection")

        when (actualDirection) {
            Up, Down -> nextDirection = verticalMove(actualDirection)
            Left, Right -> nextDirection = horizontalMove(actualDirection)
        }

        return nextDirection
    }

    private fun horizontalMove(actualDirection: Direction): Direction {
        println("i'll move from $actualDirection, actual value is v=$verticalPosition, h=$horizontalPosition")
        if (Right == actualDirection) {
            horizontalPosition++
        } else {
            horizontalPosition--
        }


        println("evaluation between p=$horizontalPosition and l=$horizontalLimit")
        if (abs(horizontalPosition) == horizontalLimit) {
            if (actualDirection == Left) {
                horizontalLimit++
            }
            return nextMove(actualDirection)
        } else {
            return actualDirection
        }
    }

    private fun verticalMove(actualDirection: Direction): Direction {
        println("i'll move from $actualDirection, actual value is v=$verticalPosition, h$horizontalPosition")
        if (Up == actualDirection) {
            verticalPosition++
        } else {
            verticalPosition--
        }


        if (abs(verticalPosition) == verticalLimit) {
            if (actualDirection == Down) {
                verticalLimit++
            }
            return nextMove(actualDirection)
        } else {
            return actualDirection
        }
    }

    fun nextMove(actualDirection: Direction): Direction {
        when (actualDirection) {
            Up -> return Left
            Left -> return Down
            Down -> return Right
            Right -> return Up
        }
    }


    enum class Direction {
        Up, Down, Left, Right
    }
}