public class TimeInterval {
    public int start;
    public int end;

    public boolean overlapsWith(TimeInterval interval) {
        if (this.start < interval.end && this.start > interval.start) {
            return true;
        }
        else if(interval.start > this.start && interval.end < this.end) {
            return true;
        }
        else{
            return false;
        }
    }
}