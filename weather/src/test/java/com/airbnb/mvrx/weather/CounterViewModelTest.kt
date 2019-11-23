package com.airbnb.mvrx.weather

import com.airbnb.mvrx.test.MvRxTestRule
import com.airbnb.mvrx.withState
import org.junit.Assert.*
import org.junit.ClassRule
import org.junit.Test

class CounterViewModelTest {

    @Test
    fun testIncrementCount() {
        val viewModel = CounterViewModel(CounterState())
        viewModel.incrementCount()
        withState(viewModel) { state ->
            assertEquals(1, state.count)
        }
    }

    companion object {
        @JvmField
        @ClassRule
        val mvrxTestRule = MvRxTestRule()
    }
}