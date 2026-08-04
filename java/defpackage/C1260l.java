package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٟؒۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1260l extends C1852l {
    public final C1852l metrica;
    public boolean startapp;

    public C1260l(long j, C8739l c8739l, Function1 function1, Function1 function2, C1852l c1852l) {
        super(j, c8739l, function1, function2);
        this.metrica = c1852l;
        c1852l.firebase();
    }

    @Override // defpackage.C1852l, defpackage.AbstractC18620l
    public final void crashlytics() {
        if (this.crashlytics) {
            return;
        }
        super.crashlytics();
        if (this.startapp) {
            return;
        }
        this.startapp = true;
        this.metrica.smaato();
    }

    @Override // defpackage.C1852l
    public final AbstractC6873l pro() {
        C1260l c1260l;
        C1852l c1852l = this.metrica;
        if (c1852l.remoteconfig || c1852l.crashlytics) {
            return new C4728l(this);
        }
        C6295l c6295l = this.admob;
        long j = this.loadAd;
        HashMap mapLoadAd = c6295l != null ? AbstractC9620l.loadAd(c1852l.mopub(), this, this.metrica.amazon()) : null;
        synchronized (AbstractC9620l.crashlytics) {
            try {
                AbstractC9620l.crashlytics(this);
                if (c6295l == null || c6295l.amazon == 0) {
                    c1260l = this;
                    c1260l.yandex();
                    Unit unit = Unit.INSTANCE;
                } else {
                    c1260l = this;
                    AbstractC6873l abstractC6873lIsVip = c1260l.isVip(this.metrica.mopub(), c6295l, mapLoadAd, this.metrica.amazon());
                    if (!abstractC6873lIsVip.equals(C16423l.billing)) {
                        return abstractC6873lIsVip;
                    }
                    C6295l c6295lAd = c1260l.metrica.ad();
                    if (c6295lAd != null) {
                        c6295lAd.firebase(c6295l);
                    } else {
                        c1260l.metrica.applovin(c6295l);
                        c1260l.admob = null;
                    }
                }
                if (AbstractC8576l.isPro(c1260l.metrica.mopub(), j) < 0) {
                    c1260l.metrica.license();
                }
                C1852l c1852l2 = c1260l.metrica;
                c1852l2.ads(c1852l2.amazon().billing(j).amazon(c1260l.isPro));
                c1260l.metrica.signatures(j);
                C1852l c1852l3 = c1260l.metrica;
                int i = c1260l.amazon;
                c1260l.amazon = -1;
                if (i >= 0) {
                    int[] iArr = c1852l3.firebase;
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    c1852l3.firebase = iArrCopyOf;
                } else {
                    c1852l3.getClass();
                }
                c1260l.metrica.premium(c1260l.isPro);
                C1852l c1852l4 = c1260l.metrica;
                int[] iArr2 = c1260l.firebase;
                c1852l4.getClass();
                if (iArr2.length != 0) {
                    int[] iArr3 = c1852l4.firebase;
                    if (iArr3.length != 0) {
                        int length2 = iArr3.length;
                        int length3 = iArr2.length;
                        int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                        System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                        iArr2 = iArrCopyOf2;
                    }
                    c1852l4.firebase = iArr2;
                }
                Unit unit2 = Unit.INSTANCE;
                c1260l.remoteconfig = true;
                if (!c1260l.startapp) {
                    c1260l.startapp = true;
                    c1260l.metrica.smaato();
                }
                return C16423l.billing;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
