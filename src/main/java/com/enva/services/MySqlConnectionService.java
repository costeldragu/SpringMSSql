package com.enva.services;

import ch.qos.logback.core.db.DriverManagerConnectionSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Service;

/**
 * MySQL connection service
 * Single ton is processed by the @Autowired annotation
 */
@Service
public class MySqlConnectionService {
    private static Integer instances = 0;
    private static DriverManagerDataSource driverManagerDataSource;
    private static JdbcTemplate jdbcTemplate;
    /**
     * Logger controller
     */
    private static final Logger logger = LoggerFactory.getLogger(MySqlConnectionService.class);

    /**
     * The database url
     */
    @Value("${spring.datasource.url}")
    private String dbUrl;

    /**
     * The username to access the database
     */
    @Value("${spring.datasource.username}")
    private String userName;

    /**
     * The password used for the username
     */
    @Value("${spring.datasource.password}")
    private String password;

    /**
     * The driver used to connect to the database
     */
    @Value("${spring.datasource.driverClassName}")
    private String driverClassName;

    /**
     * Configure data source
     *
     * @return DriverManagerDataSource driverManagerDataSource
     */
    private DriverManagerDataSource getDataSource() {
        if (driverManagerDataSource == null) {
            driverManagerDataSource = new DriverManagerDataSource();
            driverManagerDataSource.setDriverClassName(driverClassName);
            driverManagerDataSource.setUrl(dbUrl);
            driverManagerDataSource.setUsername(userName);
            driverManagerDataSource.setPassword(password);
        }
        return driverManagerDataSource;
    }

    /**
     * Get the JdbcTemplate
     *
     * @return JdbcTemplate jdbcTemplate
     */
    public JdbcTemplate getJdbcTemplate() {
        if (jdbcTemplate == null) {
            jdbcTemplate = new JdbcTemplate(getDataSource());
        }
        return jdbcTemplate;
    }

    @Override
    public String toString() {
        return "MySqlConnectionService{" +
                "dbUrl='" + dbUrl + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", driverClassName='" + driverClassName + '\'' +
                '}';
    }
}
