package defpackage;

import android.text.SegmentFinder;

/* JADX INFO: renamed from: lٌٓؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8754l extends SegmentFinder {
    public final /* synthetic */ C0848l yandex;

    public C8754l(C0848l c0848l) {
        this.yandex = c0848l;
    }

    public final int nextEndBoundary(int i) {
        return this.yandex.purchase(i);
    }

    public final int nextStartBoundary(int i) {
        return this.yandex.yandex(i);
    }

    public final int previousEndBoundary(int i) {
        return this.yandex.loadAd(i);
    }

    public final int previousStartBoundary(int i) {
        return this.yandex.amazon(i);
    }
}
