package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lَۘۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10526l extends C11338l {

    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    public boolean f21414l;

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public float f21419return = -1.0f;

    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public int f21418l = -1;

    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public int f21415l = -1;

    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public C14946l f21417l = this.f22864strictfp;

    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public int f21416l = 0;

    public C10526l() {
        this.f22847else.clear();
        this.f22847else.add(this.f21417l);
        int length = this.f22842catch.length;
        for (int i = 0; i < length; i++) {
            this.f22842catch[i] = this.f21417l;
        }
    }

    @Override // defpackage.C11338l
    public final boolean advert() {
        return this.f21414l;
    }

    @Override // defpackage.C11338l
    public final boolean crashlytics() {
        return true;
    }

    @Override // defpackage.C11338l
    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final void mo2928extends(C4847l c4847l, boolean z) {
        if (this.f22866switch == null) {
            return;
        }
        C14946l c14946l = this.f21417l;
        c4847l.getClass();
        int iVip = C4847l.vip(c14946l);
        if (this.f21416l == 1) {
            this.f22846default = iVip;
            this.f22849final = 0;
            m3062synchronized(this.f22866switch.subs());
            m3059native(0);
            return;
        }
        this.f22846default = 0;
        this.f22849final = iVip;
        m3059native(this.f22866switch.metrica());
        m3062synchronized(0);
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final void m2929for(int i) {
        this.f21417l.subs(i);
        this.f21414l = true;
    }

    @Override // defpackage.C11338l
    public final boolean isVip() {
        return this.f21414l;
    }

    @Override // defpackage.C11338l
    public final void loadAd(C4847l c4847l, boolean z) {
        C10664l c10664l = (C10664l) this.f22866switch;
        if (c10664l == null) {
            return;
        }
        Object objMopub = c10664l.mopub(2);
        Object objMopub2 = c10664l.mopub(4);
        C11338l c11338l = this.f22866switch;
        boolean z2 = c11338l != null && c11338l.f22844const[0] == 2;
        if (this.f21416l == 0) {
            objMopub = c10664l.mopub(3);
            objMopub2 = c10664l.mopub(5);
            C11338l c11338l2 = this.f22866switch;
            z2 = c11338l2 != null && c11338l2.f22844const[1] == 2;
        }
        if (this.f21414l) {
            C14946l c14946l = this.f21417l;
            if (c14946l.crashlytics) {
                C4657l c4657lFirebase = c4847l.firebase(c14946l);
                c4847l.amazon(c4657lFirebase, this.f21417l.crashlytics());
                if (this.f21418l != -1) {
                    if (z2) {
                        c4847l.billing(c4847l.firebase(objMopub2), c4657lFirebase, 0, 5);
                    }
                } else if (this.f21415l != -1 && z2) {
                    C4657l c4657lFirebase2 = c4847l.firebase(objMopub2);
                    c4847l.billing(c4657lFirebase, c4847l.firebase(objMopub), 0, 5);
                    c4847l.billing(c4657lFirebase2, c4657lFirebase, 0, 5);
                }
                this.f21414l = false;
                return;
            }
        }
        if (this.f21418l != -1) {
            C4657l c4657lFirebase3 = c4847l.firebase(this.f21417l);
            c4847l.purchase(c4657lFirebase3, c4847l.firebase(objMopub), this.f21418l, 8);
            if (z2) {
                c4847l.billing(c4847l.firebase(objMopub2), c4657lFirebase3, 0, 5);
                return;
            }
            return;
        }
        if (this.f21415l != -1) {
            C4657l c4657lFirebase4 = c4847l.firebase(this.f21417l);
            C4657l c4657lFirebase5 = c4847l.firebase(objMopub2);
            c4847l.purchase(c4657lFirebase4, c4657lFirebase5, -this.f21415l, 8);
            if (z2) {
                c4847l.billing(c4657lFirebase4, c4847l.firebase(objMopub), 0, 5);
                c4847l.billing(c4657lFirebase5, c4657lFirebase4, 0, 5);
                return;
            }
            return;
        }
        if (this.f21419return != -1.0f) {
            C4657l c4657lFirebase6 = c4847l.firebase(this.f21417l);
            C4657l c4657lFirebase7 = c4847l.firebase(objMopub2);
            float f = this.f21419return;
            C1846l c1846lSmaato = c4847l.smaato();
            c1846lSmaato.amazon.mopub(c4657lFirebase6, -1.0f);
            c1846lSmaato.amazon.mopub(c4657lFirebase7, f);
            c4847l.crashlytics(c1846lSmaato);
        }
    }

    @Override // defpackage.C11338l
    public final C14946l mopub(int i) {
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi != 1) {
            if (iInmobi != 2) {
                if (iInmobi != 3) {
                    if (iInmobi != 4) {
                        return null;
                    }
                }
            }
            if (this.f21416l == 0) {
                return this.f21417l;
            }
            return null;
        }
        if (this.f21416l == 1) {
            return this.f21417l;
        }
        return null;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final void m2930throw(int i) {
        if (this.f21416l == i) {
            return;
        }
        this.f21416l = i;
        ArrayList arrayList = this.f22847else;
        arrayList.clear();
        if (this.f21416l == 1) {
            this.f21417l = this.f22867synchronized;
        } else {
            this.f21417l = this.f22864strictfp;
        }
        arrayList.add(this.f21417l);
        C14946l[] c14946lArr = this.f22842catch;
        int length = c14946lArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c14946lArr[i2] = this.f21417l;
        }
    }
}
