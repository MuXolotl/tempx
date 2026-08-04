package defpackage;

/* JADX INFO: renamed from: lٍَؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10042l implements Comparable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f20470l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final String f20471l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final String f20472l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C4234l f20473l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f20474l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final long f20475l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final long f20476l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f20477l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final long f20478l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C17564l f20479l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final boolean f20480l;

    public AbstractC10042l(String str, C4234l c4234l, long j, int i, long j2, C17564l c17564l, String str2, String str3, long j3, long j4, boolean z) {
        this.f20474l = str;
        this.f20473l = c4234l;
        this.f20470l = j;
        this.f20477l = i;
        this.f20476l = j2;
        this.f20479l = c17564l;
        this.f20471l = str2;
        this.f20472l = str3;
        this.f20478l = j3;
        this.f20475l = j4;
        this.f20480l = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long jLongValue = l.longValue();
        long j = this.f20476l;
        if (j > jLongValue) {
            return 1;
        }
        return j < l.longValue() ? -1 : 0;
    }
}
