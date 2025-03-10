/*
 * This file is generated by jOOQ.
 */
package me.fagiolini.cinemapp.db.tables.daos;


import java.util.List;
import java.util.Optional;

import me.fagiolini.cinemapp.db.tables.Sala;
import me.fagiolini.cinemapp.db.tables.records.SalaRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class SalaDao extends DAOImpl<SalaRecord, me.fagiolini.cinemapp.db.tables.pojos.Sala, Long> {

    /**
     * Create a new SalaDao without any configuration
     */
    public SalaDao() {
        super(Sala.SALA, me.fagiolini.cinemapp.db.tables.pojos.Sala.class);
    }

    /**
     * Create a new SalaDao with an attached configuration
     */
    public SalaDao(Configuration configuration) {
        super(Sala.SALA, me.fagiolini.cinemapp.db.tables.pojos.Sala.class, configuration);
    }

    @Override
    public Long getId(me.fagiolini.cinemapp.db.tables.pojos.Sala object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<me.fagiolini.cinemapp.db.tables.pojos.Sala> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Sala.SALA.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<me.fagiolini.cinemapp.db.tables.pojos.Sala> fetchById(Long... values) {
        return fetch(Sala.SALA.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public me.fagiolini.cinemapp.db.tables.pojos.Sala fetchOneById(Long value) {
        return fetchOne(Sala.SALA.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<me.fagiolini.cinemapp.db.tables.pojos.Sala> fetchOptionalById(Long value) {
        return fetchOptional(Sala.SALA.ID, value);
    }

    /**
     * Fetch records that have <code>cinema_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<me.fagiolini.cinemapp.db.tables.pojos.Sala> fetchRangeOfCinemaId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Sala.SALA.CINEMA_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>cinema_id IN (values)</code>
     */
    public List<me.fagiolini.cinemapp.db.tables.pojos.Sala> fetchByCinemaId(Long... values) {
        return fetch(Sala.SALA.CINEMA_ID, values);
    }

    /**
     * Fetch records that have <code>capacita BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<me.fagiolini.cinemapp.db.tables.pojos.Sala> fetchRangeOfCapacita(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Sala.SALA.CAPACITA, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>capacita IN (values)</code>
     */
    public List<me.fagiolini.cinemapp.db.tables.pojos.Sala> fetchByCapacita(Integer... values) {
        return fetch(Sala.SALA.CAPACITA, values);
    }

    /**
     * Fetch records that have <code>numero BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<me.fagiolini.cinemapp.db.tables.pojos.Sala> fetchRangeOfNumero(String lowerInclusive, String upperInclusive) {
        return fetchRange(Sala.SALA.NUMERO, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>numero IN (values)</code>
     */
    public List<me.fagiolini.cinemapp.db.tables.pojos.Sala> fetchByNumero(String... values) {
        return fetch(Sala.SALA.NUMERO, values);
    }
}
