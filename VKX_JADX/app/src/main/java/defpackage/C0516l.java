package defpackage;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؑۗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0516l implements InterfaceC16746l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static ExecutorService f1835l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final Object f1836l = new Object();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final byte[] f1834l = new byte[0];

    public C0516l(View view) {
        Context context = view.getContext();
        AbstractC15422l.admob(context, R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
        AbstractC15422l.mopub(context, R.attr.motionDurationMedium2, 300);
        AbstractC15422l.mopub(context, R.attr.motionDurationShort3, 150);
        AbstractC15422l.mopub(context, R.attr.motionDurationShort2, 100);
    }

    public static List crashlytics(C13006l c13006l, int i, C13006l c13006l2, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int iSignature = c13006l.Signature(i);
        int i2 = i + iSignature;
        int iBilling = c13006l.billing(i);
        int iBilling2 = c13006l.billing(i2);
        int i3 = iBilling2 - iBilling;
        boolean z5 = i >= 0 && (c13006l.loadAd[(c13006l.ads(i) * 5) + 1] & 201326592) != 0;
        c13006l2.pro(iSignature);
        c13006l2.ad(i3, c13006l2.tapsense);
        if (c13006l.mopub < i2) {
            c13006l.premium(i2);
        }
        if (c13006l.firebase < iBilling2) {
            c13006l.applovin(iBilling2, i2);
        }
        int[] iArr = c13006l2.loadAd;
        int i4 = c13006l2.tapsense;
        int i5 = i4 * 5;
        AbstractC8669l.ad(i5, i * 5, c13006l.loadAd, iArr, i2 * 5);
        Object[] objArr = c13006l2.crashlytics;
        int i6 = c13006l2.subs;
        System.arraycopy(c13006l.crashlytics, iBilling, objArr, i6, i3);
        int i7 = c13006l2.license;
        iArr[i5 + 2] = i7;
        int i8 = i4 - i;
        int i9 = i4 + iSignature;
        int iMopub = i6 - c13006l2.mopub(iArr, i4);
        int i10 = c13006l2.remoteconfig;
        int i11 = c13006l2.smaato;
        int length = objArr.length;
        boolean z6 = z5;
        int i12 = i10;
        int i13 = i4;
        while (i13 < i9) {
            if (i13 != i4) {
                int i14 = (i13 * 5) + 2;
                iArr[i14] = iArr[i14] + i8;
            }
            int[] iArr2 = iArr;
            iArr2[(i13 * 5) + 4] = C13006l.subs(c13006l2.mopub(iArr, i13) + iMopub, i12 < i13 ? 0 : c13006l2.firebase, i11, length);
            if (i13 == i12) {
                i12++;
            }
            i13++;
            i4 = i4;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        c13006l2.remoteconfig = i12;
        int iYandex = AbstractC0736l.yandex(c13006l.amazon, i, c13006l.startapp());
        int iYandex2 = AbstractC0736l.yandex(c13006l.amazon, i2, c13006l.startapp());
        if (iYandex < iYandex2) {
            ArrayList arrayList = c13006l.amazon;
            ArrayList arrayList2 = new ArrayList(iYandex2 - iYandex);
            for (int i15 = iYandex; i15 < iYandex2; i15++) {
                C12317l c12317l = (C12317l) arrayList.get(i15);
                c12317l.yandex += i8;
                arrayList2.add(c12317l);
            }
            c13006l2.amazon.addAll(AbstractC0736l.yandex(c13006l2.amazon, c13006l2.tapsense, c13006l2.startapp()), arrayList2);
            arrayList.subList(iYandex, iYandex2).clear();
            list = arrayList2;
        } else {
            list = C2580l.f5619l;
        }
        if (!list.isEmpty()) {
            HashMap map = c13006l.purchase;
            HashMap map2 = c13006l2.purchase;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i16 = 0; i16 < size; i16++) {
                }
            }
        }
        int i17 = c13006l2.license;
        c13006l2.m3528throw(i7);
        int iInmobi = c13006l.inmobi(c13006l.loadAd, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iInmobi >= 0;
            if (z7) {
                c13006l.m3516catch();
                c13006l.yandex(iInmobi - c13006l.tapsense);
                c13006l.m3516catch();
            }
            c13006l.yandex(i - c13006l.tapsense);
            boolean zM3527synchronized = c13006l.m3527synchronized();
            if (z7) {
                c13006l.m3520extends();
                c13006l.isPro();
                c13006l.m3520extends();
                c13006l.isPro();
            }
            z4 = zM3527synchronized;
        } else {
            boolean zM3525strictfp = c13006l.m3525strictfp(i, iSignature);
            c13006l.m3530volatile(iBilling, i3, i - 1);
            z4 = zM3525strictfp;
        }
        if (z4) {
            AbstractC2032l.yandex("Unexpectedly removed anchors");
        }
        int i18 = c13006l2.metrica;
        int i19 = iArr3[i5 + 1];
        c13006l2.metrica = i18 + ((1073741824 & i19) != 0 ? 1 : i19 & 67108863);
        if (z2) {
            c13006l2.tapsense = i9;
            c13006l2.subs = i6 + i3;
        }
        if (z6) {
            c13006l2.m3518continue(i7);
        }
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:178:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:? A[LOOP:1: B:90:0x01fb->B:180:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:76:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:78:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:92:0x0201  */
    public static final Object loadAd(AbstractC18041l abstractC18041l, C10676l c10676l, Function3 function3) {
        AbstractC1514l abstractC1514lMopub;
        EnumC15893l enumC15893lTapsense;
        EnumC15893l enumC15893lAds;
        boolean z;
        C16781l c16781lBilling;
        C3624l c3624lAdmob;
        Object c14943l;
        List list;
        Iterator it;
        C4285l c4285l;
        AbstractC18041l abstractC18041l2;
        C10676l c10676l2;
        Object objLoadAd;
        C18450l c18450l = C18450l.f36014l;
        C13772l c13772l = C13772l.f26883l;
        InterfaceC15234l interfaceC15234lPro = abstractC18041l.mo1339native().pro();
        abstractC1514lMopub = null;
        abstractC1514lMopub = null;
        AbstractC1514l abstractC1514lMopub2 = null;
        if (interfaceC15234lPro != null && (interfaceC15234lPro instanceof InterfaceC17477l) && AbstractC16860l.m4205strictfp(interfaceC15234lPro)) {
            int i = AbstractC3759l.yandex;
            abstractC1514lMopub = AbstractC10000l.mopub(AbstractC11125l.billing(interfaceC15234lPro));
        } else {
            abstractC1514lMopub = null;
        }
        C9392l c9392l = C9392l.amazon;
        if (AbstractC8576l.yandex(abstractC1514lMopub, c9392l)) {
            C0909l c0909l = AbstractC13345l.yandex;
            InterfaceC15234l interfaceC15234lPro2 = abstractC18041l.mo1339native().pro();
            if (interfaceC15234lPro2 != null && (interfaceC15234lPro2 instanceof InterfaceC17477l) && AbstractC16860l.m4205strictfp(interfaceC15234lPro2)) {
                int i2 = AbstractC3759l.yandex;
                abstractC1514lMopub2 = AbstractC10000l.mopub(AbstractC11125l.billing(interfaceC15234lPro2));
            }
            AbstractC8576l.yandex(abstractC1514lMopub2, c9392l);
            AbstractC16860l abstractC16860lBilling = AbstractC12300l.billing(abstractC18041l);
            InterfaceC3841l annotations = abstractC18041l.getAnnotations();
            AbstractC18041l abstractC18041lAdmob = AbstractC10000l.admob(abstractC18041l);
            List listBilling = AbstractC10000l.billing(abstractC18041l);
            List listSubs = AbstractC10000l.subs(abstractC18041l);
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listSubs, 10));
            Iterator it2 = listSubs.iterator();
            while (it2.hasNext()) {
                arrayList.add(((AbstractC4946l) it2.next()).loadAd());
            }
            C16017l.f31395l.getClass();
            C16017l c16017l = C16017l.f31394l;
            InterfaceC1925l interfaceC1925lMetrica = AbstractC13345l.yandex.metrica();
            AbstractC10000l.vip(abstractC18041l);
            return loadAd(AbstractC10000l.amazon(abstractC16860lBilling, annotations, abstractC18041lAdmob, listBilling, AbstractC16901l.m4218final(AbstractC3605l.ads(c16017l, interfaceC1925lMetrica, Collections.singletonList(new C10636l(1, ((AbstractC4946l) AbstractC16901l.m4214continue(abstractC18041l.inmobi())).loadAd())), false), arrayList), AbstractC12300l.billing(abstractC18041l).metrica(), false).mo8static(abstractC18041l.mo1342throw()), c10676l, function3);
        }
        InterfaceC2224l interfaceC2224lMo1219this = c13772l.mo1219this(abstractC18041l);
        if (AbstractC13095l.premium(interfaceC2224lMo1219this)) {
            if (interfaceC2224lMo1219this instanceof InterfaceC1925l) {
                enumC15893lTapsense = AbstractC16860l.tapsense((InterfaceC17477l) ((InterfaceC1925l) interfaceC2224lMo1219this).pro());
            } else {
                C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC2224lMo1219this.getClass(), AbstractC14814l.Signature("ClassicTypeSystemContext couldn't handle: ", interfaceC2224lMo1219this, ", ")));
                enumC15893lTapsense = null;
            }
            if (enumC15893lTapsense != null) {
                switch (enumC15893lTapsense) {
                    case BOOLEAN:
                        c4285l = AbstractC3050l.yandex;
                        break;
                    case CHAR:
                        c4285l = AbstractC3050l.loadAd;
                        break;
                    case BYTE:
                        c4285l = AbstractC3050l.crashlytics;
                        break;
                    case SHORT:
                        c4285l = AbstractC3050l.amazon;
                        break;
                    case INT:
                        c4285l = AbstractC3050l.purchase;
                        break;
                    case FLOAT:
                        c4285l = AbstractC3050l.billing;
                        break;
                    case LONG:
                        c4285l = AbstractC3050l.mopub;
                        break;
                    case DOUBLE:
                        c4285l = AbstractC3050l.admob;
                        break;
                    default:
                        C18725l.billing();
                        return null;
                }
                c14943l = AbstractC1315l.yandex(c4285l, AbstractC13095l.m3545native(abstractC18041l) || c13772l.m3761l(abstractC18041l, AbstractC6830l.ads));
            } else {
                if (interfaceC2224lMo1219this instanceof InterfaceC1925l) {
                    enumC15893lAds = AbstractC16860l.ads((InterfaceC17477l) ((InterfaceC1925l) interfaceC2224lMo1219this).pro());
                } else {
                    C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC2224lMo1219this.getClass(), AbstractC14814l.Signature("ClassicTypeSystemContext couldn't handle: ", interfaceC2224lMo1219this, ", ")));
                    enumC15893lAds = null;
                }
                if (enumC15893lAds != null) {
                    EnumC17708l enumC17708l = (EnumC17708l) EnumC17708l.f34518l.get(enumC15893lAds);
                    if (enumC17708l == null) {
                        EnumC17708l.yandex(6);
                        throw null;
                    }
                    c14943l = C15617l.subs("[".concat(enumC17708l.f34520l));
                } else {
                    if (interfaceC2224lMo1219this instanceof InterfaceC1925l) {
                        InterfaceC15234l interfaceC15234lPro3 = ((InterfaceC1925l) interfaceC2224lMo1219this).pro();
                        if (interfaceC15234lPro3 != null && AbstractC16860l.m4205strictfp(interfaceC15234lPro3)) {
                            z = true;
                        }
                        if (z) {
                            if (interfaceC2224lMo1219this instanceof InterfaceC1925l) {
                                InterfaceC17477l interfaceC17477l = (InterfaceC17477l) ((InterfaceC1925l) interfaceC2224lMo1219this).pro();
                                int i3 = AbstractC3759l.yandex;
                                c16781lBilling = AbstractC11125l.billing(interfaceC17477l);
                            } else {
                                C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC2224lMo1219this.getClass(), AbstractC14814l.Signature("ClassicTypeSystemContext couldn't handle: ", interfaceC2224lMo1219this, ", ")));
                                c16781lBilling = null;
                            }
                            String str = C4632l.yandex;
                            c3624lAdmob = C4632l.admob(c16781lBilling);
                            if (c3624lAdmob == null) {
                                c14943l = null;
                            } else {
                                if (!c10676l.amazon && ((list = C4632l.metrica) == null || !list.isEmpty())) {
                                    it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (((C11180l) it.next()).yandex.equals(c3624lAdmob)) {
                                                c14943l = null;
                                            }
                                        }
                                    }
                                }
                                c14943l = new C14943l(C8353l.purchase(c3624lAdmob));
                            }
                        } else {
                            c14943l = null;
                        }
                    } else {
                        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC2224lMo1219this.getClass(), AbstractC14814l.Signature("ClassicTypeSystemContext couldn't handle: ", interfaceC2224lMo1219this, ", ")));
                    }
                    z = false;
                    if (z) {
                        c14943l = null;
                    } else {
                        if (interfaceC2224lMo1219this instanceof InterfaceC1925l) {
                            InterfaceC17477l interfaceC17477l2 = (InterfaceC17477l) ((InterfaceC1925l) interfaceC2224lMo1219this).pro();
                            int i4 = AbstractC3759l.yandex;
                            c16781lBilling = AbstractC11125l.billing(interfaceC17477l2);
                        } else {
                            C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC2224lMo1219this.getClass(), AbstractC14814l.Signature("ClassicTypeSystemContext couldn't handle: ", interfaceC2224lMo1219this, ", ")));
                            c16781lBilling = null;
                        }
                        String str2 = C4632l.yandex;
                        c3624lAdmob = C4632l.admob(c16781lBilling);
                        if (c3624lAdmob == null) {
                            c14943l = null;
                        } else {
                            if (!c10676l.amazon) {
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((C11180l) it.next()).yandex.equals(c3624lAdmob)) {
                                            c14943l = null;
                                        }
                                    }
                                }
                            }
                            c14943l = new C14943l(C8353l.purchase(c3624lAdmob));
                        }
                    }
                }
            }
        } else {
            c14943l = null;
        }
        if (c14943l != null) {
            Object objYandex = AbstractC1315l.yandex(c14943l, c10676l.yandex);
            function3.invoke(abstractC18041l, objYandex, c10676l);
            return objYandex;
        }
        InterfaceC1925l interfaceC1925lMo1339native = abstractC18041l.mo1339native();
        if (interfaceC1925lMo1339native instanceof C11794l) {
            C11794l c11794l = (C11794l) interfaceC1925lMo1339native;
            AbstractC18041l abstractC18041l3 = c11794l.f23608l;
            if (abstractC18041l3 != null) {
                return loadAd(AbstractC12300l.firebase(abstractC18041l3), c10676l, function3);
            }
            C8339l.subs("There should be no intersection type in existing descriptors, but found: ".concat(AbstractC16901l.m4210case(c11794l.f23607l, null, null, null, null, 63)));
            return null;
        }
        InterfaceC15234l interfaceC15234lPro4 = interfaceC1925lMo1339native.pro();
        if (interfaceC15234lPro4 == null) {
            C1759l.adcel(abstractC18041l, "no descriptor for type constructor of ");
            return null;
        }
        if (C8741l.purchase(interfaceC15234lPro4)) {
            return new C14943l("error/NonExistentClass");
        }
        boolean z2 = interfaceC15234lPro4 instanceof InterfaceC17477l;
        if (z2 && AbstractC16860l.advert(abstractC18041l)) {
            if (abstractC18041l.inmobi().size() != 1) {
                C10754l.ads("arrays must have one type argument");
                return null;
            }
            AbstractC4946l abstractC4946l = (AbstractC4946l) abstractC18041l.inmobi().get(0);
            AbstractC18041l abstractC18041lLoadAd = abstractC4946l.loadAd();
            if (abstractC4946l.yandex() == 2) {
                objLoadAd = new C14943l("java/lang/Object");
            } else {
                int iInmobi = AbstractC5020l.inmobi(abstractC4946l.yandex());
                if (iInmobi == 0 ? (c10676l2 = c10676l.billing) == null : !(iInmobi == 1 ? (c10676l2 = c10676l.purchase) != null : (c10676l2 = c10676l.crashlytics) != null)) {
                    c10676l2 = c10676l;
                }
                objLoadAd = loadAd(abstractC18041lLoadAd, c10676l2, function3);
            }
            return C15617l.subs("[".concat(C15617l.metrica((AbstractC3050l) objLoadAd)));
        }
        if (z2) {
            if (AbstractC6245l.yandex(interfaceC15234lPro4) && !c10676l.loadAd && (abstractC18041l2 = (AbstractC18041l) AbstractC8016l.loadAd(abstractC18041l, new HashSet())) != null) {
                return loadAd(abstractC18041l2, new C10676l(c10676l.yandex, true, c10676l.crashlytics, c10676l.amazon, c10676l.purchase, c10676l.billing, c10676l.mopub, c10676l.admob), function3);
            }
            InterfaceC17477l interfaceC17477l3 = (InterfaceC17477l) interfaceC15234lPro4;
            interfaceC17477l3.mo864l();
            if (interfaceC17477l3.mo752l() == 4) {
                interfaceC17477l3 = (InterfaceC17477l) interfaceC17477l3.Signature();
            }
            C14943l c14943l2 = new C14943l(yandex(interfaceC17477l3.mo864l(), c18450l));
            function3.invoke(abstractC18041l, c14943l2, c10676l);
            return c14943l2;
        }
        if (interfaceC15234lPro4 instanceof InterfaceC16902l) {
            AbstractC18041l abstractC18041lMopub = AbstractC12300l.mopub((InterfaceC16902l) interfaceC15234lPro4);
            if (abstractC18041l.mo1342throw()) {
                abstractC18041lMopub = AbstractC12008l.mopub(abstractC18041lMopub, true);
            }
            return loadAd(abstractC18041lMopub, c10676l, C3499l.f7388l);
        }
        if ((interfaceC15234lPro4 instanceof C9522l) && c10676l.mopub) {
            AbstractC15211l abstractC15211l = ((C9522l) interfaceC15234lPro4).f19410l;
            return loadAd(abstractC15211l != null ? abstractC15211l : null, c10676l, function3);
        }
        C1759l.adcel(abstractC18041l, "Unknown type ");
        return null;
    }

    public static final String yandex(InterfaceC17477l interfaceC17477l, C18450l c18450l) {
        InterfaceC8371l interfaceC8371lSignature = interfaceC17477l.Signature();
        C3498l name = interfaceC17477l.getName();
        C3498l c3498l = AbstractC13589l.yandex;
        if (name == null || name.f7383l) {
            name = AbstractC13589l.crashlytics;
        }
        String strCrashlytics = name.crashlytics();
        if (!(interfaceC8371lSignature instanceof InterfaceC9921l)) {
            InterfaceC17477l interfaceC17477l2 = interfaceC8371lSignature instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC8371lSignature : null;
            if (interfaceC17477l2 != null) {
                return AbstractC11043l.admob('$', yandex(interfaceC17477l2, c18450l), strCrashlytics);
            }
            C1759l.smaato("Unexpected container: ", interfaceC8371lSignature, " for ", interfaceC17477l);
            return null;
        }
        C2312l c2312l = ((AbstractC3740l) ((InterfaceC9921l) interfaceC8371lSignature)).f7826l;
        if (c2312l.yandex.crashlytics()) {
            return strCrashlytics;
        }
        return c2312l.yandex.yandex.replace('.', '/') + '/' + strCrashlytics;
    }
}
