package klawit.example.newfirstapp

import klawit.example.newfirstapp.database.DatabaseDAO
import klawit.example.newfirstapp.databinding.FragmentContactBinding
import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class NameContactViewModelFactory (
    private val dataSource: DatabaseDAO,
    private val binding: FragmentContactBinding,
    private val application: Application
) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(NameContactViewModel::class.java)) {
            return NameContactViewModel(dataSource, binding, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}