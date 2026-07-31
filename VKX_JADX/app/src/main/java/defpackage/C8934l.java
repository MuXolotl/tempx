package defpackage;

/* JADX INFO: renamed from: lٌُٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8934l extends C7488l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C8934l f18403l = new C8934l(1, 0, 1);

    public final boolean amazon(int i) {
        return this.f15488l <= i && i <= this.f15487l;
    }

    @Override // defpackage.C7488l
    public final boolean equals(Object obj) {
        if (!(obj instanceof C8934l)) {
            return false;
        }
        if (isEmpty() && ((C8934l) obj).isEmpty()) {
            return true;
        }
        C8934l c8934l = (C8934l) obj;
        return this.f15488l == c8934l.f15488l && this.f15487l == c8934l.f15487l;
    }

    @Override // defpackage.C7488l
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f15488l * 31) + this.f15487l;
    }

    @Override // defpackage.C7488l
    public final boolean isEmpty() {
        return this.f15488l > this.f15487l;
    }

    @Override // defpackage.C7488l
    public final String toString() {
        return this.f15488l + ".." + this.f15487l;
    }
}
