package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* JADX INFO: renamed from: l٘ۛؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18194l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C18554l c18554l = (C18554l) obj;
        c1080l.m788class(c18554l.yandex());
        boolean z = c18554l.f36217l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            c16786l.subs(c1080l, 17, Boolean.valueOf(z));
        }
        boolean z2 = c18554l.f36220l;
        if (z2) {
            c16786l.subs(c1080l, 16, Boolean.valueOf(z2));
        }
        boolean z3 = c18554l.f36231l;
        if (z3) {
            c16786l.subs(c1080l, 15, Boolean.valueOf(z3));
        }
        boolean z4 = c18554l.f36221l;
        if (z4) {
            c16786l.subs(c1080l, 13, Boolean.valueOf(z4));
        }
        boolean z5 = c18554l.f36219l;
        if (z5) {
            c16786l.subs(c1080l, 12, Boolean.valueOf(z5));
        }
        boolean z6 = c18554l.f36223l;
        if (z6) {
            c16786l.subs(c1080l, 11, Boolean.valueOf(z6));
        }
        boolean z7 = c18554l.f36230l;
        if (z7) {
            c16786l.subs(c1080l, 10, Boolean.valueOf(z7));
        }
        boolean z8 = c18554l.f36215l;
        if (z8) {
            c16786l.subs(c1080l, 9, Boolean.valueOf(z8));
        }
        boolean z9 = c18554l.f36226l;
        if (z9) {
            c16786l.subs(c1080l, 8, Boolean.valueOf(z9));
        }
        EnumC0972l enumC0972l = c18554l.f36229l;
        if (enumC0972l != EnumC0972l.CHROMA_TAB) {
            EnumC0972l.f2682l.subs(c1080l, 18, enumC0972l);
        }
        EnumC14810l enumC14810l = c18554l.f36222l;
        if (enumC14810l != EnumC14810l.AUTOMATIC) {
            EnumC14810l.f28974l.subs(c1080l, 7, enumC14810l);
        }
        EnumC10468l enumC10468l = c18554l.f36227l;
        if (enumC10468l != EnumC10468l.BLUR) {
            EnumC10468l.f21321l.subs(c1080l, 14, enumC10468l);
        }
        boolean z10 = c18554l.f36218l;
        if (z10) {
            c16786l.subs(c1080l, 5, Boolean.valueOf(z10));
        }
        boolean z11 = c18554l.f36216l;
        if (z11) {
            c16786l.subs(c1080l, 4, Boolean.valueOf(z11));
        }
        boolean z12 = c18554l.f36228l;
        if (z12) {
            c16786l.subs(c1080l, 3, Boolean.valueOf(z12));
        }
        boolean z13 = c18554l.f36224l;
        if (z13) {
            c16786l.subs(c1080l, 2, Boolean.valueOf(z13));
        }
        boolean z14 = c18554l.f36225l;
        if (z14) {
            c16786l.subs(c1080l, 1, Boolean.valueOf(z14));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        Object objCrashlytics = EnumC10468l.BLUR;
        EnumC14810l enumC14810l = EnumC14810l.AUTOMATIC;
        EnumC0972l enumC0972l = EnumC0972l.CHROMA_TAB;
        long jAmazon = c7084l.amazon();
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        boolean zBooleanValue3 = false;
        boolean zBooleanValue4 = false;
        boolean zBooleanValue5 = false;
        boolean zBooleanValue6 = false;
        boolean zBooleanValue7 = false;
        boolean zBooleanValue8 = false;
        boolean zBooleanValue9 = false;
        boolean zBooleanValue10 = false;
        boolean zBooleanValue11 = false;
        boolean zBooleanValue12 = false;
        boolean zBooleanValue13 = false;
        boolean zBooleanValue14 = false;
        Object objCrashlytics2 = enumC0972l;
        Object objCrashlytics3 = enumC14810l;
        while (true) {
            Object obj = objCrashlytics;
            while (true) {
                int iMopub = c7084l.mopub();
                if (iMopub == -1) {
                    return new C18554l(zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, (EnumC10468l) obj, (EnumC14810l) objCrashlytics3, (EnumC0972l) objCrashlytics2, zBooleanValue6, zBooleanValue7, zBooleanValue8, zBooleanValue9, zBooleanValue10, zBooleanValue11, zBooleanValue12, zBooleanValue13, zBooleanValue14, c7084l.purchase(jAmazon));
                }
                C16786l c16786l = AbstractC7532l.billing;
                switch (iMopub) {
                    case 1:
                        zBooleanValue = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                        break;
                    case 2:
                        zBooleanValue2 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                        break;
                    case 3:
                        zBooleanValue3 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                        break;
                    case 4:
                        zBooleanValue4 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                        break;
                    case 5:
                        zBooleanValue5 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                        break;
                    case 6:
                    default:
                        c7084l.remoteconfig(iMopub);
                        break;
                    case 7:
                        try {
                            objCrashlytics3 = EnumC14810l.f28974l.crashlytics(c7084l);
                        } catch (C12016l e) {
                            c7084l.yandex(iMopub, 1, Long.valueOf(e.f23945l));
                        }
                        break;
                    case 8:
                        zBooleanValue6 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                        break;
                    case 9:
                        zBooleanValue7 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                        break;
                    case 10:
                        zBooleanValue8 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                        break;
                    case 11:
                        zBooleanValue9 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                        break;
                    case 12:
                        zBooleanValue10 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                        break;
                    case 13:
                        zBooleanValue11 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                        break;
                    case 14:
                        try {
                            objCrashlytics = EnumC10468l.f21321l.crashlytics(c7084l);
                        } catch (C12016l e2) {
                            c7084l.yandex(iMopub, 1, Long.valueOf(e2.f23945l));
                        }
                        break;
                    case 15:
                        zBooleanValue12 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                        break;
                    case 16:
                        zBooleanValue13 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        zBooleanValue14 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        try {
                            objCrashlytics2 = EnumC0972l.f2682l.crashlytics(c7084l);
                        } catch (C12016l e3) {
                            c7084l.yandex(iMopub, 1, Long.valueOf(e3.f23945l));
                        }
                        break;
                }
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C18554l c18554l = (C18554l) obj;
        int iPurchase = c18554l.yandex().purchase();
        boolean z = c18554l.f36225l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            iPurchase = AbstractC9029l.firebase(z, c16786l, 1, iPurchase);
        }
        boolean z2 = c18554l.f36224l;
        if (z2) {
            iPurchase = AbstractC9029l.firebase(z2, c16786l, 2, iPurchase);
        }
        boolean z3 = c18554l.f36228l;
        if (z3) {
            iPurchase = AbstractC9029l.firebase(z3, c16786l, 3, iPurchase);
        }
        boolean z4 = c18554l.f36216l;
        if (z4) {
            iPurchase = AbstractC9029l.firebase(z4, c16786l, 4, iPurchase);
        }
        boolean z5 = c18554l.f36218l;
        if (z5) {
            iPurchase = AbstractC9029l.firebase(z5, c16786l, 5, iPurchase);
        }
        EnumC10468l enumC10468l = c18554l.f36227l;
        if (enumC10468l != EnumC10468l.BLUR) {
            iPurchase += EnumC10468l.f21321l.firebase(14, enumC10468l);
        }
        EnumC14810l enumC14810l = c18554l.f36222l;
        if (enumC14810l != EnumC14810l.AUTOMATIC) {
            iPurchase += EnumC14810l.f28974l.firebase(7, enumC14810l);
        }
        EnumC0972l enumC0972l = c18554l.f36229l;
        if (enumC0972l != EnumC0972l.CHROMA_TAB) {
            iPurchase += EnumC0972l.f2682l.firebase(18, enumC0972l);
        }
        boolean z6 = c18554l.f36226l;
        if (z6) {
            iPurchase = AbstractC9029l.firebase(z6, c16786l, 8, iPurchase);
        }
        boolean z7 = c18554l.f36215l;
        if (z7) {
            iPurchase = AbstractC9029l.firebase(z7, c16786l, 9, iPurchase);
        }
        boolean z8 = c18554l.f36230l;
        if (z8) {
            iPurchase = AbstractC9029l.firebase(z8, c16786l, 10, iPurchase);
        }
        boolean z9 = c18554l.f36223l;
        if (z9) {
            iPurchase = AbstractC9029l.firebase(z9, c16786l, 11, iPurchase);
        }
        boolean z10 = c18554l.f36219l;
        if (z10) {
            iPurchase = AbstractC9029l.firebase(z10, c16786l, 12, iPurchase);
        }
        boolean z11 = c18554l.f36221l;
        if (z11) {
            iPurchase = AbstractC9029l.firebase(z11, c16786l, 13, iPurchase);
        }
        boolean z12 = c18554l.f36231l;
        if (z12) {
            iPurchase = AbstractC9029l.firebase(z12, c16786l, 15, iPurchase);
        }
        boolean z13 = c18554l.f36220l;
        if (z13) {
            iPurchase = AbstractC9029l.firebase(z13, c16786l, 16, iPurchase);
        }
        boolean z14 = c18554l.f36217l;
        return z14 ? AbstractC9029l.firebase(z14, c16786l, 17, iPurchase) : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C18554l c18554l = (C18554l) obj;
        boolean z = c18554l.f36225l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            c16786l.admob(c13161l, 1, Boolean.valueOf(z));
        }
        boolean z2 = c18554l.f36224l;
        if (z2) {
            c16786l.admob(c13161l, 2, Boolean.valueOf(z2));
        }
        boolean z3 = c18554l.f36228l;
        if (z3) {
            c16786l.admob(c13161l, 3, Boolean.valueOf(z3));
        }
        boolean z4 = c18554l.f36216l;
        if (z4) {
            c16786l.admob(c13161l, 4, Boolean.valueOf(z4));
        }
        boolean z5 = c18554l.f36218l;
        if (z5) {
            c16786l.admob(c13161l, 5, Boolean.valueOf(z5));
        }
        EnumC10468l enumC10468l = c18554l.f36227l;
        if (enumC10468l != EnumC10468l.BLUR) {
            EnumC10468l.f21321l.admob(c13161l, 14, enumC10468l);
        }
        EnumC14810l enumC14810l = c18554l.f36222l;
        if (enumC14810l != EnumC14810l.AUTOMATIC) {
            EnumC14810l.f28974l.admob(c13161l, 7, enumC14810l);
        }
        EnumC0972l enumC0972l = c18554l.f36229l;
        if (enumC0972l != EnumC0972l.CHROMA_TAB) {
            EnumC0972l.f2682l.admob(c13161l, 18, enumC0972l);
        }
        boolean z6 = c18554l.f36226l;
        if (z6) {
            c16786l.admob(c13161l, 8, Boolean.valueOf(z6));
        }
        boolean z7 = c18554l.f36215l;
        if (z7) {
            c16786l.admob(c13161l, 9, Boolean.valueOf(z7));
        }
        boolean z8 = c18554l.f36230l;
        if (z8) {
            c16786l.admob(c13161l, 10, Boolean.valueOf(z8));
        }
        boolean z9 = c18554l.f36223l;
        if (z9) {
            c16786l.admob(c13161l, 11, Boolean.valueOf(z9));
        }
        boolean z10 = c18554l.f36219l;
        if (z10) {
            c16786l.admob(c13161l, 12, Boolean.valueOf(z10));
        }
        boolean z11 = c18554l.f36221l;
        if (z11) {
            c16786l.admob(c13161l, 13, Boolean.valueOf(z11));
        }
        boolean z12 = c18554l.f36231l;
        if (z12) {
            c16786l.admob(c13161l, 15, Boolean.valueOf(z12));
        }
        boolean z13 = c18554l.f36220l;
        if (z13) {
            c16786l.admob(c13161l, 16, Boolean.valueOf(z13));
        }
        boolean z14 = c18554l.f36217l;
        if (z14) {
            c16786l.admob(c13161l, 17, Boolean.valueOf(z14));
        }
        c13161l.m3586switch(c18554l.yandex());
    }
}
