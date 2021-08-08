package com.example.loco.ui.base
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import com.example.ui.fragments.detail.DetailFragment
import com.example.ui.fragments.detail.DetailViewModel
import com.example.ui.fragments.playlist.PlayListViewModelFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

abstract class BaseFragment<Binding: ViewBinding, VM: BaseViewModel>(private val inflate: (LayoutInflater, ViewGroup?, Boolean) -> Binding): Fragment() {

    private var _binding: Binding? = null
    val binding get() = _binding!!
 //   val viewModel: ada by viewModel()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflate.invoke(inflater, container, false)
        setupLiveData()
        setupUI()
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    abstract fun setupLiveData()
    abstract fun setupUI()
}