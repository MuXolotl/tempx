package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lُؚٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7395l implements InterfaceC14833l {
    public long admob;
    public C3253l amazon;
    public InterfaceC10430l crashlytics;
    public InterfaceC2053l loadAd;
    public int mopub;
    public C17363l purchase;
    public int subs;
    public final C13143l yandex = new C13143l(16);
    public long isPro = -1;
    public int billing = 0;

    @Override // defpackage.InterfaceC14833l
    public final void amazon(long j, long j2) {
        if (j != 0) {
            if (this.billing == 3) {
                C17363l c17363l = this.purchase;
                c17363l.getClass();
                c17363l.amazon(j, j2);
                return;
            }
            return;
        }
        this.billing = 0;
        this.subs = 0;
        this.isPro = -1L;
        if (this.purchase != null) {
            this.purchase = null;
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final void billing(InterfaceC2053l interfaceC2053l) {
        this.loadAd = interfaceC2053l;
    }

    @Override // defpackage.InterfaceC14833l
    public final boolean crashlytics(InterfaceC10430l interfaceC10430l) {
        return AbstractC17828l.amazon((C11826l) interfaceC10430l, true);
    }

    @Override // defpackage.InterfaceC14833l
    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) throws C17655l {
        while (true) {
            int i = this.billing;
            if (i == 0) {
                int i2 = this.subs;
                C13143l c13143l = this.yandex;
                if (i2 == 0) {
                    if (!interfaceC10430l.loadAd(c13143l.yandex, 0, 8, true)) {
                        InterfaceC2053l interfaceC2053l = this.loadAd;
                        interfaceC2053l.getClass();
                        interfaceC2053l.firebase();
                        this.loadAd.tapsense(new C9828l(-9223372036854775807L));
                        this.billing = 4;
                        return -1;
                    }
                    this.subs = 8;
                    c13143l.m3562for(0);
                    this.admob = c13143l.applovin();
                    this.mopub = c13143l.remoteconfig();
                }
                if (this.admob == 1) {
                    interfaceC10430l.readFully(c13143l.yandex, 8, 8);
                    this.subs += 8;
                    this.admob = c13143l.m3564package();
                }
                if (this.mopub == 1836086884) {
                    long position = interfaceC10430l.getPosition();
                    this.isPro = position;
                    long j = this.subs;
                    C16542l c16542l = new C16542l(0L, position - j, -9223372036854775807L, position, this.admob - j);
                    InterfaceC2053l interfaceC2053l2 = this.loadAd;
                    interfaceC2053l2.getClass();
                    InterfaceC8979l interfaceC8979lStartapp = interfaceC2053l2.startapp(1024, 4);
                    C12984l c12984l = new C12984l();
                    c12984l.remoteconfig = AbstractC3825l.vip("image/heic");
                    c12984l.firebase = new C7417l(c16542l);
                    AbstractC9029l.license(c12984l, interfaceC8979lStartapp);
                    this.billing = 2;
                } else {
                    this.billing = 1;
                }
            } else if (i == 1) {
                interfaceC10430l.remoteconfig((int) (this.admob - ((long) this.subs)));
                this.subs = 0;
                this.billing = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return -1;
                        }
                        C18073l.admob();
                        return 0;
                    }
                    if (this.amazon == null || interfaceC10430l != this.crashlytics) {
                        this.crashlytics = interfaceC10430l;
                        this.amazon = new C3253l(interfaceC10430l, this.isPro);
                    }
                    C17363l c17363l = this.purchase;
                    c17363l.getClass();
                    int iLoadAd = c17363l.loadAd(this.amazon, c1014l);
                    if (iLoadAd == 1) {
                        c1014l.f2761l += this.isPro;
                    }
                    return iLoadAd;
                }
                if (this.purchase == null) {
                    this.purchase = new C17363l(InterfaceC5304l.f11423l, 8);
                }
                C3253l c3253l = new C3253l(interfaceC10430l, this.isPro);
                this.amazon = c3253l;
                if (this.purchase.crashlytics(c3253l)) {
                    C17363l c17363l2 = this.purchase;
                    long j2 = this.isPro;
                    InterfaceC2053l interfaceC2053l3 = this.loadAd;
                    interfaceC2053l3.getClass();
                    c17363l2.billing(new C3253l(j2, interfaceC2053l3, 5));
                    this.billing = 3;
                } else {
                    InterfaceC2053l interfaceC2053l4 = this.loadAd;
                    interfaceC2053l4.getClass();
                    interfaceC2053l4.firebase();
                    this.loadAd.tapsense(new C9828l(-9223372036854775807L));
                    this.billing = 4;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final List purchase() {
        C9258l c9258l = AbstractC1186l.f3181l;
        return C13708l.f26763l;
    }

    @Override // defpackage.InterfaceC14833l
    public final void release() {
        C17363l c17363l = this.purchase;
        if (c17363l != null) {
            c17363l.getClass();
            this.purchase = null;
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final InterfaceC14833l yandex() {
        return this;
    }
}
