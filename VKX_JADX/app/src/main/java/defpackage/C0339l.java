package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؑٔۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0339l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f1389l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f1390l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1391l;

    public /* synthetic */ C0339l(InterfaceC2262l interfaceC2262l, Function1 function1, int i) {
        this.f1391l = i;
        this.f1390l = interfaceC2262l;
        this.f1389l = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f1391l;
        Function1 function1 = this.f1389l;
        InterfaceC2262l interfaceC2262l = this.f1390l;
        switch (i) {
            case 0:
                AbstractC10999l.mopub(interfaceC2262l, null, 4, new C3289l(1, null, function1), 1);
                break;
            default:
                AbstractC10999l.mopub(interfaceC2262l, null, 4, new C3289l(2, null, function1), 1);
                break;
        }
        return Unit.INSTANCE;
    }
}
