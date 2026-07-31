package defpackage;

/* JADX INFO: renamed from: lُؓۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1778l extends AbstractC14615l {
    public final C8378l admob;
    public final C0346l firebase;
    public final C7972l isPro;
    public final Integer smaato;
    public final C7972l subs;

    public C1778l(C8378l c8378l, C7972l c7972l, C7972l c7972l2, C0346l c0346l, Integer num) {
        this.admob = c8378l;
        this.subs = c7972l;
        this.isPro = c7972l2;
        this.firebase = c0346l;
        this.smaato = num;
    }

    @Override // defpackage.AbstractC6968l
    public final Integer amazon() {
        return this.smaato;
    }

    @Override // defpackage.AbstractC6968l
    public final AbstractC3302l purchase() {
        return this.admob;
    }

    @Override // defpackage.AbstractC14615l
    public final C0346l subs() {
        return this.firebase;
    }
}
