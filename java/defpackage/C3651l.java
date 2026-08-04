package defpackage;

/* JADX INFO: renamed from: lؕۜؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3651l extends AbstractC13244l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f7643l = -1;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C13552l f7644l;

    public C3651l(C13552l c13552l) {
        this.f7644l = c13552l;
    }

    @Override // defpackage.AbstractC13244l
    public final void yandex() {
        int i;
        Object[] objArr;
        do {
            i = this.f7643l + 1;
            this.f7643l = i;
            objArr = this.f7644l.f26570l;
            if (i >= objArr.length) {
                break;
            }
        } while (objArr[i] == null);
        if (i >= objArr.length) {
            this.f26017l = 2;
        } else {
            this.f26016l = objArr[i];
            this.f26017l = 1;
        }
    }
}
