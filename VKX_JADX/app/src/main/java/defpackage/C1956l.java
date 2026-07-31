package defpackage;

import j$.util.Objects;
import java.util.Iterator;

/* JADX INFO: renamed from: lؓٛۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1956l extends AbstractC10199l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f4453l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f4454l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Iterator f4455l;

    public C1956l(AbstractC10199l abstractC10199l) {
        super(0);
        this.f4455l = abstractC10199l;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4454l > 0 || this.f4455l.hasNext();
    }

    @Override // defpackage.AbstractC10199l, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (this.f4454l <= 0) {
            C4139l c4139l = (C4139l) this.f4455l.next();
            this.f4453l = c4139l.yandex;
            this.f4454l = c4139l.yandex();
        }
        this.f4454l--;
        Object obj = this.f4453l;
        Objects.requireNonNull(obj);
        return obj;
    }
}
