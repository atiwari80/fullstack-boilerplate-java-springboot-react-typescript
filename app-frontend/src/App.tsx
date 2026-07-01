import axios from 'axios';
const apiEndpoint = 'https://example.com/api';

// Changed line
const apiResponse = await axios.get(`${apiEndpoint}/endpoint`);

// Changed line
// Removed insecure protocol
// const responseText = await axios.get(`${apiEndpoint}/endpoint`, { method: 'get' });

console.log(apiResponse);
