package it.morfoza;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Wojt on 2016-08-25.
 */

@Component
public class DataBasePhilosopherRepository implements PhilosopherRepository {

    private JdbcTemplate jdbcTemplate;

    public DataBasePhilosopherRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Philosopher getByName(String philosopherName) {


                return jdbcTemplate.queryForObject("SELECT name, health, rhetorics, brainPower, conceit, wellBeing, musclePower, dumbfounded, level FROM philosophy WHERE name = ?", new PhilosopherRowMapper(),philosopherName );
            }



    @Override
    public List<Philosopher> getAllPhilosophers() {
        return jdbcTemplate.query("SELECT name, health, rhetorics, brainPower, conceit, wellBeing, musclePower, dumbfounded, level FROM philosophy", new PhilosopherRowMapper() );
    }
}
