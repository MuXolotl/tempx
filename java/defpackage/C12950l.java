package defpackage;

/* JADX INFO: renamed from: lّۣۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12950l extends AbstractC8481l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final transient Object f25402l;

    public C12950l(Object obj) {
        obj.getClass();
        this.f25402l = obj;
    }

    @Override // defpackage.AbstractC8481l, defpackage.AbstractC5511l
    public final AbstractC1186l amazon() {
        return AbstractC1186l.isVip(this.f25402l);
    }

    @Override // defpackage.AbstractC5511l
    public final int billing(int i, Object[] objArr) {
        objArr[i] = this.f25402l;
        return i + 1;
    }

    @Override // defpackage.AbstractC5511l, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f25402l.equals(obj);
    }

    @Override // defpackage.AbstractC8481l, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f25402l.hashCode();
    }

    @Override // defpackage.AbstractC5511l
    /* JADX INFO: renamed from: remoteconfig */
    public final AbstractC10199l iterator() {
        return new C8580l(this.f25402l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // defpackage.AbstractC5511l
    public final boolean smaato() {
        return false;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f25402l.toString() + ']';
    }
}
