fun create() {
    cls()
    print("\nNew contact's firstname:\n>>>")
    val newFirstName: String = readLine()?.trim() ?: readLine().toString()

    print("\nNew contact's lastname:\n>>>")
    val newLastName: String = readLine()?.trim() ?: readLine().toString()

    print("\nNew contact's nickname:\n>>>")
    val newNickName: String = readLine()?.trim() ?: readLine().toString()

    print("\nNew contact's address:\n>>>")
    val newAddress: String = readLine()?.trim() ?: readLine().toString()

    var newPrivateNumber: String
    while (true){
        print("\nNew contact's private phone number:\n>>>")
        newPrivateNumber = readLine()?.trim() ?: readLine().toString()
        if (!isInTheList(newPrivateNumber)) break
    }

    var newWorkNumber: String
    while (true) {
        print("\nNew contact's work phone number:\n>>>")
        newWorkNumber = readLine()?.trim() ?: readLine().toString()
        if (!isInTheList(newWorkNumber)) break
    }

    database.add(
        Entry(
            firstName = newFirstName,
            lastName = newLastName,
            nickName = newNickName,
            address = newAddress,
            privateNumber = newPrivateNumber,
            workNumber = newWorkNumber,
        )
    )
}