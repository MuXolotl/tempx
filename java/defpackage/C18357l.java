package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: l٘ۧؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18357l implements InterfaceC11515l {
    public final C17413l crashlytics;
    public final C13252l loadAd;
    public final C13252l yandex;

    public C18357l(Context context, C17413l c17413l) {
        this.crashlytics = c17413l;
        C16529l c16529l = C16529l.purchase;
        C4225l.loadAd(context);
        C16930l c16930lCrashlytics = C4225l.yandex().crashlytics(c16529l);
        if (C16529l.amazon.contains(new C7017l("json"))) {
            this.yandex = new C13252l(new C16366l(c16930lCrashlytics, 2));
        }
        this.loadAd = new C13252l(new C16366l(c16930lCrashlytics, 3));
    }

    @Override // defpackage.InterfaceC11515l
    public final void yandex(C2888l c2888l) {
        int i = this.crashlytics.loadAd;
        EnumC14251l enumC14251l = EnumC14251l.f27852l;
        EnumC14251l enumC14251l2 = EnumC14251l.f27853l;
        if (i != 0) {
            ((C11117l) this.loadAd.get()).yandex(c2888l.f6291l != 0 ? new C11658l(null, c2888l.yandex(i), enumC14251l2, null) : new C11658l(null, c2888l.yandex(i), enumC14251l, null), new C1759l(20));
            return;
        }
        C13252l c13252l = this.yandex;
        if (c13252l != null) {
            ((C11117l) c13252l.get()).yandex(c2888l.f6291l != 0 ? new C11658l(null, c2888l.yandex(i), enumC14251l2, null) : new C11658l(null, c2888l.yandex(i), enumC14251l, null), new C1759l(20));
        }
    }
}
