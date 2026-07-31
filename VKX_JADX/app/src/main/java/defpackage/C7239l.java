package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚْ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7239l implements InterfaceC17955l {
    public final C10086l amazon;
    public final C10086l billing;
    public final C10086l purchase;
    public final Function1 yandex;
    public final C1685l loadAd = new C1685l(this);
    public final C16801l crashlytics = new C16801l();

    public C7239l(Function1 function1) {
        this.yandex = function1;
        Boolean bool = Boolean.FALSE;
        this.amazon = AbstractC8020l.smaato(bool);
        this.purchase = AbstractC8020l.smaato(bool);
        this.billing = AbstractC8020l.smaato(bool);
    }

    @Override // defpackage.InterfaceC17955l
    public final /* synthetic */ boolean amazon() {
        return true;
    }

    @Override // defpackage.InterfaceC17955l
    public final /* synthetic */ boolean crashlytics() {
        return true;
    }

    @Override // defpackage.InterfaceC17955l
    public final Object loadAd(EnumC11011l enumC11011l, Function2 function2, InterfaceC14029l interfaceC14029l) {
        Object objAdmob = AbstractC11990l.admob(new C4647l(this, enumC11011l, function2, (InterfaceC14029l) null, 4), interfaceC14029l);
        return objAdmob == EnumC9342l.f19165l ? objAdmob : Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC17955l
    public final float purchase(float f) {
        return ((Number) this.yandex.invoke(Float.valueOf(f))).floatValue();
    }

    @Override // defpackage.InterfaceC17955l
    public final boolean yandex() {
        return ((Boolean) this.amazon.getValue()).booleanValue();
    }
}
