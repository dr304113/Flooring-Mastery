/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.dao;

import com.sg.flooringmastery.dto.Tax;
import java.util.List;

/**
 *
 * @author dr304
 */
public interface TaxDao {

    public List<Tax> getAllTaxes() throws FlooringPersistenceException;

    public Tax getTax(String stateAbbreviation) throws FlooringPersistenceException;

}
