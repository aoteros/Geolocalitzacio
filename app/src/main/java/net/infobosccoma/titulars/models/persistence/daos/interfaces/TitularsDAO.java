package net.infobosccoma.titulars.models.persistence.daos.interfaces;

import net.infobosccoma.titulars.models.business.entities.PuntsInteres;

import java.util.List;

/**
 * Created by profe on 23/2/2016.
 */
public interface TitularsDAO {

    List<PuntsInteres> getById(final String id);
    List<PuntsInteres> getAll();
}
