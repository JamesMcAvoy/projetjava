package model;

import java.sql.SQLException;
import java.util.List;

import model.dao.BoulderDashDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ModelFacade implements IModel {

    /**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
        super();
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleById(int)
     */
    @Override
    public String getLevelById(final int id) throws SQLException {
        return BoulderDashDAO.getLevelById(id);
    }

}
