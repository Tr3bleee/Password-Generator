import java.util.*
import kotlin.random.Random

fun main() {
    // Prompt the user to enter "R"
    println("Press R to generate a random password.")

    // Read the user's input
    val input = readlnOrNull()

    // Check if the input is "R" (ignoring caps lock)
    if (input?.uppercase(Locale.getDefault()) == "R") {
        // Create a random number generator
        val random = Random

        // Generate a random length for the password (between 6 and 14)
        val passwordLength = random.nextInt(9) + 6

        // Generate a password of the specified length
        val password = CharArray(passwordLength) {
            // Choose a random character range (lowercase letters, uppercase letters, or digits)
            val ranges = listOf('a'..'z', 'A'..'Z', '0'..'9')
            val range = ranges.random(random)

            // Choose a random character from the chosen range
            range.random(random)
        }

        // Print the generated password
        println("Password: ${password.joinToString("")}")
    } else {
        // Print an error message if the input is invalid
        println("Invalid input.")
    }
}