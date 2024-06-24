package fr.sciam.workshop.javase.webserver;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class MainWebServer {

  public static void main(String[] args) throws IOException {
  }
}

class PersonnesHandler implements HttpHandler {

  @Override
  public void handle(HttpExchange exchange) throws IOException {
  }
}
