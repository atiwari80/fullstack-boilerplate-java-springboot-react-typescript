
		try (PreparedStatement ps = connection.prepareStatement("SELECT 'Hello, ' || ? || ' from ' || ? || ' on ' || ?")){
					  ps.setString(1, message);
					  ps.setString(2, principal.getName());
  ps.setDate(3, java.sql.Date.valueOf(date));
				  return ps.executeQuery().toString();
		}