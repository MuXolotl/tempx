package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَّۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10251l implements InterfaceC6940l {
    public final C9922l yandex;
    public final C12469l loadAd = new C12469l(this, 0);
    public final C16801l crashlytics = new C16801l();

    public C10251l(C9922l c9922l) {
        this.yandex = c9922l;
    }

    @Override // defpackage.InterfaceC6940l
    public final Object yandex(EnumC11011l enumC11011l, Function2 function2, AbstractC5563l abstractC5563l) {
        Object objAdmob = AbstractC11990l.admob(new C4647l(this, enumC11011l, function2, (InterfaceC14029l) null, 2), abstractC5563l);
        return objAdmob == EnumC9342l.f19165l ? objAdmob : Unit.INSTANCE;
    }
}
