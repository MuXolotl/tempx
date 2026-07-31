package androidx.core.widget;

import android.content.Intent;
import android.widget.RemoteViewsService;
import defpackage.C6183l;
import defpackage.C8339l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RemoteViewsCompatService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra == -1) {
            C8339l.smaato("No app widget id was present in the intent");
            return null;
        }
        int intExtra2 = intent.getIntExtra("androidx.core.widget.extra.view_id", -1);
        if (intExtra2 != -1) {
            return new C6183l(this, intExtra, intExtra2);
        }
        C8339l.smaato("No view id was present in the intent");
        return null;
    }
}
