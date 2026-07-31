package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lٌُۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11395l extends C7084l {
    public final C2881l isPro;

    public C11395l(C2881l c2881l) {
        super(new C0869l());
        this.isPro = c2881l;
    }

    @Override // defpackage.C7084l
    public final int admob() {
        return this.isPro.admob;
    }

    @Override // defpackage.C7084l
    public final long amazon() {
        return this.isPro.crashlytics();
    }

    @Override // defpackage.C7084l
    public final long firebase() {
        return this.isPro.isPro();
    }

    @Override // defpackage.C7084l
    public final int isPro() {
        return this.isPro.subs();
    }

    @Override // defpackage.C7084l
    public final long metrica() {
        return this.isPro.vip();
    }

    @Override // defpackage.C7084l
    public final int mopub() {
        return this.isPro.billing();
    }

    @Override // defpackage.C7084l
    public final C3844l purchase(long j) {
        return this.isPro.amazon((int) j);
    }

    @Override // defpackage.C7084l
    public final void remoteconfig(int i) {
        this.isPro.smaato(i);
    }

    @Override // defpackage.C7084l
    public final String smaato() {
        return this.isPro.firebase();
    }

    @Override // defpackage.C7084l
    public final void startapp() throws IOException {
        this.isPro.metrica();
    }

    @Override // defpackage.C7084l
    public final C3844l subs() {
        return this.isPro.admob();
    }

    @Override // defpackage.C7084l
    public final int vip() {
        return this.isPro.remoteconfig();
    }

    @Override // defpackage.C7084l
    public final void yandex(int i, int i2, Object obj) {
        C2881l c2881l = this.isPro;
        AbstractC9361l.billing(i2).admob(new C13161l((InterfaceC16805l) c2881l.subs.get(c2881l.amazon - 1)), i, obj);
    }
}
