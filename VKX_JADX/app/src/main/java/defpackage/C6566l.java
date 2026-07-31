package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lؙٕٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6566l extends AbstractC7532l {
    public final C8688l Signature;

    public C6566l(InterfaceC1388l interfaceC1388l) {
        super(3, interfaceC1388l, 2, null);
        this.Signature = new C8688l(new C6573l(23));
    }

    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C9533l c9533l = (C9533l) obj;
        String str = c9533l.f19430l;
        c1080l.m788class(c9533l.yandex());
        ((AbstractC7532l) this.Signature.getValue()).subs(c1080l, 99, c9533l.f19434l);
        C8785l.f18084l.yandex().subs(c1080l, 8, c9533l.f19437l);
        C5542l c5542l = c9533l.f19431l;
        if (c5542l != null) {
            C5542l.f11822l.subs(c1080l, 7, c5542l);
        }
        C17937l c17937l = c9533l.f19435l;
        if (c17937l != null) {
            C17937l.f34908l.subs(c1080l, 6, c17937l);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            AbstractC7532l.startapp.subs(c1080l, 5, str);
        }
        C18482l c18482l = c9533l.f19429l;
        if (c18482l != null) {
            C18482l.f36093l.subs(c1080l, 4, c18482l);
        }
        C15589l c15589l = c9533l.f19436l;
        if (c15589l != null) {
            C15589l.f30433l.subs(c1080l, 3, c15589l);
        }
        EnumC4900l enumC4900l = c9533l.f19432l;
        if (enumC4900l != EnumC4900l.Crash) {
            EnumC4900l.f9993l.subs(c1080l, 2, enumC4900l);
        }
        long j = c9533l.f19433l;
        if (j != 0) {
            AbstractC7532l.firebase.subs(c1080l, 1, Long.valueOf(j));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jLongValue;
        EnumC4900l enumC4900l = EnumC4900l.Crash;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jAmazon = c7084l.amazon();
        Object objCrashlytics = null;
        Object objCrashlytics2 = null;
        Object objCrashlytics3 = null;
        String strSmaato = "";
        long j = 0;
        Object objCrashlytics4 = null;
        Object objCrashlytics5 = enumC4900l;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C9533l(j, (EnumC4900l) objCrashlytics5, (C15589l) objCrashlytics4, (C18482l) objCrashlytics, strSmaato, (C17937l) objCrashlytics2, (C5542l) objCrashlytics3, arrayList, linkedHashMap, c7084l.purchase(jAmazon));
            }
            if (iMopub != 99) {
                switch (iMopub) {
                    case 1:
                        jLongValue = ((Number) AbstractC7532l.firebase.crashlytics(c7084l)).longValue();
                        break;
                    case 2:
                        try {
                            jLongValue = j;
                            objCrashlytics5 = EnumC4900l.f9993l.crashlytics(c7084l);
                        } catch (C12016l e) {
                            jLongValue = j;
                            c7084l.yandex(iMopub, 1, Long.valueOf(e.f23945l));
                        }
                        break;
                    case 3:
                        objCrashlytics4 = C15589l.f30433l.crashlytics(c7084l);
                        jLongValue = j;
                        break;
                    case 4:
                        objCrashlytics = C18482l.f36093l.crashlytics(c7084l);
                        jLongValue = j;
                        break;
                    case 5:
                        AbstractC7532l.startapp.getClass();
                        strSmaato = c7084l.smaato();
                        jLongValue = j;
                        break;
                    case 6:
                        objCrashlytics2 = C17937l.f34908l.crashlytics(c7084l);
                        jLongValue = j;
                        break;
                    case 7:
                        objCrashlytics3 = C5542l.f11822l.crashlytics(c7084l);
                        jLongValue = j;
                        break;
                    case 8:
                        arrayList.add(C8785l.f18084l.crashlytics(c7084l));
                        jLongValue = j;
                        break;
                    default:
                        c7084l.remoteconfig(iMopub);
                        jLongValue = j;
                        break;
                }
            } else {
                jLongValue = j;
                objCrashlytics5 = objCrashlytics5;
                linkedHashMap.putAll((Map) ((AbstractC7532l) this.Signature.getValue()).crashlytics(c7084l));
            }
            objCrashlytics5 = objCrashlytics5;
            j = jLongValue;
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C9533l c9533l = (C9533l) obj;
        String str = c9533l.f19430l;
        int iPurchase = c9533l.yandex().purchase();
        long j = c9533l.f19433l;
        if (j != 0) {
            iPurchase += AbstractC7532l.firebase.firebase(1, Long.valueOf(j));
        }
        EnumC4900l enumC4900l = c9533l.f19432l;
        if (enumC4900l != EnumC4900l.Crash) {
            iPurchase += EnumC4900l.f9993l.firebase(2, enumC4900l);
        }
        C15589l c15589l = c9533l.f19436l;
        if (c15589l != null) {
            iPurchase += C15589l.f30433l.firebase(3, c15589l);
        }
        C18482l c18482l = c9533l.f19429l;
        if (c18482l != null) {
            iPurchase += C18482l.f36093l.firebase(4, c18482l);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            iPurchase += AbstractC7532l.startapp.firebase(5, str);
        }
        C17937l c17937l = c9533l.f19435l;
        if (c17937l != null) {
            iPurchase += C17937l.f34908l.firebase(6, c17937l);
        }
        C5542l c5542l = c9533l.f19431l;
        if (c5542l != null) {
            iPurchase += C5542l.f11822l.firebase(7, c5542l);
        }
        return ((AbstractC7532l) this.Signature.getValue()).firebase(99, c9533l.f19434l) + C8785l.f18084l.yandex().firebase(8, c9533l.f19437l) + iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C9533l c9533l = (C9533l) obj;
        String str = c9533l.f19430l;
        long j = c9533l.f19433l;
        if (j != 0) {
            AbstractC7532l.firebase.admob(c13161l, 1, Long.valueOf(j));
        }
        EnumC4900l enumC4900l = c9533l.f19432l;
        if (enumC4900l != EnumC4900l.Crash) {
            EnumC4900l.f9993l.admob(c13161l, 2, enumC4900l);
        }
        C15589l c15589l = c9533l.f19436l;
        if (c15589l != null) {
            C15589l.f30433l.admob(c13161l, 3, c15589l);
        }
        C18482l c18482l = c9533l.f19429l;
        if (c18482l != null) {
            C18482l.f36093l.admob(c13161l, 4, c18482l);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            AbstractC7532l.startapp.admob(c13161l, 5, str);
        }
        C17937l c17937l = c9533l.f19435l;
        if (c17937l != null) {
            C17937l.f34908l.admob(c13161l, 6, c17937l);
        }
        C5542l c5542l = c9533l.f19431l;
        if (c5542l != null) {
            C5542l.f11822l.admob(c13161l, 7, c5542l);
        }
        C8785l.f18084l.yandex().admob(c13161l, 8, c9533l.f19437l);
        ((AbstractC7532l) this.Signature.getValue()).admob(c13161l, 99, c9533l.f19434l);
        c13161l.m3586switch(c9533l.yandex());
    }
}
