package defpackage;

/* JADX INFO: renamed from: lٍؓٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1738l implements InterfaceC9719l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C1738l f4144l = new C1738l("falcon-512", 9);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C1738l f4145l = new C1738l("falcon-1024", 10);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f4146l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f4147l;

    public C1738l(String str, int i) {
        if (i < 1 || i > 10) {
            C8339l.metrica("Log N degree should be between 1 and 10");
            throw null;
        }
        this.f4147l = str;
        this.f4146l = i;
    }
}
