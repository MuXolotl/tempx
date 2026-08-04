package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: lِؚٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11688l extends AbstractC2634l {
    public static final byte[] metrica = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] startapp = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean vip;

    public static boolean purchase(C13143l c13143l, byte[] bArr) {
        if (c13143l.yandex() < bArr.length) {
            return false;
        }
        int i = c13143l.loadAd;
        byte[] bArr2 = new byte[bArr.length];
        c13143l.firebase(0, bArr.length, bArr2);
        c13143l.m3562for(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.AbstractC2634l
    public final void amazon(boolean z) {
        super.amazon(z);
        if (z) {
            this.vip = false;
        }
    }

    @Override // defpackage.AbstractC2634l
    public final boolean crashlytics(C13143l c13143l, long j, C2494l c2494l) {
        if (purchase(c13143l, metrica)) {
            byte[] bArrCopyOf = Arrays.copyOf(c13143l.yandex, c13143l.crashlytics);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListCrashlytics = AbstractC13251l.crashlytics(bArrCopyOf);
            if (((C5978l) c2494l.f5291l) == null) {
                C12984l c12984l = new C12984l();
                c12984l.remoteconfig = AbstractC3825l.vip("audio/ogg");
                c12984l.vip = AbstractC3825l.vip("audio/opus");
                c12984l.f25447throws = i;
                c12984l.f25442package = 48000;
                c12984l.adcel = arrayListCrashlytics;
                c2494l.f5291l = new C5978l(c12984l);
                return true;
            }
        } else {
            if (!purchase(c13143l, startapp)) {
                ((C5978l) c2494l.f5291l).getClass();
                return false;
            }
            ((C5978l) c2494l.f5291l).getClass();
            if (!this.vip) {
                this.vip = true;
                c13143l.m3568throw(8);
                C7417l c7417lBilling = AbstractC6968l.billing(AbstractC1186l.pro(AbstractC6968l.mopub(c13143l, false, false).f23023l));
                if (c7417lBilling != null) {
                    C12984l c12984lYandex = ((C5978l) c2494l.f5291l).yandex();
                    c12984lYandex.firebase = c7417lBilling.loadAd(((C5978l) c2494l.f5291l).smaato);
                    c2494l.f5291l = new C5978l(c12984lYandex);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC2634l
    public final long loadAd(C13143l c13143l) {
        byte[] bArr = c13143l.yandex;
        return (((long) this.subs) * AbstractC13251l.purchase(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }
}
