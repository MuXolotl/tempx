package defpackage;

import android.view.WindowInsets;

/* JADX INFO: renamed from: lؓٙٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C1928l extends C6892l {
    public C15496l Signature;
    public C15496l license;
    public C15496l tapsense;

    public C1928l(C1473l c1473l, WindowInsets windowInsets) {
        super(c1473l, windowInsets);
        this.tapsense = null;
        this.Signature = null;
        this.license = null;
    }

    @Override // defpackage.C3521l, defpackage.C17212l
    public C1473l ads(int i, int i2, int i3, int i4) {
        return C1473l.admob(this.crashlytics.inset(i, i2, i3, i4), null);
    }

    @Override // defpackage.C17212l
    public C15496l firebase() {
        if (this.Signature == null) {
            this.Signature = C15496l.crashlytics(this.crashlytics.getMandatorySystemGestureInsets());
        }
        return this.Signature;
    }

    @Override // defpackage.C17212l
    public C15496l metrica() {
        if (this.license == null) {
            this.license = C15496l.crashlytics(this.crashlytics.getTappableElementInsets());
        }
        return this.license;
    }

    @Override // defpackage.C17212l
    public C15496l remoteconfig() {
        if (this.tapsense == null) {
            this.tapsense = C15496l.crashlytics(this.crashlytics.getSystemGestureInsets());
        }
        return this.tapsense;
    }

    public C1928l(C1473l c1473l, C1928l c1928l) {
        super(c1473l, c1928l);
        this.tapsense = null;
        this.Signature = null;
        this.license = null;
    }

    @Override // defpackage.C17815l, defpackage.C17212l
    public void isVip(C15496l c15496l) {
    }
}
