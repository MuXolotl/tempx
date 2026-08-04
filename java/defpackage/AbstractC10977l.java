package defpackage;

import j$.util.Collection;
import java.util.Arrays;

/* JADX INFO: renamed from: lُُۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10977l extends AbstractC5511l implements Collection, java.util.Collection {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ int f22123l = 0;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public transient AbstractC8481l f22124l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient C13708l f22125l;

    @Override // defpackage.AbstractC5511l
    public final AbstractC1186l amazon() {
        C13708l c13708l = this.f22125l;
        if (c13708l != null) {
            return c13708l;
        }
        AbstractC1186l abstractC1186lAmazon = super.amazon();
        this.f22125l = (C13708l) abstractC1186lAmazon;
        return abstractC1186lAmazon;
    }

    @Override // defpackage.AbstractC5511l
    public final int billing(int i, Object[] objArr) {
        AbstractC10199l it = metrica().iterator();
        while (it.hasNext()) {
            C4139l c4139l = (C4139l) it.next();
            Arrays.fill(objArr, i, c4139l.yandex() + i, c4139l.yandex);
            i += c4139l.yandex();
        }
        return i;
    }

    @Override // defpackage.AbstractC5511l, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return ((C8970l) this).f18504l.loadAd(obj) > 0;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10977l)) {
            return false;
        }
        AbstractC10977l abstractC10977l = (AbstractC10977l) obj;
        C8970l c8970l = (C8970l) this;
        if (c8970l.size() != abstractC10977l.size() || metrica().size() != abstractC10977l.metrica().size()) {
            return false;
        }
        for (C4139l c4139l : abstractC10977l.metrica()) {
            if (c8970l.f18504l.loadAd(c4139l.yandex) != c4139l.yandex()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return AbstractC5088l.admob(metrica());
    }

    public final AbstractC8481l metrica() {
        AbstractC8481l c7544l = this.f22124l;
        if (c7544l == null) {
            c7544l = isEmpty() ? C13825l.f26967l : new C7544l(this, 0);
            this.f22124l = c7544l;
        }
        return c7544l;
    }

    @Override // defpackage.AbstractC5511l
    /* JADX INFO: renamed from: remoteconfig */
    public final AbstractC10199l iterator() {
        return new C1956l(metrica().iterator());
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return metrica().toString();
    }

    public abstract AbstractC8481l vip();
}
