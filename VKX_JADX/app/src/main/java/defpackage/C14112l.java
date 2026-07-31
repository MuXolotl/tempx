package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّٓۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14112l extends AbstractC0306l {
    public HashSet amazon;
    public final C10086l billing;
    public final boolean crashlytics;
    public final boolean loadAd;
    public final /* synthetic */ C6956l mopub;
    public final C6295l purchase;
    public final long yandex;

    public C14112l(C6956l c6956l, long j, boolean z, boolean z2, C16543l c16543l) {
        this.mopub = c6956l;
        this.yandex = j;
        this.loadAd = z;
        this.crashlytics = z2;
        C6295l c6295l = AbstractC13087l.yandex;
        this.purchase = new C6295l();
        this.billing = new C10086l(C11890l.f23708l, C1461l.f3659l);
    }

    @Override // defpackage.AbstractC0306l
    public final void Signature(C6956l c6956l) {
        HashSet hashSet = this.amazon;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Set) it.next()).remove(c6956l.license());
            }
        }
        if (AbstractC2812l.advert(c6956l)) {
            this.purchase.remoteconfig(c6956l);
        }
    }

    @Override // defpackage.AbstractC0306l
    public final void adcel(C4224l c4224l) {
        this.mopub.loadAd.adcel(c4224l);
    }

    @Override // defpackage.AbstractC0306l
    public final InterfaceC12776l admob() {
        return this.mopub.admob;
    }

    @Override // defpackage.AbstractC0306l
    public final void ads(C6931l c6931l) {
        this.mopub.loadAd.ads(c6931l);
    }

    @Override // defpackage.AbstractC0306l
    public final boolean amazon() {
        return this.mopub.loadAd.amazon();
    }

    @Override // defpackage.AbstractC0306l
    public final boolean billing() {
        return this.crashlytics;
    }

    @Override // defpackage.AbstractC0306l
    public final void crashlytics() {
        this.mopub.signatures--;
    }

    @Override // defpackage.AbstractC0306l
    public final boolean firebase() {
        return this.mopub.loadAd.firebase();
    }

    @Override // defpackage.AbstractC0306l
    public final InterfaceC12932l isPro() {
        return this.mopub.loadAd.isPro();
    }

    @Override // defpackage.AbstractC0306l
    public final void license(C6931l c6931l) {
        this.mopub.loadAd.license(c6931l);
    }

    @Override // defpackage.AbstractC0306l
    public final C6295l loadAd(C6931l c6931l, InterfaceC14382l interfaceC14382l, Function2 function2) {
        return this.mopub.loadAd.loadAd(c6931l, interfaceC14382l, function2);
    }

    @Override // defpackage.AbstractC0306l
    public final void metrica(Set set) {
        HashSet hashSet = this.amazon;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.amazon = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.AbstractC0306l
    public final long mopub() {
        return this.yandex;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[LOOP:0: B:9:0x0017->B:22:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066 A[EDGE_INSN: B:26:0x0066->B:23:0x0066 BREAK  A[LOOP:0: B:9:0x0017->B:22:0x0063], SYNTHETIC] */
    public final void pro() {
        C6295l c6295l = this.purchase;
        if (c6295l.subs()) {
            HashSet hashSet = this.amazon;
            if (hashSet != null) {
                Object[] objArr = c6295l.loadAd;
                long[] jArr = c6295l.yandex;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    C6956l c6956l = (C6956l) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(c6956l.license());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            c6295l.loadAd();
        }
    }

    @Override // defpackage.AbstractC0306l
    public final boolean purchase() {
        return this.loadAd;
    }

    @Override // defpackage.AbstractC0306l
    public final AbstractC5758l remoteconfig(AbstractC11411l abstractC11411l) {
        return this.mopub.loadAd.remoteconfig(abstractC11411l);
    }

    @Override // defpackage.AbstractC0306l
    public final void smaato(C6931l c6931l) {
        C6956l c6956l = this.mopub;
        c6956l.loadAd.smaato(c6956l.admob);
        c6956l.loadAd.smaato(c6931l);
    }

    @Override // defpackage.AbstractC0306l
    public final void startapp(C6956l c6956l) {
        this.purchase.yandex(c6956l);
    }

    @Override // defpackage.AbstractC0306l
    public final InterfaceC18556l subs() {
        return (InterfaceC18556l) this.billing.getValue();
    }

    @Override // defpackage.AbstractC0306l
    public final InterfaceC3263l subscription(C11029l c11029l) {
        return this.mopub.loadAd.subscription(c11029l);
    }

    @Override // defpackage.AbstractC0306l
    public final void tapsense() {
        this.mopub.signatures++;
    }

    @Override // defpackage.AbstractC0306l
    public final C6295l vip(C6931l c6931l, InterfaceC14382l interfaceC14382l, C6295l c6295l) {
        return this.mopub.loadAd.vip(c6931l, interfaceC14382l, c6295l);
    }

    @Override // defpackage.AbstractC0306l
    public final void yandex(C6931l c6931l, Function2 function2) {
        this.mopub.loadAd.yandex(c6931l, function2);
    }
}
