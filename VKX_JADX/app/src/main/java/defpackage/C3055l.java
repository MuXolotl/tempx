package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؔۦۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3055l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f6583l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f6584l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6585l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f6586l;

    public /* synthetic */ C3055l(Function1 function1, int i, InterfaceC8714l interfaceC8714l, int i2) {
        this.f6585l = i2;
        this.f6584l = function1;
        this.f6583l = i;
        this.f6586l = interfaceC8714l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f6585l;
        int i2 = this.f6583l;
        Function1 function1 = this.f6584l;
        InterfaceC8714l interfaceC8714l = this.f6586l;
        switch (i) {
            case 0:
                int i3 = AbstractC8007l.yandex;
                interfaceC8714l.setValue(Boolean.FALSE);
                function1.invoke(Integer.valueOf(i2));
                break;
            default:
                int i4 = AbstractC8007l.yandex;
                interfaceC8714l.setValue(Boolean.FALSE);
                function1.invoke(Integer.valueOf(i2));
                break;
        }
        return Unit.INSTANCE;
    }
}
