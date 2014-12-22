//Author: James Ruckstuhl
//Date Last Modified: Monday September 29th, 2014
//Program Description: This class contains utility methods used by the IPSubnetInformation and SubnetCalculator classes

//START: Class UtilityMethods
public  class UtilityMethods 
{
	//START: Method validateIPAddress                  
	//DESCRIPTION:Returns true if the IP address is valid and false otherwise
	//PREREQUISITES: None                  
	//OUTCOMES: Returns true if the IP address is valid and false otherwise
	//CALLS: Standard Java Integer and String methods, no custom methods
	//CALLED BY: Method initialize in SubnetCalculator
	public static boolean validateIPAddress(String ipAddress)
	{
		try
		{
			String [] octets = ipAddress.split("\\.");
			if(ipAddress == null || ipAddress.isEmpty())
			{
				return false;
			}
				
			else if(ipAddress.endsWith("."))
			{
				return false;
			}
					
			if(octets.length != 4)
			{
				return false;
			}
				
			for(int i = 0; i < octets.length; i++)
			{
				if(Integer.parseInt(octets[i])>255 || Integer.parseInt(octets[i])<0)
				{
					return false;
				}
			}	
			return true;
		}

		catch(Exception e)
		{
			return false;
		}
	}//END: Method validateIPAddress
	
	//START: Method validateVLSM                 
	//DESCRIPTION:Returns true if the VLSM is valid and false otherwise
	//PREREQUISITES: None                  
	//OUTCOMES: Returns true if the VLSM is valid and false otherwise
	//CALLS: None
	//CALLED BY: Method initialize in SubnetCalculator
	public static boolean validateVLSM(int vlsm)
	{
		if(vlsm >= 1 && vlsm <= 32)
		{
			return true;
		}
		
		else
		{
			return false;
		}		
	}//END: Method validateVLSM
	
	//START: Method validateDottedDecimalSubnetMask                 
	//DESCRIPTION:Returns "" if the dotted decimal subnet mask is invalid and \number, where number is the cidr value if true
	//PREREQUISITES: None                  
	//OUTCOMES: Returns true if the IP address is valid and false otherwise
	//CALLS: None
	//CALLED BY: Method initialize in SubnetCalculator
	public static String validateDottedDecimalSubnetMask(String dottedDecimalSubnetMask)
	{
		//Start: Create an array of valid dotted decimal subnet masks
		String [] validDottedDecimalSubnetMasks = new String [32];
		validDottedDecimalSubnetMasks[0] = "128.0.0.0";
		validDottedDecimalSubnetMasks[1] = "192.0.0.0";
		validDottedDecimalSubnetMasks[2] = "224.0.0.0";
		validDottedDecimalSubnetMasks[3] = "240.0.0.0";
		validDottedDecimalSubnetMasks[4] = "248.0.0.0";
		validDottedDecimalSubnetMasks[5] = "252.0.0.0";
		validDottedDecimalSubnetMasks[6] = "254.0.0.0";
		validDottedDecimalSubnetMasks[7] = "255.0.0.0";
		validDottedDecimalSubnetMasks[8] = "255.128.0.0";
		validDottedDecimalSubnetMasks[9] = "255.192.0.0";
		validDottedDecimalSubnetMasks[10] = "255.224.0.0";
		validDottedDecimalSubnetMasks[11] = "255.240.0.0";
		validDottedDecimalSubnetMasks[12] = "255.248.0.0";
		validDottedDecimalSubnetMasks[13] = "255.252.0.0";
		validDottedDecimalSubnetMasks[14] = "255.254.0.0";
		validDottedDecimalSubnetMasks[15] = "255.255.0.0";
		validDottedDecimalSubnetMasks[16] = "255.255.128.0";
		validDottedDecimalSubnetMasks[17] = "255.255.192.0";
		validDottedDecimalSubnetMasks[18] = "255.255.224.0";
		validDottedDecimalSubnetMasks[19] = "255.255.240.0";
		validDottedDecimalSubnetMasks[20] = "255.255.248.0";
		validDottedDecimalSubnetMasks[21] = "255.255.252.0";
		validDottedDecimalSubnetMasks[22] = "255.255.254.0";
		validDottedDecimalSubnetMasks[23] = "255.255.255.0";
		validDottedDecimalSubnetMasks[24] = "255.255.255.128";
		validDottedDecimalSubnetMasks[25] = "255.255.255.192";
		validDottedDecimalSubnetMasks[26] = "255.255.255.224";
		validDottedDecimalSubnetMasks[27] = "255.255.255.240";
		validDottedDecimalSubnetMasks[28] = "255.255.255.248";
		validDottedDecimalSubnetMasks[29] = "255.255.255.252";
		validDottedDecimalSubnetMasks[30] = "255.255.255.254";
		validDottedDecimalSubnetMasks[31] = "255.255.255.255";
		//Start: create an array of valid dotted decimal subnet masks
		
		if(!validateIPAddress(dottedDecimalSubnetMask))
		{
			return "";
		}
	
		
		for(int i = 0; i < 32; i++)
		{
			if(dottedDecimalSubnetMask.equals(validDottedDecimalSubnetMasks[i]))
			{
				String cidr = "\\" + (i + 1);
				return cidr;			
			}
		}
			
		return "";
	}//END: Method validateDottedDecimalInfo
}//END: Class UtilityMethods
