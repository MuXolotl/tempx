package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.car.app.navigation.model.Maneuver;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import j$.time.Instant;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.Provider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;

/* JADX INFO: renamed from: lؘٗۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16936l implements InterfaceC2165l, InterfaceC10466l, InterfaceC7664l, InterfaceC16651l, InterfaceC5688l, InterfaceC14881l, InterfaceC9481l, InterfaceC7592l, InterfaceC15244l, InterfaceC9765l, InterfaceC1953l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33024l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ C16936l f33019l = new C16936l(16);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ C16936l f33016l = new C16936l(17);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C16936l f33021l = new C16936l(18);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ C16936l f33020l = new C16936l(20);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C16936l f33023l = new C16936l(21);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ C16936l f33017l = new C16936l(22);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ C16936l f33018l = new C16936l(23);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final /* synthetic */ C16936l f33022l = new C16936l(24);

    public C16936l(InputConnectionC12817l inputConnectionC12817l) {
        this.f33024l = 11;
    }

    public static long amazon(C17841l c17841l, float f) {
        float[] fArr = c17841l.yandex;
        int i = 1;
        long jYandex = C9699l.yandex(fArr[0], fArr[1]);
        float f2 = 0.0f;
        float f3 = f;
        while (true) {
            float f4 = i / 3.0f;
            long jCrashlytics = c17841l.crashlytics(f4);
            float fBilling = AbstractC10433l.billing(AbstractC10433l.subs(jCrashlytics, jYandex));
            if (fBilling >= f3) {
                return C9699l.yandex(f4 - ((1.0f - (f3 / fBilling)) / 3.0f), f);
            }
            f3 -= fBilling;
            f2 += fBilling;
            if (i == 3) {
                return C9699l.yandex(1.0f, f2);
            }
            i++;
            jYandex = jCrashlytics;
        }
    }

    public static C5008l vip(C1869l c1869l, InterfaceC15879l interfaceC15879l) {
        InterfaceC5965l interfaceC5965lSignature;
        EnumC15475l enumC15475l;
        C3585l c3585l = new C3585l(10, interfaceC15879l);
        List list = c1869l.purchase;
        AbstractC5088l.yandex("ResolvedFeatureGroup", "resolveFeatureGroup: sessionConfig = " + c1869l + ", lensFacing = " + interfaceC15879l.metrica());
        Set set = c1869l.amazon;
        if (set.isEmpty() && list.isEmpty()) {
            return null;
        }
        List list2 = c1869l.billing;
        if (set.isEmpty() && list.isEmpty()) {
            C8339l.metrica("Must have at least one required or preferred feature");
            return null;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                AbstractC6896l abstractC6896l = (AbstractC6896l) it.next();
                boolean z = abstractC6896l instanceof C0527l;
                EnumC15475l enumC15475l2 = EnumC15475l.f30273l;
                if (z) {
                    enumC15475l = EnumC15475l.f30275l;
                } else if (abstractC6896l instanceof C9731l) {
                    enumC15475l = EnumC15475l.f30272l;
                } else if (abstractC6896l instanceof C9585l) {
                    enumC15475l = EnumC15475l.f30277l;
                } else if (AbstractC5641l.admob(abstractC6896l)) {
                    enumC15475l = EnumC15475l.f30276l;
                } else {
                    enumC15475l = abstractC6896l instanceof C10245l ? EnumC15475l.f30278l : enumC15475l2;
                }
                if (enumC15475l == enumC15475l2) {
                    interfaceC5965lSignature = new C14109l(abstractC6896l);
                    break;
                }
            } else {
                Iterator it2 = set.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            C2041l c2041lPro = C3585l.pro((AbstractC5295l) obj, list2);
                            if (c2041lPro != null) {
                                AbstractC5088l.yandex("DefaultFeatureGroupResolver", "resolveFeatureGroup: filtered out preferred feature due to " + c2041lPro);
                            } else {
                                c2041lPro = null;
                            }
                            if (c2041lPro == null) {
                                arrayList.add(obj);
                            }
                        }
                        AbstractC5088l.yandex("DefaultFeatureGroupResolver", "resolveFeatureGroup: filteredPreferredFeatures = " + arrayList);
                        interfaceC5965lSignature = c3585l.Signature(c1869l, arrayList, 0, C2580l.f5619l);
                        break;
                    }
                    C2041l c2041lPro2 = C3585l.pro((AbstractC5295l) it2.next(), list2);
                    if (c2041lPro2 != null) {
                        interfaceC5965lSignature = c2041lPro2;
                        break;
                    }
                }
            }
        }
        if (interfaceC5965lSignature instanceof C1999l) {
            C5008l c5008l = ((C1999l) interfaceC5965lSignature).yandex;
            AbstractC5088l.yandex("ResolvedFeatureGroup", "resolvedFeatureGroup = " + c5008l);
            return c5008l;
        }
        if (interfaceC5965lSignature instanceof C2158l) {
            C8339l.metrica("Feature group is not supported");
            return null;
        }
        if (interfaceC5965lSignature instanceof C14109l) {
            throw new IllegalArgumentException(((C14109l) interfaceC5965lSignature).yandex + " is not supported");
        }
        if (!(interfaceC5965lSignature instanceof C2041l)) {
            C18725l.billing();
            return null;
        }
        C2041l c2041l = (C2041l) interfaceC5965lSignature;
        throw new IllegalArgumentException(c2041l.yandex + " must be added for " + c2041l.loadAd);
    }

    @Override // defpackage.InterfaceC16651l
    public InterfaceC0048l Signature() {
        return new C12402l();
    }

    @Override // defpackage.InterfaceC5479l
    public C5104l adcel() {
        return C5104l.crashlytics();
    }

    @Override // defpackage.InterfaceC7592l
    public InterfaceC9354l admob(InterfaceC9354l interfaceC9354l, InterfaceC12932l interfaceC12932l) {
        return AbstractC7572l.license(2, interfaceC12932l, C1732l.f4136l, new C0932l(this, interfaceC9354l, null, 18)).yandex;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0080 A[Catch: all -> 0x00e3, TryCatch #1 {all -> 0x00e3, blocks: (B:23:0x007a, B:25:0x0080, B:29:0x0099, B:31:0x00a1, B:45:0x00eb), top: B:51:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1 A[Catch: all -> 0x00e3, TRY_LEAVE, TryCatch #1 {all -> 0x00e3, blocks: (B:23:0x007a, B:25:0x0080, B:29:0x0099, B:31:0x00a1, B:45:0x00eb), top: B:51:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3 A[Catch: all -> 0x00d3, TryCatch #2 {all -> 0x00d3, blocks: (B:33:0x00ad, B:35:0x00b3, B:40:0x00da), top: B:53:0x00ad }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[LOOP:0: B:53:0x00ad->B:58:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [lٌؚۛ] */
    /* JADX WARN: Type inference failed for: r10v11, types: [com.github.luben.zstd.ZstdDecompressCtx] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.github.luben.zstd.ZstdDecompressCtx] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v0, types: [lًٓٝ] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [lًٓٝ] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.github.luben.zstd.ZstdDecompressCtx] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7, types: [lًٓٝ] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v4, types: [lًٓٝ] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [lٌؚۛ] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8, types: [lٌؚۛ] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00dd -> B:51:0x007a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00e8 -> B:51:0x007a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public java.lang.Object billing(defpackage.InterfaceC9354l r9, defpackage.InterfaceC8639l r10, defpackage.InterfaceC7987l r11, defpackage.AbstractC0283l r12) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16936l.billing(lٍؘؒ, lٌؚۛ, lًٓٝ, lّؑۧ):java.lang.Object");
    }

    public void crashlytics(InterfaceC3841l interfaceC3841l, InterfaceC3841l interfaceC3841l2) {
        HashSet hashSet = new HashSet();
        Iterator it = interfaceC3841l.iterator();
        while (it.hasNext()) {
            hashSet.add(((InterfaceC1910l) it.next()).mopub());
        }
        Iterator it2 = interfaceC3841l2.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((InterfaceC1910l) it2.next()).mopub());
        }
    }

    public AbstractC4946l firebase(AbstractC4946l abstractC4946l, C12014l c12014l, InterfaceC16902l interfaceC16902l, int i) {
        int iMo2182l;
        C9522l c9522l = (C9522l) c12014l.f23940l;
        if (i > 100) {
            C11983l.license(c9522l.getName(), "Too deep recursion while expanding type alias ");
            return null;
        }
        if (abstractC4946l.crashlytics()) {
            return AbstractC12008l.isPro(interfaceC16902l);
        }
        AbstractC18041l abstractC18041lLoadAd = abstractC4946l.loadAd();
        InterfaceC15234l interfaceC15234lPro = abstractC18041lLoadAd.mo1339native().pro();
        AbstractC4946l abstractC4946l2 = interfaceC15234lPro instanceof InterfaceC16902l ? (AbstractC4946l) ((Map) c12014l.f23943l).get(interfaceC15234lPro) : null;
        int i2 = 0;
        if (abstractC4946l2 == null) {
            AbstractC15211l abstractC15211lSubs = AbstractC6419l.subs(abstractC4946l.loadAd().mo3847class());
            if (!AbstractC11748l.subs(abstractC15211lSubs) && AbstractC12008l.crashlytics(abstractC15211lSubs, C12844l.f25260l, null)) {
                InterfaceC1925l interfaceC1925lMo1339native = abstractC15211lSubs.mo1339native();
                InterfaceC15234l interfaceC15234lPro2 = interfaceC1925lMo1339native.pro();
                interfaceC1925lMo1339native.getParameters().size();
                abstractC15211lSubs.inmobi().size();
                if (!(interfaceC15234lPro2 instanceof InterfaceC16902l)) {
                    if (!(interfaceC15234lPro2 instanceof C9522l)) {
                        AbstractC15211l abstractC15211lMetrica = metrica(abstractC15211lSubs, c12014l, i);
                        C2201l.amazon(abstractC15211lMetrica);
                        for (Object obj : abstractC15211lMetrica.inmobi()) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                AbstractC14055l.subscription();
                                throw null;
                            }
                            AbstractC4946l abstractC4946l3 = (AbstractC4946l) obj;
                            if (!abstractC4946l3.crashlytics() && !AbstractC12008l.crashlytics(abstractC4946l3.loadAd(), C12844l.f25280l, null)) {
                            }
                            i2 = i3;
                        }
                        return new C10636l(abstractC4946l.yandex(), abstractC15211lMetrica);
                    }
                    C9522l c9522l2 = (C9522l) interfaceC15234lPro2;
                    if (c12014l.m3305private(c9522l2)) {
                        return new C10636l(1, C8741l.loadAd(EnumC5123l.f11146l, c9522l2.getName().f7384l));
                    }
                    List listInmobi = abstractC15211lSubs.inmobi();
                    ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listInmobi, 10));
                    for (Object obj2 : listInmobi) {
                        int i4 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC14055l.subscription();
                            throw null;
                        }
                        arrayList.add(firebase((AbstractC4946l) obj2, c12014l, (InterfaceC16902l) interfaceC1925lMo1339native.getParameters().get(i2), i + 1));
                        i2 = i4;
                    }
                    List parameters = c9522l2.f19415l.getParameters();
                    ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(parameters, 10));
                    Iterator it = parameters.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((InterfaceC16902l) it.next()).mo864l());
                    }
                    return new C10636l(abstractC4946l.yandex(), AbstractC14506l.isPro(isPro(new C12014l(c12014l, c9522l2, arrayList, AbstractC8676l.subscription(AbstractC16901l.m4226l(arrayList, arrayList2)), 28), abstractC15211lSubs.mo1340package(), abstractC15211lSubs.mo1342throw(), i + 1, false), metrica(abstractC15211lSubs, c12014l, i)));
                }
            }
            return abstractC4946l;
        }
        if (abstractC4946l2.crashlytics()) {
            return AbstractC12008l.isPro(interfaceC16902l);
        }
        AbstractC14318l abstractC14318lMo3847class = abstractC4946l2.loadAd().mo3847class();
        int iYandex = abstractC4946l2.yandex();
        int iYandex2 = abstractC4946l.yandex();
        if (iYandex2 != iYandex && iYandex2 != 1 && iYandex == 1) {
            iYandex = iYandex2;
        }
        if (interfaceC16902l == null || (iMo2182l = interfaceC16902l.mo2182l()) == 0) {
            iMo2182l = 1;
        }
        if (iMo2182l != iYandex && iMo2182l != 1 && iYandex == 1) {
            iYandex = 1;
        }
        crashlytics(abstractC18041lLoadAd.getAnnotations(), abstractC14318lMo3847class.getAnnotations());
        AbstractC15211l abstractC15211lSubs2 = AbstractC12008l.subs(AbstractC6419l.subs(abstractC14318lMo3847class), abstractC18041lLoadAd.mo1342throw());
        C16017l c16017lMo1340package = abstractC18041lLoadAd.mo1340package();
        if (!AbstractC11748l.subs(abstractC15211lSubs2)) {
            if (AbstractC11748l.subs(abstractC15211lSubs2)) {
                c16017lMo1340package = abstractC15211lSubs2.mo1340package();
            } else {
                C16017l c16017lMo1340package2 = abstractC15211lSubs2.mo1340package();
                C13645l c13645l = C16017l.f31395l;
                if (!c16017lMo1340package.isEmpty() || !c16017lMo1340package2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = ((ConcurrentHashMap) c13645l.f26671l).values().iterator();
                    while (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        C7687l c7687l = (C7687l) c16017lMo1340package.f31396l.get(iIntValue);
                        C7687l c7687l2 = (C7687l) c16017lMo1340package2.f31396l.get(iIntValue);
                        if (c7687l != null) {
                            if (c7687l2 != null) {
                                InterfaceC3841l c2172l = c7687l.yandex;
                                InterfaceC3841l interfaceC3841l = c7687l2.yandex;
                                if (c2172l.isEmpty()) {
                                    c2172l = interfaceC3841l;
                                } else if (!interfaceC3841l.isEmpty()) {
                                    c2172l = new C2172l(new InterfaceC3841l[]{c2172l, interfaceC3841l});
                                }
                                c7687l = new C7687l(c2172l);
                            }
                            c7687l2 = c7687l;
                        } else if (c7687l2 == null) {
                            c7687l2 = null;
                        } else if (c7687l != null) {
                            InterfaceC3841l c2172l2 = c7687l2.yandex;
                            InterfaceC3841l interfaceC3841l2 = c7687l.yandex;
                            if (c2172l2.isEmpty()) {
                                c2172l2 = interfaceC3841l2;
                            } else if (!interfaceC3841l2.isEmpty()) {
                                c2172l2 = new C2172l(new InterfaceC3841l[]{c2172l2, interfaceC3841l2});
                            }
                            c7687l2 = new C7687l(c2172l2);
                        }
                        AbstractC3324l.crashlytics(arrayList3, c7687l2);
                    }
                    c16017lMo1340package = C13645l.ads(arrayList3);
                }
            }
            abstractC15211lSubs2 = AbstractC6419l.smaato(abstractC15211lSubs2, null, c16017lMo1340package, 1);
        }
        return new C10636l(iYandex, abstractC15211lSubs2);
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        return C15435l.yandex;
    }

    public AbstractC15211l isPro(C12014l c12014l, C16017l c16017l, boolean z, int i, boolean z2) {
        InterfaceC3841l interfaceC3841l;
        C16017l c16017lAds;
        C9522l c9522l = (C9522l) c12014l.f23940l;
        AbstractC15211l abstractC15211l = c9522l.f19413l;
        if (abstractC15211l == null) {
            abstractC15211l = null;
        }
        AbstractC4946l abstractC4946lFirebase = firebase(new C10636l(1, abstractC15211l), c12014l, null, i);
        AbstractC15211l abstractC15211lSubs = AbstractC6419l.subs(abstractC4946lFirebase.loadAd());
        if (AbstractC11748l.subs(abstractC15211lSubs)) {
            return abstractC15211lSubs;
        }
        abstractC4946lFirebase.yandex();
        InterfaceC3841l annotations = abstractC15211lSubs.getAnnotations();
        C14513l c14513l = AbstractC3791l.loadAd;
        InterfaceC13922l interfaceC13922l = AbstractC3791l.yandex[0];
        C7687l c7687l = (C7687l) c14513l.advert(c16017l);
        if (c7687l == null || (interfaceC3841l = c7687l.yandex) == null) {
            interfaceC3841l = C2782l.f6058l;
        }
        crashlytics(annotations, interfaceC3841l);
        if (!AbstractC11748l.subs(abstractC15211lSubs)) {
            if (AbstractC11748l.subs(abstractC15211lSubs)) {
                c16017lAds = abstractC15211lSubs.mo1340package();
            } else {
                C16017l c16017lMo1340package = abstractC15211lSubs.mo1340package();
                C13645l c13645l = C16017l.f31395l;
                if (c16017l.isEmpty() && c16017lMo1340package.isEmpty()) {
                    c16017lAds = c16017l;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((ConcurrentHashMap) c13645l.f26671l).values().iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        C7687l c7687l2 = (C7687l) c16017l.f31396l.get(iIntValue);
                        C7687l c7687l3 = (C7687l) c16017lMo1340package.f31396l.get(iIntValue);
                        if (c7687l2 != null) {
                            if (c7687l3 != null) {
                                InterfaceC3841l c2172l = c7687l2.yandex;
                                InterfaceC3841l interfaceC3841l2 = c7687l3.yandex;
                                if (c2172l.isEmpty()) {
                                    c2172l = interfaceC3841l2;
                                } else if (!interfaceC3841l2.isEmpty()) {
                                    c2172l = new C2172l(new InterfaceC3841l[]{c2172l, interfaceC3841l2});
                                }
                                c7687l2 = new C7687l(c2172l);
                            }
                            c7687l3 = c7687l2;
                        } else if (c7687l3 == null) {
                            c7687l3 = null;
                        } else if (c7687l2 != null) {
                            InterfaceC3841l c2172l2 = c7687l3.yandex;
                            InterfaceC3841l interfaceC3841l3 = c7687l2.yandex;
                            if (c2172l2.isEmpty()) {
                                c2172l2 = interfaceC3841l3;
                            } else if (!interfaceC3841l3.isEmpty()) {
                                c2172l2 = new C2172l(new InterfaceC3841l[]{c2172l2, interfaceC3841l3});
                            }
                            c7687l3 = new C7687l(c2172l2);
                        }
                        AbstractC3324l.crashlytics(arrayList, c7687l3);
                    }
                    c16017lAds = C13645l.ads(arrayList);
                }
            }
            abstractC15211lSubs = AbstractC6419l.smaato(abstractC15211lSubs, null, c16017lAds, 1);
        }
        AbstractC15211l abstractC15211lSubs2 = AbstractC12008l.subs(abstractC15211lSubs, z);
        return z2 ? AbstractC14506l.isPro(abstractC15211lSubs2, AbstractC3605l.subscription(C3198l.loadAd, c16017l, c9522l.f19415l, (List) c12014l.f23944l, z)) : abstractC15211lSubs2;
    }

    @Override // defpackage.InterfaceC2165l
    public Object loadAd(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }

    public AbstractC15211l metrica(AbstractC15211l abstractC15211l, C12014l c12014l, int i) {
        InterfaceC1925l interfaceC1925lMo1339native = abstractC15211l.mo1339native();
        List listInmobi = abstractC15211l.inmobi();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listInmobi, 10));
        int i2 = 0;
        for (Object obj : listInmobi) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC14055l.subscription();
                throw null;
            }
            AbstractC4946l abstractC4946l = (AbstractC4946l) obj;
            AbstractC4946l abstractC4946lFirebase = firebase(abstractC4946l, c12014l, (InterfaceC16902l) interfaceC1925lMo1339native.getParameters().get(i2), i + 1);
            if (!abstractC4946lFirebase.crashlytics()) {
                abstractC4946lFirebase = new C10636l(abstractC4946lFirebase.yandex(), AbstractC12008l.admob(abstractC4946lFirebase.loadAd(), abstractC4946l.loadAd().mo1342throw()));
            }
            arrayList.add(abstractC4946lFirebase);
            i2 = i3;
        }
        return AbstractC6419l.smaato(abstractC15211l, arrayList, null, 2);
    }

    @Override // defpackage.InterfaceC5688l
    public Object mopub(SharedPreferences sharedPreferences, String str, Object obj) {
        return Integer.valueOf(sharedPreferences.getInt(str, ((Number) obj).intValue()));
    }

    @Override // defpackage.InterfaceC7664l
    public C2106l purchase() {
        Instant instantNow = Instant.now();
        C2106l c2106l = C2106l.f4733l;
        return C16367l.license(instantNow.getEpochSecond(), instantNow.getNano());
    }

    @Override // defpackage.InterfaceC15244l
    public Object remoteconfig(C11644l c11644l) {
        switch (this.f33024l) {
            case 16:
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(c11644l);
            default:
                return new C13411l((C8271l) c11644l.remoteconfig(C8271l.class), (C6319l) c11644l.remoteconfig(C6319l.class), (C7854l) c11644l.remoteconfig(C7854l.class));
        }
    }

    @Override // defpackage.InterfaceC1953l
    public Object smaato(C3823l c3823l) {
        AbstractC0288l abstractC0288lAmazon;
        C16346l c16346l = (C16346l) c3823l.isPro();
        C17994l c17994lIsVip = C12043l.isVip();
        String str = c16346l.f31963l;
        c17994lIsVip.loadAd();
        ((C12043l) c17994lIsVip.f20498l).signatures(str);
        String str2 = c16346l.f31960l;
        c17994lIsVip.loadAd();
        ((C12043l) c17994lIsVip.f20498l).applovin(str2);
        boolean z = c16346l.f31966l;
        c17994lIsVip.loadAd();
        ((C12043l) c17994lIsVip.f20498l).m3353throws(z);
        long j = c16346l.f31961l;
        c17994lIsVip.loadAd();
        ((C12043l) c17994lIsVip.f20498l).m3352package(j);
        byte[] bArr = c16346l.f31962l;
        if (bArr != null) {
            C2530l c2530lVip = AbstractC15619l.vip(0, bArr.length, bArr);
            c17994lIsVip.loadAd();
            ((C12043l) c17994lIsVip.f20498l).premium(c2530lVip);
        }
        for (C12386l c12386l : c16346l.f31965l) {
            for (C4153l c4153l : c12386l.f24474l) {
                int i = c4153l.f8519l;
                String str3 = c4153l.f8522l;
                if (i == 1) {
                    C12390l c12390lIsVip = C4281l.isVip();
                    c12390lIsVip.admob(str3);
                    if (i != 1) {
                        C8339l.metrica("Not a long type");
                        return null;
                    }
                    long j2 = c4153l.f8521l;
                    c12390lIsVip.loadAd();
                    ((C4281l) c12390lIsVip.f20498l).applovin(j2);
                    abstractC0288lAmazon = c12390lIsVip.amazon();
                } else if (i == 2) {
                    C12390l c12390lIsVip2 = C4281l.isVip();
                    c12390lIsVip2.admob(str3);
                    if (i != 2) {
                        C8339l.metrica("Not a boolean type");
                        return null;
                    }
                    boolean z2 = c4153l.f8518l;
                    c12390lIsVip2.loadAd();
                    ((C4281l) c12390lIsVip2.f20498l).appmetrica(z2);
                    abstractC0288lAmazon = c12390lIsVip2.amazon();
                } else if (i == 3) {
                    C12390l c12390lIsVip3 = C4281l.isVip();
                    c12390lIsVip3.admob(str3);
                    if (i != 3) {
                        C8339l.metrica("Not a double type");
                        return null;
                    }
                    double d = c4153l.f8524l;
                    c12390lIsVip3.loadAd();
                    ((C4281l) c12390lIsVip3.f20498l).inmobi(d);
                    abstractC0288lAmazon = c12390lIsVip3.amazon();
                } else if (i == 4) {
                    C12390l c12390lIsVip4 = C4281l.isVip();
                    c12390lIsVip4.admob(str3);
                    if (i != 4) {
                        C8339l.metrica("Not a String type");
                        return null;
                    }
                    String str4 = c4153l.f8523l;
                    AbstractC1051l.subs(str4);
                    c12390lIsVip4.loadAd();
                    ((C4281l) c12390lIsVip4.f20498l).m1522throws(str4);
                    abstractC0288lAmazon = c12390lIsVip4.amazon();
                } else {
                    if (i != 5) {
                        C8339l.metrica(AbstractC9361l.Signature(i, "Unrecognized flag type: ", new StringBuilder(String.valueOf(i).length() + 24)));
                        return null;
                    }
                    C12390l c12390lIsVip5 = C4281l.isVip();
                    c12390lIsVip5.admob(str3);
                    if (i != 5) {
                        C8339l.metrica("Not a bytes type");
                        return null;
                    }
                    byte[] bArr2 = c4153l.f8526l;
                    AbstractC1051l.subs(bArr2);
                    C2530l c2530lVip2 = AbstractC15619l.vip(0, bArr2.length, bArr2);
                    c12390lIsVip5.loadAd();
                    ((C4281l) c12390lIsVip5.f20498l).m1520package(c2530lVip2);
                    abstractC0288lAmazon = c12390lIsVip5.amazon();
                }
                c17994lIsVip.loadAd();
                ((C12043l) c17994lIsVip.f20498l).appmetrica((C4281l) abstractC0288lAmazon);
            }
            String[] strArr = c12386l.f24473l;
            if (strArr != null) {
                for (String str5 : strArr) {
                    c17994lIsVip.loadAd();
                    ((C12043l) c17994lIsVip.f20498l).inmobi(str5);
                }
            }
        }
        return (C12043l) c17994lIsVip.amazon();
    }

    @Override // defpackage.InterfaceC5688l
    public void subs(SharedPreferences sharedPreferences, String str, Object obj) {
        Integer numValueOf = Integer.valueOf(((Number) obj).intValue());
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt(str, numValueOf.intValue());
        editorEdit.apply();
    }

    @Override // defpackage.InterfaceC9481l
    public boolean yandex(C5138l c5138l, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                ((InterfaceC1554l) c5138l.f11181l).mopub();
                Parcelable parcelable = (Parcelable) ((InterfaceC1554l) c5138l.f11181l).vip();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                e.toString();
                return false;
            }
        }
        ClipDescription clipDescriptionYandex = ((InterfaceC1554l) c5138l.f11181l).yandex();
        InterfaceC1554l interfaceC1554l = (InterfaceC1554l) c5138l.f11181l;
        new ClipData(clipDescriptionYandex, new ClipData.Item(interfaceC1554l.amazon()));
        interfaceC1554l.yandex();
        interfaceC1554l.subs();
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        return false;
    }

    @Override // defpackage.InterfaceC9765l
    public Object zza() {
        switch (this.f33024l) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(10L, 74, "measurement.upload.max_realtime_events_per_day").get()).longValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list2 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(5000L, 50, "measurement.sgtm.upload.min_delay_after_startup").get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            default:
                return new Boolean(((Boolean) C10331l.loadAd.get()).booleanValue());
            case 20:
                List list3 = AbstractC5981l.yandex;
                C12737l.f25103l.get();
                return Integer.valueOf((int) ((Long) C1801l.yandex.billing(-2L, 3, "measurement.test.int_flag").get()).longValue());
            case 21:
                List list4 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(3600000L, 12, "measurement.session.engagement_interval").get();
            case 22:
                List list5 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(65536L, 66, "measurement.upload.max_bundle_size").get()).longValue());
            case 23:
                List list6 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(1000L, 70, "measurement.upload.max_events_per_bundle").get()).longValue());
        }
    }

    public /* synthetic */ C16936l(int i) {
        this.f33024l = i;
    }

    @Override // defpackage.InterfaceC14881l
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // defpackage.InterfaceC14881l
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
