package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lؙۖٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6671l implements InterfaceC12767l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public transient Collection f14026l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient Set f14027l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient Collection f14028l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public transient Map f14029l;

    @Override // defpackage.InterfaceC12767l
    public Map admob() {
        Map map = this.f14029l;
        if (map != null) {
            return map;
        }
        Map mapCrashlytics = crashlytics();
        this.f14029l = mapCrashlytics;
        return mapCrashlytics;
    }

    public abstract Collection amazon();

    public abstract Iterator billing();

    public abstract Map crashlytics();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC12767l) {
            return admob().equals(((InterfaceC12767l) obj).admob());
        }
        return false;
    }

    public final int hashCode() {
        return admob().hashCode();
    }

    @Override // defpackage.InterfaceC12767l
    public Set keySet() {
        Set set = this.f14027l;
        if (set != null) {
            return set;
        }
        Set setPurchase = purchase();
        this.f14027l = setPurchase;
        return setPurchase;
    }

    public boolean loadAd(Object obj) {
        Iterator it = admob().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC12767l
    public Collection mopub() {
        Collection collection = this.f14028l;
        if (collection != null) {
            return collection;
        }
        Collection collectionAmazon = amazon();
        this.f14028l = collectionAmazon;
        return collectionAmazon;
    }

    public abstract Set purchase();

    @Override // defpackage.InterfaceC12767l
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) admob().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final String toString() {
        return admob().toString();
    }

    public final boolean yandex(Object obj, Object obj2) {
        Collection collection = (Collection) admob().get(obj);
        return collection != null && collection.contains(obj2);
    }
}
