java.sql.PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE name = ?");
statement.setString(1, name);
statement.execute();
connection.commit();