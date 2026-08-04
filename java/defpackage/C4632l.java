package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: lٜؗؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4632l {
    public static final HashMap admob;
    public static final String amazon;
    public static final C2312l billing;
    public static final String crashlytics;
    public static final HashMap firebase;
    public static final HashMap isPro;
    public static final String loadAd;
    public static final List metrica;
    public static final C3624l mopub;
    public static final C3624l purchase;
    public static final HashMap remoteconfig;
    public static final HashMap smaato;
    public static final HashMap subs;
    public static final LinkedHashSet vip;
    public static final String yandex;

    static {
        StringBuilder sb = new StringBuilder();
        C1015l c1015l = C1015l.amazon;
        sb.append(c1015l.yandex);
        sb.append('.');
        sb.append(c1015l.loadAd);
        yandex = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        C0097l c0097l = C0097l.amazon;
        sb2.append(c0097l.yandex);
        sb2.append('.');
        sb2.append(c0097l.loadAd);
        loadAd = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        C9392l c9392l = C9392l.amazon;
        sb3.append(c9392l.yandex);
        sb3.append('.');
        sb3.append(c9392l.loadAd);
        crashlytics = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        C4988l c4988l = C4988l.amazon;
        sb4.append(c4988l.yandex);
        sb4.append('.');
        sb4.append(c4988l.loadAd);
        amazon = sb4.toString();
        C3624l c3624lAd = C8565l.ad(new C2312l("kotlin.jvm.functions.FunctionN"));
        purchase = c3624lAd;
        billing = c3624lAd.yandex();
        mopub = C18098l.ads;
        purchase(Class.class);
        admob = new HashMap();
        subs = new HashMap();
        isPro = new HashMap();
        firebase = new HashMap();
        smaato = new HashMap();
        remoteconfig = new HashMap();
        vip = new LinkedHashSet();
        C3624l c3624lAd2 = C8565l.ad(AbstractC3333l.premium);
        C2312l c2312l = AbstractC3333l.f7108volatile;
        C2312l c2312l2 = c3624lAd2.yandex;
        C11180l c11180l = new C11180l(purchase(Iterable.class), c3624lAd2, new C3624l(c2312l2, AbstractC14905l.amazon(c2312l, c2312l2), false));
        C3624l c3624lAd3 = C8565l.ad(AbstractC3333l.signatures);
        C2312l c2312l3 = AbstractC3333l.f7102strictfp;
        C2312l c2312l4 = c3624lAd3.yandex;
        C11180l c11180l2 = new C11180l(purchase(Iterator.class), c3624lAd3, new C3624l(c2312l4, AbstractC14905l.amazon(c2312l3, c2312l4), false));
        C3624l c3624lAd4 = C8565l.ad(AbstractC3333l.applovin);
        C2312l c2312l5 = AbstractC3333l.f7096native;
        C2312l c2312l6 = c3624lAd4.yandex;
        C11180l c11180l3 = new C11180l(purchase(Collection.class), c3624lAd4, new C3624l(c2312l6, AbstractC14905l.amazon(c2312l5, c2312l6), false));
        C3624l c3624lAd5 = C8565l.ad(AbstractC3333l.appmetrica);
        C2312l c2312l7 = AbstractC3333l.f7099private;
        C2312l c2312l8 = c3624lAd5.yandex;
        C11180l c11180l4 = new C11180l(purchase(List.class), c3624lAd5, new C3624l(c2312l8, AbstractC14905l.amazon(c2312l7, c2312l8), false));
        C3624l c3624lAd6 = C8565l.ad(AbstractC3333l.f7107throws);
        C2312l c2312l9 = AbstractC3333l.f7091for;
        C2312l c2312l10 = c3624lAd6.yandex;
        C11180l c11180l5 = new C11180l(purchase(Set.class), c3624lAd6, new C3624l(c2312l10, AbstractC14905l.amazon(c2312l9, c2312l10), false));
        C3624l c3624lAd7 = C8565l.ad(AbstractC3333l.inmobi);
        C2312l c2312l11 = AbstractC3333l.f7088extends;
        C2312l c2312l12 = c3624lAd7.yandex;
        C11180l c11180l6 = new C11180l(purchase(ListIterator.class), c3624lAd7, new C3624l(c2312l12, AbstractC14905l.amazon(c2312l11, c2312l12), false));
        C2312l c2312l13 = AbstractC3333l.f7098package;
        C3624l c3624lAd8 = C8565l.ad(c2312l13);
        C2312l c2312l14 = AbstractC3333l.f7106throw;
        C2312l c2312l15 = c3624lAd8.yandex;
        C11180l c11180l7 = new C11180l(purchase(Map.class), c3624lAd8, new C3624l(c2312l15, AbstractC14905l.amazon(c2312l14, c2312l15), false));
        C3624l c3624lAmazon = C8565l.ad(c2312l13).amazon(AbstractC3333l.f7105synchronized.yandex.mopub());
        C2312l c2312l16 = AbstractC3333l.f7083catch;
        C2312l c2312l17 = c3624lAmazon.yandex;
        List<C11180l> listRemoteconfig = AbstractC14055l.remoteconfig(c11180l, c11180l2, c11180l3, c11180l4, c11180l5, c11180l6, c11180l7, new C11180l(purchase(Map.Entry.class), c3624lAmazon, new C3624l(c2312l17, AbstractC14905l.amazon(c2312l16, c2312l17), false)));
        metrica = listRemoteconfig;
        amazon(Object.class, AbstractC3333l.yandex);
        amazon(String.class, AbstractC3333l.billing);
        amazon(CharSequence.class, AbstractC3333l.purchase);
        crashlytics(Throwable.class, AbstractC3333l.firebase);
        amazon(Cloneable.class, AbstractC3333l.crashlytics);
        amazon(Number.class, AbstractC3333l.subs);
        crashlytics(Comparable.class, AbstractC3333l.smaato);
        amazon(Enum.class, AbstractC3333l.isPro);
        crashlytics(Annotation.class, AbstractC3333l.subscription);
        for (C11180l c11180l8 : listRemoteconfig) {
            C3624l c3624l = c11180l8.yandex;
            C3624l c3624l2 = c11180l8.loadAd;
            C3624l c3624l3 = c11180l8.crashlytics;
            yandex(c3624l, c3624l2);
            loadAd(c3624l3.yandex(), c3624l);
            smaato.put(c3624l3, c3624l2);
            remoteconfig.put(c3624l2, c3624l3);
            C2312l c2312lYandex = c3624l2.yandex();
            C2312l c2312lYandex2 = c3624l3.yandex();
            isPro.put(c3624l3.yandex().yandex, c2312lYandex);
            firebase.put(c2312lYandex.yandex, c2312lYandex2);
        }
        for (EnumC17708l enumC17708l : EnumC17708l.values()) {
            C2312l c2312l18 = enumC17708l.f34523l;
            if (c2312l18 == null) {
                EnumC17708l.yandex(15);
                throw null;
            }
            C3624l c3624l4 = new C3624l(c2312l18.loadAd(), c2312l18.yandex.mopub());
            C2312l c2312lYandex3 = AbstractC3974l.firebase.yandex(enumC17708l.crashlytics().f31171l);
            yandex(c3624l4, new C3624l(c2312lYandex3.loadAd(), c2312lYandex3.yandex.mopub()));
        }
        for (C3624l c3624l5 : AbstractC9530l.yandex) {
            C2312l c2312l19 = new C2312l("kotlin.jvm.internal." + c3624l5.billing().loadAd() + "CompanionObject");
            yandex(new C3624l(c2312l19.loadAd(), c2312l19.yandex.mopub()), c3624l5.amazon(AbstractC13589l.loadAd));
        }
        for (int i = 0; i < 23; i++) {
            C2312l c2312l20 = new C2312l(AbstractC0653l.vip(i, "kotlin.jvm.functions.Function"));
            yandex(new C3624l(c2312l20.loadAd(), c2312l20.yandex.mopub()), new C3624l(AbstractC3974l.firebase, C3498l.purchase("Function" + i)));
            loadAd(new C2312l(AbstractC9361l.Signature(i, loadAd, new StringBuilder())), mopub);
        }
        for (int i2 = 0; i2 < 22; i2++) {
            loadAd(new C2312l(AbstractC9361l.Signature(i2, amazon, new StringBuilder())), mopub);
        }
        loadAd(new C2312l("kotlin.concurrent.atomics.AtomicInt"), purchase(AtomicInteger.class));
        loadAd(new C2312l("kotlin.concurrent.atomics.AtomicLong"), purchase(AtomicLong.class));
        loadAd(new C2312l("kotlin.concurrent.atomics.AtomicBoolean"), purchase(AtomicBoolean.class));
        loadAd(new C2312l("kotlin.concurrent.atomics.AtomicReference"), purchase(AtomicReference.class));
        loadAd(new C2312l("kotlin.concurrent.atomics.AtomicIntArray"), purchase(AtomicIntegerArray.class));
        loadAd(new C2312l("kotlin.concurrent.atomics.AtomicLongArray"), purchase(AtomicLongArray.class));
        loadAd(new C2312l("kotlin.concurrent.atomics.AtomicArray"), purchase(AtomicReferenceArray.class));
        loadAd(AbstractC3333l.loadAd.subs(), purchase(Void.class));
    }

    public static C3624l admob(C16781l c16781l) {
        if (billing(c16781l, yandex, false) || billing(c16781l, crashlytics, true)) {
            return purchase;
        }
        return (billing(c16781l, loadAd, false) || billing(c16781l, amazon, true)) ? mopub : (C3624l) subs.get(c16781l);
    }

    public static void amazon(Class cls, C16781l c16781l) {
        crashlytics(cls, c16781l.subs());
    }

    public static boolean billing(C16781l c16781l, String str, boolean z) {
        String str2 = c16781l.yandex;
        if (AbstractC16648l.isVip(str2, str, false)) {
            String strSubstring = str2.substring(str.length());
            if (!AbstractC12024l.m3349try(strSubstring, '0')) {
                Integer numSignatures = AbstractC16648l.signatures(strSubstring);
                int i = z ? 22 : 23;
                if (numSignatures != null && numSignatures.intValue() >= i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void crashlytics(Class cls, C2312l c2312l) {
        yandex(purchase(cls), new C3624l(c2312l.loadAd(), c2312l.yandex.mopub()));
    }

    public static void loadAd(C2312l c2312l, C3624l c3624l) {
        vip.add(c2312l);
        subs.put(c2312l.yandex, c3624l);
    }

    public static C3624l mopub(C2312l c2312l) {
        return (C3624l) admob.get(c2312l.yandex);
    }

    public static C3624l purchase(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return purchase(declaringClass).amazon(C3498l.purchase(cls.getSimpleName()));
        }
        C2312l c2312l = new C2312l(cls.getCanonicalName());
        return new C3624l(c2312l.loadAd(), c2312l.yandex.mopub());
    }

    public static C2312l subs(C16781l c16781l) {
        return (C2312l) firebase.get(c16781l);
    }

    public static void yandex(C3624l c3624l, C3624l c3624l2) {
        admob.put(c3624l.yandex().yandex, c3624l2);
        loadAd(c3624l2.yandex(), c3624l);
    }
}
