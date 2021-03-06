package se.esss.litterbox.icebox.icetray.gui;

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

import se.esss.litterbox.icebox.icetray.icecube.Signal;

public abstract class SignalConfiguratorPanel extends JPanel {

	private static final long serialVersionUID = -9104767885807126408L;
	private JLabel lblSigs;
	private JPanel sigButtonPanel;
	
	public JList<Signal> sigList;
	protected JButton btnDeleteSel;
	protected JButton btnCreateNewSignal;
	public DefaultListModel<Signal> model;
	protected final String dupeSigErrorString = "A signal with this name already exists";

	public SignalConfiguratorPanel() {
		setLayout(new BorderLayout(0, 0));
		
		lblSigs = new JLabel(panelLabel());
		lblSigs.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblSigs.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblSigs, BorderLayout.NORTH);
		
		sigList = new JList<Signal>();
		sigList.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		model = new DefaultListModel<Signal>();
		sigList.setModel(model);
		JScrollPane readSigScrollPane = new JScrollPane(sigList);
		add(readSigScrollPane, BorderLayout.CENTER);
		
		sigButtonPanel = new JPanel();
		add(sigButtonPanel, BorderLayout.SOUTH);
		sigButtonPanel.setLayout(new BorderLayout(0, 0));
		
		btnDeleteSel = new JButton("Delete Selected");
		sigButtonPanel.add(btnDeleteSel, BorderLayout.NORTH);
		
		btnCreateNewSignal= new JButton("Create New Signal");
		sigButtonPanel.add(btnCreateNewSignal, BorderLayout.SOUTH);
	}

	protected abstract String panelLabel();
	
}
