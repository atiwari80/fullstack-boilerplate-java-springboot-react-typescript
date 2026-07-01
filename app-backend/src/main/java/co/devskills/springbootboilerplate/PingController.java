String query = "SELECT * FROM users WHERE name = ?\n";
try (Connection connection = DriverManager.getConnection("jdbc:sqlite:sqlitestorage.db")) {\n    PreparedStatement statement = connection.prepareStatement(query);
    statement.setString(1, name);
    statement.execute();\n}