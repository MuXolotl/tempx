package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؗٔۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4888l extends AbstractC2634l {
    public C16528l metrica;
    public C5478l vip;

    @Override // defpackage.AbstractC2634l
    public final void amazon(boolean z) {
        super.amazon(z);
        if (z) {
            this.vip = null;
            this.metrica = null;
        }
    }

    @Override // defpackage.AbstractC2634l
    public final boolean crashlytics(C13143l c13143l, long j, C2494l c2494l) {
        byte[] bArr = c13143l.yandex;
        C5478l c5478l = this.vip;
        if (c5478l == null) {
            C5478l c5478l2 = new C5478l(bArr, 17);
            this.vip = c5478l2;
            C12984l c12984lYandex = c5478l2.crashlytics(Arrays.copyOfRange(bArr, 9, c13143l.crashlytics), null).yandex();
            c12984lYandex.remoteconfig = AbstractC3825l.vip("audio/ogg");
            c2494l.f5291l = new C5978l(c12984lYandex);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            C16528l c16528l = this.metrica;
            if (c16528l != null) {
                c16528l.f32303l = j;
                c2494l.f5290l = c16528l;
            }
            ((C5978l) c2494l.f5291l).getClass();
            return false;
        }
        C18595l c18595lCrashlytics = AbstractC13273l.crashlytics(c13143l);
        C5478l c5478l3 = new C5478l(c5478l.yandex, c5478l.loadAd, c5478l.crashlytics, c5478l.amazon, c5478l.purchase, c5478l.mopub, c5478l.admob, c5478l.isPro, c18595lCrashlytics, c5478l.smaato);
        this.vip = c5478l3;
        C16528l c16528l2 = new C16528l();
        c16528l2.f32302l = c5478l3;
        c16528l2.f32305l = c18595lCrashlytics;
        c16528l2.f32303l = -1L;
        c16528l2.f32306l = -1L;
        this.metrica = c16528l2;
        return true;
    }

    @Override // defpackage.AbstractC2634l
    public final long loadAd(C13143l c13143l) {
        byte[] bArr = c13143l.yandex;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            c13143l.m3568throw(4);
            c13143l.m3566strictfp();
        }
        int iMopub = AbstractC15439l.mopub(i, c13143l);
        c13143l.m3562for(0);
        return iMopub;
    }
}
