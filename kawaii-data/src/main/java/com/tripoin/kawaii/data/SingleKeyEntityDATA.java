package com.tripoin.kawaii.data;

/**
 * created on 9/29/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 *
 * interface dengan primary key 1 object(object key sebaiknya tipe primitif)
 *
 * @param <KEY>
 *
 */
public interface SingleKeyEntityDATA<KEY> {

    /**
     * primary key dari data
     *
     * @return ID data
     */
    public KEY getId();

    /**
     *
     *
     * @param id ID data
     */
    public void setId(KEY id);
}
