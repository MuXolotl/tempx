package defpackage;

/* JADX INFO: renamed from: lْۨؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13825l extends AbstractC8481l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C13825l f26967l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final Object[] f26968l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final transient int f26969l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final transient int f26970l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final transient int f26971l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final transient Object[] f26972l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final transient Object[] f26973l;

    static {
        Object[] objArr = new Object[0];
        f26968l = objArr;
        f26967l = new C13825l(0, 0, 0, objArr, objArr);
    }

    public C13825l(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.f26972l = objArr;
        this.f26971l = i;
        this.f26973l = objArr2;
        this.f26969l = i2;
        this.f26970l = i3;
    }

    @Override // defpackage.AbstractC5511l
    public final int admob() {
        return this.f26970l;
    }

    @Override // defpackage.AbstractC5511l
    public final int billing(int i, Object[] objArr) {
        Object[] objArr2 = this.f26972l;
        int i2 = this.f26970l;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.AbstractC5511l, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f26973l;
            if (objArr.length != 0) {
                int iAmazon = AbstractC12027l.amazon(obj);
                while (true) {
                    int i = iAmazon & this.f26969l;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iAmazon = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC5511l
    public final int firebase() {
        return 0;
    }

    @Override // defpackage.AbstractC8481l, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f26971l;
    }

    @Override // defpackage.AbstractC5511l
    public final Object[] mopub() {
        return this.f26972l;
    }

    @Override // defpackage.AbstractC5511l
    /* JADX INFO: renamed from: remoteconfig */
    public final AbstractC10199l iterator() {
        return amazon().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f26970l;
    }

    @Override // defpackage.AbstractC5511l
    public final boolean smaato() {
        return false;
    }

    @Override // defpackage.AbstractC8481l
    public final AbstractC1186l tapsense() {
        return AbstractC1186l.vip(this.f26970l, this.f26972l);
    }
}
