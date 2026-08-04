package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lؙۘۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6702l {
    public static final C6702l loadAd = new C6702l(C14054l.f27396l);
    public final Map yandex;

    public C6702l(Map map) {
        this.yandex = map;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x0115  */
    public final C0861l yandex(int i, InterfaceC13012l interfaceC13012l) {
        AbstractC6786l c15672l;
        AbstractC6786l abstractC6786lMo1765catch;
        AbstractC6786l abstractC6786lMo1767extends;
        Map map = this.yandex;
        if (map.isEmpty()) {
            return new C0861l(i, interfaceC13012l);
        }
        boolean z = interfaceC13012l instanceof AbstractC6786l;
        AbstractC6786l abstractC6786l = z ? (AbstractC6786l) interfaceC13012l : null;
        AbstractC6786l abstractC6786lMo1767extends2 = abstractC6786l != null ? abstractC6786l.mo1767extends() : null;
        AbstractC6786l abstractC6786l2 = z ? (AbstractC6786l) interfaceC13012l : null;
        AbstractC6786l abstractC6786lMo1765catch2 = abstractC6786l2 != null ? abstractC6786l2.mo1765catch() : null;
        boolean z2 = false;
        if (abstractC6786lMo1767extends2 != null && abstractC6786lMo1765catch2 != null) {
            C0861l c0861lYandex = yandex(i, abstractC6786lMo1767extends2);
            InterfaceC13012l interfaceC13012l2 = c0861lYandex.loadAd;
            AbstractC6786l abstractC6786l3 = interfaceC13012l2 instanceof AbstractC6786l ? (AbstractC6786l) interfaceC13012l2 : null;
            if (abstractC6786l3 != null && (abstractC6786lMo1767extends = abstractC6786l3.mo1767extends()) != null) {
                c0861lYandex = new C0861l(c0861lYandex.yandex, abstractC6786lMo1767extends);
            }
            C0861l c0861lYandex2 = yandex(i, abstractC6786lMo1765catch2);
            InterfaceC13012l interfaceC13012l3 = c0861lYandex2.loadAd;
            AbstractC6786l abstractC6786l4 = interfaceC13012l3 instanceof AbstractC6786l ? (AbstractC6786l) interfaceC13012l3 : null;
            if (abstractC6786l4 != null && (abstractC6786lMo1765catch = abstractC6786l4.mo1765catch()) != null) {
                c0861lYandex2 = new C0861l(c0861lYandex2.yandex, abstractC6786lMo1765catch);
            }
            InterfaceC13012l interfaceC13012l4 = c0861lYandex2.loadAd;
            InterfaceC13012l interfaceC13012l5 = c0861lYandex.loadAd;
            if (interfaceC13012l4 == null || interfaceC13012l5 == null) {
                return C0861l.crashlytics;
            }
            int i2 = c0861lYandex.yandex;
            if (AbstractC0367l.yandex) {
                c15672l = new C5380l(AbstractC3605l.subs((AbstractC15211l) ((C5380l) interfaceC13012l5).f11513l, (AbstractC15211l) ((C5380l) interfaceC13012l4).f11513l));
            } else {
                AbstractC6786l abstractC6786l5 = (AbstractC6786l) interfaceC13012l5;
                AbstractC6786l abstractC6786l6 = (AbstractC6786l) interfaceC13012l4;
                c15672l = abstractC6786l5.equals(abstractC6786l6) ? abstractC6786l5 : new C15672l(abstractC6786l5, abstractC6786l6, false, null);
            }
            return new C0861l(i2, c15672l);
        }
        InterfaceC1122l interfaceC1122lMo1616package = interfaceC13012l.mo1616package();
        if (interfaceC1122lMo1616package == null) {
            return new C0861l(i, interfaceC13012l);
        }
        C0861l c0861l = (C0861l) map.get(interfaceC1122lMo1616package);
        if (c0861l == null) {
            if (!interfaceC13012l.mo1617throws().isEmpty()) {
                List<C0861l> listMo1617throws = interfaceC13012l.mo1617throws();
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listMo1617throws, 10));
                for (C0861l c0861l2 : listMo1617throws) {
                    int i3 = c0861l2.yandex;
                    InterfaceC13012l interfaceC13012l6 = c0861l2.loadAd;
                    arrayList.add((interfaceC13012l6 == null || i3 == 0) ? C0861l.crashlytics : yandex(i3, interfaceC13012l6));
                }
                boolean zSignature = interfaceC13012l.Signature();
                List annotations = interfaceC13012l.getAnnotations();
                AbstractC6786l abstractC6786l7 = z ? (AbstractC6786l) interfaceC13012l : null;
                interfaceC13012l = AbstractC6427l.purchase(interfaceC1122lMo1616package, arrayList, zSignature, annotations, abstractC6786l7 != null ? abstractC6786l7.remoteconfig() : null);
            }
            return new C0861l(i, interfaceC13012l);
        }
        InterfaceC13012l interfaceC13012l7 = c0861l.loadAd;
        int i4 = c0861l.yandex;
        if (interfaceC13012l7 == null || i4 == 0) {
            return c0861l;
        }
        if (i4 != 1) {
            if (i != 1 && i4 != i) {
                C8339l.smaato("CONFLICTING_PROJECTION");
                return null;
            }
            i = i4;
        }
        InterfaceC0583l interfaceC0583l = (InterfaceC0583l) interfaceC13012l7;
        AbstractC6786l abstractC6786lMo1771throw = ((AbstractC6786l) interfaceC0583l).mo1771throw(interfaceC13012l.Signature() || interfaceC13012l7.Signature());
        AbstractC6786l abstractC6786l8 = z ? (AbstractC6786l) interfaceC13012l : null;
        if (abstractC6786l8 == null || !abstractC6786l8.pro()) {
            AbstractC6786l abstractC6786l9 = interfaceC0583l instanceof AbstractC6786l ? (AbstractC6786l) interfaceC0583l : null;
            if (abstractC6786l9 != null && abstractC6786l9.pro() && !interfaceC13012l.Signature()) {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        return new C0861l(i, abstractC6786lMo1771throw.mo1768for(z2));
    }
}
