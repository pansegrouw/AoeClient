
package au.com.alliedexpress.neptune.ttws_ejb;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import au.com.alliedexpress.neptune.ttws_ejb.types.Account;
import au.com.alliedexpress.neptune.ttws_ejb.types.Client;
import au.com.alliedexpress.neptune.ttws_ejb.types.Job;
import au.com.alliedexpress.neptune.ttws_ejb.types.JobExt;
import au.com.alliedexpress.neptune.ttws_ejb.types.JobIds;
import au.com.alliedexpress.neptune.ttws_ejb.types.JobPrice;
import au.com.alliedexpress.neptune.ttws_ejb.types.Note;
import au.com.alliedexpress.neptune.ttws_ejb.types.arrays.au.com.alliedexpress.ai.webservice.JobArray;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TTWS", targetNamespace = "http://neptune.alliedexpress.com.au/ttws-ejb")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    au.com.alliedexpress.neptune.ttws_ejb.types.ObjectFactory.class,
    au.com.alliedexpress.neptune.ttws_ejb.types.arrays.au.com.alliedexpress.ai.webservice.ObjectFactory.class
})
public interface TTWS {


    /**
     * 
     * @param job2
     * @param string1
     * @return
     *     returns au.com.alliedexpress.neptune.ttws_ejb.types.Job
     */
    @WebMethod
    @WebResult(name = "result", partName = "result")
    public Job bookLocalCourierJob(
        @WebParam(name = "String_1", partName = "String_1")
        String string1,
        @WebParam(name = "Job_2", partName = "Job_2")
        Job job2);

    /**
     * 
     * @param job2
     * @param string1
     * @return
     *     returns au.com.alliedexpress.neptune.ttws_ejb.types.JobPrice
     */
    @WebMethod
    @WebResult(name = "result", partName = "result")
    public JobPrice calculatePrice(
        @WebParam(name = "String_1", partName = "String_1")
        String string1,
        @WebParam(name = "Job_2", partName = "Job_2")
        Job job2);

    /**
     * 
     * @param int2
     * @param string3
     * @param string4
     * @param string1
     */
    @WebMethod
    public void cancelJob(
        @WebParam(name = "String_1", partName = "String_1")
        String string1,
        @WebParam(name = "int_2", partName = "int_2")
        int int2,
        @WebParam(name = "String_3", partName = "String_3")
        String string3,
        @WebParam(name = "String_4", partName = "String_4")
        String string4);

    /**
     * 
     * @param int2
     * @param string1
     */
    @WebMethod
    public void cancelPendingJob(
        @WebParam(name = "String_1", partName = "String_1")
        String string1,
        @WebParam(name = "int_2", partName = "int_2")
        int int2);

    /**
     * 
     * @param jobIds2
     * @param string1
     */
    @WebMethod
    public void chargeJobs(
        @WebParam(name = "String_1", partName = "String_1")
        String string1,
        @WebParam(name = "JobIds_2", partName = "JobIds_2")
        JobIds jobIds2);

    /**
     * 
     * @param jobIds2
     * @param string1
     * @return
     *     returns au.com.alliedexpress.neptune.ttws_ejb.types.arrays.au.com.alliedexpress.ai.webservice.JobArray
     */
    @WebMethod
    @WebResult(name = "result", partName = "result")
    public JobArray dispatchPendingJobs(
        @WebParam(name = "String_1", partName = "String_1")
        String string1,
        @WebParam(name = "JobIds_2", partName = "JobIds_2")
        JobIds jobIds2);

    /**
     * 
     * @param job2
     * @param int3
     * @param string1
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(name = "result", partName = "result")
    public byte[] generateLabel(
        @WebParam(name = "String_1", partName = "String_1")
        String string1,
        @WebParam(name = "Job_2", partName = "Job_2")
        Job job2,
        @WebParam(name = "int_3", partName = "int_3")
        int int3);

    /**
     * 
     * @param string3
     * @param string4
     * @param string1
     * @param string2
     * @return
     *     returns au.com.alliedexpress.neptune.ttws_ejb.types.Account
     */
    @WebMethod
    @WebResult(name = "result", partName = "result")
    public Account getAccountDefaults(
        @WebParam(name = "String_1", partName = "String_1")
        String string1,
        @WebParam(name = "String_2", partName = "String_2")
        String string2,
        @WebParam(name = "String_3", partName = "String_3")
        String string3,
        @WebParam(name = "String_4", partName = "String_4")
        String string4);

    /**
     * 
     * @param string1
     * @param account2
     * @return
     *     returns au.com.alliedexpress.neptune.ttws_ejb.types.arrays.au.com.alliedexpress.ai.webservice.JobArray
     */
    @WebMethod
    @WebResult(name = "result", partName = "result")
    public JobArray getChargedJobs(
        @WebParam(name = "String_1", partName = "String_1")
        String string1,
        @WebParam(name = "Account_2", partName = "Account_2")
        Account account2);

    /**
     * 
     * @param string1
     * @param account2
     * @return
     *     returns au.com.alliedexpress.neptune.ttws_ejb.types.arrays.au.com.alliedexpress.ai.webservice.JobArray
     */
    @WebMethod
    @WebResult(name = "result", partName = "result")
    public JobArray getDispatchedJobs(
        @WebParam(name = "String_1", partName = "String_1")
        String string1,
        @WebParam(name = "Account_2", partName = "Account_2")
        Account account2);

    /**
     * 
     * @param string5
     * @param string3
     * @param string4
     * @param string1
     * @param string2
     * @return
     *     returns au.com.alliedexpress.neptune.ttws_ejb.types.arrays.au.com.alliedexpress.ai.webservice.JobArray
     */
    @WebMethod
    @WebResult(name = "result", partName = "result")
    public JobArray getIntranetJobs(
        @WebParam(name = "String_1", partName = "String_1")
        String string1,
        @WebParam(name = "String_2", partName = "String_2")
        String string2,
        @WebParam(name = "String_3", partName = "String_3")
        String string3,
        @WebParam(name = "String_4", partName = "String_4")
        String string4,
        @WebParam(name = "String_5", partName = "String_5")
        String string5);

    /**
     * 
     * @param string3
     * @param string4
     * @param string1
     * @param string2
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "result", partName = "result")
    public String getJobAsXML(
        @WebParam(name = "String_1", partName = "String_1")
        String string1,
        @WebParam(name = "String_2", partName = "String_2")
        String string2,
        @WebParam(name = "String_3", partName = "String_3")
        String string3,
        @WebParam(name = "String_4", partName = "String_4")
        String string4);

    /**
     * 
     * @param string5
     * @param string3
     * @param string4
     * @param string1
     * @param string2
     * @return
     *     returns au.com.alliedexpress.neptune.ttws_ejb.types.Job
     */
    @WebMethod
    @WebResult(name = "result", partName = "result")
    public Job getJobDetails(
        @WebParam(name = "String_1", partName = "String_1")
        String string1,
        @WebParam(name = "String_2", partName = "String_2")
        String string2,
        @WebParam(name = "String_3", partName = "String_3")
        String string3,
        @WebParam(name = "String_4", partName = "String_4")
        String string4,
        @WebParam(name = "String_5", partName = "String_5")
        String string5);

    /**
     * 
     * @param string5
     * @param string3
     * @param string4
     * @param string1
     * @param int6
     * @param string2
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(name = "result", partName = "result")
    public byte[] getLabel(
        @WebParam(name = "String_1", partName = "String_1")
        String string1,
        @WebParam(name = "String_2", partName = "String_2")
        String string2,
        @WebParam(name = "String_3", partName = "String_3")
        String string3,
        @WebParam(name = "String_4", partName = "String_4")
        String string4,
        @WebParam(name = "String_5", partName = "String_5")
        String string5,
        @WebParam(name = "int_6", partName = "int_6")
        int int6);

    /**
     * 
     * @param string3
     * @param string4
     * @param string1
     * @param string2
     * @return
     *     returns au.com.alliedexpress.neptune.ttws_ejb.types.Account
     */
    @WebMethod
    @WebResult(name = "result", partName = "result")
    public Account getLocalCourierAccountDefaults(
        @WebParam(name = "String_1", partName = "String_1")
        String string1,
        @WebParam(name = "String_2", partName = "String_2")
        String string2,
        @WebParam(name = "String_3", partName = "String_3")
        String string3,
        @WebParam(name = "String_4", partName = "String_4")
        String string4);

    /**
     * 
     * @param int2
     * @param string5
     * @param string3
     * @param string4
     * @param string1
     * @return
     *     returns au.com.alliedexpress.neptune.ttws_ejb.types.Job
     */
    @WebMethod
    @WebResult(name = "result", partName = "result")
    public Job getLocalCourierJobDetails(
        @WebParam(name = "String_1", partName = "String_1")
        String string1,
        @WebParam(name = "int_2", partName = "int_2")
        int int2,
        @WebParam(name = "String_3", partName = "String_3")
        String string3,
        @WebParam(name = "String_4", partName = "String_4")
        String string4,
        @WebParam(name = "String_5", partName = "String_5")
        String string5);

    /**
     * 
     * @param string1
     * @param account2
     * @return
     *     returns au.com.alliedexpress.neptune.ttws_ejb.types.arrays.au.com.alliedexpress.ai.webservice.JobArray
     */
    @WebMethod
    @WebResult(name = "result", partName = "result")
    public JobArray getPendingJobs(
        @WebParam(name = "String_1", partName = "String_1")
        String string1,
        @WebParam(name = "Account_2", partName = "Account_2")
        Account account2);

    /**
     * 
     * @param jobIds2
     * @param string1
     */
    @WebMethod
    public void hideJobs(
        @WebParam(name = "String_1", partName = "String_1")
        String string1,
        @WebParam(name = "JobIds_2", partName = "JobIds_2")
        JobIds jobIds2);

    /**
     * 
     * @param job2
     * @param string1
     * @return
     *     returns au.com.alliedexpress.neptune.ttws_ejb.types.Job
     */
    @WebMethod
    @WebResult(name = "result", partName = "result")
    public Job quoteLocalCourierJob(
        @WebParam(name = "String_1", partName = "String_1")
        String string1,
        @WebParam(name = "Job_2", partName = "Job_2")
        Job job2);

    /**
     * 
     * @param job2
     * @param string1
     */
    @WebMethod
    public void savePendingJob(
        @WebParam(name = "String_1", partName = "String_1")
        String string1,
        @WebParam(name = "Job_2", partName = "Job_2")
        Job job2);

    /**
     * 
     * @param note2
     * @param string1
     */
    @WebMethod
    public void setNote(
        @WebParam(name = "String_1", partName = "String_1")
        String string1,
        @WebParam(name = "Note_2", partName = "Note_2")
        Note note2);

    /**
     * 
     * @param job2
     * @param string1
     * @return
     *     returns au.com.alliedexpress.neptune.ttws_ejb.types.Job
     */
    @WebMethod
    @WebResult(name = "result", partName = "result")
    public Job validateBooking(
        @WebParam(name = "String_1", partName = "String_1")
        String string1,
        @WebParam(name = "Job_2", partName = "Job_2")
        Job job2);

    /**
     * 
     * @param string1
     * @param jobExt2
     * @return
     *     returns au.com.alliedexpress.neptune.ttws_ejb.types.JobExt
     */
    @WebMethod
    @WebResult(name = "result", partName = "result")
    public JobExt validateBookingExt(
        @WebParam(name = "String_1", partName = "String_1")
        String string1,
        @WebParam(name = "JobExt_2", partName = "JobExt_2")
        JobExt jobExt2);

    /**
     * 
     * @param string1
     * @return
     *     returns au.com.alliedexpress.neptune.ttws_ejb.types.Client
     */
    @WebMethod
    @WebResult(name = "result", partName = "result")
    public Client validateClient(
        @WebParam(name = "String_1", partName = "String_1")
        String string1);

}
