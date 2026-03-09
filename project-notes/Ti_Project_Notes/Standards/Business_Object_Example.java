/*******************************************************************************
 * Copyright 2017 - 2019 L.I.D.P. Consulting Services, Inc.  All rights reserved.
 *
 * Information in these files are the confidential and proprietary product of 
 * L.I.D.P. Consulting Services, Inc. No part of these files may be used, 
 * reproduced or distributed except as authorized in writing by 
 * L.I.D.P. Consulting Services, Inc.
 *******************************************************************************/
package com.lidp.model.admin.persistence;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

import com.lidp.model.admin.keys.PFQG_Key_00;
import com.lidp.model.sort.PFQGSortOrder;
import com.lidp.model.superobj.AbstractTO;

//Add this suppress warning if Eclipse shows a warning here.
@SuppressWarnings("serial")
public class PFQG_MasterArea extends AbstractTO
{
   private PFXX_Timestamp pfxxTimestamp;
   private PFQG_Key_00 _PFQG_Key_00;
   private Integer _PRIMARY_KEY;
   // Instantiate List/Arrays/Vectors with a variable-type.
   private List<PFQG_Entry> _PFQG_EntrySet;

   // Add a space between other variable declarations and declaring boolean initObjects. InitObjects
   // always appears on the bottom of the list.
   private boolean initObjects = false;

   // Add two spaces after declaring initObjects, before the first method definition.
   // Additionally, create 3 constructors. A default, one with a boolean parameter,
   // and one with a parameter of the class's own data-type.
   public PFQG_MasterArea()
   {
      initialize();
   }

   public PFQG_MasterArea(boolean param)
   {
      initObjects = param;

      initialize();
   }

   public PFQG_MasterArea(PFQG_MasterArea param)
   {
      if (param.getPFXX_Timestamp() != null)
      {
         pfxxTimestamp = param.getPFXX_Timestamp().copy();
      }

      if (param.getPFQG_Key_00() != null)
      {
         _PFQG_Key_00 = param.getPFQG_Key_00().copy();
      }

      _PRIMARY_KEY = param.getPRIMARY_KEY();

      if (param.getPFQG_EntrySet() != null)
      {
         _PFQG_EntrySet = new Vector<PFQG_Entry>();
         for (PFQG_Entry p : param.getPFQG_EntrySet())
         {
            _PFQG_EntrySet.add(p.copy());
         }
      }
   }

   public PFXX_Timestamp getPFXX_Timestamp()
   {
      return pfxxTimestamp;
   }

   public void setPFXX_Timestamp(PFXX_Timestamp param)
   {
      pfxxTimestamp = param;
   }

   public PFQG_Key_00 getPFQG_Key_00()
   {
      return _PFQG_Key_00;
   }

   public void setPFQG_Key_00(PFQG_Key_00 param)
   {
      _PFQG_Key_00 = param;
   }

   public Integer getPRIMARY_KEY()
   {
      return _PRIMARY_KEY;
   }

   public void setPRIMARY_KEY(Integer param)
   {
      _PRIMARY_KEY = param;
   }

   public void addPFQG_Entry(PFQG_Entry param)
   {
      if (_PFQG_EntrySet == null)
      {
         _PFQG_EntrySet = new Vector<PFQG_Entry>();
      }

      _PFQG_EntrySet.add(param);

      Collections.sort(_PFQG_EntrySet, new PFQGSortOrder());
   }

   public void removePFQG_Entry(PFQG_Entry param)
   {
      _PFQG_EntrySet.remove(param);
   }

   public List<PFQG_Entry> getPFQG_EntrySet()
   {
      return _PFQG_EntrySet;
   }

   // Always include a copy method for business objects.
   public PFQG_MasterArea copy()
   {
      return new PFQG_MasterArea(this);
   }

   public void initialize()
   {
      if (initObjects)
      {
         // Declare objects as new instances using the "new" keyword.
         // Initialize Objects here...

         PFQG_EntrySet = new Vector<PFQG_Entry>();
         PFQG_Key_00 = new PFQG_Key_00();
         pfxxTimestamp = new PFXX_Timestamp();
      }
      else
      {
         // Declare objects null within else statement.
         PFQG_EntrySet = null;
         PFQG_Key_00 = null;
         pfxxTimestamp = null;

         initObjects = true;
      }

      // Primitives and Strings are initialized outside of the if/else declaration.
      // Additionally, there is always an empty line when code is preceeded by a close-bracket.
      _PRIMARY_KEY = 0;
      // Empty lines are not needed if close-bracket comes after the last line of code in the block.
   }
}
