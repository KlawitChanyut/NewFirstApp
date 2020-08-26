package Klawit.example.newfirstapp

import Klawit.example.newfirstapp.databinding.FragmentAboutMeBinding
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AboutMeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AboutMeFragment : Fragment() {
    class AboutmeFragment : Fragment() {

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            var binding = DataBindingUtil.inflate<FragmentAboutMeBinding>(
                inflater,
                R.layout.fragment_about_me,
                container,
                false
            )
            setHasOptionsMenu(true)
            return binding.root
        }

        override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
            super.onCreateOptionsMenu(menu, inflater)
            inflater?.inflate(R.menu.options_menu, menu)
        }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            return NavigationUI.onNavDestinationSelected(
                item!!,
                view!!.findNavController()
            ) || super.onOptionsItemSelected(item)
        }

    }
}