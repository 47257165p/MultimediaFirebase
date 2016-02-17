package com.multimediafirebase;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.client.Firebase;
import com.firebase.ui.FirebaseListAdapter;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    Firebase myFirebaseRef;
    private FirebaseListAdapter <Nota>adapter;


    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        final ListView notas = (ListView) rootView.findViewById(R.id.lVNotes);

        MyApp app = (MyApp) getActivity().getApplication();
        Firebase ref = app.getRef();

        Firebase notes = ref.child("notes");
        Firebase notesRef = notes.push();
        Nota n1 = new Nota("nota 1", "esta es la nota número 1");
        notesRef.setValue(n1);

        notes = ref.child("notes");

        adapter = new FirebaseListAdapter<Nota>(getActivity(), Nota.class, R.layout.list_notes_info, notes) {
            @Override
            protected void populateView(View v, Nota nota, int position) {
                TextView tVTituto = (TextView) v.findViewById(R.id.tVTitulo);
                tVTituto.setText(nota.getTitulo());
                TextView tVDescripcion = (TextView) v.findViewById(R.id.tVDescripcion);
                tVDescripcion.setText(nota.getDescripcion());
            }
        };

        notas.setAdapter(adapter);


        /*ListView lVUsers = (ListView) rootView.findViewById(R.id.lVUsers);
        configureFirebase();
        Firebase usersRef = myFirebaseRef.child("users");
        Firebase userr = usersRef.push();
        User u1 = new User("perico", "palotes");
        userr.setValue(u1);

        userr = usersRef.push();
        User u2 = new User("perico", "palotillos");
        userr.setValue(u2);

        userr = usersRef.push();
        User u3 = new User("perico", "palotacos");
        userr.setValue(u3);*/

        return rootView;
    }

    public void configureFirebase ()
    {
        Firebase.setAndroidContext(getContext());
        myFirebaseRef = new Firebase("https://multimediafirebase.firebaseio.com/");
    }
}
