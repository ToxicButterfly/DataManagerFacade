class ApiManager() {
    private var listOfUsers = mutableListOf<User>(User("Иван", "Петров", "01-02-2005"),
        User("Анна", "Хомякова", "03-04-1995"),
        User("Елена", "Рубина", "05-06-2015"),
        User("Николай", "Мордус", "07-08-1999"))

    fun getUserByName(name: String): User? {
        val user: User? = listOfUsers.firstOrNull{it.name == name }
        return user
    }
}