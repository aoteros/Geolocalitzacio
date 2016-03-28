package net.infobosccoma.titulars.presenters.impl;


import android.support.v4.app.FragmentActivity;

import net.infobosccoma.titulars.models.business.entities.PuntsInteres;
import net.infobosccoma.titulars.models.persistence.daos.impl.TitularsRESTDAO;
import net.infobosccoma.titulars.models.persistence.daos.interfaces.TitularsDAO;
import net.infobosccoma.titulars.presenters.interfaces.IMainViewPresenter;
import net.infobosccoma.titulars.views.impl.activities.BaseActivity;

import java.util.List;

public class MainViewPresenterImpl implements IMainViewPresenter {


    private BaseActivity view;
    private List<PuntsInteres> titulars;
    private TitularsDAO titularsDAO;

    @Override
    public void onCreate(BaseActivity view) {
        this.view = view;
        titularsDAO = new TitularsRESTDAO((FragmentActivity)view);
    }

    public void getLocalitzacioFromService() {
        titulars = titularsDAO.getAll();
    }

    public void getLocalitzacioById(String localitzacio) {
        titulars = titularsDAO.getById(localitzacio);
    }

}

