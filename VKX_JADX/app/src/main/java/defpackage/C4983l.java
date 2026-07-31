package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: lًؗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4983l {
    public final /* synthetic */ int amazon;
    public final CopyOnWriteArrayList crashlytics;
    public boolean loadAd;
    public final Object purchase;
    public final ArrayList yandex;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4983l(C3464l c3464l) {
        this(c3464l.purchase());
        this.amazon = 6;
        this.purchase = c3464l;
        c3464l.crashlytics = AbstractC9905l.admob(c3464l.crashlytics, new C8250l(12, this));
    }

    public final void amazon() {
        CopyOnWriteArrayList<AutoCloseable> copyOnWriteArrayList = this.crashlytics;
        for (AutoCloseable autoCloseable : copyOnWriteArrayList) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                AbstractC14238l.subscription((ExecutorService) autoCloseable);
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
            } else if (autoCloseable instanceof DrmManagerClient) {
                ((DrmManagerClient) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof ContentProviderClient)) {
                    C11983l.crashlytics();
                    return;
                }
                ((ContentProviderClient) autoCloseable).release();
            }
        }
        copyOnWriteArrayList.clear();
        ArrayList arrayList = this.yandex;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C0760l) it.next()).billing();
        }
        arrayList.clear();
    }

    public final void purchase(boolean z) {
        this.loadAd = z;
        for (C0760l c0760l : this.yandex) {
            c0760l.mopub(c0760l.purchase && z);
        }
    }

    public final void yandex() {
    }

    public C4983l(boolean z) {
        this.yandex = new ArrayList();
        this.loadAd = z;
        this.crashlytics = new CopyOnWriteArrayList();
    }

    public final void crashlytics(C0560l c0560l) {
    }

    public final void loadAd(C0560l c0560l) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4983l(int i, Object obj) {
        this(false);
        this.amazon = i;
        this.purchase = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4983l(C16195l c16195l) {
        this(true);
        this.amazon = 7;
        this.purchase = c16195l;
    }
}
