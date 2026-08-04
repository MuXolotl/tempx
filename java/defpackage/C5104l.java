package defpackage;

import android.util.ArrayMap;
import j$.util.Objects;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: lؗۘؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5104l extends C7420l implements InterfaceC17944l {
    public static C5104l amazon(InterfaceC17944l interfaceC17944l) {
        TreeMap treeMap = new TreeMap(C7420l.f15371l);
        for (C6916l c6916l : interfaceC17944l.startapp()) {
            Set<EnumC10534l> setSignature = interfaceC17944l.Signature(c6916l);
            ArrayMap arrayMap = new ArrayMap();
            for (EnumC10534l enumC10534l : setSignature) {
                arrayMap.put(enumC10534l, interfaceC17944l.advert(c6916l, enumC10534l));
            }
            treeMap.put(c6916l, arrayMap);
        }
        return new C5104l(treeMap);
    }

    public static C5104l crashlytics() {
        return new C5104l(new TreeMap(C7420l.f15371l));
    }

    public final void isPro(C6916l c6916l) {
        this.f15372l.remove(c6916l);
    }

    public final void mopub(C6916l c6916l, Object obj) {
        purchase(c6916l, EnumC10534l.f21432l, obj);
    }

    public final void purchase(C6916l c6916l, EnumC10534l enumC10534l, Object obj) {
        EnumC10534l enumC10534l2;
        TreeMap treeMap = this.f15372l;
        Map map = (Map) treeMap.get(c6916l);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(c6916l, arrayMap);
            arrayMap.put(enumC10534l, obj);
            return;
        }
        EnumC10534l enumC10534l3 = (EnumC10534l) Collections.min(map.keySet());
        if (Objects.equals(map.get(enumC10534l3), obj) || enumC10534l3 != (enumC10534l2 = EnumC10534l.f21428l) || enumC10534l != enumC10534l2) {
            map.put(enumC10534l, obj);
            return;
        }
        StringBuilder sb = new StringBuilder("Option values conflicts: ");
        sb.append(c6916l.yandex);
        sb.append(", existing value (");
        sb.append(enumC10534l3);
        Object obj2 = map.get(enumC10534l3);
        sb.append(")=");
        sb.append(obj2);
        sb.append(", conflicting (");
        sb.append(enumC10534l);
        sb.append(")=");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }
}
