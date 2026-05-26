package ragavi.com.recyclercard25

data class Cake(
    val cakeImage: Int,
    val title: String,
    val description: String
) {
    companion object {
        val data = listOf(
            Cake(
                R.drawable.donut,
                title = "Dount",
                description = "Description dount"
            ),
            Cake(
                R.drawable.eclair,
                title = "Eclair",
                description = "Description eclair"
            ),
            Cake(
                R.drawable.muffin,
                title = "Muffin",
                description = "Description muffin"
            ),
            Cake(
                R.drawable.pudding,
                title = "Pudding",
                description = "Description pudding"
            ),
            Cake(
                R.drawable.cupcake,
                title = "Cupcake",
                description = "Description cupcake"
            ),
            Cake(
                R.drawable.donuta,
                title = "Donuta",
                description = "Description dount"
            )
        )
    }
}
