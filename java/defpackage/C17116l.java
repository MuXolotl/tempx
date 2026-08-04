package defpackage;

/* JADX INFO: renamed from: lٜٗٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17116l implements InterfaceC10110l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public long f33285l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f33286l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33287l = 1;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f33288l;

    public C17116l(int i, long j, int i2) {
        this.f33286l = i;
        this.f33285l = j;
        this.f33288l = i2;
    }

    public String toString() {
        switch (this.f33287l) {
            case 0:
                StringBuilder sb = new StringBuilder("AtomSizeTooSmall{type=");
                sb.append(AbstractC15323l.m3967finally(this.f33286l));
                sb.append(", size=");
                sb.append(this.f33285l);
                sb.append(", minHeaderSize=");
                return AbstractC14814l.remoteconfig(this.f33288l, "}", sb);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C17116l() {
    }
}
