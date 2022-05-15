fun create() {
    cls()
    print("\nNew contact's firstname:\n>>>")
    val newFirstName = getInput()

    print("\nNew contact's lastname:\n>>>")
    val newLastName = getInput()

    print("\nNew contact's nickname:\n>>>")
    val newNickName = getInput()

    print("\nNew contact's address:\n>>>")
    val newAddress = getInput()

    var newPrivateNumber: String
    while (true){
        print("\nNew contact's private phone number:\n>>>")
        newPrivateNumber = getInput()
        if (!isInTheList(newPrivateNumber)) break
    }

    var newWorkNumber: String
    while (true) {
        print("\nNew contact's work phone number:\n>>>")
        newWorkNumber = getInput()
        if (!isInTheList(newWorkNumber)) break
    }

    database.add(
        Entry(
            firstName = toEnglish(newFirstName),
            lastName = toEnglish(newLastName),
            nickName = toEnglish(newNickName),
            address = toEnglish(newAddress),
            privateNumber = newPrivateNumber,
            workNumber = newWorkNumber,
        )
    )
}