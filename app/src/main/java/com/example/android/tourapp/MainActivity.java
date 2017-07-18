package com.example.android.tourapp;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    PlacesFragment places;
    TabFragment tabsFragments;
    PhrasesFragment phrases;
    FragmentManager fragManager;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        if (savedInstanceState == null) {
            MenuItem item =  navigationView.getMenu().getItem(0);
            onNavigationItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.places) {
            setTitle(R.string.places);
            places = new PlacesFragment();
            fragManager = getSupportFragmentManager();
            fragManager.beginTransaction().replace(R.id.frame, places).commit();
            item.setChecked(true);

        } else if (id == R.id.cafes) {
            setTitle(R.string.cafes);
            tabsFragments = new TabFragment();
            fragManager = getSupportFragmentManager();
            fragManager.beginTransaction().replace(R.id.frame, tabsFragments).commit();

        } else if (id == R.id.hotels) {
            setTitle(R.string.hotels);
            tabsFragments = new TabFragment();
            fragManager = getSupportFragmentManager();
            fragManager.beginTransaction().replace(R.id.frame, tabsFragments).commit();

        } else if (id == R.id.language) {
            setTitle(R.string.phrases);
            phrases = new PhrasesFragment();
            fragManager = getSupportFragmentManager();
            fragManager.beginTransaction().replace(R.id.frame, phrases).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
