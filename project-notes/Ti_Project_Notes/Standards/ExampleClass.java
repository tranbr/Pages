package com.lidp.enterprise.process.module;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lidp.model.admin.persistence.ARAC_AccountingRecord;
import com.lidp.model.admin.persistence.PFTM_MasterArea;
import com.lidp.model.superobj.AbstractTO;
import com.lidp.utilities.util.ADMI_SystemConstants;

public class ExampleClass
{
   /*
    * Declare static variables at the top.
    */
   private final static int ARRAYEX_LENGTH = 5;

   private String stringEx;
   private String stringDateEx;
   private String stringTimeEx;
   private int intEx;
   private char charEx;
   private boolean booleanEx;
   private BigDecimal bigEx;
   private Integer integerEx;
   private String[] stringArrayEx;
   private HashMap<String, String> hashEx;
   private ArrayList<String> arrayListEx;
   private List<String> listEx;
   private AbstractTO abstractEx;
   private ARAC_AccountingRecord aracEx;
   private ArrayList<ARAC_AccountingRecord> arrayArac;

   /*
    * Place an empty line before declaring initObjects at the bottom of the list.
    */
   private boolean initObjects = false;


   /*
    * Two empty lines should be placed before the first method in a class.
    * Additionally, all areas will have a default constructor calling the initialize method.
    */
   public ExampleClass()
   {
      initialize();
   }
   
   /*
    * All areas will have a Single argument initialize constructor. Calls the initialize() method.
    * param boolean controlling the initialization of objects.
    */
   public ExampleClass(boolean param)
   {
      initObjects = param;

      initialize();
   }

   /*
    * All areas will have a copy constructor to utilize during the copy method.
    */
   public ExampleClass(ExampleClass param)
   {
      stringEx = e.getStringEx();
      stringDateEx = e.getStringDateEx();
      stringTimeEx = e.getStringTimeEx();
      intEx = e.getIntEx();
      charEx = e.getCharEx();
      booleanEx = e.getBooleanEx();
      bigEx = e.getBigDecimalEx();
      integerEx = e.getIntegerEx();

      for (int i = 0; i < ARRAYEX_LENGTH; i++)
      {
         stringArrayEx[i] = e.getStringDateEx()[i];
      }

      if (e.getHashEx() != null)
      {
         hashEx = new HashMap<String, String>();

         Iterator it = e.getHashEx().entrySet().iterator();
         while (it.hasNext())
         {
            Map<K, V>.Entry pair = (Map.Entry) it.next();
            hashEx.put(pair.getKey(), pair.getValue());
            it.remove();
         }
      }

      if (e.getArrayListEx() != null)
      {
         arrayListEx = new ArrayList<String>();

         for (String s : e.getArrayListEx())
         {
            arrayListEx.add(s);
         }
      }

      if (e.getListEx() != null)
      {
         listEx = new List<String>();

         for (String s : e.getListEx())
         {
            listEx.add(s);
         }
      }
      
      if (e.getAbstractEx() != null)
      {
         abstractEx = e.getAbstractEx().copy();
      }
      
      if (e.getAracEx() != null)
      {
         aracEx = e.getAracEx().copy();
      }

      if (e.getArrayArac() != null)
      {
         arrayArac = new ArrayList<ARAC_AccountingRecord>();

         for (ARAC_AccounntingRecord a : e.getArrayArac())
         {
            arrayArac.add(a.copy());
         }
      }
   }

   // Getters and
   // setters------------------------------------------------------------------
   arrayListEx

   /*
    * Always use "param" for the parameter in setters.
    */
   public void setStringEx(String param)
   {
      stringEx = param;
   }

   public String getStringEx()
   {
      return stringEx;
   }

   public void setStringDateEx(String param)
   {
      stringDateEx = param;
   }

   public String getStringDateEx()
   {
      return stringDateEx;
   }

   public void setStringTimeEx(String param)
   {
      stringTimeEx = param;
   }

   public String getStringTimeEx()
   {
      return stringTimeEx;
   }

   public void setIntEx(int param)
   {
      intEx = param;
   }

   public int getIntEx()
   {
      return intEx;
   }

   public void setCharEx(char param)
   {
      charEx = param;
   }

   public char getCharEx()arrayListEx
   {
      return charEx;
   }

   public void setBooleanEx(boolean param)
   {
      booleanEx = param;
   }

   public boolean getBooleanEx()
   {
      return booleanEx;
   }

   public void setBigDecimlaEx(BigDecimal param)
   {
      /*
       * Set the scale and rounding mode in BigDecimal setters like this:
       */
      bigEx = param.setScale(2, 1);
   }

   public BigDecimal getBigDecimalEx()
   {
      return bigEx;
   }

   public void setIntegerEx(Integer param)
   {
      integerEx = param;
   }

   public Integer getIntegerEx()
   {
      return integerEx;
   }

   public void setStringArrayEx(String[] param)
   {
      stringArrayEx = param;
   }

   public String[] getStringArrayEx()
   {
      return stringArrayEx;
   }

   public void setHashEx(HashMap<String, String> param)
   {
      hashEx = param;
   }

   public HashMap<String, String> getHashEx()
   {
      return hashEx;
   }

   public void setArrayListEx(ArrayList<String> param)
   {
      arrayListEx = param;
   }

   public ArrayList<String> getArrayListEx()
   {
      return arrayListEx;
   }

   public void setListEx(List<String> param)
   {
      listEx = param;
   }

   public List<String> getListEx()
   {
      return listEx;
   }

   public void setAbstractEx(AbstractTO param)
   {
      abstractEx = param;
   }

   public AbstractTO getAbstractEx()
   {
      return abstractEx;
   }

   public void setAracEx(ARAC_AccountingRecord param)
   {
      aracEx = param;
   }

   public ARAC_AccountingRecord getAracEx()
   {
      return aracEx;
   }

   // -------------------------------------------------------------------------------------

   /*
    * All areas will contain a copy method in which an instance of the area is
    * created and all fields are manually entered into the new instance
    */
   public ExampleClass copy()
   {
      return new ExampleClass(this);
   }

   /*
    * All areas will contain an initialize method to reset all area values to
    * default. This method will be called from the default constructor
    */
   public void initialize()
   {
      if (initObjects)
      {
         /*
          * Include "Initialize Objects here..." comment, and initialize all objects here.
          */

         // Initialize Objects here...
         aracEx = new ARAC_AccountingRecord();
         arrayArac = new ArrayList<ARAC_AccountingRecord>();
      }
      else
      {
        /*
         * Set objects to null here. Also set initObjects to "true".
         */
         initObjects = true;
         aracEx = null;
         arrayArac = null;

         aracEx = new ARAC_AccountingRecord();
      }

      /*
       * Always include an empty line after a close bracket.
       */
      stringEx = "";

      /*
       * All dates and times are instantiated using ADMI_SystemConstants, DATE_ZEROES and TIME_ZEROES are default.
       */
      stringDateEx = ADMI_SystemConstants.DATE_ZEROES;
      stringTimeEx = ADMI_SystemConstants.TIME_ZEROES;
      intEx = 0;

      /*
       * Characters are instantiated using a space ' '.
       */
      charEx = ' ';
      booleanEx = false;

      /*
       * In the initalize method, BigDecimals are initialized without a rounding mode.
       */
      bigEx = BigDecimal.ZERO.setScale(2);
      integerEx = new Integer(0);
      
      stringArrayEx = new String[ARRAYEX_LENGTH];

      for (int i = 0; i < ARRAYEX_LENGTH; i++)
      {
         stringArrayEx[i] = "";
      }

      hashEx = new HashMap<String, String>();
      arrayListEx = new ArrayList<String>();
      listEx = new ArrayList<String>();
      abstractEx = null;
   }
}