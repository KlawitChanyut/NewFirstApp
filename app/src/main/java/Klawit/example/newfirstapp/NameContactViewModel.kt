package Klawit.example.newfirstapp

import Klawit.example.newfirstapp.database.DatabaseDAO
import Klawit.example.newfirstapp.databinding.FragmentContactBinding
import android.app.Application
import androidx.lifecycle.AndroidViewModel

class NameContactViewModel(
    val database: DatabaseDAO,
    private val binding:FragmentContactBinding,
    application: Application
) : AndroidViewModel(application) {

}




