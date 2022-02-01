// Generated by view binder compiler. Do not edit!
package com.example.poormansgym.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.poormansgym.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMachineBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonAdd;

  @NonNull
  public final Button buttonPre;

  @NonNull
  public final AppCompatImageView mimg;

  @NonNull
  public final TextView name;

  @NonNull
  public final EditText reps;

  @NonNull
  public final EditText sets;

  @NonNull
  public final TextView tdate;

  @NonNull
  public final EditText weight;

  private ActivityMachineBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonAdd,
      @NonNull Button buttonPre, @NonNull AppCompatImageView mimg, @NonNull TextView name,
      @NonNull EditText reps, @NonNull EditText sets, @NonNull TextView tdate,
      @NonNull EditText weight) {
    this.rootView = rootView;
    this.buttonAdd = buttonAdd;
    this.buttonPre = buttonPre;
    this.mimg = mimg;
    this.name = name;
    this.reps = reps;
    this.sets = sets;
    this.tdate = tdate;
    this.weight = weight;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMachineBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMachineBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_machine, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMachineBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonAdd;
      Button buttonAdd = ViewBindings.findChildViewById(rootView, id);
      if (buttonAdd == null) {
        break missingId;
      }

      id = R.id.buttonPre;
      Button buttonPre = ViewBindings.findChildViewById(rootView, id);
      if (buttonPre == null) {
        break missingId;
      }

      id = R.id.mimg;
      AppCompatImageView mimg = ViewBindings.findChildViewById(rootView, id);
      if (mimg == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.reps;
      EditText reps = ViewBindings.findChildViewById(rootView, id);
      if (reps == null) {
        break missingId;
      }

      id = R.id.sets;
      EditText sets = ViewBindings.findChildViewById(rootView, id);
      if (sets == null) {
        break missingId;
      }

      id = R.id.tdate;
      TextView tdate = ViewBindings.findChildViewById(rootView, id);
      if (tdate == null) {
        break missingId;
      }

      id = R.id.weight;
      EditText weight = ViewBindings.findChildViewById(rootView, id);
      if (weight == null) {
        break missingId;
      }

      return new ActivityMachineBinding((ConstraintLayout) rootView, buttonAdd, buttonPre, mimg,
          name, reps, sets, tdate, weight);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
