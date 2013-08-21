package org.sharonjl.headsup;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;

public class MainActivity extends FragmentActivity {

	/* Fragments */
	private static final int F_INDEX = 1;
	private static final int F_EDIT = 2;
	private static final int F_DETAIL = 3;
	private static final int F_ABOUT = 4;
	private static final int FRAGMENT_COUNT = F_ABOUT + 1;
	
	private Fragment[] fragments = new Fragment[FRAGMENT_COUNT];
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
				
		// Fragment setup
		FragmentManager fm = getSupportFragmentManager();
//		fragments[F_EDIT] = fm.findFragmentById(R.id.editPostFragment);
		fragments[F_INDEX] = fm.findFragmentById(R.id.messageFragment);
 
	    FragmentTransaction transaction = fm.beginTransaction();
	    for(int i = 0; i < fragments.length; i++) {
	    	if(fragments[i] != null)
	    		transaction.hide(fragments[i]);
	    }
	    transaction.commit();
	    showFragment(F_INDEX, false);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private void showFragment(int fragmentIndex, boolean addToBackStack) {
	    FragmentManager fm = getSupportFragmentManager();
	    FragmentTransaction transaction = fm.beginTransaction();
	    for (int i = 0; i < fragments.length; i++) {
	    	if(fragments[i] != null) {
		        if (i == fragmentIndex) {
		            transaction.show(fragments[i]);
		        } else {
		            transaction.hide(fragments[i]);
		        }
	    	}
	    }
	    if (addToBackStack) {
	        transaction.addToBackStack(null);
	    }
	    transaction.commit();
	}

}
