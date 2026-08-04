package defpackage;

/* JADX INFO: renamed from: lٌِۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11716l extends AbstractC14615l {
    public final C2385l admob;
    public final Integer firebase;
    public final C0346l isPro;
    public final C7972l subs;

    public C11716l(C2385l c2385l, C7972l c7972l, C0346l c0346l, Integer num) {
        this.admob = c2385l;
        this.subs = c7972l;
        this.isPro = c0346l;
        this.firebase = num;
    }

    @Override // defpackage.AbstractC6968l
    public final Integer amazon() {
        return this.firebase;
    }

    @Override // defpackage.AbstractC6968l
    public final AbstractC3302l purchase() {
        return this.admob;
    }

    @Override // defpackage.AbstractC14615l
    public final C0346l subs() {
        return this.isPro;
    }
}
