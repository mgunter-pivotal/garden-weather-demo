FROM maven:3.6.0-jdk-11-slim
WORKDIR /app


# RUN mvn dependency:resolve

# RUN mkdir -p /app/target

# RUN install ping

ENV JVM_OPTS "-XX:+UseCGroupMemoryLimitForHeap -XX:MaxRAMFraction=1"
# RUN mvn install
# RUN mvn compile
CMD ["sleep", "100"]

# EXPOSE 9091
