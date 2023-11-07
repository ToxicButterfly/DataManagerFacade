class CacheManager {
    private var listOfUsers = mutableListOf<User>()

    fun getUserByName(name: String): String{
        var user: User? = listOfUsers.firstOrNull{it.name == name }
        if (user != null)
            return "User $user found in CacheManager"
        else {
            val api = ApiManager()
            user = api.getUserByName(name)
            if (user != null) {
                listOfUsers.add(user)
                return "User $user found in ApiManager"
            }
            else
                return "There's no user with such name"
        }
    }
}