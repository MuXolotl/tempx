package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lّٗۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12661l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f24930l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C8954l f24931l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24932l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f24933l;

    public /* synthetic */ C12661l(C8954l c8954l, Function0 function0, InterfaceC2262l interfaceC2262l) {
        this.f24932l = 1;
        this.f24931l = c8954l;
        this.f24930l = function0;
        this.f24933l = interfaceC2262l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f24932l;
        EnumC9129l enumC9129l = EnumC9129l.f18765l;
        int i2 = 2;
        InterfaceC14029l interfaceC14029l = null;
        Function0 function0 = this.f24930l;
        InterfaceC2262l interfaceC2262l = this.f24933l;
        C8954l c8954l = this.f24931l;
        int i3 = 3;
        switch (i) {
            case 0:
                if (((Boolean) c8954l.amazon.invoke(enumC9129l)).booleanValue()) {
                    AbstractC10999l.mopub(interfaceC2262l, null, 0, new C12328l(c8954l, interfaceC14029l, 6), 3).mo2154l(new C7366l(c8954l, function0, 1));
                }
                break;
            case 1:
                int iOrdinal = c8954l.amazon().ordinal();
                if (iOrdinal == 1) {
                    function0.invoke();
                    Unit unit = Unit.INSTANCE;
                } else if (iOrdinal != 2) {
                    AbstractC10999l.mopub(interfaceC2262l, null, 0, new C12328l(c8954l, interfaceC14029l, i3), 3);
                } else {
                    AbstractC10999l.mopub(interfaceC2262l, null, 0, new C12328l(c8954l, interfaceC14029l, i2), 3);
                }
                break;
            case 2:
                if (((Boolean) c8954l.amazon.invoke(enumC9129l)).booleanValue()) {
                    AbstractC10999l.mopub(interfaceC2262l, null, 0, new C12328l(c8954l, interfaceC14029l, 8), 3).mo2154l(new C7366l(c8954l, function0, 2));
                }
                break;
            default:
                if (c8954l.amazon() == EnumC9129l.f18764l && c8954l.purchase()) {
                    AbstractC10999l.mopub(interfaceC2262l, null, 0, new C12328l(c8954l, interfaceC14029l, 9), 3);
                } else {
                    AbstractC10999l.mopub(interfaceC2262l, null, 0, new C12328l(c8954l, interfaceC14029l, 10), 3).mo2154l(new C6199l(7, function0));
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C12661l(C8954l c8954l, InterfaceC2262l interfaceC2262l, Function0 function0, int i) {
        this.f24932l = i;
        this.f24931l = c8954l;
        this.f24933l = interfaceC2262l;
        this.f24930l = function0;
    }
}
