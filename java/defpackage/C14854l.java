package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lّٔٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14854l implements InterfaceC14833l {
    public int amazon;
    public InterfaceC2053l billing;
    public final String crashlytics;
    public final int loadAd;
    public InterfaceC8979l mopub;
    public int purchase;
    public final int yandex;

    public C14854l(int i, int i2, String str) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = str;
    }

    @Override // defpackage.InterfaceC14833l
    public final void amazon(long j, long j2) {
        if (j == 0 || this.purchase == 1) {
            this.purchase = 1;
            this.amazon = 0;
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final void billing(InterfaceC2053l interfaceC2053l) {
        this.billing = interfaceC2053l;
        InterfaceC8979l interfaceC8979lStartapp = interfaceC2053l.startapp(1024, 4);
        this.mopub = interfaceC8979lStartapp;
        C12984l c12984l = new C12984l();
        String str = this.crashlytics;
        c12984l.remoteconfig = AbstractC3825l.vip(str);
        c12984l.vip = AbstractC3825l.vip(str);
        AbstractC9029l.license(c12984l, interfaceC8979lStartapp);
        this.billing.firebase();
        this.billing.tapsense(new C10455l());
        this.purchase = 1;
    }

    @Override // defpackage.InterfaceC14833l
    public final boolean crashlytics(InterfaceC10430l interfaceC10430l) {
        int i = this.loadAd;
        int i2 = this.yandex;
        AbstractC12442l.subscription((i2 == -1 || i == -1) ? false : true);
        C13143l c13143l = new C13143l(i);
        ((C11826l) interfaceC10430l).billing(c13143l.yandex, 0, i, false);
        return c13143l.m3567synchronized() == i2;
    }

    @Override // defpackage.InterfaceC14833l
    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) {
        int i = this.purchase;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            C18073l.admob();
            return 0;
        }
        InterfaceC8979l interfaceC8979l = this.mopub;
        interfaceC8979l.getClass();
        int iBilling = interfaceC8979l.billing(interfaceC10430l, 1024, true);
        if (iBilling != -1) {
            this.amazon += iBilling;
            return 0;
        }
        this.purchase = 2;
        this.mopub.yandex(0L, 1, this.amazon, 0, null);
        this.amazon = 0;
        return 0;
    }

    @Override // defpackage.InterfaceC14833l
    public final List purchase() {
        C9258l c9258l = AbstractC1186l.f3181l;
        return C13708l.f26763l;
    }

    @Override // defpackage.InterfaceC14833l
    public final void release() {
    }

    @Override // defpackage.InterfaceC14833l
    public final InterfaceC14833l yandex() {
        return this;
    }
}
