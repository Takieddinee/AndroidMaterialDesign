package example.android.com.androidmaterialdesign


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import org.jetbrains.anko.design.snackbar
import org.jetbrains.anko.toast


/**
 * A simple [Fragment] subclass.
 */
class FloatingTextFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {


        val view =  inflater!!.inflate(R.layout.fragment_floating_text, container, false)
        val button =  view.findViewById<Button>(R.id.button3)
        button.setOnClickListener { view ->
            snackbar(view,"Veuillez confirmer","Ok"){
               activity.toast("Merci pour la confirmation")
            }
        }

    return view

    }


    companion object {
        val instance = FloatingTextFragment()
    }

}// Required empty public constructor
