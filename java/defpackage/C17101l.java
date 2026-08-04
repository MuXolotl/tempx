package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lْٕٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17101l implements InterfaceC5793l {
    public final C8232l yandex;

    public C17101l(C8232l c8232l) {
        this.yandex = c8232l;
    }

    @Override // defpackage.InterfaceC5793l
    public final boolean amazon() {
        return !this.yandex.mopub().remoteconfig.isEmpty();
    }

    @Override // defpackage.InterfaceC5793l
    public final int crashlytics() {
        int i;
        C8232l c8232l = this.yandex;
        int i2 = 0;
        if (c8232l.mopub().remoteconfig.isEmpty()) {
            return 0;
        }
        C13217l c13217lMopub = c8232l.mopub();
        EnumC7283l enumC7283l = c13217lMopub.adcel;
        EnumC7283l enumC7283l2 = EnumC7283l.f15126l;
        int iSubs = (int) (enumC7283l == enumC7283l2 ? c13217lMopub.subs() & 4294967295L : c13217lMopub.subs() >> 32);
        C13217l c13217lMopub2 = c8232l.mopub();
        boolean z = c13217lMopub2.adcel == enumC7283l2;
        List list = c13217lMopub2.remoteconfig;
        if (!list.isEmpty()) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < list.size()) {
                int iAmazon = AbstractC8513l.amazon(z, c13217lMopub2, i3);
                if (iAmazon == -1) {
                    i3++;
                } else {
                    int iMax = 0;
                    while (i3 < list.size() && AbstractC8513l.amazon(z, c13217lMopub2, i3) == iAmazon) {
                        iMax = Math.max(iMax, (int) (z ? ((C9696l) list.get(i3)).pro & 4294967295L : ((C9696l) list.get(i3)).pro >> 32));
                        i3++;
                    }
                    i4 += iMax;
                    i5++;
                }
            }
            i2 = (i4 / i5) + c13217lMopub2.subscription;
        }
        if (i2 != 0 && (i = iSubs / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.InterfaceC5793l
    public final int loadAd() {
        return ((C9696l) AbstractC16901l.m4214continue(this.yandex.mopub().remoteconfig)).yandex;
    }

    @Override // defpackage.InterfaceC5793l
    public final int purchase() {
        return this.yandex.amazon.loadAd.admob();
    }

    @Override // defpackage.InterfaceC5793l
    public final int yandex() {
        return this.yandex.mopub().startapp;
    }
}
