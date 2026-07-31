package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lُّؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4045l implements InterfaceC5793l {
    public final C7583l yandex;

    public C4045l(C7583l c7583l) {
        this.yandex = c7583l;
    }

    @Override // defpackage.InterfaceC5793l
    public final boolean amazon() {
        return !this.yandex.mopub().remoteconfig.isEmpty();
    }

    @Override // defpackage.InterfaceC5793l
    public final int crashlytics() {
        int i;
        C7583l c7583l = this.yandex;
        int size = 0;
        if (c7583l.mopub().remoteconfig.isEmpty()) {
            return 0;
        }
        C16122l c16122lMopub = c7583l.mopub();
        C16122l c16122l = AbstractC15187l.yandex;
        EnumC7283l enumC7283l = c16122lMopub.license;
        EnumC7283l enumC7283l2 = EnumC7283l.f15126l;
        int i2 = (int) (enumC7283l == enumC7283l2 ? c16122lMopub.vip & 4294967295L : c16122lMopub.vip >> 32);
        C16122l c16122lMopub2 = c7583l.mopub();
        List list = c16122lMopub2.remoteconfig;
        if (!list.isEmpty()) {
            int size2 = list.size();
            int i3 = 0;
            while (size < size2) {
                C15724l c15724l = (C15724l) list.get(size);
                i3 += (int) (c16122lMopub2.license == enumC7283l2 ? c15724l.license & 4294967295L : c15724l.license >> 32);
                size++;
            }
            size = (i3 / list.size()) + c16122lMopub2.subscription;
        }
        if (size != 0 && (i = i2 / size) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.InterfaceC5793l
    public final int loadAd() {
        return ((C15724l) AbstractC16901l.m4214continue(this.yandex.mopub().remoteconfig)).yandex;
    }

    @Override // defpackage.InterfaceC5793l
    public final int purchase() {
        return ((C15308l) this.yandex.crashlytics.f15343l).admob();
    }

    @Override // defpackage.InterfaceC5793l
    public final int yandex() {
        return this.yandex.mopub().smaato;
    }
}
