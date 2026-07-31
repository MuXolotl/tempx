package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lؓۡؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2168l extends AbstractC6671l implements Serializable {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final transient Map f4808l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public transient int f4809l;

    public AbstractC2168l(Map map) {
        AbstractC12442l.admob(map.isEmpty());
        this.f4808l = map;
    }

    @Override // defpackage.AbstractC6671l
    public final Collection amazon() {
        return this instanceof C2497l ? new C4512l(0, this) : new C9897l(0, this);
    }

    @Override // defpackage.AbstractC6671l
    public final Iterator billing() {
        return new C0979l(this, 1);
    }

    @Override // defpackage.InterfaceC12767l
    public final void clear() {
        Map map = this.f4808l;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f4809l = 0;
    }

    @Override // defpackage.AbstractC6671l
    public Map crashlytics() {
        return new C1137l(this, this.f4808l, 0);
    }

    public abstract Collection firebase(Object obj, Collection collection);

    @Override // defpackage.InterfaceC12767l
    public Collection get(Object obj) {
        Collection collectionSubs = (Collection) this.f4808l.get(obj);
        if (collectionSubs == null) {
            collectionSubs = subs();
        }
        return firebase(obj, collectionSubs);
    }

    public boolean isPro(Object obj, Object obj2) {
        Map map = this.f4808l;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f4809l++;
            return true;
        }
        Collection collectionSubs = subs();
        if (!collectionSubs.add(obj2)) {
            C8339l.subs("New Collection violated the Collection spec");
            return false;
        }
        this.f4809l++;
        map.put(obj, collectionSubs);
        return true;
    }

    @Override // defpackage.AbstractC6671l
    public Set purchase() {
        return new C3087l(this, this.f4808l);
    }

    @Override // defpackage.InterfaceC12767l
    public final int size() {
        return this.f4809l;
    }

    public abstract Collection subs();
}
