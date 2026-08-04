package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؗؕۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4657l implements Comparable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f9478l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public float f9480l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f9482l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f9477l = -1;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f9474l = -1;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f9481l = 0;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f9484l = false;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final float[] f9475l = new float[9];

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final float[] f9476l = new float[9];

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C1846l[] f9483l = new C1846l[16];

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f9479l = 0;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f9485l = 0;

    public C4657l(int i) {
        this.f9482l = i;
    }

    public final void amazon(C4847l c4847l, float f) {
        this.f9480l = f;
        this.f9484l = true;
        int i = this.f9479l;
        this.f9474l = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f9483l[i2].admob(c4847l, this, false);
        }
        this.f9479l = 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f9477l - ((C4657l) obj).f9477l;
    }

    public final void crashlytics() {
        this.f9482l = 5;
        this.f9481l = 0;
        this.f9477l = -1;
        this.f9474l = -1;
        this.f9480l = 0.0f;
        this.f9484l = false;
        int i = this.f9479l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f9483l[i2] = null;
        }
        this.f9479l = 0;
        this.f9485l = 0;
        this.f9478l = false;
        Arrays.fill(this.f9476l, 0.0f);
    }

    public final void loadAd(C1846l c1846l) {
        int i = this.f9479l;
        int i2 = 0;
        while (i2 < i) {
            if (this.f9483l[i2] == c1846l) {
                while (i2 < i - 1) {
                    C1846l[] c1846lArr = this.f9483l;
                    int i3 = i2 + 1;
                    c1846lArr[i2] = c1846lArr[i3];
                    i2 = i3;
                }
                this.f9479l--;
                return;
            }
            i2++;
        }
    }

    public final void purchase(C4847l c4847l, C1846l c1846l) {
        int i = this.f9479l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f9483l[i2].subs(c4847l, c1846l, false);
        }
        this.f9479l = 0;
    }

    public final String toString() {
        return "" + this.f9477l;
    }

    public final void yandex(C1846l c1846l) {
        int i = 0;
        while (true) {
            int i2 = this.f9479l;
            C1846l[] c1846lArr = this.f9483l;
            if (i >= i2) {
                if (i2 >= c1846lArr.length) {
                    this.f9483l = (C1846l[]) Arrays.copyOf(c1846lArr, c1846lArr.length * 2);
                }
                C1846l[] c1846lArr2 = this.f9483l;
                int i3 = this.f9479l;
                c1846lArr2[i3] = c1846l;
                this.f9479l = i3 + 1;
                return;
            }
            if (c1846lArr[i] == c1846l) {
                return;
            } else {
                i++;
            }
        }
    }
}
