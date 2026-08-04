package defpackage;

/* JADX INFO: renamed from: lُٚٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11143l extends AbstractC13244l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f22392l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C9740l f22393l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f22394l;

    public C11143l(C9740l c9740l) {
        this.f22393l = c9740l;
        this.f22392l = c9740l.f19883l;
        this.f22394l = c9740l.f19880l;
    }

    @Override // defpackage.AbstractC13244l
    public final void yandex() {
        int i = this.f22392l;
        if (i == 0) {
            this.f26017l = 2;
            return;
        }
        C9740l c9740l = this.f22393l;
        Object[] objArr = c9740l.f19882l;
        int i2 = this.f22394l;
        this.f26016l = objArr[i2];
        this.f26017l = 1;
        this.f22394l = (i2 + 1) % c9740l.f19881l;
        this.f22392l = i - 1;
    }
}
