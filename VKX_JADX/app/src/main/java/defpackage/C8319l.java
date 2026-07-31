package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lًۡٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8319l extends C5188l {
    /* JADX WARN: Illegal instructions before constructor call */
    public C8319l(C3498l c3498l) {
        C8741l c8741l = C8741l.yandex;
        C8123l c8123l = C8741l.loadAd;
        C6430l c6430l = C16412l.purchase;
        List list = C2580l.f5619l;
        super(c8123l, c3498l, 3, 1, list, c6430l);
        C5786l c5786l = new C5786l(this, null, C2782l.f6058l, true, 1, InterfaceC5706l.f12087l);
        c5786l.m1860l(list, AbstractC6004l.purchase);
        C7662l c7662lYandex = C8741l.yandex(9, false, (String[]) Arrays.copyOf(new String[]{c5786l.getName().f7384l, ""}, 2));
        EnumC5123l enumC5123l = EnumC5123l.f11123l;
        c5786l.f20715l = new C14487l(C8741l.crashlytics(enumC5123l, new String[0]), c7662lYandex, enumC5123l, list, false, new String[0]);
        inmobi(c7662lYandex, Collections.singleton(c5786l), c5786l);
    }

    @Override // defpackage.AbstractC10170l, defpackage.AbstractC11832l
    public final InterfaceC7637l mopub(AbstractC10794l abstractC10794l, C14945l c14945l) {
        String[] strArr = {getName().f7384l, abstractC10794l.toString()};
        C8741l c8741l = C8741l.yandex;
        return C8741l.yandex(9, false, (String[]) Arrays.copyOf(strArr, 2));
    }

    @Override // defpackage.C5188l
    public final String toString() {
        return getName().loadAd();
    }

    @Override // defpackage.AbstractC10170l
    /* JADX INFO: renamed from: appmetrica */
    public final InterfaceC17477l isPro(C2201l c2201l) {
        return this;
    }

    @Override // defpackage.AbstractC10170l, defpackage.InterfaceC10900l
    public final InterfaceC10233l isPro(C2201l c2201l) {
        return this;
    }
}
