package net.infobosccoma.titulars.presenters.interfaces;


import net.infobosccoma.titulars.views.impl.activities.BaseActivity;

public interface IMainViewPresenter {

    public void onCreate(BaseActivity view);
    public void getLocalitzacioFromService();
    public void getLocalitzacioById(String localitzacio);

}
