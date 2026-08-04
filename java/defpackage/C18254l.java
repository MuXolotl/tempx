package defpackage;

/* JADX INFO: renamed from: l٘۠ۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18254l extends AbstractC17322l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f35761l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C0051l f35762l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f35763l;

    public boolean getAllowsGoneWidget() {
        return this.f35762l.f936l;
    }

    public int getMargin() {
        return this.f35762l.f935l;
    }

    public int getType() {
        return this.f35761l;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f35762l.f936l = z;
    }

    public void setDpMargin(int i) {
        this.f35762l.f935l = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f35762l.f935l = i;
    }

    public void setType(int i) {
        this.f35761l = i;
    }
}
