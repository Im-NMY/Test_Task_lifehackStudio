package com.example.test_task_lifehackstudio.ui

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.example.test_task_lifehackstudio.base.BaseViewModel
import com.example.test_task_lifehackstudio.base.Event
import com.example.test_task_lifehackstudio.domain.InstitutionModel
import com.example.test_task_lifehackstudio.domain.Interactor
import kotlinx.coroutines.launch

class MainViewModel(private val interactor: Interactor) : BaseViewModel<ViewState>() {

    init {
        processDataEvent(DataEvent.LoadInstitution)
    }

    override fun initialViewState() = ViewState(
        itemList = emptyList(),
        institution = InstitutionModel(
            id = "",
            name = "",
            img = "",
            description = "",
            url = "",
            phone = ""
        )
    )

    override fun reduce(event: Event, previousState: ViewState): ViewState? {
        when (event) {
            is DataEvent.LoadInstitution -> {
                viewModelScope.launch {
                    interactor.getListInstitution().fold(
                        onError = {},
                        onSuccess = {
                            processDataEvent(DataEvent.OnLoadListInstitutionSucceed(it))
                        })
                }
                return null
            }
            is DataEvent.OnLoadListInstitutionSucceed -> {
                return previousState.copy(
                    itemList = event.itemList
                )
            }
            is UiEvent.OnOpenItemClicked -> {
                viewModelScope.launch {
                    interactor.getInstitution(event.index.toString()).fold(
                        onError = {
                                  Log.e("qwe", it.localizedMessage)
                        },
                        onSuccess = {
                            processDataEvent(DataEvent.OnLoadInstitutionSucceed(it))
                        }
                    )
                }
                return null
            }
            is DataEvent.OnLoadInstitutionSucceed -> {
                return previousState.copy(
                    institution = event.item
                )
            }
            else -> return null
        }
    }
}