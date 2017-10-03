package sorting;

public class RectanglesL {

	public static void main(String[] args) {
		Rectangle l1=new Rectangle(1,5,10,4);
		Rectangle l2=new Rectangle(20,6,4,5);
		//Rectangle l2=new Rectangle(1,6,4,5);
		
		RangeXY rangeL1=Range(l1);
		RangeXY rangeL2=Range(l2);
		Rectangle newRec=intersection(rangeL1,rangeL2);
		if(newRec.width==0 || newRec.height==0)
			System.out.println("Rectangular does not exits");
		else
		    System.out.println("Rectangular does exits details are as below\n"+toString(newRec));
	}


	private static String toString(Rectangle newRec) {
		return "my_rectangle = {\nleft_x: "+newRec.left_x+",\nbottom_y: "+newRec.bottom_y+",\nwidth: "+newRec.width+",\nheight: "+newRec.height+",\n}";
	}


	private static Rectangle intersection(RangeXY rangeL1, RangeXY rangeL2) {

		Rectangle newRec=new Rectangle();
		if(rangeL1.x_start==rangeL2.x_start){
			newRec.left_x=rangeL1.x_start;
			if(rangeL1.y_start>rangeL2.y_start){
				newRec.bottom_y=rangeL1.y_start;
				newRec.width=rangeL1.x_end-rangeL1.x_start;
				newRec.height=(rangeL2.y_end-rangeL2.y_start)-(newRec.bottom_y-rangeL2.y_start);
			}
			else{
				newRec.bottom_y=rangeL2.y_start;
				newRec.width=rangeL2.x_end-rangeL2.x_start;
				newRec.height=(rangeL1.y_end-rangeL1.y_start)-(newRec.bottom_y-rangeL1.y_start);
			}
		}
		else{
		if(rangeL2.x_start>rangeL1.x_start && rangeL2.x_start<rangeL1.x_end){
			newRec.left_x=rangeL2.x_start;
			newRec.bottom_y=rangeL2.y_start;
			if(rangeL1.x_start>rangeL2.x_start && rangeL1.x_start<rangeL2.x_end){
				newRec.width=rangeL1.x_start-newRec.left_x;
				newRec.height=rangeL1.y_end-newRec.bottom_y;
			}
			else if(rangeL1.x_end>rangeL2.x_start && rangeL1.x_end<rangeL2.x_end){
				newRec.width=rangeL1.x_end-newRec.left_x;
				newRec.height=rangeL1.y_end-newRec.bottom_y;
			}
		}
		else if(rangeL2.x_end>rangeL1.x_start && rangeL2.x_end<rangeL1.x_end){
			newRec.left_x=rangeL1.x_end;
			newRec.bottom_y=rangeL2.y_end;
			if(rangeL1.x_start>rangeL2.x_start && rangeL1.x_start<rangeL2.x_end){
				newRec.width=rangeL1.x_start-newRec.left_x;
				newRec.height=rangeL1.y_end-newRec.bottom_y;
			}
			else if(rangeL1.x_end>rangeL2.x_start && rangeL1.x_end<rangeL2.x_end){
				newRec.width=rangeL1.x_end-newRec.left_x;
				newRec.height=rangeL1.y_end-newRec.bottom_y;
			}
		}
		}
		return newRec;
	}


	private static RangeXY Range(Rectangle l) {
		RangeXY rangeXY=new RangeXY(l.left_x,l.left_x+l.width,l.bottom_y,l.bottom_y+l.height);
		return rangeXY;
	}
}
class RangeXY{
	int x_start;
	int x_end;
	int y_start;
	int y_end;
	public RangeXY(){}
	public RangeXY(int x_start,int x_end,int y_start,int y_end)
	{
		this.x_start=x_start;
		this.x_end=x_end;
		this.y_start=y_start;
		this.y_end=y_end;
	}
}
class Rectangle{
	// coordinates of bottom-left corner
	    int left_x;
	    int bottom_y;

	    // width and height
	    int width;
	    int height;
	    public Rectangle(){}
	    public Rectangle(int left_x, int bottom_y, int width, int height) {
	    	this.left_x=left_x;
	    	this.bottom_y=bottom_y;
	    	this.width=width;
	    	this.height=height;
		}
}
