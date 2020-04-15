package bkp.com.javatutorial.ui.controlStatement;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bkp.com.javatutorial.R;

public class ControlStatementFragment extends Fragment {

    private ControlStatementViewModel mViewModel;

    public static ControlStatementFragment newInstance() {
        return new ControlStatementFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_control_statement, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(ControlStatementViewModel.class);
        // TODO: Use the ViewModel
    }

}
