package androidx.glance.appwidget;

import android.content.Intent;
import android.widget.RemoteViewsService;
import defpackage.C5183l;
import defpackage.C6175l;
import defpackage.C8339l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class GlanceRemoteViewsService extends RemoteViewsService {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C5183l f418l = new C5183l(1);

    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        if (intent == null) {
            C8339l.metrica("Intent is null");
            return null;
        }
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra == -1) {
            C8339l.smaato("No app widget id was present in the intent");
            return null;
        }
        int intExtra2 = intent.getIntExtra("androidx.glance.widget.extra.view_id", -1);
        if (intExtra2 == -1) {
            C8339l.smaato("No view id was present in the intent");
            return null;
        }
        String stringExtra = intent.getStringExtra("androidx.glance.widget.extra.size_info");
        if (stringExtra != null && stringExtra.length() != 0) {
            return new C6175l(this, intExtra, intExtra2, stringExtra);
        }
        C8339l.smaato("No size info was present in the intent");
        return null;
    }
}
