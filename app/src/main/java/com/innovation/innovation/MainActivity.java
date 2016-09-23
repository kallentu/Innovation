package com.innovation.innovation;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.innovation.innovation.MESSAGE";
    private boolean isInDB;

    //Views changed by database
    TextView idView;
    EditText productBox;
    EditText descriptionBox;

    //Finds the views needed for database
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idView = (TextView) findViewById(R.id.productID);
        productBox = (EditText) findViewById(R.id.product);
        descriptionBox = (EditText) findViewById(R.id.productDescription);

        if (isInDB == false) {
            DBHandler dbHandler = new DBHandler(this, null, null, 1);

            Product alternativeEducation =
                    new Product("Alternative Education - Dispelling Myth", "Experiential learning");
            dbHandler.addProduct(alternativeEducation);

            Product frReportCard =
                    new Product("An Innovative Primary French Immersion Report Card", "Reporting and Assessment");
            dbHandler.addProduct(frReportCard);

            Product comShift =
                    new Product("Assessment And How We Communicate Student Learning Alongside The Shifting Curriculum", "Reporting and Assessment");
            dbHandler.addProduct(comShift);

            Product gradeReport =
                    new Product("Assessment, Grading And Reporting Field Test", "Reporting and Assessment");
            dbHandler.addProduct(gradeReport);

            Product authSciPart =
                    new Product("Authentic Science Partnership: Inquire, Research, Experience (ASPIRE)", "Project-based learning");
            dbHandler.addProduct(authSciPart);

            Product comStudAss =
                    new Product("Communicating Student Assessment", "Rural");
            dbHandler.addProduct(comStudAss);

            Product comStudLearn =
                    new Product("Communicating Student Learning", "Multi-grade Classrooms");
            dbHandler.addProduct(comStudLearn);

            Product comStudLearn2 =
                    new Product("Communicating Student Learning Part 2", "Reporting and Assessment");
            dbHandler.addProduct(comStudLearn2);

            Product devComp =
                    new Product("Developing competencies", "Project-based learning");
            dbHandler.addProduct(devComp);

            Product dynScience =
                    new Product("Dynamic Science Learning Through Student Choice", "Cross-curricular");
            dbHandler.addProduct(dynScience);

            Product elemMath =
                    new Product("Elementary Math Innovation Project", "Aboriginal learning / Cultural development");
            dbHandler.addProduct(elemMath);

            Product firstNatOutdoors =
                    new Product("First Nations Outdoor Education Program", "Experiential learning");
            dbHandler.addProduct(firstNatOutdoors);

            Product firstPeop =
                    new Product("First Peoples", "Aboriginal learning / Cultural development");
            dbHandler.addProduct(firstPeop);

            Product gradeless =
                    new Product("Going Gradeless", "Cross-curricular");
            dbHandler.addProduct(gradeless);

            Product earlyLearnClass =
                    new Product("Inquiry in the Early Learning Classroom", "N/A");
            dbHandler.addProduct(earlyLearnClass);

            Product translationToTrans =
                    new Product("Inquiry-based, Interdisciplinary, Competency-based Graduation Structure: Moving Beyond Translation to Transformation", "Reporting and Assessment");
            dbHandler.addProduct(translationToTrans);

            Product inspirED =
                    new Product("InspirED", "Social, emotional learning / self-regulation");
            dbHandler.addProduct(inspirED);

            Product johnSTEM =
                    new Product("John Oliver STEM Program", "Project-based learning");
            dbHandler.addProduct(johnSTEM);

            Product learnInDepth =
                    new Product("Learning In Depth", "Project-based learning");
            dbHandler.addProduct(learnInDepth);

            Product innovationRoom =
                    new Product("Making Room for Innovation", "Project-based learning");
            dbHandler.addProduct(innovationRoom);

            Product makerSpace =
                    new Product("Mobile Makerspace", "Cross-curricular");
            dbHandler.addProduct(makerSpace);

            Product persLearn =
                    new Product("Personalized Learning", "Vulnerable / at-risk students");
            dbHandler.addProduct(persLearn);

            Product redesignAssess =
                    new Product("Re-Designing Assessment in a Middle School", "Reporting and Assessment");
            dbHandler.addProduct(redesignAssess);

            Product canHistory =
                    new Product("Re-Storying Canadian History: The Interdependence of Creative and Critical Thinking", "Aboriginal learning / Cultural development");
            dbHandler.addProduct(canHistory);

            Product calibrateNormal =
                    new Product("Recalibrating to a New Normal", "Vulnerable / at-risk students");
            dbHandler.addProduct(calibrateNormal);

            Product saHali =
                    new Product("Sa-Hali Family of Schools", "Trades / Skills / Career Development");
            dbHandler.addProduct(saHali);

            Product teachLearnStrat =
                    new Product("Teaching and learning strategies", "Experiential learning");
            dbHandler.addProduct(teachLearnStrat);

            Product templetonSTEM =
                    new Product("Templeton STEM Program", "Experiential learning");
            dbHandler.addProduct(templetonSTEM);

            Product inspireProj =
                    new Product("The ins-PI-re Project", "Trades / Skills / Career Development");
            dbHandler.addProduct(inspireProj);

            Product multiGrade =
                    new Product("The Multi-Grade Approach to Learning", "Multi-grade classrooms");
            dbHandler.addProduct(elemMath);

            Product moduleTeach =
                    new Product("Using a Module Approach for Teaching and Learning", "Multi-grade classrooms");
            dbHandler.addProduct(moduleTeach);

            isInDB = true;
        }
    }

    //Adds new Product given from the views
    public void newProduct (View view) {
        DBHandler dbHandler = new DBHandler(this, null, null, 1);

        String description =
                descriptionBox.getText().toString();

        Product product =
                new Product(productBox.getText().toString(), description);

        dbHandler.addProduct(product);
        productBox.setText("");
        descriptionBox.setText("");
    }

    //Find product in database onClick
    public void lookupProduct (View view) {
        DBHandler dbHandler = new DBHandler(this, null, null, 1);

        Product product =
                dbHandler.findProduct(productBox.getText().toString());

        if (product != null) {
            idView.setText(String.valueOf(product.getID()));

            descriptionBox.setText(String.valueOf(product.getDescription()));

            /*
            Used for changing url to image and puts it to imageview

            //Gets file path of image and sets it to the image view
            File imgFile = new  File(String.valueOf(product.getDescription()));

            if(imgFile.exists()){

                Bitmap myBitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());

                ImageView myImage = (ImageView) findViewById(R.id.picture);

                myImage.setImageBitmap(myBitmap);

            }

            */

        } else {
            idView.setText("No Match Found");
        }
    }

    //Removes the product from database
    public void removeProduct (View view) {
        DBHandler dbHandler = new DBHandler(this, null,
                null, 1);

        //If deleted, will return true
        boolean result = dbHandler.deleteProduct(
                productBox.getText().toString());

        if (result)
        {
            idView.setText("Record Deleted");
            productBox.setText("");
            descriptionBox.setText("");
        }
        else
            idView.setText("No Match Found");
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
