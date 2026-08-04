package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lْؑۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0297l extends AbstractC11451l {
    public final Map loadAd;

    public C0297l(AbstractC1068l abstractC1068l, AbstractC1068l abstractC1068l2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        amazon(linkedHashMap, abstractC1068l);
        amazon(linkedHashMap, abstractC1068l2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((C11421l) entry.getKey()).crashlytics) {
                entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.loadAd = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public static void amazon(LinkedHashMap linkedHashMap, AbstractC1068l abstractC1068l) {
        for (int i = 0; i < abstractC1068l.mopub(); i++) {
            C11421l c11421lAdmob = abstractC1068l.admob(i);
            Object obj = linkedHashMap.get(c11421lAdmob);
            boolean z = c11421lAdmob.crashlytics;
            Class cls = c11421lAdmob.loadAd;
            if (z) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(c11421lAdmob, arrayList);
                }
                arrayList.add(cls.cast(abstractC1068l.subs(i)));
            } else {
                linkedHashMap.put(c11421lAdmob, cls.cast(abstractC1068l.subs(i)));
            }
        }
    }

    @Override // defpackage.AbstractC11451l
    public final Set crashlytics() {
        return this.loadAd.keySet();
    }

    @Override // defpackage.AbstractC11451l
    public final int loadAd() {
        return this.loadAd.size();
    }

    @Override // defpackage.AbstractC11451l
    public final void yandex(C7502l c7502l, C16979l c16979l) {
        for (Map.Entry entry : this.loadAd.entrySet()) {
            C11421l c11421l = (C11421l) entry.getKey();
            Object value = entry.getValue();
            if (c11421l.crashlytics) {
                c7502l.subs(c11421l, ((List) value).iterator(), c16979l);
            } else {
                c7502l.mopub(c11421l, value, c16979l);
            }
        }
    }
}
