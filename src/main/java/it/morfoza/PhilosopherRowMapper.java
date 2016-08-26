package it.morfoza;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Wojt on 2016-08-25.
 */
public class PhilosopherRowMapper implements RowMapper<Philosopher> {

    @Override
    public Philosopher mapRow(ResultSet resultSet, int i) throws SQLException {
        String name = resultSet.getString("name");
        int health = resultSet.getInt("health");
        int brainPower = resultSet.getInt("brainPower");
        int conceit = resultSet.getInt("conceit");
        int rhetorics = resultSet.getInt("rhetorics");
        int wellBeing = resultSet.getInt("wellBeing");
        int musclePower = resultSet.getInt("musclePower");
        boolean dumbfounded = resultSet.getBoolean("dumbfounded");
        int level = resultSet.getInt("level");

Philosopher philosopher = new PhilosopherImpl(name, health,brainPower, conceit, rhetorics, wellBeing, musclePower, dumbfounded, level);
         return philosopher;

    }
}
