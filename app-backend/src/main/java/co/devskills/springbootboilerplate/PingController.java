String query = "SELECT * FROM users WHERE name = ? AND email = ?"; // replace this line
// String query = "SELECT * FROM users WHERE name = "+name+" AND email = "+email; // Do NOT use this line
// Replace with this: // connection.prepareStatement() is used to prevent SQL injection
