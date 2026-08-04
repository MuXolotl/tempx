package defpackage;

import android.widget.RemoteViews;
import java.util.ArrayList;

/* JADX INFO: renamed from: lِؒۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0997l {
    public static final C0997l amazon = new C0997l(new long[0], new RemoteViews[0], 1);
    public final int crashlytics;
    public final RemoteViews[] loadAd;
    public final long[] yandex;

    public C0997l(long[] jArr, RemoteViews[] remoteViewsArr, int i) {
        this.yandex = jArr;
        this.loadAd = remoteViewsArr;
        this.crashlytics = i;
        if (jArr.length != remoteViewsArr.length) {
            C8339l.metrica("RemoteCollectionItems has different number of ids and views");
            throw null;
        }
        if (i < 1) {
            C8339l.metrica("View type count must be >= 1");
            throw null;
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = AbstractC16901l.m4245throws(arrayList).size();
        if (size <= this.crashlytics) {
            return;
        }
        throw new IllegalArgumentException(("View type count is set to " + this.crashlytics + ", but the collection contains " + size + " different layout ids").toString());
    }
}
