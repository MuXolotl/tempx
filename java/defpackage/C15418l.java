package defpackage;

/* JADX INFO: renamed from: lٕؓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15418l extends AbstractC15674l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f30133l;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f30133l) {
            case 0:
                int i = this.f30648l;
                this.f30648l = i + 2;
                Object[] objArr = this.f30650l;
                return new C14136l(objArr[i], objArr[i + 1], 0);
            case 1:
                int i2 = this.f30648l;
                this.f30648l = i2 + 2;
                return this.f30650l[i2];
            default:
                int i3 = this.f30648l;
                this.f30648l = i3 + 2;
                return this.f30650l[i3 + 1];
        }
    }
}
