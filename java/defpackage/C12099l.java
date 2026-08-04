package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: lِۚ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12099l implements InterfaceC0553l {
    public final DynamicRangeProfiles yandex;

    public C12099l(DynamicRangeProfiles dynamicRangeProfiles) {
        this.yandex = dynamicRangeProfiles;
    }

    public static Set amazon(Set set) {
        if (set.isEmpty()) {
            return C5746l.f12138l;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            C15421l c15421l = (C15421l) AbstractC12156l.yandex.get(Long.valueOf(jLongValue));
            if (c15421l == null && AbstractC5088l.metrica()) {
                Log.w("CXCP", "Dynamic range profile cannot be converted to a DynamicRange object: " + jLongValue);
            }
            if (c15421l != null) {
                linkedHashSet.add(c15421l);
            }
        }
        return DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    @Override // defpackage.InterfaceC0553l
    public final Set crashlytics(C15421l c15421l) {
        LinkedHashMap linkedHashMap = AbstractC12156l.yandex;
        Long lYandex = AbstractC12156l.yandex(c15421l, this.yandex);
        if (lYandex != null) {
            return amazon(this.yandex.getProfileCaptureRequestConstraints(lYandex.longValue()));
        }
        C8936l.smaato(c15421l, "DynamicRange is not supported: ");
        return null;
    }

    @Override // defpackage.InterfaceC0553l
    public final Set loadAd() {
        return amazon(this.yandex.getSupportedProfiles());
    }

    @Override // defpackage.InterfaceC0553l
    public final DynamicRangeProfiles yandex() {
        return this.yandex;
    }
}
