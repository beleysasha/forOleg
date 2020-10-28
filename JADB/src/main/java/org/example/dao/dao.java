package org.example.dao;

import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import java.sql.SQLException;

public class dao {
    public static void main(String[] args) throws SQLException {
//        SingleConnectionDataSource dataSource =
//                new SingleConnectionDataSource("jdbc:mysql://localhost:3306/lesson?useUnicode=true&serverTimezone=UTC", "Sasha", "Ищщ23652005",
//                        false);
//        Connection connection = dataSource.getConnection();
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery("Select * from users");
//        while (resultSet.next()){
//            System.out.println(resultSet.getString("name"));
//            System.out.println(resultSet.getString("id"));
//
//        resultSet.close();
//        statement.close();
//        connection.close();


//        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//        jdbcTemplate.query("Select * from users",
////                BeanPropertyRowMapper.newInstance(User.class)
//                dao::mapper);
//
//        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);
//        MapSqlParameterSource sqlParameterSource = new MapSqlParameterSource();
//        sqlParameterSource.addValue("name", "sasha");
//        sqlParameterSource.addValue("id","1");
//        System.out.println(template.query
//                ("Select * from users where name = :name and id = :id",sqlParameterSource,
//                        BeanPropertyRowMapper.newInstance(User.class)));
//
//    }
//    private static User mapper(ResultSet rs,int i) throws SQLException {
//        return User.builder().id(rs.getInt("id")).name(rs.getString("name")).build();
//    }
    }
}