package com.thoughtworks.capability.gtb.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;

import java.io.IOException;
import java.util.Date;

public class DateSerializer extends StdScalarSerializer<Date> {
    public DateSerializer() {
        super(Date.class);
    }

    @Override
    public void serialize(Date time, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeNumber(time.getTime());
    }
}
