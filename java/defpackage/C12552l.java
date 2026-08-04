package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: lِّٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12552l {
    public static final ExecutorC14538l admob = new ExecutorC14538l();
    public final CopyOnWriteArrayList amazon = new CopyOnWriteArrayList();
    public List billing = Collections.EMPTY_LIST;
    public final ExecutorC14538l crashlytics = admob;
    public final C10023l loadAd;
    public int mopub;
    public List purchase;
    public final C5008l yandex;

    public C12552l(C5008l c5008l, C10023l c10023l) {
        this.yandex = c5008l;
        this.loadAd = c10023l;
    }

    public final void yandex() {
        Iterator it = this.amazon.iterator();
        while (it.hasNext()) {
            AbstractC14630l abstractC14630l = ((C6824l) it.next()).yandex;
        }
    }
}
