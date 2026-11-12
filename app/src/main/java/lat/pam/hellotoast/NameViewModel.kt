package lat.pam.hellotoast // Gunakan nama package ini sesuai dengan folder kamu

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NameViewModel : ViewModel() {
    // Create a LiveData with an Int
    val currentName: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
}