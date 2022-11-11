package com.techprimers.grpc.service;

import com.techprimers.grpc.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {
    @Override
    public void greeting(GreetingRequest request, StreamObserver<GreetingResponse> responseObserver) {
        String message = request.getMessage();

        int num=Integer.parseInt(message);
        StringBuffer sf=new StringBuffer();
        for(int i=1;i<10;i++) {
            sf.append(num + "* " + i + " =" + num * i);
         }


        GreetingResponse greetingResponse = GreetingResponse.newBuilder()
                .setMessage(sf.toString())
                .build();

        responseObserver.onNext(greetingResponse);
        responseObserver.onCompleted();
    }
}
