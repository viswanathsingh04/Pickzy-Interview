package plus.demo.com.pickzy_interview.Inter;

import plus.demo.com.pickzy_interview.Bean.Main;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by VPS on 04-01-2018.
 */

public interface ApiInterface {
    @GET("interview_pickzy/interview.json")
    Call<Main> GetPickzy();
}
