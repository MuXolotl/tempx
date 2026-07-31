package defpackage;

/* JADX INFO: renamed from: lؙْۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C6731l extends AbstractC10598l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C10038l f14095l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C8403l f14096l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C8403l f14097l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f14098l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C12222l f14091l = new C12222l("Setup");

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C12222l f14093l = new C12222l("Monitoring");

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C12222l f14092l = new C12222l("Plugins");

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C12222l f14090l = new C12222l("Call");

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C12222l f14094l = new C12222l("Fallback");

    public C6731l(boolean z, C10038l c10038l) {
        super(f14091l, f14093l, f14092l, f14090l, f14094l);
        this.f14098l = z;
        this.f14095l = c10038l;
        this.f14096l = new C8403l(z, 0);
        this.f14097l = new C8403l(z, 1);
    }

    @Override // defpackage.AbstractC10598l
    public final boolean mopub() {
        return this.f14098l;
    }
}
