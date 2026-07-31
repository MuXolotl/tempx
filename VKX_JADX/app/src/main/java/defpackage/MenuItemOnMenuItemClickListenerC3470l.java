package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;

/* JADX INFO: renamed from: lؕٙٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MenuItemOnMenuItemClickListenerC3470l implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ Object crashlytics;
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ MenuItemOnMenuItemClickListenerC3470l(Object obj, Object obj2, int i) {
        this.yandex = i;
        this.loadAd = obj;
        this.crashlytics = obj2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
        int i = this.yandex;
        Object obj = this.crashlytics;
        Object obj2 = this.loadAd;
        switch (i) {
            case 0:
                ((C5249l) obj2).amazon.invoke(((C4496l) obj).yandex);
                break;
            default:
                AbstractC5941l.m1889for((Context) obj2, (TextClassification) obj);
                break;
        }
        return true;
    }
}
