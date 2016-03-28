package net.infobosccoma.titulars.network;


import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;

import net.infobosccoma.titulars.models.business.entities.PuntsInteres;


public class TitularsRetrofitSpiceRequest extends RetrofitSpiceRequest<PuntsInteres.Llista, TitularsAPI> {

    public TitularsRetrofitSpiceRequest() {
        super(PuntsInteres.Llista.class, TitularsAPI.class);
    }

    @Override
    public PuntsInteres.Llista loadDataFromNetwork() {
        return getService().getAll();
    }


}


