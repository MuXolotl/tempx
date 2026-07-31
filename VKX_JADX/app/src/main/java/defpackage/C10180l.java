package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lٌََ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10180l extends AbstractC7532l {
    public final C8688l Signature;

    public C10180l(InterfaceC1388l interfaceC1388l) {
        super(3, interfaceC1388l, 2, null);
        this.Signature = new C8688l(new C15687l(2));
    }

    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C3597l c3597l = (C3597l) obj;
        c1080l.m788class(c3597l.yandex());
        ((AbstractC7532l) this.Signature.getValue()).subs(c1080l, 15, c3597l.f7523l);
        AbstractC7532l.startapp.subs(c1080l, 14, c3597l.f7534l);
        boolean z = c3597l.f7524l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            c16786l.subs(c1080l, 13, Boolean.valueOf(z));
        }
        C15697l c15697l = c3597l.f7522l;
        if (c15697l != null) {
            C15697l.f30835l.subs(c1080l, 12, c15697l);
        }
        boolean z2 = c3597l.f7526l;
        if (z2) {
            c16786l.subs(c1080l, 11, Boolean.valueOf(z2));
        }
        C15744l c15744l = c3597l.f7533l;
        if (c15744l != null) {
            C15744l.f30925l.subs(c1080l, 16, c15744l);
        }
        C15744l c15744l2 = c3597l.f7519l;
        if (c15744l2 != null) {
            C15744l.f30925l.subs(c1080l, 8, c15744l2);
        }
        C15744l c15744l3 = c3597l.f7529l;
        if (c15744l3 != null) {
            C15744l.f30925l.subs(c1080l, 7, c15744l3);
        }
        C15744l c15744l4 = c3597l.f7532l;
        if (c15744l4 != null) {
            C15744l.f30925l.subs(c1080l, 6, c15744l4);
        }
        C11656l.f23372l.subs(c1080l, 5, c3597l.f7525l);
        C7315l c7315l = c3597l.f7530l;
        if (c7315l != null) {
            C7315l.f15167l.subs(c1080l, 4, c7315l);
        }
        C1887l c1887l = c3597l.f7521l;
        if (c1887l != null) {
            C1887l.f4312l.subs(c1080l, 3, c1887l);
        }
        C18364l c18364l = c3597l.f7520l;
        if (c18364l != null) {
            C18364l.f35874l.subs(c1080l, 2, c18364l);
        }
        boolean z3 = c3597l.f7531l;
        if (z3) {
            c16786l.subs(c1080l, 10, Boolean.valueOf(z3));
        }
        C3554l c3554l = c3597l.f7527l;
        if (c3554l != null) {
            C3554l.f7468l.subs(c1080l, 9, c3554l);
        }
        C3554l c3554l2 = c3597l.f7528l;
        if (c3554l2 != null) {
            C3554l.f7468l.subs(c1080l, 1, c3554l2);
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jAmazon = c7084l.amazon();
        Object objCrashlytics = null;
        Object objCrashlytics2 = null;
        Object objCrashlytics3 = null;
        Object objCrashlytics4 = null;
        Object objCrashlytics5 = null;
        Object objCrashlytics6 = null;
        Object objCrashlytics7 = null;
        Object objCrashlytics8 = null;
        Object objCrashlytics9 = null;
        String strSmaato = null;
        Object objCrashlytics10 = null;
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        boolean zBooleanValue3 = false;
        Object objCrashlytics11 = null;
        while (true) {
            int iMopub = c7084l.mopub();
            Object obj = objCrashlytics11;
            if (iMopub == -1) {
                return new C3597l((C3554l) objCrashlytics10, (C3554l) obj, zBooleanValue, (C18364l) objCrashlytics, (C1887l) objCrashlytics2, (C7315l) objCrashlytics3, (C11656l) objCrashlytics4, (C15744l) objCrashlytics5, (C15744l) objCrashlytics6, (C15744l) objCrashlytics7, (C15744l) objCrashlytics8, zBooleanValue2, (C15697l) objCrashlytics9, zBooleanValue3, strSmaato, linkedHashMap, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.billing;
            switch (iMopub) {
                case 1:
                    objCrashlytics10 = C3554l.f7468l.crashlytics(c7084l);
                    break;
                case 2:
                    objCrashlytics = C18364l.f35874l.crashlytics(c7084l);
                    break;
                case 3:
                    objCrashlytics2 = C1887l.f4312l.crashlytics(c7084l);
                    break;
                case 4:
                    objCrashlytics3 = C7315l.f15167l.crashlytics(c7084l);
                    break;
                case 5:
                    objCrashlytics4 = C11656l.f23372l.crashlytics(c7084l);
                    break;
                case 6:
                    objCrashlytics5 = C15744l.f30925l.crashlytics(c7084l);
                    break;
                case 7:
                    objCrashlytics6 = C15744l.f30925l.crashlytics(c7084l);
                    break;
                case 8:
                    objCrashlytics7 = C15744l.f30925l.crashlytics(c7084l);
                    break;
                case 9:
                    objCrashlytics11 = C3554l.f7468l.crashlytics(c7084l);
                    continue;
                case 10:
                    zBooleanValue = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    break;
                case 11:
                    zBooleanValue2 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    break;
                case 12:
                    objCrashlytics9 = C15697l.f30835l.crashlytics(c7084l);
                    break;
                case 13:
                    zBooleanValue3 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    break;
                case 14:
                    AbstractC7532l.startapp.getClass();
                    strSmaato = c7084l.smaato();
                    break;
                case 15:
                    linkedHashMap.putAll((Map) ((AbstractC7532l) this.Signature.getValue()).crashlytics(c7084l));
                    break;
                case 16:
                    objCrashlytics8 = C15744l.f30925l.crashlytics(c7084l);
                    objCrashlytics11 = obj;
                    continue;
                default:
                    c7084l.remoteconfig(iMopub);
                    break;
            }
            objCrashlytics11 = obj;
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C3597l c3597l = (C3597l) obj;
        int iPurchase = c3597l.yandex().purchase();
        C3554l c3554l = c3597l.f7528l;
        if (c3554l != null) {
            iPurchase += C3554l.f7468l.firebase(1, c3554l);
        }
        C3554l c3554l2 = c3597l.f7527l;
        if (c3554l2 != null) {
            iPurchase += C3554l.f7468l.firebase(9, c3554l2);
        }
        boolean z = c3597l.f7531l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            iPurchase = AbstractC9029l.firebase(z, c16786l, 10, iPurchase);
        }
        C18364l c18364l = c3597l.f7520l;
        if (c18364l != null) {
            iPurchase += C18364l.f35874l.firebase(2, c18364l);
        }
        C1887l c1887l = c3597l.f7521l;
        if (c1887l != null) {
            iPurchase += C1887l.f4312l.firebase(3, c1887l);
        }
        C7315l c7315l = c3597l.f7530l;
        if (c7315l != null) {
            iPurchase += C7315l.f15167l.firebase(4, c7315l);
        }
        int iFirebase = C11656l.f23372l.firebase(5, c3597l.f7525l) + iPurchase;
        C15744l c15744l = c3597l.f7532l;
        if (c15744l != null) {
            iFirebase += C15744l.f30925l.firebase(6, c15744l);
        }
        C15744l c15744l2 = c3597l.f7529l;
        if (c15744l2 != null) {
            iFirebase += C15744l.f30925l.firebase(7, c15744l2);
        }
        C15744l c15744l3 = c3597l.f7519l;
        if (c15744l3 != null) {
            iFirebase += C15744l.f30925l.firebase(8, c15744l3);
        }
        C15744l c15744l4 = c3597l.f7533l;
        if (c15744l4 != null) {
            iFirebase += C15744l.f30925l.firebase(16, c15744l4);
        }
        boolean z2 = c3597l.f7526l;
        if (z2) {
            iFirebase = AbstractC9029l.firebase(z2, c16786l, 11, iFirebase);
        }
        C15697l c15697l = c3597l.f7522l;
        if (c15697l != null) {
            iFirebase += C15697l.f30835l.firebase(12, c15697l);
        }
        boolean z3 = c3597l.f7524l;
        if (z3) {
            iFirebase = AbstractC9029l.firebase(z3, c16786l, 13, iFirebase);
        }
        return ((AbstractC7532l) this.Signature.getValue()).firebase(15, c3597l.f7523l) + AbstractC7532l.startapp.firebase(14, c3597l.f7534l) + iFirebase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C3597l c3597l = (C3597l) obj;
        C3554l c3554l = c3597l.f7528l;
        if (c3554l != null) {
            C3554l.f7468l.admob(c13161l, 1, c3554l);
        }
        C3554l c3554l2 = c3597l.f7527l;
        if (c3554l2 != null) {
            C3554l.f7468l.admob(c13161l, 9, c3554l2);
        }
        boolean z = c3597l.f7531l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            c16786l.admob(c13161l, 10, Boolean.valueOf(z));
        }
        C18364l c18364l = c3597l.f7520l;
        if (c18364l != null) {
            C18364l.f35874l.admob(c13161l, 2, c18364l);
        }
        C1887l c1887l = c3597l.f7521l;
        if (c1887l != null) {
            C1887l.f4312l.admob(c13161l, 3, c1887l);
        }
        C7315l c7315l = c3597l.f7530l;
        if (c7315l != null) {
            C7315l.f15167l.admob(c13161l, 4, c7315l);
        }
        C11656l.f23372l.admob(c13161l, 5, c3597l.f7525l);
        C15744l c15744l = c3597l.f7532l;
        if (c15744l != null) {
            C15744l.f30925l.admob(c13161l, 6, c15744l);
        }
        C15744l c15744l2 = c3597l.f7529l;
        if (c15744l2 != null) {
            C15744l.f30925l.admob(c13161l, 7, c15744l2);
        }
        C15744l c15744l3 = c3597l.f7519l;
        if (c15744l3 != null) {
            C15744l.f30925l.admob(c13161l, 8, c15744l3);
        }
        C15744l c15744l4 = c3597l.f7533l;
        if (c15744l4 != null) {
            C15744l.f30925l.admob(c13161l, 16, c15744l4);
        }
        boolean z2 = c3597l.f7526l;
        if (z2) {
            c16786l.admob(c13161l, 11, Boolean.valueOf(z2));
        }
        C15697l c15697l = c3597l.f7522l;
        if (c15697l != null) {
            C15697l.f30835l.admob(c13161l, 12, c15697l);
        }
        boolean z3 = c3597l.f7524l;
        if (z3) {
            c16786l.admob(c13161l, 13, Boolean.valueOf(z3));
        }
        AbstractC7532l.startapp.admob(c13161l, 14, c3597l.f7534l);
        ((AbstractC7532l) this.Signature.getValue()).admob(c13161l, 15, c3597l.f7523l);
        c13161l.m3586switch(c3597l.yandex());
    }
}
