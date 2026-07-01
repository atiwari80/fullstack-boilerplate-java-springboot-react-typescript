String query = "SELECT * FROM users WHERE name = ?";
java.sql.Connection connection = 
druid.Connection.getConnection();
java.sql.PreparedStatement statement = connection.prepareStatement(query);
statement.setString(1, name);
statement.execute();
connection.commit();
