// Changed query to use a prepared statement
String query = "SELECT * FROM users WHERE name = ?";

try (Connection connection = DriverManager.getConnection("jdbc:sqlite:sqlitestorage.db")) {
	try (PreparedStatement statement = connection.prepareStatement(query)) {
		statement.setString(1, name);
		try (ResultSet resultSet = statement.executeQuery()) {
			// Process the result set as needed
		}
	}
} catch (SQLException e) {
	// Handle the SQL exception as needed
}
return "pong";