package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lُٗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11089l extends AbstractC15025l {
    public C7941l Signature;
    public final boolean adcel;
    public final ArrayList ads;
    public long license;
    public final boolean metrica;
    public long pro;
    public final long remoteconfig;
    public final long smaato;
    public final boolean startapp;
    public final C4322l subscription;
    public C12226l tapsense;
    public final boolean vip;

    public C11089l(C7361l c7361l) {
        super(c7361l.yandex);
        this.smaato = c7361l.loadAd;
        this.remoteconfig = c7361l.crashlytics;
        this.vip = c7361l.amazon;
        this.metrica = c7361l.purchase;
        this.startapp = c7361l.billing;
        this.adcel = c7361l.mopub;
        this.ads = new ArrayList();
        this.subscription = new C4322l();
    }

    public final void applovin(AbstractC10759l abstractC10759l) {
        long j;
        long j2;
        long j3;
        C4322l c4322l = this.subscription;
        abstractC10759l.vip(0, c4322l);
        long j4 = c4322l.startapp;
        C12226l c12226l = this.tapsense;
        long j5 = this.remoteconfig;
        ArrayList arrayList = this.ads;
        if (c12226l == null || arrayList.isEmpty() || this.metrica) {
            boolean z = this.startapp;
            j = this.smaato;
            if (z) {
                long j6 = c4322l.smaato;
                j += j6;
                j2 = j6 + j5;
            } else {
                j2 = j5;
            }
            this.license = j4 + j;
            this.pro = j5 != Long.MIN_VALUE ? j4 + j2 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C15810l c15810l = (C15810l) arrayList.get(i);
                long j7 = this.license;
                long j8 = this.pro;
                c15810l.f31050l = j7;
                c15810l.f31044l = j8;
            }
            j3 = j2;
        } else {
            j = this.license - j4;
            j3 = j5 != Long.MIN_VALUE ? this.pro - j4 : Long.MIN_VALUE;
        }
        try {
            C12226l c12226l2 = new C12226l(abstractC10759l, j, j3, this.adcel);
            this.tapsense = c12226l2;
            remoteconfig(c12226l2);
        } catch (C7941l e) {
            this.Signature = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C15810l) arrayList.get(i2)).f31045l = this.Signature;
            }
        }
    }

    @Override // defpackage.AbstractC7238l, defpackage.AbstractC14384l
    public final void isPro() throws C7941l {
        C7941l c7941l = this.Signature;
        if (c7941l != null) {
            throw c7941l;
        }
        super.isPro();
    }

    @Override // defpackage.AbstractC15025l
    public final void isVip(AbstractC10759l abstractC10759l) {
        if (this.Signature != null) {
            return;
        }
        applovin(abstractC10759l);
    }

    @Override // defpackage.AbstractC14384l
    public final InterfaceC8782l loadAd(C5019l c5019l, InterfaceC3783l interfaceC3783l, long j) {
        C15810l c15810l = new C15810l(this.firebase.loadAd(c5019l, interfaceC3783l, j), this.vip, this.license, this.pro, 0);
        this.ads.add(c15810l);
        return c15810l;
    }

    @Override // defpackage.AbstractC7238l, defpackage.AbstractC14384l
    public final void startapp() {
        super.startapp();
        this.Signature = null;
        this.tapsense = null;
    }

    @Override // defpackage.AbstractC14384l
    public final void vip(InterfaceC8782l interfaceC8782l) {
        ArrayList arrayList = this.ads;
        AbstractC12442l.subscription(arrayList.remove(interfaceC8782l));
        this.firebase.vip(((C15810l) interfaceC8782l).f31047l);
        if (!arrayList.isEmpty() || this.metrica) {
            return;
        }
        C12226l c12226l = this.tapsense;
        c12226l.getClass();
        applovin(c12226l.purchase);
    }

    @Override // defpackage.AbstractC14384l
    public final boolean yandex(C2427l c2427l) {
        AbstractC14384l abstractC14384l = this.firebase;
        return abstractC14384l.admob().purchase.equals(c2427l.purchase) && abstractC14384l.yandex(c2427l);
    }
}
