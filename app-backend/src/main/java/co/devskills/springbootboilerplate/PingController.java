@GetMapping(value = "/search")
@ResponseStatus(HttpStatus.OK)
public String search(@RequestParam String name) {
 String query = "SELECT * FROM users WHERE name = ?";
 try (Connection connection = DriverManager.getConnection("jdbc:sqlite:sqlitestorage.db")) {
 try (PreparedStatement statement = connection.prepareStatement(query)) {
 statement.setString(1, name);
 try (ResultSet resultSet = statement.executeQuery()) {
 if (resultSet.next()) {
 return "User found: " + resultSet.getString("name");
 }
 }
 }
 }
 return "No user found";
}
