package systems.icetech.icebox.icetray.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public abstract class SignalConfiguratorPanel extends JPanel {

	private static final long serialVersionUID = -9104767885807126408L;
	private JLabel lblSigs;
	private JPanel sigButtonPanel;
	//protected ActionListener createBtnListener;
	//protected ActionListener delBtnListener;
	
	public JList<String> sigList;
	protected JButton btnDeleteSel;
	protected JButton btnCreateNewSignal;
	public DefaultListModel<String> model;

	public SignalConfiguratorPanel() {
		setLayout(new BorderLayout(0, 0));
		
		lblSigs = new JLabel(buttonText());
		lblSigs.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblSigs.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblSigs, BorderLayout.NORTH);
		
		sigList = new JList<String>();
		sigList.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		model = new DefaultListModel<String>();
		sigList.setModel(model);
		JScrollPane readSigScrollPane = new JScrollPane(sigList);
		add(readSigScrollPane, BorderLayout.CENTER);
		
		sigButtonPanel = new JPanel();
		add(sigButtonPanel, BorderLayout.SOUTH);
		sigButtonPanel.setLayout(new BorderLayout(0, 0));
		
		btnDeleteSel = new JButton("Delete Selected");
		sigButtonPanel.add(btnDeleteSel, BorderLayout.NORTH);
		//btnDeleteSel.addActionListener(delBtnListener);
		
		btnCreateNewSignal= new JButton("Create New Signal");
		sigButtonPanel.add(btnCreateNewSignal, BorderLayout.SOUTH);
		//btnCreateNewSignal.addActionListener(createBtnListener);
	}

	protected abstract String buttonText();
	
}
