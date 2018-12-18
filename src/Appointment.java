public class Appointment
{
    public boolean conflictsWith(Appointment other)
    {
        return getTime().overlapsWith(other.getTime());
    }
    public TimeInterval getTime() {
        return null;
    }
    public boolean overlapsWith(TimeInterval interval) {
        return false;
    }

}
