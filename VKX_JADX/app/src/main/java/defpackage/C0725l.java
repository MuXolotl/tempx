package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: lٖؑۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0725l extends C10806l {

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final SparseBooleanArray f2219case;

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final boolean f2220catch;

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final SparseArray f2221else;

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final boolean f2222extends;

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final boolean f2223for;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final boolean f2224native;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final boolean f2225private;

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final boolean f2226throw;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final boolean f2227volatile;

    public C0725l(C9205l c9205l) {
        amazon(c9205l);
        this.f2227volatile = c9205l.f18947l;
        this.f2224native = c9205l.f18943l;
        this.f2225private = c9205l.f18944l;
        this.f2222extends = c9205l.f18939l;
        this.f2223for = c9205l.f18941l;
        this.f2226throw = c9205l.f18945l;
        this.f2220catch = c9205l.f18946l;
        SparseArray sparseArray = c9205l.f18940l;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.f2221else = sparseArray2;
        this.f2219case = c9205l.f18942l.clone();
    }

    @Override // defpackage.C10806l
    public final C10806l crashlytics() {
        super.crashlytics();
        return this;
    }

    @Override // defpackage.C10806l
    public final C4970l loadAd() {
        return new C9205l(this);
    }

    @Override // defpackage.C10806l
    public final void yandex(C0815l c0815l) {
        this.f21852synchronized.put(c0815l.yandex, c0815l);
    }

    public C0725l() {
        this.f2221else = new SparseArray();
        this.f2219case = new SparseBooleanArray();
        this.f2227volatile = true;
        this.f2224native = true;
        this.f2225private = true;
        this.f2222extends = true;
        this.f2223for = true;
        this.f2226throw = true;
        this.f2220catch = true;
    }
}
