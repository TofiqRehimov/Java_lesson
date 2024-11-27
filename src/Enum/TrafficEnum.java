package Enum;

    enum TrafficEnum {
        RED ("Dayan"),
        YELLOW ("Hazirlas"),
        GREEN ("Get");


        private final  String TrafficLight;

        TrafficEnum(String trafficLight) {
            TrafficLight = trafficLight;
        }

        public String getTrafficLight() {
            return TrafficLight;
        }
}
