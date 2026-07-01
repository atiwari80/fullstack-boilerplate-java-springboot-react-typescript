1: String query = "SELECT * FROM users WHERE name = ?\n";
2: try (Connection connection = DriverManager.getConnection("jdbc:sqlite:sqlitestorage.db")) {\n    PreparedStatement statement = connection.prepareStatement(query);
3:     statement.setString(1, name);
4:     statement.execute();\n}
