import java.util.Scanner
import scala.util.Random.nextInt
import java.sql.DriverManager
import java.sql.Connection

//I called the folder tic tac toe but its actually rock paper scissors lol
object Main {
  //todo: User Authentication with sql database
  //todo: Score Count, make a method
  //todo:
  
    def main(args: Array[String]): Unit = {
        var sc = new Scanner(System.in)


        var startProgram = true
        while (startProgram){
          rPS()
        
        }

        
          def rPS():  Unit = {

            var startCPU = false
            var startP2 = false
            mainMenu()


            def mainMenu():Unit = {
              println("====================")
              println("Welcome to my Rock, Paper, Scissors game!")
              println("Written in Scala")
              println("====================")
              println("Choose from the following options.")
              println("1. Play vs the CPU!")
              println("2. Play vs a friend!")
              println("3. High Scores!")
              println("4. Exit.")
              var menuChoice = sc.nextInt()
              sc.nextLine()
              
              

                menuChoice match {
                  case 1 => 
                    startCPU = true
                    while(startCPU){
                      vsCPU()
                    }
                  case 2 => vsP2()
                  case 3 => highScores()
                  case 4 => startProgram = false
                  case _ => println("Invalid Choice. Try Again!")
                }
            }

            def vsCPU(): Unit = {
              println("====================")
              println("Hope you're ready to rumble!")
              println("Make a choice!")
              println("1. Rock")
              println("2. Scissors")
              println("3. Papers")
              println("4. Exit.")

              var userChoice = sc.nextInt()
              sc.nextLine()
              var pcChoice = nextInt(3) + 1

              // userChoice match {
              //   case pcChoice => println(s"Both players selected ${userChoice}. Call it a tie.")
              //   case 1 =>
              //     if (pcChoice == 2){
              //       println("Rock crushes scissors! You win!!")
              //     } else {
              //       println("Paper covers Rock! You lose. ")
              //       }
              //   case 2 =>
              //     if (pcChoice == 3){
              //     println("Scissors cuts paper! You win!!")
              //     } else {
              //       println("Rock crushes scissors! You lost.")
              //       }
              //   case 3 =>
              //     if (pcChoice == 3){
              //     println("Scissors cuts paper! You win!!")
              //   } else {
              //     println("Rock crushes scissors! You lost.")
              //   }
              //   case 4 =>mainMenu()
              //   case _ => println("Invalid choice, Try again!")
              // }
              // var result = Array(userChoice, pcChoice)


                if (userChoice == 4) {
                  return startCPU = false
                }else if (userChoice == pcChoice){
                  println(s"Both players selected ${userChoice}. Call it a tie.")
                } else if (userChoice == 1){
                  if (pcChoice == 2){
                    println("Rock crushes scissors! You win!!")
                  } else {
                    println("Paper covers Rock! You lose. ")
                  }
                } else if (userChoice == 2){
                  if (pcChoice == 3){
                    println("Scissors cuts paper! You win!!")
                  } else {
                    println("Rock crushes scissors! You lost.")
                  }

                } else if (userChoice == 3){
                  if (pcChoice == 1){
                    println("Paper suffocates Rock slowly, effortlessly. It's a slow death. You win. At what cost.")
                  } else {
                    println("Scissors cuts paper! You lost!")
                  }
                }
                

                // println("====================")
                // println("Try Again?")
                // println("1. Try Again")
                // println("2. Back to Main Menu")

                // var continue = sc.nextInt()
                // sc.nextLine()

                // continue match {
                //   case 1 => vsCPU()
                //   case 2 => mainMenu()
                //   case _ => println("Invalid choice, try again")
                // }

              }
        
            
            def vsP2(): Unit = {
              println("this is the multiplayer")
              mainMenu()
            }
            def highScores(): Unit = {
              println("this is the highscores method")
              mainMenu()
            }



          }
        
    }
}