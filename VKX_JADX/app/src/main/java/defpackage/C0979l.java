package defpackage;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lُٟؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0979l implements Iterator {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Iterator f2697l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2168l f2698l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f2700l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f2696l = null;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Collection f2695l = null;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Iterator f2699l = EnumC11514l.f23137l;

    public C0979l(AbstractC2168l abstractC2168l, int i) {
        this.f2700l = i;
        this.f2698l = abstractC2168l;
        this.f2697l = abstractC2168l.f4808l.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2697l.hasNext() || this.f2699l.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f2699l.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f2697l.next();
            this.f2696l = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f2695l = collection;
            this.f2699l = collection.iterator();
        }
        Object obj = this.f2696l;
        Object next = this.f2699l.next();
        switch (this.f2700l) {
            case 0:
                return next;
            default:
                return new C11896l(obj, next);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f2699l.remove();
        Collection collection = this.f2695l;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f2697l.remove();
        }
        this.f2698l.f4809l--;
    }
}
