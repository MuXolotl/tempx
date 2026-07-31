package defpackage;

/* JADX INFO: renamed from: lؗۜۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5179l extends AbstractC8481l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final transient C3965l f11244l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final transient AbstractC13675l f11245l;

    public C5179l(AbstractC13675l abstractC13675l, C3965l c3965l) {
        this.f11245l = abstractC13675l;
        this.f11244l = c3965l;
    }

    @Override // defpackage.AbstractC8481l, defpackage.AbstractC5511l
    public final AbstractC1186l amazon() {
        return this.f11244l;
    }

    @Override // defpackage.AbstractC5511l
    public final int billing(int i, Object[] objArr) {
        return this.f11244l.billing(i, objArr);
    }

    @Override // defpackage.AbstractC5511l, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f11245l.get(obj) != null;
    }

    @Override // defpackage.AbstractC5511l
    /* JADX INFO: renamed from: remoteconfig */
    public final AbstractC10199l iterator() {
        return this.f11244l.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f11245l.size();
    }

    @Override // defpackage.AbstractC5511l
    public final boolean smaato() {
        return true;
    }
}
