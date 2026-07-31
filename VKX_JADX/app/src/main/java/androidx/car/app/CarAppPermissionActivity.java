package androidx.car.app;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import defpackage.AbstractActivityC14666l;
import defpackage.C17423l;
import defpackage.C5131l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class CarAppPermissionActivity extends AbstractActivityC14666l {

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final /* synthetic */ int f276l = 0;

    @Override // defpackage.AbstractActivityC14666l, defpackage.AbstractActivityC11746l, android.app.Activity
    public final void onCreate(Bundle bundle) throws Exception {
        super.onCreate(bundle);
        try {
            Bundle bundle2 = getPackageManager().getApplicationInfo(getPackageName(), 128).metaData;
            int i = bundle2 != null ? bundle2.getInt("androidx.car.app.theme") : 0;
            Context contextCreateConfigurationContext = createConfigurationContext(getResources().getConfiguration());
            if (i != 0) {
                contextCreateConfigurationContext.setTheme(i);
            }
            int identifier = contextCreateConfigurationContext.getResources().getIdentifier("carPermissionActivityLayout", "attr", getPackageName());
            if (identifier != 0) {
                int resourceId = contextCreateConfigurationContext.getTheme().obtainStyledAttributes(new int[]{identifier}).getResourceId(0, 0);
                if (resourceId != 0) {
                    setContentView(resourceId);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Intent intent = getIntent();
        if (intent == null || !"androidx.car.app.action.REQUEST_PERMISSIONS".equals(intent.getAction())) {
            StringBuilder sb = new StringBuilder("Unexpected intent action for CarAppPermissionActivity: ");
            sb.append(intent == null ? "null Intent" : intent.getAction());
            Log.e("CarApp", sb.toString());
            finish();
            return;
        }
        Bundle extras = intent.getExtras();
        IOnRequestPermissionsListener iOnRequestPermissionsListenerAsInterface = IOnRequestPermissionsListener.Stub.asInterface(extras.getBinder("androidx.car.app.action.EXTRA_ON_REQUEST_PERMISSIONS_RESULT_LISTENER_KEY"));
        String[] stringArray = extras.getStringArray("androidx.car.app.action.EXTRA_PERMISSIONS_KEY");
        if (iOnRequestPermissionsListenerAsInterface != null && stringArray != null) {
            smaato(new C5131l(this, iOnRequestPermissionsListenerAsInterface, 2), new C17423l(2)).amazon(stringArray);
        } else {
            Log.e("CarApp", "Intent to request permissions is missing the callback binder");
            finish();
        }
    }
}
