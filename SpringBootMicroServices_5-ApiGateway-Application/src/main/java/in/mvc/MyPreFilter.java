package in.mvc;

//import java.lang.System.Logger;
import org.slf4j.Logger;
import java.util.List;
import java.util.Set;

import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;


@Component
public class MyPreFilter implements GlobalFilter{

	
	Logger logger =LoggerFactory.getLogger(MyPreFilter.class);
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		logger.info("filer() method executed.....");
		
		//Access request information
//		ServerHttpRequest request = (ServerHttpRequest) exchange.getRequest();
		org.springframework.http.server.reactive.ServerHttpRequest request = exchange.getRequest();
		HttpHeaders headers = request.getHeaders();
		Set<String> keySet = headers.keySet();
		keySet.forEach(key -> {
			List<String> value = headers.get(key);
			System.out.println(key + " :: " + value);
		});
		return chain.filter(exchange);
	}
	
	

	
}
