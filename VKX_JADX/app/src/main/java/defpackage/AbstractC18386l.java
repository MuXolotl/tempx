package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lٙؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18386l {
    public static final C17963l crashlytics;
    public static final C17963l loadAd;
    public static final C6916l yandex = new C6916l("camera2.streamSpec.streamUseCase", Long.TYPE, null);

    static {
        C17963l c17963l = new C17963l();
        int i = Build.VERSION.SDK_INT;
        EnumC11949l enumC11949l = EnumC11949l.f23819l;
        EnumC11949l enumC11949l2 = EnumC11949l.f23817l;
        EnumC11949l enumC11949l3 = EnumC11949l.f23816l;
        if (i >= 33) {
            EnumC11949l enumC11949l4 = EnumC11949l.f23820l;
            EnumC11949l enumC11949l5 = EnumC11949l.f23814l;
            c17963l.put(4L, AbstractC8669l.m2407import(new EnumC11949l[]{enumC11949l3, enumC11949l4, enumC11949l5}));
            c17963l.put(1L, AbstractC8669l.m2407import(new EnumC11949l[]{enumC11949l3, enumC11949l4, enumC11949l5}));
            c17963l.put(2L, Collections.singleton(enumC11949l2));
            c17963l.put(3L, Collections.singleton(enumC11949l));
        }
        loadAd = c17963l.crashlytics();
        C17963l c17963l2 = new C17963l();
        if (i >= 33) {
            c17963l2.put(4L, AbstractC8669l.m2407import(new EnumC11949l[]{enumC11949l3, enumC11949l2, enumC11949l}));
            c17963l2.put(3L, AbstractC8669l.m2407import(new EnumC11949l[]{enumC11949l3, enumC11949l}));
        }
        crashlytics = c17963l2.crashlytics();
    }

    public static boolean amazon(InterfaceC5389l interfaceC5389l) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        long[] jArr = (long[]) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
        return (jArr == null || jArr.length == 0) ? false : true;
    }

    public static boolean billing(InterfaceC5389l interfaceC5389l, ArrayList arrayList, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        boolean z;
        boolean z2;
        if (Build.VERSION.SDK_INT >= 33) {
            ArrayList<InterfaceC0048l> arrayList2 = new ArrayList(linkedHashMap.keySet());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((C7314l) it.next()).billing == null) {
                    C8339l.smaato("Required value was null.");
                    return false;
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object obj = linkedHashMap.get((InterfaceC0048l) it2.next());
                if (obj == null) {
                    C8339l.smaato("Required value was null.");
                    return false;
                }
                if (((C5464l) obj).billing == null) {
                    C8339l.smaato("Required value was null.");
                    return false;
                }
            }
            long[] jArr = (long[]) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
            if (jArr != null && jArr.length != 0) {
                HashSet hashSet = new HashSet();
                for (long j : jArr) {
                    hashSet.add(Long.valueOf(j));
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    C7314l c7314l = (C7314l) it3.next();
                    InterfaceC17944l interfaceC17944l = c7314l.billing;
                    C6916l c6916l = C16443l.f32153l;
                    if (interfaceC17944l.mo861strictfp(c6916l) && ((Number) c7314l.billing.adcel(c6916l)).longValue() != 0) {
                        z2 = false;
                        z = true;
                    } else {
                        z = false;
                        z2 = true;
                    }
                } else {
                    z = false;
                    z2 = false;
                }
                for (InterfaceC0048l interfaceC0048l : arrayList2) {
                    C6916l c6916l2 = C16443l.f32153l;
                    if (interfaceC0048l.mo861strictfp(c6916l2)) {
                        long jLongValue = ((Number) interfaceC0048l.adcel(c6916l2)).longValue();
                        if (jLongValue != 0) {
                            if (z2) {
                                C8339l.metrica("Either all use cases must have non-default stream use case assigned or none should have it");
                                return false;
                            }
                            linkedHashSet.add(Long.valueOf(jLongValue));
                            z = true;
                        } else if (z) {
                            C8339l.metrica("Either all use cases must have non-default stream use case assigned or none should have it");
                            return false;
                        }
                    } else if (z) {
                        C8339l.metrica("Either all use cases must have non-default stream use case assigned or none should have it");
                        return false;
                    }
                    z2 = true;
                }
                if (!z2) {
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        if (!hashSet.contains(Long.valueOf(((Number) it4.next()).longValue()))) {
                        }
                    }
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        C7314l c7314l2 = (C7314l) it5.next();
                        InterfaceC17944l interfaceC17944l2 = c7314l2.billing;
                        C16443l c16443lLoadAd = loadAd(interfaceC17944l2, (Long) interfaceC17944l2.adcel(C16443l.f32153l));
                        if (c16443lLoadAd != null) {
                            C6472l c6472lYandex = C5464l.yandex(c7314l2.crashlytics);
                            c6472lYandex.f13514l = Integer.valueOf(c7314l2.mopub);
                            Range range = c7314l2.admob;
                            if (range == null) {
                                C6541l.subs("Null expectedFrameRateRange");
                                return false;
                            }
                            c6472lYandex.f13516l = range;
                            C15421l c15421l = c7314l2.amazon;
                            if (c15421l == null) {
                                C6541l.subs("Null dynamicRange");
                                return false;
                            }
                            c6472lYandex.f13515l = c15421l;
                            c6472lYandex.f13510l = c16443lLoadAd;
                            linkedHashMap2.put(c7314l2, c6472lYandex.yandex());
                        }
                    }
                    for (InterfaceC0048l interfaceC0048l2 : arrayList2) {
                        C5464l c5464l = (C5464l) linkedHashMap.get(interfaceC0048l2);
                        InterfaceC17944l interfaceC17944l3 = c5464l.billing;
                        C16443l c16443lLoadAd2 = loadAd(interfaceC17944l3, (Long) interfaceC17944l3.adcel(C16443l.f32153l));
                        if (c16443lLoadAd2 != null) {
                            C6472l c6472lLoadAd = c5464l.loadAd();
                            c6472lLoadAd.f13510l = c16443lLoadAd2;
                            linkedHashMap.put(interfaceC0048l2, c6472lLoadAd.yandex());
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean crashlytics(EnumC11949l enumC11949l, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (enumC11949l != EnumC11949l.f23818l) {
            Long lValueOf = Long.valueOf(j);
            C17963l c17963l = loadAd;
            return c17963l.containsKey(lValueOf) && ((Set) c17963l.get(Long.valueOf(j))).contains(enumC11949l);
        }
        Long lValueOf2 = Long.valueOf(j);
        C17963l c17963l2 = crashlytics;
        if (!c17963l2.containsKey(lValueOf2)) {
            return false;
        }
        Set set = (Set) c17963l2.get(Long.valueOf(j));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((EnumC11949l) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static C16443l loadAd(InterfaceC17944l interfaceC17944l, Long l) {
        C6916l c6916l = yandex;
        if (interfaceC17944l.mo861strictfp(c6916l) && AbstractC8576l.yandex(interfaceC17944l.adcel(c6916l), l)) {
            return null;
        }
        C5104l c5104lAmazon = C5104l.amazon(interfaceC17944l);
        c5104lAmazon.mopub(c6916l, l);
        return new C16443l(5, c5104lAmazon);
    }

    public static boolean purchase(InterfaceC17944l interfaceC17944l, EnumC11949l enumC11949l) {
        if (((Boolean) interfaceC17944l.smaato(InterfaceC0048l.f929l, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        C6916l c6916l = C14180l.f27767l;
        if (interfaceC17944l.mo861strictfp(c6916l)) {
            return enumC11949l.ordinal() == 0 && ((Number) interfaceC17944l.adcel(c6916l)).intValue() == 2;
        }
        return false;
    }

    public static boolean yandex(InterfaceC5389l interfaceC5389l, List list) {
        if (Build.VERSION.SDK_INT >= 33) {
            long[] jArr = (long[]) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
            if (jArr != null && jArr.length != 0) {
                HashSet hashSet = new HashSet();
                for (long j : jArr) {
                    hashSet.add(Long.valueOf(j));
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!hashSet.contains(Long.valueOf(((C2483l) it.next()).crashlytics.f36415l))) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}
