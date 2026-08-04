package defpackage;

/* JADX INFO: renamed from: lٖؖ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4429l extends AbstractC12128l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final transient AbstractC12128l f9017l;

    public C4429l(AbstractC12128l abstractC12128l) {
        super(1);
        this.f9017l = abstractC12128l;
    }

    @Override // defpackage.AbstractC12128l, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f9017l.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC12128l abstractC12128l = this.f9017l;
        AbstractC13693l.remoteconfig(i, abstractC12128l.size());
        return abstractC12128l.get((abstractC12128l.size() - 1) - i);
    }

    @Override // defpackage.AbstractC12128l, java.util.List
    public final int indexOf(Object obj) {
        AbstractC12128l abstractC12128l = this.f9017l;
        int iLastIndexOf = abstractC12128l.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (abstractC12128l.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.AbstractC12128l, java.util.List
    public final int lastIndexOf(Object obj) {
        AbstractC12128l abstractC12128l = this.f9017l;
        int iIndexOf = abstractC12128l.indexOf(obj);
        if (iIndexOf >= 0) {
            return (abstractC12128l.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // defpackage.AbstractC12128l, java.util.List
    /* JADX INFO: renamed from: metrica */
    public final AbstractC12128l subList(int i, int i2) {
        AbstractC12128l abstractC12128l = this.f9017l;
        AbstractC13693l.vip(i, i2, abstractC12128l.size());
        return abstractC12128l.subList(abstractC12128l.size() - i2, abstractC12128l.size() - i).vip();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9017l.size();
    }

    @Override // defpackage.AbstractC12128l
    public final AbstractC12128l vip() {
        return this.f9017l;
    }
}
