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

public class VBoxExample extends Application{	//FX를 사용하기 위해선 Application을 상속받아야 한다. 필수!

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		VBox root = new VBox(); //VBOX 인스턴트 생성
		root.setPadding(new Insets(10,10,10,10));
	
		ImageView iv = new ImageView();
		iv.setFitWidth(200);
		iv.setPreserveRatio(true); //한쪽이미지를 맞춰서 표현해주겠습니다.
		iv.setImage(new Image("/basic/images/hwasan.jpg")); //Image 경로
		
		HBox hbox = new HBox();
		hbox.setAlignment(Pos.CENTER);
		hbox.setSpacing(20);
		
		Button btnPrev = new Button();
		btnPrev.setText("이전");				//이전 버튼
		Button btnNext = new Button("다음"); //다음 버튼
		HBox.setHgrow(btnNext, Priority.ALWAYS); //다음 버튼의 남은 폭을 채움
		btnNext.setMaxWidth(Double.MAX_VALUE);
		
		hbox.getChildren().add(btnPrev); // hbox에 이전 버튼을 담겠다.
		hbox.getChildren().add(btnNext); // hbox에 다음 버튼을 담겠다.
		VBox.setMargin(hbox, new Insets(10));
		
		root.getChildren().add(iv); // getChildren : 무대위에 객체를 올려준다.
		root.getChildren().add(hbox);
		
		//최종적으로 화면에 보여주기
		Scene scene = new Scene(root); // (스테이지(신(컨테이너)))	
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("VBox 예제");
		primaryStage.setResizable(false);
	}	
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
