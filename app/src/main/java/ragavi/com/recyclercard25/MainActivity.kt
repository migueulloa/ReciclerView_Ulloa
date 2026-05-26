package ragavi.com.recyclercard25

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cakeList: RecyclerView = findViewById(R.id.recycler)
        cakeList.layoutManager = LinearLayoutManager(this)
        val cakeAdapter = CakeAdapter()

        cakeList.adapter = cakeAdapter
        cakeAdapter.cakes = Cake.data
    }
}
