package defpackage;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lُۚۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11320l extends AbstractSet {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C6756l f22812l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22813l;

    public /* synthetic */ C11320l(C6756l c6756l, int i) {
        this.f22813l = i;
        this.f22812l = c6756l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f22813l;
        C6756l c6756l = this.f22812l;
        switch (i) {
            case 0:
                c6756l.clear();
                break;
            default:
                c6756l.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.f22813l;
        C6756l c6756l = this.f22812l;
        switch (i) {
            case 0:
                Map mapCrashlytics = c6756l.crashlytics();
                if (mapCrashlytics != null) {
                    return mapCrashlytics.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iPurchase = c6756l.purchase(entry.getKey());
                    if (iPurchase != -1 && AbstractC7000l.loadAd(c6756l.firebase()[iPurchase], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return c6756l.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f22813l;
        C6756l c6756l = this.f22812l;
        switch (i) {
            case 0:
                Map mapCrashlytics = c6756l.crashlytics();
                return mapCrashlytics != null ? mapCrashlytics.entrySet().iterator() : new C2873l(c6756l, 1);
            default:
                Map mapCrashlytics2 = c6756l.crashlytics();
                return mapCrashlytics2 != null ? mapCrashlytics2.keySet().iterator() : new C2873l(c6756l, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.f22813l;
        C6756l c6756l = this.f22812l;
        switch (i) {
            case 0:
                Map mapCrashlytics = c6756l.crashlytics();
                if (mapCrashlytics != null) {
                    return mapCrashlytics.entrySet().remove(obj);
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (c6756l.mopub()) {
                    return false;
                }
                int iAmazon = c6756l.amazon();
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = c6756l.f14160l;
                Objects.requireNonNull(obj2);
                int iFirebase = AbstractC15576l.firebase(key, value, iAmazon, obj2, c6756l.subs(), c6756l.isPro(), c6756l.firebase());
                if (iFirebase == -1) {
                    return false;
                }
                c6756l.billing(iFirebase, iAmazon);
                c6756l.f14158l--;
                c6756l.f14166l += 32;
                return true;
            default:
                Map mapCrashlytics2 = c6756l.crashlytics();
                if (mapCrashlytics2 != null) {
                    return mapCrashlytics2.keySet().remove(obj);
                }
                return c6756l.admob(obj) != C6756l.f14156l;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.f22813l;
        C6756l c6756l = this.f22812l;
        switch (i) {
            case 0:
                break;
        }
        return c6756l.size();
    }
}
