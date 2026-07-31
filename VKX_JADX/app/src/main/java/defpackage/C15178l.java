package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lٔۜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15178l {
    public C2397l amazon;
    public final C14783l crashlytics = new C14783l(Boolean.FALSE);
    public final C16801l loadAd;
    public final boolean yandex;

    public C15178l(boolean z, C16801l c16801l) {
        this.yandex = z;
        this.loadAd = c16801l;
    }

    public final Object crashlytics(EnumC11011l enumC11011l, AbstractC5563l abstractC5563l) {
        InterfaceC14029l interfaceC14029l = null;
        C10928l c10928l = new C10928l(this, enumC11011l, new C13954l(this, interfaceC14029l, 8), interfaceC14029l, 6);
        C16801l c16801l = this.loadAd;
        c16801l.getClass();
        Object objAdmob = AbstractC11990l.admob(new C13067l(enumC11011l, c16801l, c10928l, (InterfaceC14029l) null), abstractC5563l);
        return objAdmob == EnumC9342l.f19165l ? objAdmob : Unit.INSTANCE;
    }

    public final boolean loadAd() {
        C14783l c14783l = this.crashlytics;
        return ((Boolean) c14783l.loadAd.getValue()).booleanValue() || ((Boolean) c14783l.crashlytics.getValue()).booleanValue();
    }

    public final void yandex() {
        C2397l c2397l;
        this.crashlytics.crashlytics.setValue(Boolean.FALSE);
        if (!this.yandex || (c2397l = this.amazon) == null) {
            return;
        }
        c2397l.yandex(null);
    }
}
