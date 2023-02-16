fun main() {
    // Prompt the user to enter "R"
    println("Press R to generate a random password.")

    // Read the user's input and check if it is "R" (ignoring caps lock)
    if (readlnOrNull()?.uppercase() == "R") {
        // Prompt the user to enter the desired password length
        println("Enter the password length: (6-30)")

        // Read the user's input and parse it as an integer, defaulting to 0 if null
        val passwordLength = readlnOrNull()?.toIntOrNull() ?: 0

        // Check if the password length is valid (between 6 and 30)
        if (passwordLength in 6..30) {
            // Generate a password of the specified length
            val password = CharArray(passwordLength) {
                // Choose a random character range (lowercase letters, uppercase letters, or digits)
                // and choose a random character from the chosen range
                listOf('a'..'z', 'A'..'Z', '0'..'9').random().random()
            }

            // Print the generated password
            println("Password: ${password.joinToString("")}")
        } else {
            // Print an error message if the password length is invalid
            println("Invalid password length.")
        }
    } else {
        // Print an error message if the input is invalid
        println("Invalid input.")
    }
}