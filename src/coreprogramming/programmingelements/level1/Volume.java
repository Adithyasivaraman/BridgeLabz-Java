class Volume{
    public static void main(String[] args) {
        double radiusKm = 6378;
        double radiusM = radiusKm/1.6;
        long volumeKm = Math.round((4/3)*(22/7)*Math.pow(radiusKm,3));
        long volumeM = Math.round((4/3)*(22/7)*Math.pow(radiusM,3));
        System.out.println("The volume of earth in cubic kilometers is "+volumeKm+" and cubic miles is "+volumeM);
    }
}