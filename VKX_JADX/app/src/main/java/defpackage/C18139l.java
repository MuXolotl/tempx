package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: l٘ۗۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18139l extends AbstractC1387l {
    public static final C18139l amazon = new C18139l(1, 0, 2);

    @Override // defpackage.AbstractC1387l
    public final void amazon(C12676l c12676l, InterfaceC3770l interfaceC3770l, C13006l c13006l, C15389l c15389l, InterfaceC3928l interfaceC3928l) {
        int[] iArr;
        C12317l c12317l;
        int iCrashlytics;
        int iMopub = c12676l.mopub(0);
        if (c13006l.vip != 0) {
            AbstractC2032l.yandex("Cannot move a group while inserting");
        }
        if (iMopub < 0) {
            AbstractC2032l.yandex("Parameter offset is out of bounds");
        }
        if (iMopub == 0) {
            return;
        }
        int i = c13006l.tapsense;
        int i2 = c13006l.license;
        int i3 = c13006l.Signature;
        int i4 = i;
        while (true) {
            iArr = c13006l.loadAd;
            if (iMopub <= 0) {
                break;
            }
            i4 += iArr[(c13006l.ads(i4) * 5) + 3];
            if (i4 > i3) {
                AbstractC2032l.yandex("Parameter offset is out of bounds");
            }
            iMopub--;
        }
        int i5 = iArr[(c13006l.ads(i4) * 5) + 3];
        int iMopub2 = c13006l.mopub(c13006l.loadAd, c13006l.ads(c13006l.tapsense));
        int iMopub3 = c13006l.mopub(c13006l.loadAd, c13006l.ads(i4));
        int i6 = i4 + i5;
        int iMopub4 = c13006l.mopub(c13006l.loadAd, c13006l.ads(i6));
        int i7 = iMopub4 - iMopub3;
        c13006l.ad(i7, Math.max(c13006l.tapsense - 1, 0));
        c13006l.pro(i5);
        int[] iArr2 = c13006l.loadAd;
        int iAds = c13006l.ads(i6) * 5;
        AbstractC8669l.ad(c13006l.ads(i) * 5, iAds, iArr2, iArr2, (i5 * 5) + iAds);
        if (i7 > 0) {
            Object[] objArr = c13006l.crashlytics;
            int iAdmob = c13006l.admob(iMopub3 + i7);
            System.arraycopy(objArr, iAdmob, objArr, iMopub2, c13006l.admob(iMopub4 + i7) - iAdmob);
        }
        int i8 = iMopub3 + i7;
        int i9 = i8 - iMopub2;
        int i10 = c13006l.firebase;
        int i11 = c13006l.smaato;
        int length = c13006l.crashlytics.length;
        int i12 = c13006l.remoteconfig;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iAds2 = c13006l.ads(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iAds2 * 5) + 4] = C13006l.subs(C13006l.subs(c13006l.mopub(iArr2, iAds2) - i15, i12 < iAds2 ? 0 : i10, i11, length), c13006l.firebase, c13006l.smaato, c13006l.crashlytics.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iStartapp = c13006l.startapp();
        int iYandex = AbstractC0736l.yandex(c13006l.amazon, i6, iStartapp);
        ArrayList arrayList = new ArrayList();
        if (iYandex >= 0) {
            while (iYandex < c13006l.amazon.size() && (iCrashlytics = c13006l.crashlytics((c12317l = (C12317l) c13006l.amazon.get(iYandex)))) >= i6 && iCrashlytics < i16) {
                arrayList.add(c12317l);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            C12317l c12317l2 = (C12317l) arrayList.get(i18);
            int iCrashlytics2 = c13006l.crashlytics(c12317l2) + i17;
            if (iCrashlytics2 >= c13006l.mopub) {
                c12317l2.yandex = -(iStartapp - iCrashlytics2);
            } else {
                c12317l2.yandex = iCrashlytics2;
            }
            c13006l.amazon.add(AbstractC0736l.yandex(c13006l.amazon, iCrashlytics2, iStartapp), c12317l2);
        }
        if (c13006l.m3525strictfp(i6, i5)) {
            AbstractC2032l.yandex("Unexpectedly removed anchors");
        }
        c13006l.remoteconfig(i2, c13006l.Signature, i);
        if (i7 > 0) {
            c13006l.m3530volatile(i8, i7, i6 - 1);
        }
    }
}
