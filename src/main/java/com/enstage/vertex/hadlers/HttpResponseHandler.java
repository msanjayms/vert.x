package com.enstage.vertex.hadlers;

import io.vertx.core.Handler;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;

public class HttpResponseHandler implements Handler<HttpServerRequest> {

	@Override
	public void handle(HttpServerRequest request) {

		System.out.println("incoming request!");
		HttpServerResponse response = request.response();
		response.setStatusCode(200);
		response.headers().add("Content-Length", String.valueOf(57)).add("Content-Type", "text/html");
		response.write("Vert.x is alive!");
		response.end("<h1>Hello from my first Vert.x application</h1>");

	}

}
