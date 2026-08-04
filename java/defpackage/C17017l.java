package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٍٗۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C17017l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C16024l f33156l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33157l;

    public /* synthetic */ C17017l(C16024l c16024l, int i) {
        this.f33157l = i;
        this.f33156l = c16024l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f33157l;
        C16024l c16024l = this.f33156l;
        switch (i) {
            case 0:
                boolean zAmazon = c16024l.amazon();
                if (zAmazon) {
                    C2343l c2343l = c16024l.vip;
                    InterfaceC13922l[] interfaceC13922lArr = C16024l.ad;
                    InterfaceC13922l interfaceC13922l = interfaceC13922lArr[10];
                    Collection collection = (Collection) c2343l.invoke();
                    C2343l c2343l2 = c16024l.startapp;
                    InterfaceC13922l interfaceC13922l2 = interfaceC13922lArr[12];
                    return AbstractC16901l.m4232new(collection, (Collection) c2343l2.invoke());
                }
                if (zAmazon) {
                    C18725l.billing();
                    return null;
                }
                C2343l c2343l3 = c16024l.Signature;
                InterfaceC13922l interfaceC13922l3 = C16024l.ad[17];
                Collection collection2 = (Collection) c2343l3.invoke();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collection2) {
                    if (!AbstractC4769l.purchase((AbstractC1112l) obj)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 1:
                boolean zAmazon2 = c16024l.amazon();
                if (zAmazon2) {
                    C2343l c2343l4 = c16024l.metrica;
                    InterfaceC13922l[] interfaceC13922lArr2 = C16024l.ad;
                    InterfaceC13922l interfaceC13922l4 = interfaceC13922lArr2[11];
                    Collection collection3 = (Collection) c2343l4.invoke();
                    C2343l c2343l5 = c16024l.adcel;
                    InterfaceC13922l interfaceC13922l5 = interfaceC13922lArr2[13];
                    return AbstractC16901l.m4232new(collection3, (Collection) c2343l5.invoke());
                }
                if (zAmazon2) {
                    C18725l.billing();
                    return null;
                }
                C2343l c2343l6 = c16024l.Signature;
                InterfaceC13922l interfaceC13922l6 = C16024l.ad[17];
                Collection collection4 = (Collection) c2343l6.invoke();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : collection4) {
                    if (AbstractC4769l.purchase((AbstractC1112l) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            default:
                C2343l c2343l7 = c16024l.vip;
                InterfaceC13922l[] interfaceC13922lArr3 = C16024l.ad;
                InterfaceC13922l interfaceC13922l7 = interfaceC13922lArr3[10];
                Collection collection5 = (Collection) c2343l7.invoke();
                C2343l c2343l8 = c16024l.metrica;
                InterfaceC13922l interfaceC13922l8 = interfaceC13922lArr3[11];
                return AbstractC16901l.m4232new(collection5, (Collection) c2343l8.invoke());
        }
    }
}
