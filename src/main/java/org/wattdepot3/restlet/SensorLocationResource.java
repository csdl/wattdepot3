/**
 * LocationResource.java created on Oct 16, 2013 by Cam Moore.
 */
package org.wattdepot3.restlet;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Put;
import org.wattdepot3.datamodel.SensorLocation;

/**
 * LocationResource - HTTP Interface for data model Location.
 * 
 * @author Cam Moore
 * 
 */
public interface SensorLocationResource {

  /**
   * Defines GET /wattdepot/{group_id}/location/{location_id} API call.
   * 
   * @return The Location with the given id. The id is sent in the request.
   */
  @Get("json") // Use JSON as transport encoding.
  public SensorLocation retrieve();

  /**
   * Defines the PUT /wattdepot/{group_id}/location/ API call.
   * 
   * @param sensorLocation
   *          The Location to store.
   */
  @Put("json")
  public void store(SensorLocation sensorLocation);

  /**
   * Defined the DEL /wattdepot/{group_id}/location/{location_id} API call. The id is sent
   * in the request.
   */
  @Delete
  public void remove();

}
