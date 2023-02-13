package edu.dixietech.bradc.footballcompose.model

data class Team(
    val id: Int = 0,
    val name: String = "",
    val colors: Array<Long> = arrayOf(),
    val logo: String = ""
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Team

        if (id != other.id) return false
        if (name != other.name) return false
        if (!colors.contentEquals(other.colors)) return false
        if (logo != other.logo) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + name.hashCode()
        result = 31 * result + colors.contentHashCode()
        result = 31 * result + logo.hashCode()
        return result
    }
}
