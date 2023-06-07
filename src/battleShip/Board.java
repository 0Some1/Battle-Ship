package battleShip;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Board {

	private JFrame frmBattleShip;
	private String name;
	private int n2;
	private int n3;
	private int n4;
	private int n5;
	int rocket;
	int saveRocket;
	private int row;
	private int colunm;
	JButton[][] buttons;
	int [][] matrix;
	JLabel jName;
	JLabel j2;
	JLabel j3;
	JLabel j4;
	JLabel j5;
	JLabel jRockets;


	

	/**
	 * Launch the application.
	 */
	public static void run(String name,int n2,int n3, int n4, int n5, int row, int colunm,int rocket) {
		try {
			Board window = new Board(name,n2,n3,n4,n5,row,colunm,rocket);
			window.frmBattleShip.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Create the application.
	 */
	public Board(String name,int n2,int n3, int n4, int n5, int row, int colunm,int rocket) {
		this.name=name;
		this.n2=n2;
		this.n3=n3;
		this.n4=n4;
		this.n5=n5;
		this.row=row;
		this.colunm=colunm;
		this.rocket=rocket;
		this.matrix=new int[row][colunm];
		saveRocket=rocket;
		makeMatrix();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBattleShip = new JFrame();
		frmBattleShip.setTitle("BATTLE SHIP");
		frmBattleShip.setIconImage(Toolkit.getDefaultToolkit().getImage(Input.class.getResource("/resources/Games_BoardGames_Artboard_31-512.png")));
		frmBattleShip.getContentPane().setBackground(new Color(240, 248, 255));
		frmBattleShip.setResizable(false);
		frmBattleShip.setBounds(0, 0, colunm*5+745, row*5+475);
		frmBattleShip.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBattleShip.getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, colunm*5+446, row*5+446);
		frmBattleShip.getContentPane().add(panel);
		panel.setLayout(new GridLayout(row,colunm, 0, 0));
		frmBattleShip.setLocationRelativeTo(null);

		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(colunm*5+446, 0,745-446 ,row*5+475 );
		frmBattleShip.getContentPane().add(panel2);
		
		jName=new JLabel("name : "+name);
		jName.setBounds(20 , 10 , 100 , 50);
		panel2.add(jName);

		j2=new JLabel("n2: "+n2);
		j2.setBounds(20,50,100,50);
		panel2.add(j2);

		j3=new JLabel("n3: "+n3);
		j3.setBounds(20,100	,100,50);
		panel2.add(j3);

		j4=new JLabel("n4: "+n4);
		j4.setBounds(20,150,100,50);
		panel2.add(j4);

		j5=new JLabel("n5: "+n5);
		j5.setBounds(20,200,100,50);
		panel2.add(j5);

		jRockets =new JLabel("rocket: "+rocket);
		jRockets.setBounds(20,250,100,50);
		panel2.add(jRockets);

		JButton hintBtn =new JButton("Hint");
		hintBtn.setBounds(10,300,145,25);
		panel2.add(hintBtn);
		hintBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ChangeIcon().start();
            }
        });

		JButton back=new JButton("Back");
		back.setBounds(155,300,100,25);
		panel2.add(back);
		back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmBattleShip.dispose();
                Input.main(null);
            }
        });
		buttons=new JButton[row][colunm];

		for (int i = 0; i < buttons.length; i++) {
			for (int j = 0; j < buttons[i].length; j++) {
				buttons[i][j]=new JButton();
				buttons[i][j].setActionCommand(i+" "+j);
				buttons[i][j].setSize(70, 70);
				//buttons[i][j].setBackground(new Color(79, 182, 255));
				panel.add(buttons[i][j]);

			}
		}

		for (int i = 0; i <buttons.length ; i++) {
			for (int j = 0; j <buttons[i].length ; j++) {
				buttons[i][j].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						String[] es=e.getActionCommand().split(" ");
						if (matrix[Integer.parseInt(es[0])][Integer.parseInt(es[1])]==0){
							buttons[Integer.parseInt(es[0])][Integer.parseInt(es[1])].setBackground(Color.blue);
							matrix[Integer.parseInt(es[0])][Integer.parseInt(es[1])]=-1;
						}else if(matrix[Integer.parseInt(es[0])][Integer.parseInt(es[1])]!=0 && matrix[Integer.parseInt(es[0])][Integer.parseInt(es[1])]!=-1 && matrix[Integer.parseInt(es[0])][Integer.parseInt(es[1])]!= 1 ) {
							buttons[Integer.parseInt(es[0])][Integer.parseInt(es[1])].setBackground(Color.red);
							matrix[Integer.parseInt(es[0])][Integer.parseInt(es[1])]=1;
						}
						rocket--;
						changeIcon();
						isEnd();
					}
				});
			}
		}


	}

	public void  makeMatrix(){

		for (int i = 0; i <n2 ; i++) {
			findAndEdit(2);
		}
		for (int i = 0; i <n3 ; i++) {
			findAndEdit(3);
		}
		for (int i = 0; i <n4 ; i++) {
			findAndEdit(4);
		}
		for (int i = 0; i <n5 ; i++) {
			findAndEdit(5);
		}

		for (int i = 0; i <matrix.length ; i++) {
			for (int j = 0; j <matrix[i].length ; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

	}

	public void findAndEdit(int size){
		boolean find=false;
		boolean right=false;
		boolean left=false;
		while (!right && !left){
			int x;
			int y;
			while (true) {
				Random random = new Random();
				x = random.nextInt(row);
				y = random.nextInt(colunm);

				if (matrix[x][y] == 0) {
					break;
				}

			}

			int i=x;
			int j=y;
			int counter=0;
			find=true;
			while (i>0 && i<row && j>0  && j<colunm && counter<size){
				if (matrix[i][j]!=0){
					find=false;
				}
				j++;
				counter++;
			}

			if (find && counter==size){
				i=x;
				j=y;
				counter=0;
				while (i>0 && i<row && j>0  && j<colunm && counter<size){
					matrix[i][j]=size;
					j++;
					counter++;
				}
				right=true;
				return;

			}


			i=x;
			j=y;
			counter=0;
			find=true;
			while (i>0 && i<row && j>0  && j<colunm && counter<size){

				if (matrix[i][j]!=0){
					find=false;
				}
				i++;
				counter++;
			}

			if (find && counter==size){
				i=x;
				j=y;
				counter=0;
				while (i>0 && i<row && j>0  && j<colunm && counter<size){
					matrix[i][j]=size;
					i++;
					counter++;
				}
				left=true;
				return;
			}



		}




	}

	public void isEnd(){
	    boolean win=true;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if (matrix[i][j]!=1 && matrix[i][j]!=-1 && matrix[i][j]!=0){
                    win=false;
                    break;
                }
            }
        }

        if (win){
            JOptionPane.showConfirmDialog(null, "You  won !","Game is Finished!",JOptionPane.PLAIN_MESSAGE);
            frmBattleShip.dispose();
            Input.main(null);

            int sum=n2*2+n3*3+n4*4+n5*5;
            int score=row*colunm*sum/rocket;

            try {
                FileWriter fileWriter=new FileWriter("record.txt",true);
                fileWriter.write(name+"  "+score+"\n");
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        if (rocket==0 && !win){
            JOptionPane.showConfirmDialog(null, "You  lost !","Game is Finished!",JOptionPane.PLAIN_MESSAGE);
            frmBattleShip.dispose();
            Input.main(null);
        }

	}
	public void changeIcon(){
	    float counterN2=0;
        float counterN3=0;
        float counterN4=0;
        float counterN5=0;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if (matrix[i][j]==2){
                    counterN2++;
                }
                if (matrix[i][j]==3){
                    counterN3++;
                }
                if (matrix[i][j]==4){
                    counterN4++;
                }
                if (matrix[i][j]==5){
                    counterN5++;
                }
            }
        }

        j2.setText("n2: "+Math.ceil(counterN2/2));
        j3.setText("n3: "+Math.ceil(counterN3/3));
        j4.setText("n4: "+Math.ceil(counterN4/4));
        j5.setText("n5: "+Math.ceil(counterN5/5));

        jRockets.setText("rocket: "+rocket);



	}

	class ChangeIcon extends Thread{

	    public void run(){
            for (int i = 0; i <buttons.length ; i++) {
                for (int j = 0; j <buttons[i].length ; j++) {
                    if (matrix[i][j]==1){
                        buttons[i][j].setBackground(Color.red);
                    }else if (matrix[i][j]==-1){
                        buttons[i][j].setBackground(Color.blue);
                    }else if (matrix[i][j]==0){
                        buttons[i][j].setBackground(Color.CYAN);
                    }else {
                        buttons[i][j].setBackground(Color.green);
                    }

                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int i = 0; i <buttons.length ; i++) {
                for (int j = 0; j <buttons[i].length ; j++) {
                    if (matrix[i][j]==1){
                        buttons[i][j].setBackground(Color.red);
                    }else if (matrix[i][j]==-1){
                        buttons[i][j].setBackground(Color.blue);
                    }else if (matrix[i][j]==0){
                        buttons[i][j].setBackground(null);
                    }else {
                        buttons[i][j].setBackground(null);
                    }

                }
            }
        }
    }
}
