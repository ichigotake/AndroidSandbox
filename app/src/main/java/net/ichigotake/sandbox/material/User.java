package net.ichigotake.sandbox.material;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;

public class User extends BaseObservable {

    private final ObservableField<String> firstName = new ObservableField<>();
    private final ObservableField<String> lastName = new ObservableField<>();

    @Bindable
    public String getFirstName() {
        return firstName.get();
    }

    @Bindable
    public String getLastName() {
        return lastName.get();
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
        notifyPropertyChanged(net.ichigotake.sandbox.material.BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
        notifyPropertyChanged(net.ichigotake.sandbox.material.BR.lastName);
    }

}