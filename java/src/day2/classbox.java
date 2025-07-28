package day2;
class classbox {
	 double width, height, depth;

	 
	 classbox(double w, double h, double d) {
	     width = w;
	     height = h;
	     depth = d;
	 }
	 double getVolume() {
	     return width * height * depth;
	 }

	 
	 public static void main(String[] args) {
	     classbox myclassbox = new classbox(5.0, 3.0, 2.0);

	     System.out.println("Volume of the box is: " + myclassbox.getVolume());
	 }
}
