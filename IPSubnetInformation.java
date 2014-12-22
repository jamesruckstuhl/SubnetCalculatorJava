//Author: James Ruckstuhl
//Date Last Modified: Monday September 29th, 2014
//Program Description: This class represents the calculated subnet information for IP Addresses
//for COSC 4436 Assignment #1 - Creating a Subnet Calculator
			
//START: Class IPSubnetInformation     						
public class IPSubnetInformation 
{
	private String ipAddress;
	private char networkClass;
	private String subnetMask;
	private String cidr;
	private int hostsPerSubnet;
	private String broadcastAddress;
	private int bitsInHost;
	private int bitsInNetwork;
	private String networkAddress = "";
						
	//START: Method getIPAddress               
	//DESCRIPTION: Returns ipAddress variable     
	//PREREQUISITES: ipAddress variable exists   
	//OUTCOMES: returns value of ipAddress       
	//variable	
	//CALLS: None
	//CALLED BY: Method initialize in SubnetCalculator
	public String getIpAddress() 
	{
		return ipAddress;
	} //END: Method getIpAddress      					

			
	//START: Method setIPAddress                 
	//DESCRIPTION: Sets ipAddress variable      
	//PREREQUISITES: ipAddress variable exists   
	//OUTCOMES: Sets value of ipAddress       
	//variable	
	//CALLS: None
	//CALLED BY: Methods calculateClassfullAddressInfo, calculateVLSMInfo, and calculateDottedDecimalInfo in this file
	public void setIpAddress(String ipAddress) 
	{
		this.ipAddress = ipAddress;
	}//END: Method setIpAddress            						
		
	//START: Method getNetworkClass              
	//DESCRIPTION: Returns networkClass variable  
	//PREREQUISITES: networkClass variable exists
	//OUTCOMES: returns value of networkClass    
	//variable	
	//CALLS: None
	//CALLED BY: Method initialize in SubnetCalculator
	public char getNetworkClass() 
	{
		return networkClass;
	}//END: Method getNetworkClass          					
    	
	//START: Method getNetworkClass              
	//DESCRIPTION: Sets networkClass variable     
	//PREREQUISITES: networkClass variable exists
	//OUTCOMES: sets value of networkClass       
	//variable	
	//CALLS: None
	//CALLED BY: Methods calculateClassfullAddressInfo, calculateVLSMInfo, and calculateDottedDecimalInfo in this file
	public void setNetworkClass(char networkClass) 
	{
		this.networkClass = networkClass;
	}
	//END: Method setNetworkClass  
		
	//START: Method getSubnetMask                
	//DESCRIPTION: gets subnetMask variable       
	//PREREQUISITES: subnetMask variable exists  
	//OUTCOMES: gets value of subnetMask         
	//variable	
	//CALLS: None
	//CALLED BY: Method initialize in SubnetCalculator
	public String getSubnetMask() 
	{
		return subnetMask;
	}
	//END: Method getSubnetMask  
			
	//START: Method setSubnetMask                
	//DESCRIPTION: set subnetMask variable       
	//PREREQUISITES: subnetMask variable exists  
	//OUTCOMES: sets value of subnetMask         
	//variable	
	//CALLS: None
	//CALLED BY: Methods calculateClassfullAddressInfo, calculateVLSMInfo, and calculateDottedDecimalInfo in this file
	public void setSubnetMask(String subnetMask) 
	{
		this.subnetMask = subnetMask;
	}//END: Method setSubnetMask            					
   
	
	//START: Method getCidr                      
	//DESCRIPTION: get cidr variable              
	//PREREQUISITES: cidr variable exists        
	//OUTCOMES: gets value of cidr               
	//variable
	//CALLS: None
	//CALLED BY: Method initialize in SubnetCalculator
	public String getCidr() 
	{
		return cidr;
	}//END: Method getCidr                  						
    		
	//START: Method setCidr                      
	//DESCRIPTION: set cidr variable              
	//PREREQUISITES: cidr variable exists        
	//OUTCOMES: sets value of cidr               
	//variable	
	//CALLS: None
	//CALLED BY: Methods calculateClassfullAddressInfo, calculateVLSMInfo, and calculateDottedDecimalInfo in this file
	public void setCidr(String cidr) 
	{
		this.cidr = cidr;
	} //END: Method setCidr                  						

				
	//START: Method getHostsPerSubnet              
	//DESCRIPTION: get hostsPerSubnet variable       
	//PREREQUISITES: hostsPerSubnet variable exists
	//OUTCOMES: gets value of hostsPerSubnet       
	//variable
	//CALLS: None
	//CALLED BY: Method initialize in SubnetCalculator
	public int getHostsPerSubnet() 
	{
		return hostsPerSubnet;
	}//END: Method getHostsPerSubnet        					

				
	//START: Method setHostsPerSubnet              
	//DESCRIPTION: set hostsPerSubnet variable      
	//PREREQUISITES: hostsPerSubnet variable exists
	//OUTCOMES: sets value of hostsPerSubnet       
	//variable
	//CALLS: None
	//CALLED BY: Methods calculateClassfullAddressInfo, calculateVLSMInfo, and calculateDottedDecimalInfo in this file
	public void setHostsPerSubnet(int hostsPerSubnet) 
	{
		this.hostsPerSubnet = hostsPerSubnet;
	}//END: Method setHostsPerSubnet        						
    
				
	//START: Method getNetworkAddress              
	//DESCRIPTION: get networkAddress variable     
	//PREREQUISITES: networkAddress variable exists
	//OUTCOMES: gets value of networkAddress       
	//variable	
	//CALLS: None
	//CALLED BY: Method initialize in SubnetCalculator
	public String getNetworkAddress()
	{
		return networkAddress;
	}//END: Method getNetworkAddress        					
	
				
	//START: Method setNetworkAddress              
	//DESCRIPTION: set networkAddress variable       
	//PREREQUISITES: networkAddress variable exists
	//OUTCOMES: sets value of networkAddress       
	//variable
	//CALLS: None
	//CALLED BY: Methods calculateClassfullAddressInfo, calculateVLSMInfo, and calculateDottedDecimalInfo in this file
	private void setNetworkAddress(String networkAddress) 
	{
		this.networkAddress = networkAddress;
		
	}//END: Method setNetworkAddress        						

			
	//START: Method getBroadcastAddress              
	//DESCRIPTION: get broadcastAddress variable      
	//PREREQUISITES: broadcastAddress variable exists
	//OUTCOMES: gets value of broadcastAddress       
	//variable	
	//CALLS: None
	//CALLED BY: Method initialize in SubnetCalculator
	public String getBroadcastAddress() 
	{
		return broadcastAddress;
	}//END: Method getBroadcastAddress      					
    
			
	//START: Method setBroadcastAddress              
	//DESCRIPTION: set broadcastAddress variable      
	//PREREQUISITES: broadcastAddress variable exists
	//OUTCOMES: sets value of broadcastAddress       
	//variable	
	//CALLS: None
	//CALLED BY: Methods calculateClassfullAddressInfo, calculateVLSMInfo, and calculateDottedDecimalInfo in this file
	public void setBroadcastAddress(String broadcastAddress) 
	{
		this.broadcastAddress = broadcastAddress;
	}//END: Method setBroadcastAddress      						
	
				
	//START: Method getBitsInHost                    
	//DESCRIPTION: get bitsInHost variable            
	//PREREQUISITES: bitsInHost variable exists      
	//OUTCOMES: gets bitsInHost                      
	//variable	
	//CALLS: None
	//CALLED BY: Method initialize in SubnetCalculator
	public int getBitsInHost() 
	{
		return bitsInHost;
	}//END: Method getBitsInHost            						

			
	//START: Method setBitsInHost                    
	//DESCRIPTION: set bitsInHost variable            
	//PREREQUISITES: bitsInHost variable exists      
	//OUTCOMES: sets bitsInHost                      
	//variable		
	//CALLS: None
	//CALLED BY: Methods calculateClassfullAddressInfo, calculateVLSMInfo, and calculateDottedDecimalInfo in this file
	public void setBitsInHost(int bitsInHost) 
	{
		this.bitsInHost = bitsInHost;
	}//END: Method setBitsInHost            					
	
			
	//START: Method getBitsInNetwork                 
	//DESCRIPTION: get bitsInNetwork variable         
	//PREREQUISITES: bitsInNetwork variable exists   
	//OUTCOMES: gets bitsInHost                      
	//variable
	//CALLS: None
	//CALLED BY: Method initialize in SubnetCalculator
	public int getBitsInNetwork() 
	{
		return bitsInNetwork;
	}//END: Method getBitsInNetwork         					
    
		
	//START: Method setBitsInNetwork                 
	//DESCRIPTION: set bitsInNetwork variable         
	//PREREQUISITES: bitsInNetwork variable exists   
	//OUTCOMES: sets bitsInHost                      
	//variable		
	//CALLS: None
	//CALLED BY: Methods calculateClassfullAddressInfo, calculateVLSMInfo, and calculateDottedDecimalInfo in this file
	public void setBitsInNetwork(int bitsInNetwork) 
	{
		this.bitsInNetwork = bitsInNetwork;
	}//END: Method setBitsInNetwork         					
    
	//START: Method calculateClassfullAddressInfo
	//DESCRIPTION: Calculates IP address information for a classfull IP address
	//PREREQUISITES: Attributes and getters and setters for this class defined
	//OUTCOMES: Calculates Classfull IP address info
	//CALLS: Setters for this class, standard Java Integer and String methods
	//CALLED BY: Method initialize in SubnetCalculator.java
	public void calculateClassfullAddressInfo(String IPAddress)
	{
	   String [] octets = IPAddress.split("\\.");

	   if(Integer.parseInt(octets[0])<=127)
	   {
		   setNetworkClass('A');
		   setSubnetMask("255.0.0.0");
		   setCidr("/8");
		   setHostsPerSubnet(16777214);
		   setNetworkAddress(octets[0] +"." +  "0" + "." + "0" + "."+ "0");
		   setBroadcastAddress(octets[0] +".255.255.255");
		   setBitsInHost(24);
		   setBitsInNetwork(8); 
	   }
	   
	   else if(Integer.parseInt(octets[0])<=191)
	   {
		   setNetworkClass('B');
		   setSubnetMask("255.255.0.0");
		   setCidr("/16");
		   setHostsPerSubnet(65534);
		   setNetworkAddress(octets[0] +"." +  octets[1] + "." + "0"+ "."+ "0");
		   setBroadcastAddress(octets[0] +"." +  octets[1] + "." + "255" + "."+ "255");
		   setBitsInHost(16);
		   setBitsInNetwork(16);
	   }
		   
	   else if(Integer.parseInt(octets[0])<=223)
	   {
		   setNetworkClass('C');
		   setSubnetMask("255.255.255.0");
		   setCidr("/24");
		   setHostsPerSubnet(254);
		   setNetworkAddress(octets[0] +"." +  octets[1] + "." + octets[2] + "."+ "0");
		   setBroadcastAddress(octets[0] +"." +  octets[1] + "." + octets[2] + "."+ "255");
		   setBitsInHost(8);
		   setBitsInNetwork(24);
	   }
	
	   else if(Integer.parseInt(octets[0])<=239)
	   {
		   setNetworkClass('D');
	   }
	   
	   else
	   {
		   setNetworkClass('E'); 
	   }
	   
	}
	
	//START: Method calculateVLSMInfo
	//DESCRIPTION: Calculates IP address information for an IP address with a VLSM
	//PREREQUISITES: Attributes and getters and setters for this class defined
	//OUTCOMES: Calculates IP address info for an IP address with a VLSM
	//CALLS: Setters for this class, standard Java Integer and String methods
	//CALLED BY: Method initialize in SubnetCalculator.java
	public void calculateVLSMInfo(String ipAddress, int vlsm)
	{
		String tempSubnetMask = null;  
		String networkAddressBinaryString = "";
		String broadcastAddressBinaryString = "";
		setCidr("/" + vlsm);
		if(vlsm <= 30)
		{
			setHostsPerSubnet((int)Math.pow(2, (32-vlsm))-2);
		} 
		
		else
		{
			setHostsPerSubnet((int)Math.pow(2, (32-vlsm)));
		}
		setBitsInNetwork(vlsm);
		setBitsInHost(32-vlsm);
		
		//Start:Calculate Subnet Mask
		for(int i = 0; i<vlsm; i++)
		{
			if(i == 0)
			{
				tempSubnetMask = "1";
			}
			else
			{
				tempSubnetMask = tempSubnetMask + "1";
			}
		}
		
		for(int i = 0; i<(32-vlsm);i++)
		{
			tempSubnetMask = tempSubnetMask + "0";
		}//End: Calculate Subnet Mask
		
		//Start:Calculate Network Address
		String [] octets = ipAddress.split("\\.");	
		int substringBase = 0;
		for(int i = 0; i<4; i++)
		{
			int temp = Integer.parseInt(tempSubnetMask.substring(substringBase,substringBase + 8),2);
			int netAddressPart = temp & Integer.parseInt(octets[i]);
			networkAddress += netAddressPart;
			networkAddressBinaryString += String.format("%8s", Integer.toBinaryString(netAddressPart)).replace(' ','0');
			if(i != 3)
			{
				networkAddress += ".";
			}
			substringBase += 8;
		}//End:Calculate Network Address
		
		//Start:Calculate Broadcast Address
		for(int i = 0; i<32; i++)
		{
			if(i<vlsm)
			{
				broadcastAddressBinaryString += networkAddressBinaryString.charAt(i);
			}
			else
			{
				broadcastAddressBinaryString += "1";
			}
		}//End: Calculate Broadcast Address
		
		setNetworkAddress(networkAddress);
		setSubnetMask(Integer.parseInt(tempSubnetMask.substring(0,8),2) + "." + Integer.parseInt(tempSubnetMask.substring(8,16),2) + "." + Integer.parseInt(tempSubnetMask.substring(16,24),2)+ "." + Integer.parseInt(tempSubnetMask.substring(24,32),2));
		setBroadcastAddress(Integer.parseInt(broadcastAddressBinaryString.substring(0,8),2) + "." + Integer.parseInt(broadcastAddressBinaryString.substring(8,16),2) + "." + Integer.parseInt(broadcastAddressBinaryString.substring(16,24),2)+ "." + Integer.parseInt(broadcastAddressBinaryString.substring(24,32),2));
	}//END: Method calculateVLSMInfo
	
	//START: Method calculateVLSMInfo
	//DESCRIPTION: Calculates IP address information for an IP address with a dotted decimal subnet mask
	//PREREQUISITES: Attributes and getters and setters for this class defined
	//OUTCOMES: Calculates IP address info for an IP address with a dotted decimal subnet mask
	//CALLS: Setters for this class, standard Java Integer and String methods, method validateDottedDecimalSubnetMask from UtilityMethods
	//CALLED BY: Method initialize in SubnetCalculator.java
	public void calculateDottedDecimalInfo(String ipAddress, String dottedDecimalSubnetMask)
	{
		String tempSubnetMask = null;  
		String networkAddressBinaryString = "";
		String broadcastAddressBinaryString = "";
		setCidr(UtilityMethods.validateDottedDecimalSubnetMask(dottedDecimalSubnetMask));
		int vlsm = Integer.parseInt(cidr.substring(1,cidr.length()));
		if(vlsm <= 30)
		{
			setHostsPerSubnet((int)Math.pow(2, (32-vlsm))-2);
		} 
		
		else
		{
			setHostsPerSubnet((int)Math.pow(2, (32-vlsm)));
		}
		setBitsInNetwork(vlsm);
		setBitsInHost(32-vlsm);
		
		//Start:Calculate Subnet Mask
		for(int i = 0; i<vlsm; i++)
		{
			if(i == 0)
			{
				tempSubnetMask = "1";
			}
			
			else
			{
				tempSubnetMask = tempSubnetMask + "1";
			}
		}
		
		for(int i = 0; i<(32-vlsm);i++)
		{
			tempSubnetMask = tempSubnetMask + "0";
		}//End:Calculate Subnet Mask
		
		//Start:Calculate Network Address
		String [] octets = ipAddress.split("\\.");	
		int substringBase = 0;
		for(int i = 0; i<4; i++)
		{
			int temp = Integer.parseInt(tempSubnetMask.substring(substringBase,substringBase + 8),2);
			int netAddressPart = temp & Integer.parseInt(octets[i]);
			networkAddress += netAddressPart;
			networkAddressBinaryString += String.format("%8s", Integer.toBinaryString(netAddressPart)).replace(' ','0');
			if(i != 3)
			{
				networkAddress += ".";
			}
			substringBase += 8;
		}//End:Calculate Network Address
		
		//Start:Calculate Broadcast Address
		for(int i = 0; i<32; i++)
		{
			if(i<vlsm)
			{
				broadcastAddressBinaryString += networkAddressBinaryString.charAt(i);
			}
			else
			{
				broadcastAddressBinaryString += "1";
			}
		}//End:Calculate Broadcast Address
		
		setNetworkAddress(networkAddress);
		setSubnetMask(Integer.parseInt(tempSubnetMask.substring(0,8),2) + "." + Integer.parseInt(tempSubnetMask.substring(8,16),2) + "." + Integer.parseInt(tempSubnetMask.substring(16,24),2)+ "." + Integer.parseInt(tempSubnetMask.substring(24,32),2));
		setBroadcastAddress(Integer.parseInt(broadcastAddressBinaryString.substring(0,8),2) + "." + Integer.parseInt(broadcastAddressBinaryString.substring(8,16),2) + "." + Integer.parseInt(broadcastAddressBinaryString.substring(16,24),2)+ "." + Integer.parseInt(broadcastAddressBinaryString.substring(24,32),2));
		
	}//END: Method calculateDottedDecimalInfo
}				
//END: Class IPSubnetInformation    
