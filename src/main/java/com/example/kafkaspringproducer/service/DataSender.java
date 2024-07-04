package com.example.kafkaspringproducer.service;

import com.example.kafkaspringproducer.model.StringValue;

public interface DataSender {
    void send(StringValue value);
}
