package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌّ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12475l implements InterfaceC17792l {
    public final /* synthetic */ int amazon;
    public final /* synthetic */ C9117l crashlytics;
    public final /* synthetic */ InterfaceC17792l loadAd;
    public final /* synthetic */ InterfaceC17792l purchase;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C12475l(InterfaceC17792l interfaceC17792l, C9117l c9117l, int i, InterfaceC17792l interfaceC17792l2, int i2) {
        this.yandex = i2;
        this.crashlytics = c9117l;
        this.amazon = i;
        this.purchase = interfaceC17792l2;
        this.loadAd = interfaceC17792l;
    }

    @Override // defpackage.InterfaceC17792l
    public final Function1 amazon() {
        switch (this.yandex) {
            case 0:
                break;
        }
        return this.loadAd.amazon();
    }

    @Override // defpackage.InterfaceC17792l
    public final Function2 billing() {
        switch (this.yandex) {
            case 0:
                break;
        }
        return this.loadAd.billing();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x008b A[LOOP:0: B:11:0x002f->B:30:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x008e A[SYNTHETIC] */
    @Override // defpackage.InterfaceC17792l
    public final void crashlytics() {
        int i = this.yandex;
        InterfaceC17792l interfaceC17792l = this.purchase;
        int i2 = this.amazon;
        C9117l c9117l = this.crashlytics;
        switch (i) {
            case 0:
                c9117l.f18735l = i2;
                interfaceC17792l.crashlytics();
                C17893l c17893l = c9117l.f18726l;
                C13660l c13660l = c9117l.f18737l;
                long[] jArr = c13660l.yandex;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j) < 128) {
                                    int i6 = (i3 << 3) + i5;
                                    Object obj = c13660l.loadAd[i6];
                                    InterfaceC6797l interfaceC6797l = (InterfaceC6797l) c13660l.crashlytics[i6];
                                    int iSmaato = c17893l.smaato(obj);
                                    if (iSmaato < 0 || iSmaato >= c9117l.f18735l) {
                                        if (iSmaato >= 0) {
                                            Object[] objArr = c17893l.f34848l;
                                            Object obj2 = objArr[iSmaato];
                                            objArr[iSmaato] = AbstractC4333l.loadAd;
                                        }
                                        if (c9117l.f18733l.loadAd(obj)) {
                                            interfaceC6797l.yandex();
                                        }
                                        c13660l.remoteconfig(i6);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i4 == 8) {
                                if (i3 != length) {
                                    i3++;
                                }
                            }
                        } else if (i3 != length) {
                            i3++;
                        }
                    }
                }
                c9117l.mopub(c9117l.f18736l);
                break;
            default:
                c9117l.f18736l = i2;
                interfaceC17792l.crashlytics();
                if (c9117l.f18732l.f7693l == null) {
                    c9117l.mopub(c9117l.f18736l);
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC17792l
    public final int loadAd() {
        switch (this.yandex) {
            case 0:
                break;
        }
        return this.loadAd.loadAd();
    }

    @Override // defpackage.InterfaceC17792l
    public final Function1 mopub() {
        switch (this.yandex) {
            case 0:
                break;
        }
        return this.loadAd.mopub();
    }

    @Override // defpackage.InterfaceC17792l
    public final int purchase() {
        switch (this.yandex) {
            case 0:
                break;
        }
        return this.loadAd.purchase();
    }

    @Override // defpackage.InterfaceC17792l
    public final Map yandex() {
        switch (this.yandex) {
            case 0:
                break;
        }
        return this.loadAd.yandex();
    }
}
