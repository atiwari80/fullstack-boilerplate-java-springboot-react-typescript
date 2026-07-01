25:     @GetMapping(value = "/search")
26:     @ResponseStatus(HttpStatus.OK)
27:     public String search(@RequestParam String name) {
28:         try (Connection connection = DriverManager.getConnection("jdbc:sqlite:sqlitestorage.db")) {
29:             String query = "SELECT * FROM users WHERE name = ?";
30:             PreparedStatement statement = connection.prepareStatement(query);
31:             statement.setString(1, name);
32:             ResultSet resultSet = statement.executeQuery();
33:             if (resultSet.next()) {
34:                 return "User found: " + resultSet.getString("name");
35:             }
36:             return "No user found";
37:         } catch (Exception ex) {
38:             return "Query failed: " + ex.getMessage();
39:         }
40:    