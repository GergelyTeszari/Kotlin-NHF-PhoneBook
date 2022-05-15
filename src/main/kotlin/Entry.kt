class Entry(
    firstName: String,
    lastName: String,
    nickName: String,
    address: String,
    privateNumber: String,
    workNumber: String
){
    private var firstName: String
    private var lastName: String
    private var nickName: String
    private var address: String
    private var privateNumber: String
    private var workNumber: String

    init {
        this.firstName = firstName
        this.lastName = lastName
        this.nickName = nickName
        this.address = address
        this.privateNumber = privateNumber
        this.workNumber = workNumber
    }

    fun getFname() = this.firstName
    fun getLname() = this.lastName
    fun getNname() = this.nickName
    fun getPnum() = this.privateNumber
    fun getWnum() = this.workNumber
    fun setFname(value: String) = value.also { firstName = it }
    fun setLname(value: String) = value.also { lastName = it }
    fun setNname(value: String) = value.also { nickName = it }
    fun setAddress(value: String) = value.also { address = it }
    fun setPnum(value: String) = value.also { privateNumber = it }
    fun setWnum(value: String) = value.also { workNumber = it }

    override fun toString(): String {
        return "Entry:" +
                "\nName: $firstName $lastName\n($nickName)" +
                "\nAddress: $address" +
                "\nPrivate number: $privateNumber" +
                "\nWork number: $workNumber\n"
    }

    fun toFile(): String{
        return "${toEnglish(firstName)}," +
                "${toEnglish(lastName)}," +
                "${toEnglish(nickName)}," +
                "${toEnglish(address)}," +
                "$privateNumber,$workNumber"
    }
}