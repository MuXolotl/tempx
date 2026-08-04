package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: lؘْۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5656l extends LinkedHashMap {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f12008l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C1306l f12009l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C15406l f12010l;

    public C5656l(C15406l c15406l, C1306l c1306l, int i) {
        super(10, 0.75f, true);
        this.f12010l = c15406l;
        this.f12009l = c1306l;
        this.f12008l = i;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (this.f12008l == 0) {
            return this.f12010l.invoke(obj);
        }
        synchronized (this) {
            Object obj2 = super.get(obj);
            if (obj2 != null) {
                return obj2;
            }
            Object objInvoke = this.f12010l.invoke(obj);
            put(obj, objInvoke);
            return objInvoke;
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        boolean z = super.size() > this.f12008l;
        if (z) {
            Object value = entry.getValue();
            this.f12009l.getClass();
            Unit unit = Unit.INSTANCE;
        }
        return z;
    }
}
