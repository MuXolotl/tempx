package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْْۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13816l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f26945l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26946l;

    public /* synthetic */ C13816l(boolean z, int i) {
        this.f26946l = i;
        this.f26945l = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C15180l c15180l;
        int i = this.f26946l;
        boolean z = true;
        boolean z2 = this.f26945l;
        switch (i) {
            case 0:
                C16229l c16229l = (C16229l) obj;
                if (!z2 || c16229l.yandex.size() <= 1) {
                    return null;
                }
                return new C13802l(7, c16229l);
            case 1:
                C8195l c8195l = (C8195l) obj;
                if (z2 && AbstractC16648l.isVip((String) c8195l.f17098l, "$", false)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                InterfaceC17593l interfaceC17593l = (InterfaceC17593l) obj;
                if (z2) {
                    InterfaceC6348l.yandex.getClass();
                    c15180l = C2056l.crashlytics;
                } else {
                    InterfaceC6348l.yandex.getClass();
                    c15180l = C2056l.billing;
                }
                AbstractC3668l.admob(interfaceC17593l, c15180l);
                AbstractC3668l.billing(interfaceC17593l, C11485l.f23085l);
                return Unit.INSTANCE;
            case 3:
                AbstractC3668l.vip((InterfaceC17593l) obj, z2);
                return Unit.INSTANCE;
            case 4:
                ((C6148l) obj).crashlytics(!z2 ? 0.8f : 1.0f);
                return Unit.INSTANCE;
            default:
                InterfaceC17593l interfaceC17593l2 = (InterfaceC17593l) obj;
                AbstractC3668l.vip(interfaceC17593l2, z2);
                AbstractC3668l.remoteconfig(interfaceC17593l2, 4);
                return Unit.INSTANCE;
        }
    }
}
