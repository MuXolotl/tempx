package defpackage;

import android.util.ArrayMap;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: lؚٞۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C7420l implements InterfaceC17944l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C7420l f15370l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C2351l f15371l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final TreeMap f15372l;

    static {
        C2351l c2351l = new C2351l(22);
        f15371l = c2351l;
        f15370l = new C7420l(new TreeMap(c2351l));
    }

    public C7420l(TreeMap treeMap) {
        this.f15372l = treeMap;
    }

    public static C7420l yandex(InterfaceC17944l interfaceC17944l) {
        if (C7420l.class.equals(interfaceC17944l.getClass())) {
            return (C7420l) interfaceC17944l;
        }
        TreeMap treeMap = new TreeMap(f15371l);
        for (C6916l c6916l : interfaceC17944l.startapp()) {
            Set<EnumC10534l> setSignature = interfaceC17944l.Signature(c6916l);
            ArrayMap arrayMap = new ArrayMap();
            for (EnumC10534l enumC10534l : setSignature) {
                arrayMap.put(enumC10534l, interfaceC17944l.advert(c6916l, enumC10534l));
            }
            treeMap.put(c6916l, arrayMap);
        }
        return new C7420l(treeMap);
    }

    @Override // defpackage.InterfaceC17944l
    public final Set Signature(C6916l c6916l) {
        Map map = (Map) this.f15372l.get(c6916l);
        return map == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(map.keySet());
    }

    @Override // defpackage.InterfaceC17944l
    public final Object adcel(C6916l c6916l) {
        Map map = (Map) this.f15372l.get(c6916l);
        if (map != null) {
            return map.get((EnumC10534l) Collections.min(map.keySet()));
        }
        C1759l.ads(c6916l, "Option does not exist: ");
        return null;
    }

    @Override // defpackage.InterfaceC17944l
    public final Object advert(C6916l c6916l, EnumC10534l enumC10534l) {
        Map map = (Map) this.f15372l.get(c6916l);
        if (map == null) {
            C1759l.ads(c6916l, "Option does not exist: ");
            return null;
        }
        if (map.containsKey(enumC10534l)) {
            return map.get(enumC10534l);
        }
        C1759l.smaato("Option does not exist: ", c6916l, " with priority=", enumC10534l);
        return null;
    }

    @Override // defpackage.InterfaceC17944l
    /* JADX INFO: renamed from: class */
    public final EnumC10534l mo860class(C6916l c6916l) {
        Map map = (Map) this.f15372l.get(c6916l);
        if (map != null) {
            return (EnumC10534l) Collections.min(map.keySet());
        }
        C1759l.ads(c6916l, "Option does not exist: ");
        return null;
    }

    @Override // defpackage.InterfaceC17944l
    public final void inmobi(C5131l c5131l) {
        for (Map.Entry entry : this.f15372l.tailMap(new C6916l("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (!((C6916l) entry.getKey()).yandex.startsWith("camera2.captureRequest.option.")) {
                return;
            }
            C6916l c6916l = (C6916l) entry.getKey();
            C3316l c3316l = (C3316l) c5131l.f11165l;
            InterfaceC17944l interfaceC17944l = (InterfaceC17944l) c5131l.f11164l;
            ((C5104l) c3316l.f7072l).purchase(c6916l, interfaceC17944l.mo860class(c6916l), interfaceC17944l.adcel(c6916l));
        }
    }

    @Override // defpackage.InterfaceC17944l
    public final Object smaato(C6916l c6916l, Object obj) {
        Map map = (Map) this.f15372l.get(c6916l);
        return map == null ? obj : map.get((EnumC10534l) Collections.min(map.keySet()));
    }

    @Override // defpackage.InterfaceC17944l
    public final Set startapp() {
        return DesugarCollections.unmodifiableSet(this.f15372l.keySet());
    }

    @Override // defpackage.InterfaceC17944l
    /* JADX INFO: renamed from: strictfp */
    public final boolean mo861strictfp(C6916l c6916l) {
        return this.f15372l.containsKey(c6916l);
    }
}
