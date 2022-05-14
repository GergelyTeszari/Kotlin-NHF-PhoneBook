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

    fun getFname(): String{
        return this.firstName
    }

    fun getLname(): String{
        return this.lastName
    }

    fun getNname(): String {
        return this.nickName
    }

    fun getPnum(): String{
        return this.privateNumber
    }

    fun getWnum(): String {
        return this.workNumber
    }

    fun setFname(value: String){
        this.firstName=value
    }

    fun setLname(value: String){
        this.lastName=value
    }

    fun setNname(value: String){
        this.nickName=value
    }

    fun setAddress(value: String){
        this.address=value
    }

    fun setPnum(value: String){
        this.privateNumber=value
    }

    fun setWnum(value: String){
        this.workNumber=value
    }

    override fun toString(): String {
        return "Entry:" +
                "\nName: $firstName $lastName\n($nickName)" +
                "\nAddress: $address" +
                "\nPrivate number: $privateNumber" +
                "\nWork number: $workNumber\n"
    }

    fun toFile(): String{
        return "$firstName,$lastName,$nickName,$address,$privateNumber,$workNumber\n"
    }
}