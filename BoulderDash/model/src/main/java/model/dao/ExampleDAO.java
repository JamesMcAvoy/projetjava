package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Example;

/**
 * <h1>The Class ExampleDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class ExampleDAO extends AbstractDAO {

    /** The sql example by id. */
    private static String sqlLevelById   = "{call  selectlevel(?)}";

    /**
     * Gets the level by id.
     *
     * @param id
     *            the id
     * @return the String of the level
     * @throws SQLException
     *             the SQL exception
     */
    public static String getLevelById(final int id) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlLevelById);
        callStatement.setInt(1, id);
        String str = "";
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                str =  result.getString("stringlevel");
            }
            result.close();
        }
        return str;
    }
}
