package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView= findViewById(R.id.recyclerView)

        val listOfFruits= getListOfFruits()
        val fruitAdaptor = FruitAdapter(listOfFruits)
        recyclerView.adapter= fruitAdaptor
        recyclerView.setHasFixedSize(true)
        fruitAdaptor.onItemClick={
            val intent= Intent(this,FruitDetails::class.java)
            intent.putExtra("FRUITS", it)
            startActivity(intent)

            }

    }
    private fun getListOfFruits(): List<Fruits>{
        val fruits= mutableListOf<Fruits>()
        fruits.add(Fruits("Mango", R.drawable.mango,"BENEFITS:\n"+
                "1. High in Antioxidants\n" +
                "\n" +
                "2. May Boost Immunity\n" +
                "\n" +
                "3. May Support Heart Health\n" +
                "\n" +
                "4. Weight management options have evolved\n" +
                "\n" +
                "5. May Improve Digestive Health\n" +
                "\n" +
                "6. May Support Eye Health\n" +
                "\n" +
                "7. May Improve Hair and Skin Health\n" +
                "\n" +
                "8. May Help Lower Your Risk of Certain Cancers"))
        fruits.add(Fruits("Apples", R.drawable.apple,"BENEFITS:\n"+
                "1. Apples Are Nutritious\n" +
                "\n" +
                "2. Apples May Be Good for Weight Loss\n" +
                "\n" +
                "3. Apples May Be Good for Your Heart\n" +
                "\n" +
                "4. They're Linked to a Lower Risk of Diabetes\n" +
                "\n" +
                "5. They May Have Prebiotic Effects and Promote Good Gut Bacteria\n" +
                "\n" +
                "6. Substances in Apples May Help Prevent Cancer"))
        fruits.add(Fruits("Pineapples", R.drawable.pineapple,"BENEFITS:\n"+
                "Great Source of Healthy Carbs\n" +
                "Improves Immunity\n" +
                "Lowers Risk of Cancer\n" +
                "It May Help Heal Wounds.\n" +
                "Improves Gut Health\n" +
                "Strengthens Bones\n" +
                "Improves Eye Health\n" +
                "Promotes Tissue and Cellular Health of Skin\n" +
                "Alleviates Common Cold\n" +
                "Strengthens Gums"))
        fruits.add(Fruits("Plum", R.drawable.plum,"BENEFITS:\n"+
                "1. Can Lower Blood Pressure\n" +
                "\n" +
                "2.Protection Against Cell Damage/Cancer\n" +
                "\n" +
                "3. Can be Ideal For Weight Loss\n" +
                "\n" +
                "4. Low Calories\n" +
                "\n" +
                "5. Great For Bone Health\n" +
                "\n" +
                "6. Effective for Constipation Relief\n" +
                "\n" +
                "7. Improves Memory & Brain Health\n" +
                "\n" +
                "8. Boosts Heart Health\n" +
                "\n" +
                "9. Can Help Prevent Diabetes\n" +
                "\n" +
                "10. Destroy Breast Cancer Cells"))
        fruits.add(Fruits("Dates", R.drawable.dates,"BENEFITS:\n"+ "A strong source of protein.\n" +
                "1. Good Source of Energy\n" +
                "\n" +
                "2. May Boost Brain Health\n" +
                "\n" +
                "3. May Help Relieve Constipation\n" +
                "\n" +
                "4. Relief from Intestinal Disorders\n" +
                "\n" +
                "5. Give Relief from Anemia\n" +
                "\n" +
                "6. Prevent Heart Diseases\n" +
                "\n" +
                "7. Treat Sexual Dysfunction\n" +
                "\n" +
                "8. Prevent Night Blindness\n" +
                "\n" +
                "9. Help Treat Chronic Diarrhea\n" +
                "\n" +
                "10. Aid Bone Health"))
        fruits.add(Fruits("Grapes", R.drawable.grapes,"BENEFITS:\n"+"Helps your immune system.\n" +
                "1. Packed With Nutrients, Especially Vitamins C and K\n" +
                "\n" +
                "2. High Antioxidant Contents May Prevent Chronic Diseases\n" +
                "\n" +
                "3. Plant Compounds May Protect Against Certain Types of Cancer\n" +
                "\n" +
                "4. Beneficial for Heart Health in Various Impressive Ways"))
        fruits.add(Fruits("Tomatoes", R.drawable.tomatoes,"BENEFITS:\n"+"Tomatoes are good for your skin.\n" +
                "1.Tomatoes are a great source of vitamins\n" +
                "\n" +
                "2.They protect heart health\n" +
                "\n" +
                "3.Improve you vision\n" +
                "\n" +
                "4.Boost digestive health\n" +
                "\n" +
                "5.Help with diabetes management\n" +
                "\n" +
                "6.Guard skin health\n" +
                "\n" +
                "7.Protect against cancer"))
        fruits.add(Fruits("Blueberries", R.drawable.blueberries,"BENEFITS:\n"+"Blueberries are the best source of antioxidants.\n" +
                "1. Low in Calories But High in Nutrients\n" +
                "\n" +
                "2. The King of Antioxidant Foods\n" +
                "\n" +
                "3. Reduce DNA Damage, Which May Help Protect Against Aging and Cancer\n" +
                "\n" +
                "4. Protect Cholesterol in Your Blood From Becoming Damaged\n" +
                "\n" +
                "5. May Lower Blood Pressure\n" +
                "\n" +
                "6. May Help Prevent Heart Disease"))
        fruits.add(Fruits("Bananas", R.drawable.bananas,"BENEFITS:\n"+"Rich in nutrients.\n" +
                "Bananas Contain Many Important Nutrients\n" +
                "Bananas Contain Nutrients That Moderate Blood Sugar Levels\n" +
                "Bananas May Improve Digestive Health\n" +
                "Bananas May Aid Weight Loss\n" +
                "Bananas May Support Heart Health\n" +
                "Bananas Contain Powerful Antioxidants\n" +
                "Bananas May Help You Feel More Full"))
        fruits.add(Fruits("Cranberries", R.drawable.cranberries,"BENEFITS:\n"+"Prevent urinary tract infections. Probably the most known benefit of cranberry juice is that it can prevent urinary tract infections (UTIs).\n" +
                "1. Powerhouse of Antioxidants\n" +
                "\n" +
                "2. Prevents UTIs\n" +
                "\n" +
                "3. Boosts Brain Power\n" +
                "\n" +
                "4. Prevents Cancer\n" +
                "\n" +
                "5. Helps with Weight Loss\n" +
                "\n" +
                "6. Combats Tooth Decay\n" +
                "\n" +
                "7. Nourishes Skin\n" +
                "\n" +
                "8. Boosts Immunity\n" +
                "\n" +
                "9. Heart Healthy"))
        fruits.add(Fruits("Strawberries", R.drawable.strawberries,"BENEFITS:\n"+"Improve blood antioxidant status.\n" +
                "1. Strawberries Enhance Cognitive Function\n" +
                "\n" +
                "2. Strawberries Benefit Diabetics\n" +
                "\n" +
                "3. Strawberries Protect the Heart\n" +
                "\n" +
                "4. Strawberries Reduce Hypertension\n" +
                "\n" +
                "5. Strawberry Can Help Prevent Allergies and Asthma\n" +
                "\n" +
                "6. Strawberry Improve Eyesight\n" +
                "\n" +
                "7. Strawberry Strengthen The Immune System"))
        fruits.add(Fruits("Cherries", R.drawable.cherries,"BENEFITS:\n"+"Reduce the risk of cancer.\n" +
                "Relives Insomnia\n" +
                "Facilitates Weight Loss\n" +
                "Lowers Hypertension\n" +
                "Prevents Cardiovascular Diseases\n" +
                "Anti-Ageing Properties\n" +
                "Promotes Healthy Locks\n" +
                "Maintains pH Balance"))
        return fruits
    }
}