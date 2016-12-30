package com.example.shrukul.farmourseller;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.jaredrummler.materialspinner.MaterialSpinner;

import java.util.Random;

/**
 * Created by shrukul on 12/27/16.
 */

public class SubCategory extends AppCompatActivity {

    String type;
    ArrayAdapter<String> arrayAdapter;
    private Toolbar toolbar;
    MaterialSpinner spinner;

    String[] PULSELIST = {"Beans", "Chickpeas", "Dentils", "Dry Peas"};
    String[] CEREALLIST = {"Maize", "Oats", "Barley", "Rice", "Millet", "Wheat"};
    String[] VEGETABLESLIST = {"Cabbage", "Lettuce", "Spinach", "Dandelion", "Wheatgrass"};
    String[] FRUITSLIST = {"Apple", "Orange", "Mango", "Grapes", "Jack Fruit", "Watermelon"};
    String[] GRAINLIST = {"Barley", "Lentil", "Rye Grains", "Oat"};
    String[] DAIRYLIST = {"Butter", "Milk", "Cheese", "Milk Powder"};
    String[] OILLIST = {"Coconut Oil", "Sunflower Oil", "Soybean Oil", "Corn Oil", "Citrus Oil", "Walnut Oil"};
    String[] PROCESSEDLIST = {"Bread", "Bacon", "Sausage", "Bagels", "Muffins", "Fruit Drinks"};

    String[] SEEDSLIST = {"Barley", "Rice", "Lupin", "Pea", "Soybean", "Millet", "Wheat"};
    String[] FERTILIZERSLIST = {"Ammonium Sulphate", "Urea", "Ammonium Chloride", "Calcium Ammonium Nitrate", "Anhydrous Ammonia", "Urea Super Granulated"};
    String[] TOOLSLIST = {"Hay knife", "Dibber", "Plough", "Scythe", "Goad", "Row cover", "Loy", "Walle Plough"};
    String[] MACHINERYLIST = {"Sprinkler system", "Farm truck", "Mower", "Cotton picker", "Tractor", "Rotator", "Roller"};
    String[] selectedList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_subcategory);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(getIntent().getStringExtra("type"));

        type = getIntent().getStringExtra("type");

        spinner = (MaterialSpinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Intent it = new Intent(SubCategory.this, Form.class);
                it.putExtra("type", new Random().nextInt(7));
                it.putExtra("item", selectedList[position]);
                startActivity(it);
                overridePendingTransition(R.anim.enter_from_right, R.anim.exit_to_left);
            }
        });

        selectContent();
    }

    private void selectContent() {
        switch (type.toLowerCase()) {
            case "pulses":
                spinner.setItems(PULSELIST);
                selectedList = PULSELIST;
                break;
            case "cereals":
                spinner.setItems(CEREALLIST);
                selectedList = CEREALLIST;
                break;
            case "vegetables":
                spinner.setItems(VEGETABLESLIST);
                selectedList = VEGETABLESLIST;
                break;
            case "fruits":
                spinner.setItems(FRUITSLIST);
                selectedList = FRUITSLIST;
                break;
            case "edible oil":
                spinner.setItems(OILLIST);
                selectedList = OILLIST;
                break;
            case "food grains":
                spinner.setItems(GRAINLIST);
                selectedList = GRAINLIST;
                break;
            case "dairy":
                spinner.setItems(DAIRYLIST);
                selectedList = DAIRYLIST;
                break;
            case "processed food":
                spinner.setItems(PROCESSEDLIST);
                selectedList = PROCESSEDLIST;
                break;
            case "seeds":
                spinner.setItems(SEEDSLIST);
                selectedList = SEEDSLIST;
                break;
            case "fertilizers":
                spinner.setItems(FERTILIZERSLIST);
                selectedList = FERTILIZERSLIST;
                break;
            case "tools":
                spinner.setItems(TOOLSLIST);
                selectedList = TOOLSLIST;
                break;
            case "machinery":
                spinner.setItems(MACHINERYLIST);
                selectedList = MACHINERYLIST;
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.enter_from_left, R.anim.exit_to_right);
    }
}
