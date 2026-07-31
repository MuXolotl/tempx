package androidx.glance.appwidget.action;

import android.app.Activity;
import android.os.Bundle;
import defpackage.AbstractC11999l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class ActionTrampolineActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC11999l.crashlytics(this, getIntent());
        finish();
    }
}
