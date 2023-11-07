class UserManager {
    fun search(){
        val cacheManager = CacheManager()
        while(true) {
            println("Чтобы выйти, введите exit")
            print("Введите имя человека, которого хотите найти: ")
            val name = readLine()
            if(name == "exit")
                break
            println(name?.let { cacheManager.getUserByName(it) })
        }
    }
}
