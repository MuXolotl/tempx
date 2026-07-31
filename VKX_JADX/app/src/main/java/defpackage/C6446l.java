package defpackage;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lؙٓٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6446l extends AbstractSet {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C6756l f13468l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13469l;

    public /* synthetic */ C6446l(C6756l c6756l, int i) {
        this.f13469l = i;
        this.f13468l = c6756l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f13469l;
        C6756l c6756l = this.f13468l;
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
        int i = this.f13469l;
        C6756l c6756l = this.f13468l;
        switch (i) {
            case 0:
                Map mapStartapp = c6756l.startapp();
                if (mapStartapp != null) {
                    return mapStartapp.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iTapsense = c6756l.tapsense(entry.getKey());
                    if (iTapsense != -1 && AbstractC7574l.firebase(c6756l.metrica()[iTapsense], entry.getValue())) {
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
        int i = this.f13469l;
        C6756l c6756l = this.f13468l;
        switch (i) {
            case 0:
                Map mapStartapp = c6756l.startapp();
                return mapStartapp != null ? mapStartapp.entrySet().iterator() : new C17384l(c6756l, 1);
            default:
                Map mapStartapp2 = c6756l.startapp();
                return mapStartapp2 != null ? mapStartapp2.keySet().iterator() : new C17384l(c6756l, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.f13469l;
        C6756l c6756l = this.f13468l;
        switch (i) {
            case 0:
                Map mapStartapp = c6756l.startapp();
                if (mapStartapp != null) {
                    return mapStartapp.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c6756l.ads()) {
                        int iSubscription = c6756l.subscription();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c6756l.f14160l;
                        Objects.requireNonNull(obj2);
                        int iAdcel = AbstractC16431l.adcel(key, value, iSubscription, obj2, c6756l.remoteconfig(), c6756l.vip(), c6756l.metrica());
                        if (iAdcel != -1) {
                            c6756l.adcel(iAdcel, iSubscription);
                            c6756l.f14158l--;
                            c6756l.f14166l += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                Map mapStartapp2 = c6756l.startapp();
                if (mapStartapp2 != null) {
                    return mapStartapp2.keySet().remove(obj);
                }
                return c6756l.license(obj) != C6756l.f14155l;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.f13469l;
        C6756l c6756l = this.f13468l;
        switch (i) {
            case 0:
                break;
        }
        return c6756l.size();
    }
}
