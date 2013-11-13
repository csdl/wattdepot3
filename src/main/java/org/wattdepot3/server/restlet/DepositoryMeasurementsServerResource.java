/**
 * DepositoryMeasurementsServerResource.java created on Oct 18, 2013 by Cam Moore.
 */
package org.wattdepot3.server.restlet;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import javax.xml.datatype.DatatypeConfigurationException;

import org.restlet.data.Status;
import org.restlet.resource.ResourceException;
import org.wattdepot3.datamodel.Depository;
import org.wattdepot3.datamodel.Measurement;
import org.wattdepot3.datamodel.Sensor;
import org.wattdepot3.exception.MissMatchedOwnerException;
import org.wattdepot3.restlet.DepositoryMeasurementsResource;
import org.wattdepot3.util.DateConvert;

/**
 * DepositoryMeasurementsServerResource - Handles the Depository measurements
 * HTTP API ("/wattdepot/{group_id}/depository/{depository_id}/measurements/").
 * 
 * @author Cam Moore
 * 
 */
public class DepositoryMeasurementsServerResource extends WattDepotServerResource implements
    DepositoryMeasurementsResource {
  private String depositoryId;
  private String sensorId;
  private String start;
  private String end;

  /*
   * (non-Javadoc)
   * 
   * @see org.restlet.resource.Resource#doInit()
   */
  @Override
  protected void doInit() throws ResourceException {
    super.doInit();
    this.sensorId = getQuery().getValues("sensor");
    this.start = getQuery().getValues("start");
    this.end = getQuery().getValues("end");
    this.depositoryId = getAttribute("depository_id");
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.wattdepot3.restlet.DepositoryMeasurementsResource#retrieve()
   */
  @Override
  public ArrayList<Measurement> retrieve() {
    System.out.println("GET /wattdepot/{" + groupId + "}/depository/{" + depositoryId
        + "}/measurements/?sensor={" + sensorId + "}&start={" + start + "}&end={" + end + "}");
    if (start != null && end != null) {
    ArrayList<Measurement> ret = new ArrayList<Measurement>();
    try {
      Depository depository = depot.getWattDeposiory(depositoryId, groupId);
      Sensor sensor = depot.getSensor(sensorId, groupId);
      Date startDate = DateConvert.parseCalStringToDate(start);
      Date endDate = DateConvert.parseCalStringToDate(end);
      for (Measurement meas : depository.getMeasurements(sensor, startDate, endDate)) {
        ret.add(meas);
      }
    }
    catch (MissMatchedOwnerException e) {
      setStatus(Status.CLIENT_ERROR_CONFLICT, e.getMessage());
    }
    catch (ParseException e) {
      setStatus(Status.CLIENT_ERROR_BAD_REQUEST, e.getMessage());
    }
    catch (DatatypeConfigurationException e) {
      setStatus(Status.SERVER_ERROR_INTERNAL, e.getMessage());
    }
    return ret;
    }
    else {
      setStatus(Status.CLIENT_ERROR_BAD_REQUEST, "Missing start and/or end times.");
      return null;
    }
  }

}
