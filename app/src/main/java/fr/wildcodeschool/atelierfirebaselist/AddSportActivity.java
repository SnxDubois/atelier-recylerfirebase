package fr.wildcodeschool.atelierfirebaselist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddSportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_sport);

        Button save = findViewById(R.id.btSave);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView tvName = findViewById(R.id.tvName);
                Switch swGroup = findViewById(R.id.swGroup);
                Switch swOutdoor = findViewById(R.id.swOutdoor);

                String name = tvName.getText().toString();
                boolean group = swGroup.isChecked();
                boolean outdoor = swOutdoor.isChecked();

                // 1. Créer l'instance de l'objet à enregistrer dans Firebase
                Sport newSport = new Sport(name, group, outdoor);

                // 2. Récupérer la base de données Firebase
                FirebaseDatabase database = FirebaseDatabase.getInstance();

                // 3. Récupérer la référence vers le noeud où enregistrer l'objet
                DatabaseReference myRef = database.getReference("loisir");

                // 4. Ajouter un nouvel élément dans la référence (avec un identifiant unique)
                myRef.push().setValue(newSport);
            }
        });
    }
}
