package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّْۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13023l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f25504l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f25505l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25506l;

    public /* synthetic */ C13023l(Function1 function1, InterfaceC8714l interfaceC8714l, int i) {
        this.f25506l = i;
        this.f25505l = function1;
        this.f25504l = interfaceC8714l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f25506l;
        InterfaceC8714l interfaceC8714l = this.f25504l;
        Function1 function1 = this.f25505l;
        switch (i) {
            case 0:
                function1.invoke(((C0639l) interfaceC8714l.getValue()).yandex.f7563l);
                break;
            default:
                function1.invoke(null);
                interfaceC8714l.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
