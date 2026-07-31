package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؗٗٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4940l extends AbstractC8870l {
    public final Long crashlytics;
    public final C5254l loadAd;
    public final Function2 yandex;

    public C4940l(Function2 function2, C5254l c5254l, Long l, int i) {
        l = (i & 8) != 0 ? null : l;
        this.yandex = function2;
        this.loadAd = c5254l;
        this.crashlytics = l;
    }

    @Override // defpackage.AbstractC8870l
    public final C2759l amazon() {
        return null;
    }

    @Override // defpackage.AbstractC8870l
    public final C5254l loadAd() {
        return this.loadAd;
    }

    public final Object purchase(InterfaceC8639l interfaceC8639l, AbstractC5563l abstractC5563l) {
        Object objInvoke = this.yandex.invoke(interfaceC8639l, abstractC5563l);
        return objInvoke == EnumC9342l.f19165l ? objInvoke : Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC8870l
    public final Long yandex() {
        return this.crashlytics;
    }
}
