package com.enstage.vertex.verticles;

import com.enstage.vertex.hadlers.HttpResponseHandler;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.http.HttpServer;

public class HttpServerVerticle extends AbstractVerticle {

	@Override
	public void start(Future<Void> fut) throws Exception {
		HttpServer httpServer = vertx.createHttpServer();
		httpServer.requestHandler(new HttpResponseHandler());
		httpServer.listen(9999);
	}
}
