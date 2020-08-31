package basic.container;

//javaFX class import
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxExample extends Application{	//FX�� ����ϱ� ���ؼ� Application�� ��ӹ޾ƾ� �Ѵ�. �ʼ�!

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		VBox root = new VBox(); //VBOX �ν���Ʈ ����
		root.setPadding(new Insets(10,10,10,10));
	
		ImageView iv = new ImageView();
		iv.setFitWidth(200);
		iv.setPreserveRatio(true); //�����̹����� ���缭 ǥ�����ְڽ��ϴ�.
		iv.setImage(new Image("/basic/images/hwasan.jpg")); //Image ���
		
		HBox hbox = new HBox();
		hbox.setAlignment(Pos.CENTER);
		hbox.setSpacing(20);
		
		Button btnPrev = new Button();
		btnPrev.setText("����");				//���� ��ư
		Button btnNext = new Button("����"); //���� ��ư
		HBox.setHgrow(btnNext, Priority.ALWAYS); //���� ��ư�� ���� ���� ä��
		btnNext.setMaxWidth(Double.MAX_VALUE);
		
		hbox.getChildren().add(btnPrev); // hbox�� ���� ��ư�� ��ڴ�.
		hbox.getChildren().add(btnNext); // hbox�� ���� ��ư�� ��ڴ�.
		VBox.setMargin(hbox, new Insets(10));
		
		root.getChildren().add(iv); // getChildren : �������� ��ü�� �÷��ش�.
		root.getChildren().add(hbox);
		
		//���������� ȭ�鿡 �����ֱ�
		Scene scene = new Scene(root); // (��������(��(�����̳�)))	
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("VBox ����");
		primaryStage.setResizable(false);
	}	
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
