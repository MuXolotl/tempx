package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: lًْؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1021l {
    public final /* synthetic */ C0189l yandex;

    public C1021l(C0189l c0189l) {
        this.yandex = c0189l;
    }

    public final void amazon() {
        Iterator it = new HashSet(this.yandex.amazon).iterator();
        while (it.hasNext()) {
            ((C1021l) it.next()).amazon();
        }
    }

    public final void billing() {
        Iterator it = new HashSet(this.yandex.amazon).iterator();
        while (it.hasNext()) {
            ((C1021l) it.next()).billing();
        }
    }

    public final void crashlytics() {
        Iterator it = new HashSet(this.yandex.amazon).iterator();
        while (it.hasNext()) {
            ((C1021l) it.next()).crashlytics();
        }
    }

    public final void loadAd(int i) {
        C0189l c0189l = this.yandex;
        c0189l.purchase(i);
        c0189l.yandex(i);
        Iterator it = new HashSet(c0189l.amazon).iterator();
        while (it.hasNext()) {
            ((C1021l) it.next()).loadAd(i);
        }
    }

    public final void purchase() {
        Iterator it = new HashSet(this.yandex.amazon).iterator();
        while (it.hasNext()) {
            ((C1021l) it.next()).purchase();
        }
    }

    public final void yandex() {
        Iterator it = new HashSet(this.yandex.amazon).iterator();
        while (it.hasNext()) {
            ((C1021l) it.next()).yandex();
        }
    }
}
