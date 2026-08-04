package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lًٔۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8007l {
    public static final /* synthetic */ int yandex = 0;

    static {
        C9902l c9902lYandex = AbstractC3478l.yandex();
        c9902lYandex.billing(0.0f, 0.0f);
        c9902lYandex.crashlytics(0.05f, 0.0f, 0.133333f, 0.06f, 0.166666f, 0.4f);
        c9902lYandex.crashlytics(0.208333f, 0.82f, 0.25f, 1.0f, 1.0f, 1.0f);
        new C6763l(0.05f, 0.7f, 0.1f, 1.0f);
        new C6763l(0.3f, 0.0f, 0.8f, 0.15f);
    }

    public static final void admob(boolean z, int i, Function0 function0, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i2) {
        InterfaceC17242l interfaceC17242l2;
        char c;
        Object objMopub;
        Object objMopub2;
        long j;
        c6956l.m2133new(-257143221);
        int i3 = i2 | (c6956l.mopub(z) ? 4 : 2) | (c6956l.amazon(i) ? 32 : 16) | (c6956l.admob(function0) ? 2048 : 1024);
        if (c6956l.m2127for(i3 & 1, (i3 & 9363) != 9362)) {
            c6956l.m2123default(1668254685);
            C18656l c18656lIsPro = AbstractC2438l.isPro(Boolean.valueOf(z), "Lyrics Interlude Transition", c6956l, (i3 & 14) | 48, 0);
            C0010l c0010l = AbstractC3483l.mopub;
            boolean zMopub = c18656lIsPro.mopub();
            Object obj = C1867l.yandex;
            if (zMopub) {
                c = ' ';
                objMopub = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656lIsPro);
            } else {
                c6956l.m2123default(1666573488);
                boolean zBilling = c6956l.billing(c18656lIsPro);
                objMopub = c6956l.m2132native();
                if (zBilling || objMopub == obj) {
                    AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
                    Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
                    c = ' ';
                    AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
                    try {
                        Object objCrashlytics = c18656lIsPro.crashlytics();
                        AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                        c6956l.m2147try(objCrashlytics);
                        objMopub = objCrashlytics;
                    } catch (Throwable th) {
                        AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                        throw th;
                    }
                } else {
                    c = ' ';
                }
                c6956l.startapp(false);
            }
            boolean zBooleanValue = ((Boolean) objMopub).booleanValue();
            c6956l.m2123default(-777792462);
            float f = zBooleanValue ? 0.0f : -30.0f;
            c6956l.startapp(false);
            C14467l c14467l = new C14467l(f);
            boolean zBilling2 = c6956l.billing(c18656lIsPro);
            Object objM2132native = c6956l.m2132native();
            if (zBilling2 || objM2132native == obj) {
                objM2132native = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 18));
                c6956l.m2147try(objM2132native);
            }
            boolean zBooleanValue2 = ((Boolean) ((InterfaceC12244l) objM2132native).getValue()).booleanValue();
            c6956l.m2123default(-777792462);
            float f2 = zBooleanValue2 ? 0.0f : -30.0f;
            c6956l.startapp(false);
            C14467l c14467l2 = new C14467l(f2);
            boolean zBilling3 = c6956l.billing(c18656lIsPro);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling3 || objM2132native2 == obj) {
                objM2132native2 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 19));
                c6956l.m2147try(objM2132native2);
            }
            c6956l.m2123default(1189346981);
            C4776l c4776lFirebase = firebase();
            c6956l.startapp(false);
            C9459l c9459lBilling = AbstractC2438l.billing(c18656lIsPro, c14467l, c14467l2, c4776lFirebase, c0010l, c6956l, 196608);
            C0010l c0010l2 = AbstractC3483l.purchase;
            if (c18656lIsPro.mopub()) {
                objMopub2 = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656lIsPro);
            } else {
                c6956l.m2123default(1666573488);
                boolean zBilling4 = c6956l.billing(c18656lIsPro);
                objMopub2 = c6956l.m2132native();
                if (zBilling4 || objMopub2 == obj) {
                    AbstractC18620l abstractC18620lBilling2 = AbstractC7572l.billing();
                    Function1 function1Purchase2 = abstractC18620lBilling2 != null ? abstractC18620lBilling2.purchase() : null;
                    AbstractC18620l abstractC18620lRemoteconfig2 = AbstractC7572l.remoteconfig(abstractC18620lBilling2);
                    try {
                        Object objCrashlytics2 = c18656lIsPro.crashlytics();
                        AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
                        c6956l.m2147try(objCrashlytics2);
                        objMopub2 = objCrashlytics2;
                    } catch (Throwable th2) {
                        AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
                        throw th2;
                    }
                }
                c6956l.startapp(false);
            }
            boolean zBooleanValue3 = ((Boolean) objMopub2).booleanValue();
            c6956l.m2123default(97258093);
            float f3 = zBooleanValue3 ? 1.0f : 0.0f;
            c6956l.startapp(false);
            Float fValueOf = Float.valueOf(f3);
            boolean zBilling5 = c6956l.billing(c18656lIsPro);
            Object objM2132native3 = c6956l.m2132native();
            if (zBilling5 || objM2132native3 == obj) {
                objM2132native3 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 20));
                c6956l.m2147try(objM2132native3);
            }
            boolean zBooleanValue4 = ((Boolean) ((InterfaceC12244l) objM2132native3).getValue()).booleanValue();
            c6956l.m2123default(97258093);
            float f4 = zBooleanValue4 ? 1.0f : 0.0f;
            c6956l.startapp(false);
            Float fValueOf2 = Float.valueOf(f4);
            boolean zBilling6 = c6956l.billing(c18656lIsPro);
            Object objM2132native4 = c6956l.m2132native();
            if (zBilling6 || objM2132native4 == obj) {
                objM2132native4 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 21));
                c6956l.m2147try(objM2132native4);
            }
            c6956l.m2123default(661775304);
            C4776l c4776lFirebase2 = firebase();
            c6956l.startapp(false);
            C9459l c9459lBilling2 = AbstractC2438l.billing(c18656lIsPro, fValueOf, fValueOf2, c4776lFirebase2, c0010l2, c6956l, 196608);
            C6839l c6839l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lLoadAd = AbstractC9151l.loadAd(AbstractC0019l.crashlytics(c4346l, c6839l), true, null, function0, 14);
            boolean zBilling7 = c6956l.billing(c9459lBilling) | c6956l.billing(c9459lBilling2);
            Object objM2132native5 = c6956l.m2132native();
            if (zBilling7 || objM2132native5 == obj) {
                objM2132native5 = new C4570l(c9459lBilling, c9459lBilling2, 0);
                c6956l.m2147try(objM2132native5);
            }
            interfaceC17242l2 = interfaceC17242l;
            InterfaceC17242l interfaceC17242lPremium = AbstractC3605l.remoteconfig(AbstractC7477l.loadAd(interfaceC17242lLoadAd, (Function1) objM2132native5), 24.0f, 8.0f).premium(interfaceC17242l2);
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36044l, c6956l, 6);
            long j2 = c6956l.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> c));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lPremium);
            InterfaceC8801l.firebase.getClass();
            Function0 function1 = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(function1);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            c6956l.m2123default(578136593);
            for (int i5 = 0; i5 < 3; i5++) {
                if (!z || i <= i5) {
                    c6956l.m2123default(556506960);
                    j = ((C18718l) c6956l.isPro(AbstractC5992l.yandex)).crashlytics;
                    c6956l.startapp(false);
                } else {
                    c6956l.m2123default(556414735);
                    j = ((C18718l) c6956l.isPro(AbstractC5992l.yandex)).yandex;
                    c6956l.startapp(false);
                }
                AbstractC9383l.yandex(AbstractC4927l.amazon(AbstractC0080l.isPro(AbstractC0019l.crashlytics(c4346l, AbstractC7497l.yandex), 12.0f), ((C9735l) AbstractC0703l.yandex(j, AbstractC0532l.admob(0.75f, 200.0f, null, 4), "[synchronized] interlude circle color", null, c6956l, 384, 8).getValue()).yandex, AbstractC16837l.yandex), c6956l, 0);
            }
            AbstractC12900l.ads(c6956l, false, true, false);
        } else {
            interfaceC17242l2 = interfaceC17242l;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12336l(z, i, function0, interfaceC17242l2, i2);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r14v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v0 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v0 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v0 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v0 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v10 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v10 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v11 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v11 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v12 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v12 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v13 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v13 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v14 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v14 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v5 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v5 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v5 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v5 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v6 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v6 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v6 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v6 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v7 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v7 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v7 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v7 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v9 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v9 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v9 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v9 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r29v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v0 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r29v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v0 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r29v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v0 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r29v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v0 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r36v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r36v0 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r36v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r36v0 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r36v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r36v0 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r36v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r36v0 ??, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r36v0 lؚِؑ, new type: lؚِؑ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    public static final void amazon(EnumC12999l enumC12999l, Function1 function1, boolean z, Function0 function0, Function0 function2, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        C6956l c6956l2;
        boolean z2;
        C6956l c6956l3;
        boolean z3;
        C6956l c6956l4;
        C6956l c6956l5 = c6956l;
        c6956l5.m2133new(133049114);
        int i2 = 4;
        int i3 = i | (c6956l5.amazon(enumC12999l == null ? -1 : enumC12999l.ordinal()) ? 4 : 2) | (c6956l5.admob(function1) ? 32 : 16) | (c6956l5.mopub(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l5.admob(function0) ? 2048 : 1024) | (c6956l5.admob(function2) ? 16384 : 8192);
        if (c6956l5.m2127for(i3 & 1, (i3 & 74899) != 74898)) {
            InterfaceC8714l interfaceC8714lAmazon = AbstractC3700l.amazon((C7549l) AbstractC16584l.yandex().billing.admob, c6956l5, 0);
            Object objM2132native = c6956l5.m2132native();
            Object obj = C1867l.yandex;
            if (objM2132native == obj) {
                objM2132native = AbstractC8020l.smaato(Boolean.FALSE);
                c6956l5.m2147try(objM2132native);
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
            if (((Boolean) interfaceC8714l.getValue()).booleanValue()) {
                c6956l5.m2123default(-588133923);
                Object objM2132native2 = c6956l5.m2132native();
                if (objM2132native2 == obj) {
                    objM2132native2 = new C0289l(interfaceC8714l, 23);
                    c6956l5.m2147try(objM2132native2);
                }
                Function0 function3 = (Function0) objM2132native2;
                C8954l c8954lTapsense = AbstractC2426l.tapsense(c6956l5);
                long j = ((C14370l) c6956l5.isPro(AbstractC16964l.yandex)).yandex.startapp;
                C15578l c15578lAmazon = AbstractC14566l.amazon(-1320256045, new C18383l(enumC12999l, function1, interfaceC8714lAmazon, function2, interfaceC8714l), c6956l5);
                z2 = true;
                AbstractC2426l.crashlytics(function3, null, c8954lTapsense, 0.0f, false, null, j, 0L, 0L, null, null, null, c15578lAmazon, c6956l, 6, 8122);
                c6956l3 = c6956l;
            } else {
                z2 = true;
                c6956l5.m2123default(-599121656);
                c6956l3 = c6956l5;
            }
            c6956l3.startapp(r10);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, r10);
            long j2 = c6956l3.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l3.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l3, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l3.m2140super();
            if (c6956l3.f14603switch) {
                c6956l3.firebase(c16395l);
            } else {
                c6956l3.m2136protected();
            }
            AbstractC8182l.billing(c6956l3, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l3, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l3, C3438l.firebase);
            AbstractC8182l.billing(c6956l3, interfaceC17242lBilling, C3438l.amazon);
            C17253l c17253l = C12719l.yandex;
            C10707l c10707l = AbstractC5992l.yandex;
            boolean z4 = z2;
            C6956l c6956l6 = c6956l3;
            C13412l c13412lSubs = C12719l.subs(((C18718l) c6956l3.isPro(c10707l)).loadAd, 0L, c6956l6, 13);
            C15521l c15521lAdmob = C12719l.admob(c6956l6);
            C14855l c14855l = C18450l.f36035l;
            C16170l c16170l = C16170l.yandex;
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lYandex = c16170l.yandex(c4346l, c14855l);
            Object objM2132native3 = c6956l6.m2132native();
            if (objM2132native3 == obj) {
                objM2132native3 = new C0289l(interfaceC8714l, 24);
                c6956l6.m2147try(objM2132native3);
            }
            C6956l c6956l7 = c6956l6;
            AbstractC17457l.billing((Function0) objM2132native3, c15521lAdmob, interfaceC17242lYandex, false, c13412lSubs, null, AbstractC14566l.amazon(-1737490147, new C16561l(i2, enumC12999l), c6956l6), c6956l7, 805306374);
            if (z) {
                c6956l7.m2123default(1368519116);
                z3 = z4;
                C6956l c6956l8 = c6956l;
                AbstractC17457l.billing(function0, C12719l.admob(c6956l), c16170l.yandex(c4346l, C18450l.f36018l), false, C12719l.subs(((C18718l) c6956l7.isPro(c10707l)).loadAd, 0L, c6956l7, 13), null, AbstractC11156l.billing, c6956l8, ((i3 >> 9) & 14) | 805306368);
                c6956l4 = c6956l8;
            } else {
                z3 = z4;
                c6956l7.m2123default(1354039202);
                c6956l4 = c6956l7;
            }
            c6956l4.startapp(false);
            c6956l4.startapp(z3);
            c6956l2 = c6956l4;
        } else {
            c6956l5.m2124else();
            c6956l2 = c6956l5;
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2940l(enumC12999l, function1, z, function0, function2, interfaceC17242l, i);
        }
    }

    public static final void billing(String str, final C16016l c16016l, final int i, final int i2, final Function1 function1, final Function1 function2, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i3) {
        C5866l c5866l;
        Object c6658l;
        InterfaceC8714l interfaceC8714l;
        c6956l.m2133new(1859507643);
        int i4 = i3 | (c6956l.billing(str) ? 4 : 2) | (c6956l.billing(c16016l) ? 32 : 16) | (c6956l.amazon(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.amazon(i2) ? 2048 : 1024) | (c6956l.admob(function1) ? 16384 : 8192) | (c6956l.admob(function2) ? 131072 : 65536) | (c6956l.billing(interfaceC17242l) ? 1048576 : 524288);
        if (c6956l.m2127for(i4 & 1, (599187 & i4) != 599186)) {
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (objM2132native == obj) {
                objM2132native = AbstractC8020l.smaato(Boolean.FALSE);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) objM2132native;
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == obj) {
                objM2132native2 = AbstractC8020l.smaato(Boolean.FALSE);
                c6956l.m2147try(objM2132native2);
            }
            InterfaceC8714l interfaceC8714l3 = (InterfaceC8714l) objM2132native2;
            C5866l c5866lYandex = AbstractC11598l.yandex(i < 0 ? 0 : i, 2, c6956l);
            InterfaceC8714l interfaceC8714lYandex = AbstractC17780l.yandex(c5866lYandex.mopub, c6956l, 0);
            Object value = interfaceC8714lYandex.getValue();
            boolean zBilling = c6956l.billing(interfaceC8714lYandex);
            Object objM2132native3 = c6956l.m2132native();
            InterfaceC14029l interfaceC14029l = null;
            if (zBilling || objM2132native3 == obj) {
                objM2132native3 = new C7864l(interfaceC8714lYandex, interfaceC8714l3, interfaceC14029l, 3);
                c6956l.m2147try(objM2132native3);
            }
            AbstractC12311l.amazon(c6956l, value, (Function2) objM2132native3);
            boolean zBilling2 = c6956l.billing(c5866lYandex);
            Object objM2132native4 = c6956l.m2132native();
            if (zBilling2 || objM2132native4 == obj) {
                objM2132native4 = new C5888l(c5866lYandex, interfaceC8714l3, interfaceC14029l, 11);
                c6956l.m2147try(objM2132native4);
            }
            AbstractC12311l.amazon(c6956l, str, (Function2) objM2132native4);
            Boolean bool = (Boolean) interfaceC8714l3.getValue();
            bool.getClass();
            Integer numValueOf = Integer.valueOf(i);
            boolean zBilling3 = c6956l.billing(c5866lYandex) | ((i4 & 896) == 256);
            Object objM2132native5 = c6956l.m2132native();
            if (zBilling3 || objM2132native5 == obj) {
                c5866l = c5866lYandex;
                interfaceC8714l = interfaceC8714l3;
                c6658l = new C6658l(i, c5866l, interfaceC8714l, interfaceC8714l2, (InterfaceC14029l) null);
                c6956l.m2147try(c6658l);
            } else {
                c5866l = c5866lYandex;
                c6658l = objM2132native5;
                interfaceC8714l = interfaceC8714l3;
            }
            AbstractC12311l.purchase(bool, numValueOf, (Function2) c6658l, c6956l);
            final C5866l c5866l2 = c5866l;
            final InterfaceC8714l interfaceC8714l4 = interfaceC8714l;
            AbstractC15497l.loadAd(interfaceC17242l, null, null, null, AbstractC14566l.amazon(-136988542, new C7605l(interfaceC8714l, 8), c6956l), 0, C9735l.isPro, 0L, null, AbstractC14566l.amazon(-1535046326, new Function3() { // from class: lّٗۡ
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    C6956l c6956l2 = (C6956l) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                        C17253l c17253lAmazon = AbstractC3605l.amazon(0.0f, 16.0f, 0.0f, 32.0f, 5);
                        InterfaceC17242l interfaceC17242lAdcel = AbstractC15042l.adcel(AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f), AbstractC15042l.isVip());
                        C16016l c16016l2 = c16016l;
                        boolean zBilling4 = c6956l2.billing(c16016l2);
                        int i5 = i;
                        boolean zAmazon = zBilling4 | c6956l2.amazon(i5);
                        int i6 = i2;
                        boolean zAmazon2 = zAmazon | c6956l2.amazon(i6);
                        Function1 function3 = function1;
                        boolean zBilling5 = zAmazon2 | c6956l2.billing(function3);
                        Function1 function4 = function2;
                        boolean zBilling6 = zBilling5 | c6956l2.billing(function4);
                        Object objM2132native6 = c6956l2.m2132native();
                        if (zBilling6 || objM2132native6 == C1867l.yandex) {
                            C2184l c2184l = new C2184l(c16016l2, i5, i6, function3, function4, interfaceC8714l4);
                            c6956l2.m2147try(c2184l);
                            objM2132native6 = c2184l;
                        }
                        AbstractC16336l.yandex(interfaceC17242lAdcel, c5866l2, c17253lAmazon, null, null, null, false, null, (Function1) objM2132native6, c6956l2, 384, 504);
                    } else {
                        c6956l2.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), c6956l, ((i4 >> 18) & 14) | 806903808, 430);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10939l(str, c16016l, i, i2, function1, function2, interfaceC17242l, i3);
        }
    }

    public static final void crashlytics(String str, InterfaceC0582l interfaceC0582l, C0059l c0059l, C0059l c0059l2, Function1 function1, Function1 function2, C15578l c15578l, C15578l c15578l2, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(-422747521);
        int i2 = i | (c6956l.billing(str) ? 4 : 2) | (c6956l.billing(interfaceC0582l) ? 32 : 16) | (c6956l.admob(c0059l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.admob(c0059l2) ? 2048 : 1024) | (c6956l.admob(function1) ? 16384 : 8192) | (c6956l.admob(function2) ? 131072 : 65536);
        if (c6956l.m2127for(i2 & 1, (38347923 & i2) != 38347922)) {
            AbstractC11028l.billing(c6956l, 0);
            AbstractC15497l.loadAd(interfaceC17242l, c15578l, c15578l2, null, null, 0, C9735l.isPro, 0L, AbstractC10439l.yandex, AbstractC14566l.amazon(1810494928, new C2669l(interfaceC0582l, str, c0059l, c0059l2, function1, function2, 1), c6956l), c6956l, 907542966, 184);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10874l(str, interfaceC0582l, c0059l, c0059l2, function1, function2, c15578l, c15578l2, interfaceC17242l, i);
        }
    }

    public static final C4776l firebase() {
        return AbstractC0532l.subs(350, 2, AbstractC5355l.amazon);
    }

    public static final int isPro(EnumC12999l enumC12999l) {
        int i = enumC12999l == null ? -1 : AbstractC16963l.yandex[enumC12999l.ordinal()];
        if (i == -1) {
            return R.string.settings_integrations_lyrics_provider_auto;
        }
        if (i == 1) {
            return R.string.settings_integrations_lyrics_provider_vk;
        }
        if (i == 2) {
            return R.string.settings_integrations_lyrics_provider_musixmatch;
        }
        if (i == 3) {
            return R.string.settings_integrations_lyrics_provider_lrclib;
        }
        if (i == 4) {
            return R.string.settings_integrations_lyrics_provider_genius;
        }
        C18725l.billing();
        return 0;
    }

    public static final void loadAd(final EnumC12999l enumC12999l, final boolean z, final boolean z2, final InterfaceC17242l interfaceC17242l, C6956l c6956l, final int i) {
        int i2;
        long jLoadAd;
        c6956l.m2133new(406651500);
        if ((i & 6) == 0) {
            i2 = (c6956l.amazon(enumC12999l == null ? -1 : enumC12999l.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (c6956l.mopub(z) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= c6956l.mopub(z2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i4 = i3 | (c6956l.billing(interfaceC17242l) ? 2048 : 1024);
        final int i5 = 0;
        if (c6956l.m2127for(i4 & 1, (i4 & 1171) != 1170)) {
            int i6 = AbstractC15548l.yandex;
            if (z) {
                c6956l.m2123default(-49903521);
                jLoadAd = C9735l.loadAd(0.15f, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.yandex);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(-49902537);
                c6956l.startapp(false);
                jLoadAd = C9735l.isPro;
            }
            final int i7 = 1;
            final int i8 = 2;
            AbstractC13319l.yandex(AbstractC14566l.amazon(-608219698, new Function2() { // from class: lٖؒۚ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i9;
                    int i10;
                    int i11 = i5;
                    EnumC12999l enumC12999l2 = enumC12999l;
                    switch (i11) {
                        case 0:
                            C6956l c6956l2 = (C6956l) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                                AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, AbstractC8007l.isPro(enumC12999l2)), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                            } else {
                                c6956l2.m2124else();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            C6956l c6956l3 = (C6956l) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                int i12 = enumC12999l2 == null ? -1 : AbstractC16963l.yandex[enumC12999l2.ordinal()];
                                if (i12 == -1) {
                                    i9 = R.string.settings_integrations_lyrics_provider_auto_description;
                                } else if (i12 == 1) {
                                    i9 = R.string.settings_integrations_lyrics_provider_vk_description;
                                } else if (i12 == 2) {
                                    i9 = R.string.settings_integrations_lyrics_provider_musixmatch_description;
                                } else if (i12 == 3) {
                                    i9 = R.string.settings_integrations_lyrics_provider_lrclib_description;
                                } else {
                                    if (i12 != 4) {
                                        C18725l.billing();
                                        return null;
                                    }
                                    i9 = R.string.settings_integrations_lyrics_provider_genius_description;
                                }
                                AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, i9), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                            } else {
                                c6956l3.m2124else();
                            }
                            return Unit.INSTANCE;
                        default:
                            C6956l c6956l4 = (C6956l) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (c6956l4.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                int i13 = enumC12999l2 == null ? -1 : AbstractC16963l.yandex[enumC12999l2.ordinal()];
                                if (i13 == -1) {
                                    i10 = R.drawable.ic_flash_outline_28;
                                } else if (i13 != 1) {
                                    i10 = R.drawable.ic_add_square_outline_28;
                                    if (i13 != 2 && i13 != 3) {
                                        if (i13 != 4) {
                                            C18725l.billing();
                                            return null;
                                        }
                                        i10 = R.drawable.ic_globe_outline_28;
                                    }
                                } else {
                                    i10 = R.drawable.ic_logo_vk_outline_28;
                                }
                                AbstractC4597l.loadAd(AbstractC16759l.crashlytics(i10, 0, c6956l4), null, null, 0L, c6956l4, 56, 12);
                            } else {
                                c6956l4.m2124else();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, c6956l), interfaceC17242l, null, AbstractC14566l.amazon(-1787216533, new Function2() { // from class: lٖؒۚ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i9;
                    int i10;
                    int i11 = i7;
                    EnumC12999l enumC12999l2 = enumC12999l;
                    switch (i11) {
                        case 0:
                            C6956l c6956l2 = (C6956l) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                                AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, AbstractC8007l.isPro(enumC12999l2)), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                            } else {
                                c6956l2.m2124else();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            C6956l c6956l3 = (C6956l) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                int i12 = enumC12999l2 == null ? -1 : AbstractC16963l.yandex[enumC12999l2.ordinal()];
                                if (i12 == -1) {
                                    i9 = R.string.settings_integrations_lyrics_provider_auto_description;
                                } else if (i12 == 1) {
                                    i9 = R.string.settings_integrations_lyrics_provider_vk_description;
                                } else if (i12 == 2) {
                                    i9 = R.string.settings_integrations_lyrics_provider_musixmatch_description;
                                } else if (i12 == 3) {
                                    i9 = R.string.settings_integrations_lyrics_provider_lrclib_description;
                                } else {
                                    if (i12 != 4) {
                                        C18725l.billing();
                                        return null;
                                    }
                                    i9 = R.string.settings_integrations_lyrics_provider_genius_description;
                                }
                                AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, i9), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                            } else {
                                c6956l3.m2124else();
                            }
                            return Unit.INSTANCE;
                        default:
                            C6956l c6956l4 = (C6956l) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (c6956l4.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                int i13 = enumC12999l2 == null ? -1 : AbstractC16963l.yandex[enumC12999l2.ordinal()];
                                if (i13 == -1) {
                                    i10 = R.drawable.ic_flash_outline_28;
                                } else if (i13 != 1) {
                                    i10 = R.drawable.ic_add_square_outline_28;
                                    if (i13 != 2 && i13 != 3) {
                                        if (i13 != 4) {
                                            C18725l.billing();
                                            return null;
                                        }
                                        i10 = R.drawable.ic_globe_outline_28;
                                    }
                                } else {
                                    i10 = R.drawable.ic_logo_vk_outline_28;
                                }
                                AbstractC4597l.loadAd(AbstractC16759l.crashlytics(i10, 0, c6956l4), null, null, 0L, c6956l4, 56, 12);
                            } else {
                                c6956l4.m2124else();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, c6956l), AbstractC14566l.amazon(2114751818, new Function2() { // from class: lٖؒۚ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i9;
                    int i10;
                    int i11 = i8;
                    EnumC12999l enumC12999l2 = enumC12999l;
                    switch (i11) {
                        case 0:
                            C6956l c6956l2 = (C6956l) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                                AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, AbstractC8007l.isPro(enumC12999l2)), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                            } else {
                                c6956l2.m2124else();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            C6956l c6956l3 = (C6956l) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                int i12 = enumC12999l2 == null ? -1 : AbstractC16963l.yandex[enumC12999l2.ordinal()];
                                if (i12 == -1) {
                                    i9 = R.string.settings_integrations_lyrics_provider_auto_description;
                                } else if (i12 == 1) {
                                    i9 = R.string.settings_integrations_lyrics_provider_vk_description;
                                } else if (i12 == 2) {
                                    i9 = R.string.settings_integrations_lyrics_provider_musixmatch_description;
                                } else if (i12 == 3) {
                                    i9 = R.string.settings_integrations_lyrics_provider_lrclib_description;
                                } else {
                                    if (i12 != 4) {
                                        C18725l.billing();
                                        return null;
                                    }
                                    i9 = R.string.settings_integrations_lyrics_provider_genius_description;
                                }
                                AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, i9), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                            } else {
                                c6956l3.m2124else();
                            }
                            return Unit.INSTANCE;
                        default:
                            C6956l c6956l4 = (C6956l) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (c6956l4.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                int i13 = enumC12999l2 == null ? -1 : AbstractC16963l.yandex[enumC12999l2.ordinal()];
                                if (i13 == -1) {
                                    i10 = R.drawable.ic_flash_outline_28;
                                } else if (i13 != 1) {
                                    i10 = R.drawable.ic_add_square_outline_28;
                                    if (i13 != 2 && i13 != 3) {
                                        if (i13 != 4) {
                                            C18725l.billing();
                                            return null;
                                        }
                                        i10 = R.drawable.ic_globe_outline_28;
                                    }
                                } else {
                                    i10 = R.drawable.ic_logo_vk_outline_28;
                                }
                                AbstractC4597l.loadAd(AbstractC16759l.crashlytics(i10, 0, c6956l4), null, null, 0L, c6956l4, 56, 12);
                            } else {
                                c6956l4.m2124else();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, c6956l), AbstractC14566l.amazon(1721752873, new C4061l(i7, z2, z), c6956l), AbstractC15548l.yandex(jLoadAd, 0L, 0L, 0L, c6956l, 510), c6956l, ((i4 >> 6) & 112) | 224262, 388);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lِٚۢ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC8007l.loadAd(enumC12999l, z, z2, interfaceC17242l, (C6956l) obj, AbstractC0545l.purchase(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void mopub(InterfaceC8714l interfaceC8714l, boolean z) {
        interfaceC8714l.setValue(Boolean.valueOf(z));
    }

    public static final void purchase(InterfaceC17242l interfaceC17242l, AbstractC14165l abstractC14165l, String str, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(1337506262);
        int i2 = i | (c6956l2.billing(interfaceC17242l) ? 4 : 2) | (c6956l2.admob(abstractC14165l) ? 32 : 16) | (c6956l2.billing(str) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l2.m2127for(i2 & 1, (i2 & 147) != 146)) {
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            C16170l c16170l = C16170l.yandex;
            C14855l c14855l = C18450l.f36043l;
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(c16170l.yandex(c4346l, c14855l), 16.0f, 0.0f, 2);
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36034l, c6956l2, 54);
            long j2 = c6956l2.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lVip);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
            C10707l c10707l = AbstractC5992l.yandex;
            AbstractC4597l.loadAd(abstractC14165l, null, AbstractC0080l.isPro(c4346l, 36.0f), ((C18718l) c6956l2.isPro(c10707l)).loadAd, c6956l2, 440 | ((i2 >> 3) & 14), 0);
            AbstractC13010l.loadAd(str, null, ((C18718l) c6956l2.isPro(c10707l)).loadAd, AbstractC7039l.isPro(15), null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, null, c6956l, ((i2 >> 6) & 14) | 24576, 0, 261098);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12755l(interfaceC17242l, abstractC14165l, str, i, 24);
        }
    }

    public static final void subs(String str, boolean z, Function0 function0, Function0 function1, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        Object objMopub;
        c6956l.m2133new(67821103);
        int i2 = i | (c6956l.billing(str) ? 4 : 2) | (c6956l.mopub(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.admob(function0) ? 2048 : 1024) | (c6956l.admob(function1) ? 16384 : 8192);
        if (c6956l.m2127for(i2 & 1, (i2 & 74899) != 74898)) {
            C18656l c18656lIsPro = AbstractC2438l.isPro(Boolean.valueOf(z), "Lyrics Item Transition", c6956l, 48, 0);
            C0010l c0010l = AbstractC3483l.purchase;
            boolean zMopub = c18656lIsPro.mopub();
            Object obj = C1867l.yandex;
            if (zMopub) {
                objMopub = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656lIsPro);
            } else {
                c6956l.m2123default(1666573488);
                boolean zBilling = c6956l.billing(c18656lIsPro);
                objMopub = c6956l.m2132native();
                if (zBilling || objMopub == obj) {
                    AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
                    Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
                    AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
                    try {
                        Object objCrashlytics = c18656lIsPro.crashlytics();
                        AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                        c6956l.m2147try(objCrashlytics);
                        objMopub = objCrashlytics;
                    } catch (Throwable th) {
                        AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                        throw th;
                    }
                }
                c6956l.startapp(false);
            }
            boolean zBooleanValue = ((Boolean) objMopub).booleanValue();
            c6956l.m2123default(-278060084);
            float f = zBooleanValue ? 1.0f : 0.5f;
            c6956l.startapp(false);
            Float fValueOf = Float.valueOf(f);
            boolean zBilling2 = c6956l.billing(c18656lIsPro);
            Object objM2132native = c6956l.m2132native();
            if (zBilling2 || objM2132native == obj) {
                objM2132native = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 22));
                c6956l.m2147try(objM2132native);
            }
            boolean zBooleanValue2 = ((Boolean) ((InterfaceC12244l) objM2132native).getValue()).booleanValue();
            c6956l.m2123default(-278060084);
            float f2 = zBooleanValue2 ? 1.0f : 0.5f;
            c6956l.startapp(false);
            Float fValueOf2 = Float.valueOf(f2);
            boolean zBilling3 = c6956l.billing(c18656lIsPro);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling3 || objM2132native2 == obj) {
                objM2132native2 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 23));
                c6956l.m2147try(objM2132native2);
            }
            c6956l.m2123default(1675597799);
            C4776l c4776lFirebase = firebase();
            c6956l.startapp(false);
            C9459l c9459lBilling = AbstractC2438l.billing(c18656lIsPro, fValueOf, fValueOf2, c4776lFirebase, c0010l, c6956l, 196608);
            AbstractC5189l abstractC5189l = AbstractC16964l.yandex;
            C11090l c11090l = ((C14370l) c6956l.isPro(abstractC5189l)).loadAd.billing;
            long j = ((C18718l) c6956l.isPro(AbstractC5992l.yandex)).yandex;
            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC9151l.crashlytics(AbstractC0019l.crashlytics(C4346l.f8873l, ((C14370l) c6956l.isPro(abstractC5189l)).crashlytics.crashlytics), null, (InterfaceC2186l) c6956l.isPro(AbstractC14631l.yandex), true, function1, function0, 440);
            boolean zBilling4 = c6956l.billing(c9459lBilling);
            Object objM2132native3 = c6956l.m2132native();
            if (zBilling4 || objM2132native3 == obj) {
                objM2132native3 = new C2116l(c9459lBilling, 6);
                c6956l.m2147try(objM2132native3);
            }
            AbstractC13010l.loadAd(str, AbstractC3605l.remoteconfig(AbstractC7477l.loadAd(interfaceC17242lCrashlytics, (Function1) objM2132native3), 24.0f, 8.0f).premium(interfaceC17242l), j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, c11090l, c6956l, i2 & 14, 0, 131064);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8076l(str, z, function0, function1, interfaceC17242l, i, 4);
        }
    }

    public static final void yandex(C15578l c15578l, C14974l c14974l, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        C15578l c15578l2;
        InterfaceC17242l interfaceC17242l2;
        C6956l c6956l2;
        c6956l.m2133new(-1723318262);
        int i2 = (c6956l.billing(c14974l) ? 32 : 16) | i | (c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            c15578l2 = c15578l;
            interfaceC17242l2 = interfaceC17242l;
            c6956l2 = c6956l;
            AbstractC0133l.amazon(c15578l2, AbstractC14566l.amazon(-1160227849, new C16561l(5, c14974l), c6956l), interfaceC17242l2, null, c6956l2, 54 | (i2 & 896), 8);
        } else {
            c15578l2 = c15578l;
            interfaceC17242l2 = interfaceC17242l;
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12755l(c15578l2, c14974l, interfaceC17242l2, i);
        }
    }
}
