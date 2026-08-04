package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِٔۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11846l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17593l f23670l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23671l;

    public /* synthetic */ C11846l(InterfaceC17593l interfaceC17593l, int i) {
        this.f23671l = i;
        this.f23670l = interfaceC17593l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        int i = this.f23671l;
        boolean z = false;
        EnumC13846l enumC13846l = EnumC13846l.f27082l;
        EnumC13846l enumC13846l2 = EnumC13846l.f27083l;
        InterfaceC17593l interfaceC17593l = this.f23670l;
        switch (i) {
            case 0:
                C2507l c2507l = (C2507l) ((InterfaceC11189l) obj);
                c2507l.f5306l = true;
                c2507l.f5307l.invoke(interfaceC17593l);
                AbstractC18037l.purchase(c2507l);
                return Boolean.FALSE;
            case 1:
                Boolean boolYandex = ((C5828l) ((InterfaceC4356l) obj)).yandex();
                if (boolYandex != null) {
                    if (boolYandex.booleanValue()) {
                        enumC13846l = enumC13846l2;
                    }
                    AbstractC3668l.startapp(interfaceC17593l, enumC13846l);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                Boolean boolYandex2 = ((C5828l) ((InterfaceC4356l) obj)).yandex();
                if (boolYandex2 != null) {
                    if (boolYandex2.booleanValue()) {
                        enumC13846l = enumC13846l2;
                    }
                    AbstractC3668l.startapp(interfaceC17593l, enumC13846l);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
