package com.bofa.mongoidstratergy;

import java.util.Date;

import org.apache.kafka.connect.sink.SinkRecord;
import org.bson.BsonObjectId;
import org.bson.BsonValue;
import org.bson.types.ObjectId;

import com.mongodb.kafka.connect.sink.converter.SinkDocument;
import com.mongodb.kafka.connect.sink.processor.id.strategy.IdStrategy;

public class PaymentOidStrategy implements IdStrategy {

	PaymentOidStrategy() {

	}

	@Override
	public BsonValue generateId(SinkDocument doc, SinkRecord orig) {
		// TODO Auto-generated method stub
		// return new BsonObjectId(orig.key().toString());
		return new BsonObjectId(new ObjectId(new Date(), Integer.parseInt(orig.key().toString())));

	}

}
