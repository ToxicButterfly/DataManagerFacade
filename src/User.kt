class User(var name: String, var surname: String, val birthday: String) {
    override fun toString(): String {
        return "User(name='$name', surname='$surname', birthday='$birthday')"
    }
}