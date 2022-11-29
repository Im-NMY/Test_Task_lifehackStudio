package com.example.test_task_lifehackstudio.ui

import com.example.test_task_lifehackstudio.base.Event
import com.example.test_task_lifehackstudio.domain.InstitutionModel
import com.example.test_task_lifehackstudio.domain.ItemInstitutionModel

data class ViewState(
    val itemList: List<ItemInstitutionModel>,
    val institution: InstitutionModel

)

sealed class UiEvent : Event {
    data class OnOpenItemClicked(val index: Int) : UiEvent()
}

sealed class DataEvent : Event {
    object LoadInstitution : DataEvent()
    data class OnLoadListInstitutionSucceed(val itemList: List<ItemInstitutionModel>) : DataEvent()
    data class OnLoadInstitutionSucceed(val item: InstitutionModel) : DataEvent()

}