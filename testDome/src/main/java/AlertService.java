import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
interface AlertDAO{
     UUID addAlert(Date time);
     Date getAlert(UUID id);
}
class AlertService {
    private final MapAlertDAO storage = new MapAlertDAO();
    private AlertDAO alertDaoObject;
    public AlertService(AlertDAO alertObject){
        this.alertDaoObject = alertObject;
    }


    public UUID raiseAlert() {
        return this.alertDaoObject.addAlert(new Date());
    }

    public Date getAlertTime(UUID id) {
        return this.alertDaoObject.getAlert(id);
    }
}

class MapAlertDAO implements AlertDAO{
    private final Map<UUID, Date> alerts = new HashMap<UUID, Date>();

    public UUID addAlert(Date time) {
        UUID id = UUID.randomUUID();
        this.alerts.put(id, time);
        return id;
    }

    public Date getAlert(UUID id) {
        return this.alerts.get(id);
    }
}