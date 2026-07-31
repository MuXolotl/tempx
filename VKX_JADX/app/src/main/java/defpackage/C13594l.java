package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lْۗۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13594l {
    public final /* synthetic */ int yandex;
    public static final C13594l loadAd = new C13594l(0);
    public static final C13594l crashlytics = new C13594l(1);
    public static final C13594l amazon = new C13594l(2);

    public /* synthetic */ C13594l(int i) {
        this.yandex = i;
    }

    public static String yandex(InterfaceC15234l interfaceC15234l) {
        String strAdmob;
        String strBilling = AbstractC3324l.billing(interfaceC15234l.getName());
        if (!(interfaceC15234l instanceof InterfaceC16902l)) {
            InterfaceC8371l interfaceC8371lSignature = interfaceC15234l.Signature();
            if (interfaceC8371lSignature instanceof InterfaceC17477l) {
                strAdmob = yandex((InterfaceC15234l) interfaceC8371lSignature);
            } else {
                strAdmob = interfaceC8371lSignature instanceof InterfaceC9921l ? AbstractC3324l.admob(C16781l.billing(((AbstractC3740l) ((InterfaceC9921l) interfaceC8371lSignature)).f7826l.yandex)) : null;
            }
            if (strAdmob != null && !strAdmob.equals("")) {
                return AbstractC11043l.admob('.', strAdmob, strBilling);
            }
        }
        return strBilling;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [lًۤؑ, lٔۡؖ] */
    /* JADX WARN: Type inference failed for: r2v2, types: [lًۤؑ] */
    /* JADX WARN: Type inference failed for: r2v3, types: [lًۤؑ] */
    public final String loadAd(InterfaceC15234l interfaceC15234l, C10822l c10822l) {
        switch (this.yandex) {
            case 0:
                return interfaceC15234l instanceof InterfaceC16902l ? c10822l.m2992for(((InterfaceC16902l) interfaceC15234l).getName(), false) : c10822l.metrica(AbstractC3324l.admob(C16781l.billing(AbstractC11125l.billing(interfaceC15234l))));
            case 1:
                if (interfaceC15234l instanceof InterfaceC16902l) {
                    return c10822l.m2992for(((InterfaceC16902l) interfaceC15234l).getName(), false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(interfaceC15234l.getName());
                    interfaceC15234l = interfaceC15234l.Signature();
                } while (interfaceC15234l instanceof InterfaceC17477l);
                return AbstractC3324l.admob(new C3862l(arrayList));
            default:
                return yandex(interfaceC15234l);
        }
    }
}
