This is not possible without modifying the API server. If you have access to it, you can enable https support and proxy the request to it over SSL.

15:     void fetch('https://127.0.0.1:8080/ping').catch(() => undefined);