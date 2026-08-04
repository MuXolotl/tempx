package defpackage;

/* JADX INFO: renamed from: lٖۤؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16745l {
    public static final /* synthetic */ int admob = 0;
    public final String amazon;
    public final long billing;
    public final String crashlytics;
    public final int loadAd;
    public final String mopub;
    public final long purchase;
    public final String yandex;

    static {
        byte b = (byte) (((byte) (0 | 2)) | 1);
        if (b == 3) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb));
    }

    public C16745l(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.yandex = str;
        this.loadAd = i;
        this.crashlytics = str2;
        this.amazon = str3;
        this.purchase = j;
        this.billing = j2;
        this.mopub = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16745l)) {
            return false;
        }
        C16745l c16745l = (C16745l) obj;
        String str = c16745l.yandex;
        String str2 = this.yandex;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!AbstractC5020l.firebase(this.loadAd, c16745l.loadAd)) {
            return false;
        }
        String str3 = c16745l.crashlytics;
        String str4 = this.crashlytics;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = c16745l.amazon;
        String str6 = this.amazon;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        if (this.purchase != c16745l.purchase || this.billing != c16745l.billing) {
            return false;
        }
        String str7 = c16745l.mopub;
        String str8 = this.mopub;
        if (str8 == null) {
            return str7 == null;
        }
        return str8.equals(str7);
    }

    public final int hashCode() {
        String str = this.yandex;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ AbstractC5020l.inmobi(this.loadAd)) * 1000003;
        String str2 = this.crashlytics;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.amazon;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.purchase;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.billing;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.mopub;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.yandex);
        sb.append(", registrationStatus=");
        int i = this.loadAd;
        if (i == 1) {
            str = "ATTEMPT_MIGRATION";
        } else if (i == 2) {
            str = "NOT_GENERATED";
        } else if (i == 3) {
            str = "UNREGISTERED";
        } else if (i != 4) {
            str = i != 5 ? "null" : "REGISTER_ERROR";
        } else {
            str = "REGISTERED";
        }
        sb.append(str);
        sb.append(", authToken=");
        sb.append(this.crashlytics);
        sb.append(", refreshToken=");
        sb.append(this.amazon);
        sb.append(", expiresInSecs=");
        sb.append(this.purchase);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.billing);
        sb.append(", fisError=");
        return AbstractC0653l.ads(sb, this.mopub, "}");
    }

    public final C11995l yandex() {
        C11995l c11995l = new C11995l();
        c11995l.yandex = this.yandex;
        c11995l.loadAd = this.loadAd;
        c11995l.crashlytics = this.crashlytics;
        c11995l.amazon = this.amazon;
        c11995l.purchase = this.purchase;
        c11995l.billing = this.billing;
        c11995l.mopub = this.mopub;
        c11995l.admob = (byte) 3;
        return c11995l;
    }
}
