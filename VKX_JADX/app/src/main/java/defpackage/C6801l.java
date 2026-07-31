package defpackage;

/* JADX INFO: renamed from: lؙٕ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6801l implements InterfaceC9719l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C6754l f14237l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f14238l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f14239l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C6801l f14232l = new C6801l("mceliece348864", 12, 3488, 64, false);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C6801l f14231l = new C6801l("mceliece348864f", 12, 3488, 64, true);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C6801l f14235l = new C6801l("mceliece460896", 13, 4608, 96, false);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C6801l f14228l = new C6801l("mceliece460896f", 13, 4608, 96, true);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C6801l f14229l = new C6801l("mceliece6688128", 13, 6688, 128, false);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C6801l f14234l = new C6801l("mceliece6688128f", 13, 6688, 128, true);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C6801l f14230l = new C6801l("mceliece6960119", 13, 6960, 119, false);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C6801l f14236l = new C6801l("mceliece6960119f", 13, 6960, 119, true);

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C6801l f14233l = new C6801l("mceliece8192128", 13, 8192, 128, false);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C6801l f14227l = new C6801l("mceliece8192128f", 13, 8192, 128, true);

    public C6801l(String str, int i, int i2, int i3, boolean z) {
        this.f14239l = str;
        this.f14238l = i3;
        C6754l c6754l = new C6754l();
        c6754l.isPro = z;
        c6754l.yandex = i2;
        c6754l.loadAd = i3;
        c6754l.crashlytics = i;
        c6754l.amazon = i3 * 2;
        int i4 = i3 * i;
        c6754l.purchase = i4;
        c6754l.billing = i2 - i4;
        boolean z2 = true;
        c6754l.mopub = (1 << i) - 1;
        c6754l.admob = i == 12 ? new C2287l(0) : new C2287l(z2 ? 1 : 0);
        c6754l.subs = i3 % 8 != 0;
        this.f14237l = c6754l;
    }
}
