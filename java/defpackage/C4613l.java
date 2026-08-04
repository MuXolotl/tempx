package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: lؗؓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4613l implements InterfaceC16965l {
    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ad A[RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:14:0x0035, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC16965l
    public final int loadAd(InterfaceC11661l interfaceC11661l, InterfaceC11661l interfaceC11661l2, InterfaceC17477l interfaceC17477l) {
        InterfaceC0207l interfaceC0207l;
        InterfaceC0207l interfaceC0207lCrashlytics;
        InterfaceC4884l interfaceC4884l;
        if ((interfaceC11661l instanceof InterfaceC0207l) && (interfaceC11661l2 instanceof InterfaceC4884l) && !AbstractC16860l.isVip(interfaceC11661l2)) {
            int i = AbstractC12132l.smaato;
            InterfaceC4884l interfaceC4884l2 = (InterfaceC4884l) interfaceC11661l2;
            AbstractC2775l abstractC2775l = (AbstractC2775l) interfaceC4884l2;
            C3498l name = abstractC2775l.getName();
            Set set = AbstractC8899l.purchase;
            if (set.contains(name)) {
                interfaceC0207l = (InterfaceC0207l) interfaceC11661l;
                interfaceC0207lCrashlytics = AbstractC11784l.crashlytics(interfaceC0207l);
                if (interfaceC0207lCrashlytics == null) {
                    if (set.contains(interfaceC0207l.getName())) {
                        interfaceC0207lCrashlytics = AbstractC3759l.loadAd(interfaceC0207l, C12844l.f25259l);
                    } else {
                        interfaceC0207lCrashlytics = null;
                    }
                }
                boolean z = interfaceC11661l instanceof InterfaceC4884l;
                if (z) {
                }
                if (interfaceC4884l == null) {
                    if (!AbstractC6889l.amazon(interfaceC11661l, interfaceC11661l2)) {
                        return 3;
                    }
                } else if (!AbstractC6889l.amazon(interfaceC11661l, interfaceC11661l2)) {
                    return 3;
                }
            } else {
                ArrayList arrayList = AbstractC8899l.yandex;
                if (AbstractC8899l.isPro.contains(abstractC2775l.getName())) {
                    interfaceC0207l = (InterfaceC0207l) interfaceC11661l;
                    interfaceC0207lCrashlytics = AbstractC11784l.crashlytics(interfaceC0207l);
                    if (interfaceC0207lCrashlytics == null) {
                        if (set.contains(interfaceC0207l.getName())) {
                            interfaceC0207lCrashlytics = null;
                        } else {
                            interfaceC0207lCrashlytics = AbstractC3759l.loadAd(interfaceC0207l, C12844l.f25259l);
                        }
                    }
                    boolean z2 = interfaceC11661l instanceof InterfaceC4884l;
                    interfaceC4884l = z2 ? (InterfaceC4884l) interfaceC11661l : null;
                    if (((interfaceC4884l == null && interfaceC4884l2.mo1474l() == interfaceC4884l.mo1474l()) || (interfaceC0207lCrashlytics != null && interfaceC4884l2.mo1474l())) && (!(interfaceC17477l instanceof C18174l) || interfaceC4884l2.mo1472break() != null || interfaceC0207lCrashlytics == null || AbstractC11784l.amazon(interfaceC17477l, interfaceC0207lCrashlytics) || ((interfaceC0207lCrashlytics instanceof InterfaceC4884l) && z2 && AbstractC12132l.yandex((InterfaceC4884l) interfaceC0207lCrashlytics) != null && AbstractC17860l.loadAd(interfaceC4884l2, 2).equals(AbstractC17860l.loadAd(((InterfaceC4884l) interfaceC11661l).mo864l(), 2))))) {
                        if (!AbstractC6889l.amazon(interfaceC11661l, interfaceC11661l2)) {
                            return 3;
                        }
                    }
                } else if (!AbstractC6889l.amazon(interfaceC11661l, interfaceC11661l2)) {
                    return 3;
                }
            }
        } else if (!AbstractC6889l.amazon(interfaceC11661l, interfaceC11661l2)) {
            return 3;
        }
        return 2;
    }

    @Override // defpackage.InterfaceC16965l
    public final int yandex() {
        return 1;
    }
}
