package ragavi.com.recyclercard25

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CakeAdapter : RecyclerView.Adapter<CakeAdapter.CakeViewHolder>() {

    var cakes = listOf<Cake>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    class CakeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ckimage: ImageView = view.findViewById(R.id.cakeimage)
        val cktitle: TextView = view.findViewById(R.id.caketitle)
        val ckdescrip: TextView = view.findViewById(R.id.cakedescrip)

        fun bind(cake: Cake) {
            ckimage.setImageResource(cake.cakeImage)
            cktitle.text = cake.title
            ckdescrip.text = cake.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CakeAdapter.CakeViewHolder {
        val view: View = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.cake_item, parent, false)
        return CakeViewHolder(view)
    }

    override fun onBindViewHolder(holder: CakeAdapter.CakeViewHolder, position: Int) {
        val cake: Cake = cakes[position]
        holder.bind(cake)
    }

    override fun getItemCount(): Int {
        return cakes.size
    }
}
