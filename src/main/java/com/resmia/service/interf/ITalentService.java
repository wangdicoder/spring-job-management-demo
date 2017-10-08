/**
 * Created by wangdi on 7/10/17.
 */

package com.resmia.service.interf;

import com.resmia.domain.Talent;
import com.resmia.utils.Response;

public interface ITalentService extends IUserService {
    Response createUser(Talent user);
    Response updateUser(Talent user, Long id);
}
