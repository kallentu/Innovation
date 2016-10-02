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
    EditText idView;
    TextView productBox;
    TextView descriptionBox;
    TextView productTypeBox;

    //Finds the views needed for database
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idView = (EditText) findViewById(R.id.productID);
        productBox = (TextView) findViewById(R.id.product);
        descriptionBox = (TextView) findViewById(R.id.productDescription);
        productTypeBox = (TextView) findViewById(R.id.productType);

        if (isInDB == false) {
            DBHandler dbHandler = new DBHandler(this, null, null, 1);

            Product alternativeEducation =
                    new Product("Alternative Education - Dispelling Myth", "Through restructuring in the Cowichan Valley, we were fortunate to have the opportunity to repurpose a 100-year-old elementary site into an Open Learning Centre.", "Experiential learning");
            dbHandler.addProduct(alternativeEducation);

            Product frReportCard =
                    new Product("An Innovative Primary French Immersion Report Card", "Our focus on creating a report card based on assessing oral and intercultural competencies will create momentum to reassess and adjust teaching practices in our local classrooms.", "Reporting and Assessment");
            dbHandler.addProduct(frReportCard);

            Product comShift =
                    new Product("Assessment And How We Communicate Student Learning Alongside The Shifting Curriculum", "We envision a door into our classrooms that will engage our learners and all those who support them in their journey, by creating a digital story of learning, and life.", "Reporting and Assessment");
            dbHandler.addProduct(comShift);

            Product gradeReport =
                    new Product("Assessment, Grading And Reporting Field Test", "To move away from traditional report cards and engage in continuous communication with parents and students through digital portfolios.", "Reporting and Assessment");
            dbHandler.addProduct(gradeReport);

            Product authSciPart =
                    new Product("Authentic Science Partnership: Inquire, Research, Experience (ASPIRE)", "The primary goal of the ASPIRE program is to provide students in a remote school district with authentic science experiences to improve their science and technological skills and literacy.", "Project-based learning");
            dbHandler.addProduct(authSciPart);

            Product comStudAss =
                    new Product("Communicating Student Assessment", "To develop a competency tracking model and communicate to parents the assessment of student learning through their multi-grade, cross-curricular courses.", "Rural");
            dbHandler.addProduct(comStudAss);

            Product comStudLearn =
                    new Product("Communicating Student Learning", "To develop and implement best practices in communicating student learning and to work towards eliminating letter grades from the Transition Program.", "Multi-grade Classrooms");
            dbHandler.addProduct(comStudLearn);

            Product comStudLearn2 =
                    new Product("Communicating Student Learning Part 2", "Deconstructing the International Baccalaureate Approaches to Learning (IB ATL) skills, and communicating students’ development of these skills both informally and formally.", "Reporting and Assessment");
            dbHandler.addProduct(comStudLearn2);

            Product devComp =
                    new Product("Developing competencies", "To provide learning opportunities that develops students’ thinking, social and personal competencies.", "Project-based learning");
            dbHandler.addProduct(devComp);

            Product dynScience =
                    new Product("Dynamic Science Learning Through Student Choice", "By using a blended learning model for content delivery, students have flexibility over how and when they learn the course material.", "Cross-curricular");
            dbHandler.addProduct(dynScience);

            Product elemMath =
                    new Product("Elementary Math Innovation Project", "To provide students with real-life experiences in multi-age teams through a café at the school.", "Aboriginal learning / Cultural development");
            dbHandler.addProduct(elemMath);

            Product firstNatOutdoors =
                    new Product("First Nations Outdoor Education Program", "To develop a program that will holistically weave First Nations culture and traditions into existing provincially recognized and Board/Authority Authorized courses to nurture a sense of belonging in identified at-risk youth.", "Experiential learning");
            dbHandler.addProduct(firstNatOutdoors);

            Product firstPeop =
                    new Product("First Peoples", "To create and facilitate a sustainable relationship between students and staff and members of B.C.’s First Peoples.", "Aboriginal learning / Cultural development");
            dbHandler.addProduct(firstPeop);

            Product gradeless =
                    new Product("Going Gradeless", "To run a gradeless assessment and reporting program in select Grade 8 & 9 classes.", "Cross-curricular");
            dbHandler.addProduct(gradeless);

            Product earlyLearnClass =
                    new Product("Inquiry in the Early Learning Classroom", "We come together to do collaborative inquiry around how to take the strengths and passions of our students and help them become more engaged and to take ownership of their learning.", "N/A");
            dbHandler.addProduct(earlyLearnClass);

            Product translationToTrans =
                    new Product("Inquiry-based, Interdisciplinary, Competency-based Graduation Structure: Moving Beyond Translation to Transformation", "The building and deployment of an interdisciplinary, competency-based digital portfolio system that ties learning artifacts to competencies and contexts.", "Reporting and Assessment");
            dbHandler.addProduct(translationToTrans);

            Product inspirED =
                    new Product("InspirED", "To implement the InspirED program for Grade 9 students centred on the concept of inquiry-based learning.", "Social, emotional learning / self-regulation");
            dbHandler.addProduct(inspirED);

            Product johnSTEM =
                    new Product("John Oliver STEM Program", "Due to a growing demand among our school’s student population we are expanding the STEM program to include more grades.", "Project-based learning");
            dbHandler.addProduct(johnSTEM);

            Product learnInDepth =
                    new Product("Learning In Depth", "The aim of Learning in Depth (LID) is for each student, by the end of his/her schooling, to know as much about that topic as almost anyone on earth.", "Project-based learning");
            dbHandler.addProduct(learnInDepth);

            Product innovationRoom =
                    new Product("Making Room for Innovation", "Our proposal is to offer a transition model to motivate both students and teachers to be able to utilize the new Applied Skills curriculum at the grade 6, 7, 8 and 9 levels.", "Project-based learning");
            dbHandler.addProduct(innovationRoom);

            Product makerSpace =
                    new Product("Mobile Makerspace", "To provide all students with STEAM (science, technology, engineering, arts, and math) Learning opportunities through a Mobile Makerspace.", "Cross-curricular");
            dbHandler.addProduct(makerSpace);

            Product persLearn =
                    new Product("Personalized Learning", "To integrate elements of Self-Directed Learning and student inquiry through their Personalized Learning Program.", "Vulnerable / at-risk students");
            dbHandler.addProduct(persLearn);

            Product redesignAssess =
                    new Product("Re-Designing Assessment in a Middle School", "For the past three years, Trafalgar Middle School has been working to incorporate authentic assessment practices into our work with students.", "Reporting and Assessment");
            dbHandler.addProduct(redesignAssess);

            Product canHistory =
                    new Product("Re-Storying Canadian History: The Interdependence of Creative and Critical Thinking", "In April of 2017, 600 Kindergarten to Grade 6 students of Glenmore Elementary will be participating in the culminating event of a year-long study called “How Canada Came to Be”.", "Aboriginal learning / Cultural development");
            dbHandler.addProduct(canHistory);

            Product calibrateNormal =
                    new Product("Recalibrating to a New Normal", "Classrooms are being transformed into digital nerve centres where a real world approach to education drives a personalized approach to learning.", "Vulnerable / at-risk students");
            dbHandler.addProduct(calibrateNormal);

            Product saHali =
                    new Product("Sa-Hali Family of Schools", "To focus on project-based learning that supports elementary, secondary and university teachers co-designing and implementing cross-curricular learning tasks and appropriate evaluation tools.", "Trades / Skills / Career Development");
            dbHandler.addProduct(saHali);

            Product teachLearnStrat =
                    new Product("Teaching and learning strategies", "To include a suite of innovative teaching and learning strategies for all teachers and students, including inquiry-based learning, hands-on exploration and learning empowered by technology.", "Experiential learning");
            dbHandler.addProduct(teachLearnStrat);

            Product templetonSTEM =
                    new Product("Templeton STEM Program", "To provide students access to STEM programming and help them develop math and science skills through enriched educational experiences.", "Experiential learning");
            dbHandler.addProduct(templetonSTEM);

            Product inspireProj =
                    new Product("The ins-PI-re Project", "To inspire students to engage with the Raspberry Pi, a small computer to help students learn programming.", "Trades / Skills / Career Development");
            dbHandler.addProduct(inspireProj);

            Product multiGrade =
                    new Product("The Multi-Grade Approach to Learning", "To take an unbiased look at multi-grade classrooms where there is a blending of curriculum and students across multiple grade levels.", "Multi-grade classrooms");
            dbHandler.addProduct(elemMath);

            Product moduleTeach =
                    new Product("Using a Module Approach for Teaching and Learning", "Inspired by the Grades 10-12 English Language Arts curriculum proposal, SD 42 endeavours to pilot the module design as suggested in the draft.", "Multi-grade classrooms");
            dbHandler.addProduct(moduleTeach);

            isInDB = true;
        }
    }

    //Adds new Product given from the views
    public void newProduct (View view) {
        DBHandler dbHandler = new DBHandler(this, null, null, 1);

        String description =
                descriptionBox.getText().toString();

        String type =
                productTypeBox.getText().toString();

        Product product =
                new Product(productBox.getText().toString(), description, type);

        dbHandler.addProduct(product);
        productBox.setText("");
        descriptionBox.setText("");
    }

    //Find product in database onClick
    public void lookupProduct (View view) {
        DBHandler dbHandler = new DBHandler(this, null, null, 1);

        Product product =
                dbHandler.findProduct(idView.getText().toString());

        if (product != null) {
            idView.setText(String.valueOf(product.getID()));
            productBox.setText(String.valueOf(product.getProduct()));
            descriptionBox.setText(String.valueOf(product.getDescription()));
            productTypeBox.setText(String.valueOf(product.getProductType()));

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
            productTypeBox.setText("");
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