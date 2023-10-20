fun main(args: Array<String>) {
    //declare arrays
    var words = arrayOf("admin", "password", "qwerty", "login", "abides", "phase")
    var specialCharacters = arrayOf('%', '#', '*', ')', '^')
    var numbers = arrayOf("0","1","2","3","4","5","6","7","8","9")

    //grab random index for each set 2 words, 3 special chars, two numbers
    val randomWordIndex = (Math.random() * (words.size - 0) +0).toInt()
    var randomWordIndexTwo : Int

    do{
        randomWordIndexTwo = (Math.random() * (words.size - 0) +0).toInt()
    }while(randomWordIndexTwo == randomWordIndex)

    val randomSpecialCharIndex = (Math.random() * (specialCharacters.size - 0) +0).toInt()
    val randomSpecialCharIndexTwo = (Math.random() * (specialCharacters.size - 0) +0).toInt()
    val randomSpecialCharIndexThree = (Math.random() * (specialCharacters.size - 0) +0).toInt()
    val randomNumIndex = (Math.random() * (numbers.size - 0) +0).toInt()
    val randomNumIndexTwo = (Math.random() * (numbers.size - 0) +0).toInt()

    //generate password without substitution
    var originalPassword = "${words[randomWordIndex]}${specialCharacters[randomSpecialCharIndex]}${numbers[randomNumIndex]}${specialCharacters[randomSpecialCharIndexTwo]}" +
            "${words[randomWordIndexTwo]}${numbers[randomNumIndexTwo]}${specialCharacters[randomSpecialCharIndexThree]}"


    //println("${originalPassword}")

    //replace s with $
    var passwordReplaced = originalPassword.replace('s', '$')
    //println("${passwordReplaced}")

    //replace a with @
    passwordReplaced = passwordReplaced.replace('a', '@')
    //println("${passwordReplaced}")

    //replace i with !
    passwordReplaced = passwordReplaced.replace('i', '!')
    println("$passwordReplaced")
}