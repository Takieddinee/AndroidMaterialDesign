package example.android.com.androidmaterialdesign

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class TouchFeedbackFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_touch_feedback, container, false)
    }

// Singleton pattern to create one object on TouchFeedbackFragment class

    companion object {
            val fragment = TouchFeedbackFragment()
        }
    }
