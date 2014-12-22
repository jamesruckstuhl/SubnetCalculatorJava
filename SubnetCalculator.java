//Author: James Ruckstuhl
//Date Last Modified: Monday September 29th, 2014
//Program Description: This is the main driver class for COSC 4436 Assignment #1 - Creating a Subnet Calculator
//The calculator should be able to handle input for a default classful IP address, an IP address with a VLSM, and an 
//IP address with a dotted decimal notation subnetmask
//Uses IPSubnetInformation and UtilityMethods classes

import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
		
//START: CLASS SubnetCalculator        						
public class SubnetCalculator 
{
	private JFrame frame;
	private JTextField textFieldInput;
	StringTokenizer tokenizer;
	IPSubnetInformation ipSubnetInformation;
			
	//START: Method Main                   
	//DESCRIPTION: Driver method for class  
	//PREREQUISITES: None                  
	//OUTCOMES: Program Execution   
	//CALLS: SubnetCalculator constructor
	//CALLED BY: None
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					SubnetCalculator window = new SubnetCalculator();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	} //END: Method Main                    					
    	
	//START: Method SubnetCalculator       
	//DESCRIPTION: Calls initialize method   
	//PREREQUISITES: initialize method     
	//OUTCOMES: Builds UI and handles input
	//via calling initialize
	//CALLS: Method initialize in this file
	//CALLED BY: Method main in this file
	public SubnetCalculator() 
	{
		initialize();
	}//END: Method SubnetCalculator         					
    
	
	//START: Method initialize		                                                   
	//DESCRIPTION: Builds UI and handles input                                           
	//PREREQUISITES: IPInfoClassful, IPInfoVLSM and IPInfoDottedDecimalNotation classes
	//OUTCOMES: Builds UI and handles input 
	//CALLS: All methods in UtilityMethods class, all methods in IPSubnetInformation except setters
	//Standard Java UI, Integer, and String methods
	//CALLED BY: Constructor SubnetCalculator()
	private void initialize() 
	{
		//The following code builds the UI and was generated using WindowBuilder in Eclipse. I chose to include a UI
		//so that output would be a bit cleaner
		//At the very end is an event listener for when the user clicks the calculate button after entering input
		
		frame = new JFrame("Subnet Calculator: Written by James Ruckstuhl");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(SubnetCalculator.class.getResource("/javax/swing/plaf/metal/icons/ocean/computer.gif")));
		frame.setResizable(false);
		frame.setBounds(100, 100, 540, 558);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblSubnetCalculator = new JLabel("Subnet Calculator");
		lblSubnetCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubnetCalculator.setFont(new Font("Calibri", Font.BOLD, 36));
		
		JLabel lblInstructions = new JLabel("Instructions\r\n\r\n\r\n\r");
		lblInstructions.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstructions.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JTextArea textAreaResults = new JTextArea();
		textAreaResults.setEditable(false);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textFieldInput = new JTextField();
		textFieldInput.setColumns(10);
		
		JLabel lblDescription = new JLabel("<html>\r\nPlease enter either <br>\r\n* An IP address<br>\r\n* An IP address with a VLSM<br>\r\n* An IP address with a dotted decimal notation subnet mask<br>\r\n</html>\r\n\r\n\r\n\r\n\r\n");
		
		JLabel lblResults = new JLabel("Results");
		lblResults.setHorizontalAlignment(SwingConstants.CENTER);
		lblResults.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(161)
					.addComponent(lblInstructions)
					.addContainerGap(217, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(116)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblSubnetCalculator)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblDescription)
							.addContainerGap(129, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textFieldInput, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(Alignment.LEADING, groupLayout.createParallelGroup(Alignment.TRAILING)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblResults, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
										.addGap(99))
									.addComponent(textAreaResults, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(16)
					.addComponent(lblSubnetCalculator)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblInstructions, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(lblDescription)
					.addGap(29)
					.addComponent(lblResults, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addComponent(textAreaResults, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
					.addGap(43)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addGap(58))
		);
		frame.getContentPane().setLayout(groupLayout);
		
		//START: Calculate Button Listener     					
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				tokenizer = new StringTokenizer(textFieldInput.getText()," ");
				
				//Start:User enters no input
				if(tokenizer.countTokens() <= 0)
				{
					JOptionPane.showMessageDialog(null, "Please provide input");
				}//End:User enters no input	
				
				//Start:User enters a default IP or an IP with a VLSM (or 1 incorrectly formed input)
				else if(tokenizer.countTokens() == 1)
				{
					//Start:Check to see if user entered in an IP with a VLSM by parsing on /
					String token = tokenizer.nextToken();

					StringTokenizer tokenizeSingleInput = new StringTokenizer(token,"/");   
					if(tokenizeSingleInput.countTokens() == 2)//User enters
					{
						String ipAddress = tokenizeSingleInput.nextToken();
						boolean vlsmValid = true;
						//JOptionPane.showMessageDialog(null, "IP Address " + ipAddress);
						if(UtilityMethods.validateIPAddress(ipAddress))
						{
							int vlsm = 0;
							try
							{
								vlsm = Integer.parseInt(tokenizeSingleInput.nextToken());
							}
							catch(Exception e)
							{
								JOptionPane.showMessageDialog(null, "Input is invalid. Please see instructions");
								vlsmValid = false;
							}
								
							if(UtilityMethods.validateVLSM(vlsm) && vlsmValid)
							{
								ipSubnetInformation = new IPSubnetInformation();	
								ipSubnetInformation.calculateVLSMInfo(ipAddress, vlsm);
								textAreaResults.setText("");
								textAreaResults.append("Subnet Mask: " + ipSubnetInformation.getSubnetMask()+"\n");
								textAreaResults.append("CIDR: " + ipSubnetInformation.getCidr()+"\n");
								textAreaResults.append("Hosts per subnet: " + ipSubnetInformation.getHostsPerSubnet()+"\n");
								textAreaResults.append("Network Address: " + ipSubnetInformation.getNetworkAddress()+"\n");
								textAreaResults.append("Broadcast Address: " + ipSubnetInformation.getBroadcastAddress()+"\n");
								textAreaResults.append("Bits in Host: " + ipSubnetInformation.getBitsInHost()+"\n");
								textAreaResults.append("Bits in Network:" + ipSubnetInformation.getBitsInNetwork()+"\n");
							}

							else
							{
								JOptionPane.showMessageDialog(null, "Input is invalid. Please see instructions");
							}
						}

						else
						{
							JOptionPane.showMessageDialog(null, "Input is invalid. Please see instructions");
						}

					}//End:Check to see if user entered in an IP with a VLSM by parsing on /
					
					//Start:User didn't enter IP with VLSM, check validity of token and handle
					else
					{
						//Start:Token is a valid IP Address, display information
						if(UtilityMethods.validateIPAddress(token))
						{
							ipSubnetInformation = new IPSubnetInformation();
							ipSubnetInformation.calculateClassfullAddressInfo(token);
							textAreaResults.setText("");
							textAreaResults.append("Network Class: " +ipSubnetInformation.getNetworkClass() +"\n");
							
							//Start:IP Address is within Classes A-C
							if(!(ipSubnetInformation.getNetworkClass()== 'E' || ipSubnetInformation.getNetworkClass()== 'D'))
							{
								textAreaResults.append("Subnet Mask: " + ipSubnetInformation.getSubnetMask()+"\n");
								textAreaResults.append("CIDR: " + ipSubnetInformation.getCidr()+"\n");
								textAreaResults.append("Network Address: " + ipSubnetInformation.getNetworkAddress()+"\n");
								textAreaResults.append("Broadcast Address: " + ipSubnetInformation.getBroadcastAddress()+"\n");
								textAreaResults.append("Bits in Host: " + ipSubnetInformation.getBitsInHost()+"\n");
								textAreaResults.append("Bits in Network:" + ipSubnetInformation.getBitsInNetwork()+"\n");
							}//End:IP Address is within Classes A-C
							
							//Start:IP Address is either D or E
							else
							{
								textAreaResults.append("Subnet Mask: Undefined\n");
								textAreaResults.append("CIDR: Undefined\n");
								textAreaResults.append("Network Address: Undefined\n");
								textAreaResults.append("Broadcast Address: Undefined\n");
								textAreaResults.append("Bits in Host: Undefined\n");
								textAreaResults.append("Bits in Network: Undefined\n");
								
							}//End:IP Address is either D or E
						}//End:Token is a valid IP Address, display information
						
						//Start: Token is not a valid IP address, display msg
						else
						{
							JOptionPane.showMessageDialog(null, "Input is invalid. Please see instructions");
						}//End: Token is not a valid IP address, display msg
						
					}//End:User didn't enter IP with VLSM, check validity of token and handle
				}//End:User enters a default IP or an IP with a VLSM (or 1 incorrectly formed input)
				
				//Start: User enters an IP address and a dotted decimal notation subnet mask (or 2 incorrect inputs)
				else if(tokenizer.countTokens() == 2)
				{
					String ipAddress = tokenizer.nextToken();
					String dottedDecimalSubnetMask = tokenizer.nextToken();
					
					if(UtilityMethods.validateIPAddress(ipAddress)&& !UtilityMethods.validateDottedDecimalSubnetMask(dottedDecimalSubnetMask).equals(""))
					{
						ipSubnetInformation = new IPSubnetInformation();	
						ipSubnetInformation.calculateDottedDecimalInfo(ipAddress, dottedDecimalSubnetMask);
						textAreaResults.setText("");
						textAreaResults.append("Subnet Mask: " + ipSubnetInformation.getSubnetMask()+"\n");
						textAreaResults.append("CIDR: " + ipSubnetInformation.getCidr()+"\n");
						textAreaResults.append("Hosts per subnet: " + ipSubnetInformation.getHostsPerSubnet()+"\n");
						textAreaResults.append("Network Address: " + ipSubnetInformation.getNetworkAddress()+"\n");
						textAreaResults.append("Broadcast Address: " + ipSubnetInformation.getBroadcastAddress()+"\n");
						textAreaResults.append("Bits in Host: " + ipSubnetInformation.getBitsInHost()+"\n");
						textAreaResults.append("Bits in Network:" + ipSubnetInformation.getBitsInNetwork()+"\n");
					}
					
					else
					{
						JOptionPane.showMessageDialog(null, "Input is invalid. Please see instructions");
					}
					
				}//End: User enters an IP address and a dotted decimal notation subnet mask (or 2 incorrect inputs)
				
				//Start: User enters 3 inputs
				else if(tokenizer.countTokens() >= 3)
				{
					JOptionPane.showMessageDialog(null, "Input is invalid. Please see instructions");	
				}//End: User enters 3 inputs
			}
		});	
		//END: CalculateButtonListener         							
	}	
    //END: Method initialize               						
}				
//END:CLASS SubnetCalculator           						

