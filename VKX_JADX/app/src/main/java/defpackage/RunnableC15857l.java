package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lٕٟۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC15857l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6285l f31116l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f31117l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31118l = 0;

    public RunnableC15857l(C1185l c1185l, long j) {
        this.f31117l = j;
        Objects.requireNonNull(c1185l);
        this.f31116l = c1185l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f31118l;
        long j = this.f31117l;
        AbstractC6285l abstractC6285l = this.f31116l;
        switch (i) {
            case 0:
                ((C1185l) abstractC6285l).m846l(j);
                break;
            default:
                C3148l c3148l = (C3148l) abstractC6285l;
                C1185l c1185l = ((C17417l) c3148l.f833l).f33952l;
                C17417l.purchase(c1185l);
                c1185l.m847l(j);
                c3148l.f6771l = null;
                break;
        }
    }

    public RunnableC15857l(C3148l c3148l, long j) {
        this.f31117l = j;
        Objects.requireNonNull(c3148l);
        this.f31116l = c3148l;
    }
}
