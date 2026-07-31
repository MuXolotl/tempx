package defpackage;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؘٔۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15326l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C2070l f29951l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29952l;

    public /* synthetic */ C15326l(C2070l c2070l, int i) {
        this.f29952l = i;
        this.f29951l = c2070l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f29952l;
        C2070l c2070l = this.f29951l;
        switch (i) {
            case 0:
                return AbstractC5592l.crashlytics(c2070l.m1107for());
            default:
                InterfaceC12657l interfaceC12657lM1107for = c2070l.m1107for();
                AbstractC1112l abstractC1112l = c2070l.f4607l;
                if (interfaceC12657lM1107for instanceof C7073l) {
                    C7073l c7073lBilling = AbstractC5592l.billing(abstractC1112l);
                    C4233l c4233l = abstractC1112l.f3046l;
                    if (AbstractC8576l.yandex(c7073lBilling, interfaceC12657lM1107for) && (c4233l.amazon || abstractC1112l.mo818extends().mo367while() == 2)) {
                        InterfaceC8371l interfaceC8371lMo818extends = c4233l.yandex;
                        if (interfaceC8371lMo818extends == null) {
                            interfaceC8371lMo818extends = abstractC1112l.mo818extends();
                        }
                        Class clsMetrica = AbstractC5592l.metrica((InterfaceC17477l) interfaceC8371lMo818extends.Signature());
                        if (clsMetrica != null) {
                            return clsMetrica;
                        }
                        C11467l.Signature(interfaceC12657lM1107for, "Cannot determine receiver Java type of inherited declaration: ");
                        return null;
                    }
                }
                return (Type) abstractC1112l.isPro().yandex().get(c2070l.f4606l);
        }
    }
}
