package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lؕۡۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3711l extends AbstractC7532l {
    public final C8688l Signature;

    public C3711l(InterfaceC1388l interfaceC1388l) {
        super(3, interfaceC1388l, 2, null);
        this.Signature = new C8688l(new C15687l(9));
    }

    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C15343l c15343l = (C15343l) obj;
        c1080l.m788class(c15343l.yandex());
        boolean z = c15343l.f29994l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            c16786l.subs(c1080l, 13, Boolean.valueOf(z));
        }
        int i = c15343l.f30001l;
        C16786l c16786l2 = AbstractC7532l.mopub;
        if (i != 0) {
            c16786l2.subs(c1080l, 12, Integer.valueOf(i));
        }
        ((AbstractC7532l) this.Signature.getValue()).subs(c1080l, 11, c15343l.f29992l);
        boolean z2 = c15343l.f29989l;
        if (z2) {
            c16786l.subs(c1080l, 10, Boolean.valueOf(z2));
        }
        boolean z3 = c15343l.f29997l;
        if (z3) {
            c16786l.subs(c1080l, 9, Boolean.valueOf(z3));
        }
        boolean z4 = c15343l.f30000l;
        if (z4) {
            c16786l.subs(c1080l, 8, Boolean.valueOf(z4));
        }
        boolean z5 = c15343l.f29993l;
        if (z5) {
            c16786l.subs(c1080l, 7, Boolean.valueOf(z5));
        }
        int i2 = c15343l.f29998l;
        if (i2 != 0) {
            c16786l2.subs(c1080l, 6, Integer.valueOf(i2));
        }
        int i3 = c15343l.f29991l;
        if (i3 != 0) {
            c16786l2.subs(c1080l, 5, Integer.valueOf(i3));
        }
        int i4 = c15343l.f29990l;
        if (i4 != 0) {
            c16786l2.subs(c1080l, 4, Integer.valueOf(i4));
        }
        int i5 = c15343l.f29999l;
        if (i5 != 0) {
            c16786l2.subs(c1080l, 3, Integer.valueOf(i5));
        }
        int i6 = c15343l.f29995l;
        if (i6 != 0) {
            c16786l2.subs(c1080l, 2, Integer.valueOf(i6));
        }
        int i7 = c15343l.f29996l;
        if (i7 != 0) {
            c16786l2.subs(c1080l, 1, Integer.valueOf(i7));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jAmazon = c7084l.amazon();
        int iIntValue = 0;
        int iIntValue2 = 0;
        int iIntValue3 = 0;
        int iIntValue4 = 0;
        int iIntValue5 = 0;
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        boolean zBooleanValue3 = false;
        boolean zBooleanValue4 = false;
        int iIntValue6 = 0;
        boolean zBooleanValue5 = false;
        int iIntValue7 = 0;
        while (true) {
            int iMopub = c7084l.mopub();
            int i = iIntValue;
            if (iMopub == -1) {
                return new C15343l(iIntValue7, i, iIntValue2, iIntValue3, iIntValue4, iIntValue5, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, linkedHashMap, iIntValue6, zBooleanValue5, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.billing;
            int i2 = iIntValue2;
            C16786l c16786l2 = AbstractC7532l.mopub;
            switch (iMopub) {
                case 1:
                    iIntValue7 = ((Number) c16786l2.crashlytics(c7084l)).intValue();
                    iIntValue = i;
                    iIntValue2 = i2;
                    break;
                case 2:
                    iIntValue = ((Number) c16786l2.crashlytics(c7084l)).intValue();
                    iIntValue2 = i2;
                    break;
                case 3:
                    iIntValue2 = ((Number) c16786l2.crashlytics(c7084l)).intValue();
                    iIntValue = i;
                    break;
                case 4:
                    iIntValue3 = ((Number) c16786l2.crashlytics(c7084l)).intValue();
                    iIntValue = i;
                    iIntValue2 = i2;
                    break;
                case 5:
                    iIntValue4 = ((Number) c16786l2.crashlytics(c7084l)).intValue();
                    iIntValue = i;
                    iIntValue2 = i2;
                    break;
                case 6:
                    iIntValue5 = ((Number) c16786l2.crashlytics(c7084l)).intValue();
                    iIntValue = i;
                    iIntValue2 = i2;
                    break;
                case 7:
                    zBooleanValue = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    iIntValue = i;
                    iIntValue2 = i2;
                    break;
                case 8:
                    zBooleanValue2 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    iIntValue = i;
                    iIntValue2 = i2;
                    break;
                case 9:
                    zBooleanValue3 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    iIntValue = i;
                    iIntValue2 = i2;
                    break;
                case 10:
                    zBooleanValue4 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    iIntValue = i;
                    iIntValue2 = i2;
                    break;
                case 11:
                    linkedHashMap.putAll((Map) ((AbstractC7532l) this.Signature.getValue()).crashlytics(c7084l));
                    iIntValue = i;
                    iIntValue2 = i2;
                    break;
                case 12:
                    iIntValue6 = ((Number) c16786l2.crashlytics(c7084l)).intValue();
                    iIntValue = i;
                    iIntValue2 = i2;
                    break;
                case 13:
                    zBooleanValue5 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    iIntValue = i;
                    iIntValue2 = i2;
                    break;
                default:
                    c7084l.remoteconfig(iMopub);
                    iIntValue = i;
                    iIntValue2 = i2;
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C15343l c15343l = (C15343l) obj;
        int iPurchase = c15343l.yandex().purchase();
        int i = c15343l.f29996l;
        C16786l c16786l = AbstractC7532l.mopub;
        if (i != 0) {
            iPurchase = AbstractC9029l.isPro(i, c16786l, 1, iPurchase);
        }
        int i2 = c15343l.f29995l;
        if (i2 != 0) {
            iPurchase = AbstractC9029l.isPro(i2, c16786l, 2, iPurchase);
        }
        int i3 = c15343l.f29999l;
        if (i3 != 0) {
            iPurchase = AbstractC9029l.isPro(i3, c16786l, 3, iPurchase);
        }
        int i4 = c15343l.f29990l;
        if (i4 != 0) {
            iPurchase = AbstractC9029l.isPro(i4, c16786l, 4, iPurchase);
        }
        int i5 = c15343l.f29991l;
        if (i5 != 0) {
            iPurchase = AbstractC9029l.isPro(i5, c16786l, 5, iPurchase);
        }
        int i6 = c15343l.f29998l;
        if (i6 != 0) {
            iPurchase = AbstractC9029l.isPro(i6, c16786l, 6, iPurchase);
        }
        boolean z = c15343l.f29993l;
        C16786l c16786l2 = AbstractC7532l.billing;
        if (z) {
            iPurchase = AbstractC9029l.firebase(z, c16786l2, 7, iPurchase);
        }
        boolean z2 = c15343l.f30000l;
        if (z2) {
            iPurchase = AbstractC9029l.firebase(z2, c16786l2, 8, iPurchase);
        }
        boolean z3 = c15343l.f29997l;
        if (z3) {
            iPurchase = AbstractC9029l.firebase(z3, c16786l2, 9, iPurchase);
        }
        boolean z4 = c15343l.f29989l;
        if (z4) {
            iPurchase = AbstractC9029l.firebase(z4, c16786l2, 10, iPurchase);
        }
        int iFirebase = ((AbstractC7532l) this.Signature.getValue()).firebase(11, c15343l.f29992l) + iPurchase;
        int i7 = c15343l.f30001l;
        if (i7 != 0) {
            iFirebase = AbstractC9029l.isPro(i7, c16786l, 12, iFirebase);
        }
        boolean z5 = c15343l.f29994l;
        return z5 ? AbstractC9029l.firebase(z5, c16786l2, 13, iFirebase) : iFirebase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C15343l c15343l = (C15343l) obj;
        int i = c15343l.f29996l;
        C16786l c16786l = AbstractC7532l.mopub;
        if (i != 0) {
            c16786l.admob(c13161l, 1, Integer.valueOf(i));
        }
        int i2 = c15343l.f29995l;
        if (i2 != 0) {
            c16786l.admob(c13161l, 2, Integer.valueOf(i2));
        }
        int i3 = c15343l.f29999l;
        if (i3 != 0) {
            c16786l.admob(c13161l, 3, Integer.valueOf(i3));
        }
        int i4 = c15343l.f29990l;
        if (i4 != 0) {
            c16786l.admob(c13161l, 4, Integer.valueOf(i4));
        }
        int i5 = c15343l.f29991l;
        if (i5 != 0) {
            c16786l.admob(c13161l, 5, Integer.valueOf(i5));
        }
        int i6 = c15343l.f29998l;
        if (i6 != 0) {
            c16786l.admob(c13161l, 6, Integer.valueOf(i6));
        }
        boolean z = c15343l.f29993l;
        C16786l c16786l2 = AbstractC7532l.billing;
        if (z) {
            c16786l2.admob(c13161l, 7, Boolean.valueOf(z));
        }
        boolean z2 = c15343l.f30000l;
        if (z2) {
            c16786l2.admob(c13161l, 8, Boolean.valueOf(z2));
        }
        boolean z3 = c15343l.f29997l;
        if (z3) {
            c16786l2.admob(c13161l, 9, Boolean.valueOf(z3));
        }
        boolean z4 = c15343l.f29989l;
        if (z4) {
            c16786l2.admob(c13161l, 10, Boolean.valueOf(z4));
        }
        ((AbstractC7532l) this.Signature.getValue()).admob(c13161l, 11, c15343l.f29992l);
        int i7 = c15343l.f30001l;
        if (i7 != 0) {
            c16786l.admob(c13161l, 12, Integer.valueOf(i7));
        }
        boolean z5 = c15343l.f29994l;
        if (z5) {
            c16786l2.admob(c13161l, 13, Boolean.valueOf(z5));
        }
        c13161l.m3586switch(c15343l.yandex());
    }
}
