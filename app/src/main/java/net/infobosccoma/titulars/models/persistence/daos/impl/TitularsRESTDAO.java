package net.infobosccoma.titulars.models.persistence.daos.impl;

import android.content.Context;

import com.octo.android.robospice.persistence.DurationInMillis;
import com.octo.android.robospice.request.listener.RequestListener;
import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;

import net.infobosccoma.titulars.models.business.entities.PuntsInteres;
import net.infobosccoma.titulars.models.persistence.daos.interfaces.TitularsDAO;
import net.infobosccoma.titulars.network.TitularsAPI;
import net.infobosccoma.titulars.views.impl.activities.BaseActivity;
import net.infobosccoma.titularscloud.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by marc on 23/2/2016.
 */
public class TitularsRESTDAO implements TitularsDAO {

    private Context context;

    public TitularsRESTDAO(Context context) {
        this.context = context;
    }

    @Override
    public List<PuntsInteres> getById(final String id) {
        List<PuntsInteres> localitzacioList = new ArrayList<>();
        RetrofitSpiceRequest<PuntsInteres.Llista, TitularsAPI> request =
                new RetrofitSpiceRequest<PuntsInteres.Llista,
                        TitularsAPI>(PuntsInteres.Llista.class,
                        TitularsAPI.class) {
                    @Override
                    public PuntsInteres.Llista loadDataFromNetwork() throws Exception {
                        return getService().getByCity(id);
                    }
                };
        ((BaseActivity) context).getSpiceManager().execute(request, "Localitzacio", DurationInMillis.ONE_MINUTE,
                (RequestListener<PuntsInteres.Llista>)
                        ((BaseActivity) context).getListListener());
        return localitzacioList;
    }

    /**
     * Obtenir tots els titulars.
     * Es fa una petició GET al servei REST
     * @return
     */
    @Override
    public List<PuntsInteres> getAll() {
        List<PuntsInteres> titulars = new ArrayList();

        // create request object
        RetrofitSpiceRequest<PuntsInteres.Llista, TitularsAPI> request = new RetrofitSpiceRequest<PuntsInteres.Llista, TitularsAPI>(PuntsInteres.Llista.class, TitularsAPI.class) {
            @Override
            public PuntsInteres.Llista loadDataFromNetwork() throws Exception {
                return getService().getAll();
            }
        };
        ((BaseActivity) context).getSpiceManager().execute(request, context.getString(R.string.cache_titulars), DurationInMillis.ONE_MINUTE, (RequestListener<PuntsInteres.Llista>) ((BaseActivity) context).getListListener());
        return titulars;
    }
}
