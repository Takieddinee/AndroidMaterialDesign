package example.android.com.androidmaterialdesign


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_floating_text.view.*
import org.jetbrains.anko.design.snackbar
import org.jetbrains.anko.toast


/**
 * A simple [Fragment] subclass.
 */
class FloatingTextFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {


        val view =  inflater!!.inflate(R.layout.fragment_floating_text, container, false)
        view.button3.setOnClickListener { view ->
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
