package defpackage;

/* JADX INFO: renamed from: lُؔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10815l {
    public static final C6490l isPro;
    public static final C6490l subs;
    public String admob;
    public final C0093l amazon;
    public long billing;
    public final byte[] crashlytics;
    public final int loadAd;
    public String mopub;
    public final C2494l purchase;
    public final long yandex;

    static {
        C7118l c7118l = AbstractC8996l.f18540l;
        Object[] objArr = {"/", "\\", "../"};
        AbstractC2991l.startapp(3, objArr);
        subs = AbstractC8996l.remoteconfig(3, objArr);
        AbstractC8996l.vip("../", "/", "\\", "?", "*", "\"", "<", ">", "|", ":", "\u0000", "\n", "\r", "\t", "\f");
        Object[] objArr2 = {"..", ".", "\\", "/"};
        AbstractC2991l.startapp(4, objArr2);
        AbstractC8996l.remoteconfig(4, objArr2);
        Object[] objArr3 = {"\\"};
        AbstractC2991l.startapp(1, objArr3);
        AbstractC8996l.remoteconfig(1, objArr3);
        Object[] objArr4 = {"../", "..\\"};
        AbstractC2991l.startapp(2, objArr4);
        isPro = AbstractC8996l.remoteconfig(2, objArr4);
        AbstractC8996l.vip("?", "*", "\"", "|", ":", "\u0000", "\n", "\r", "\t", "\f", "../", "..", new String[0]);
        Object[] objArr5 = {"\\"};
        AbstractC2991l.startapp(1, objArr5);
        AbstractC8996l.remoteconfig(1, objArr5);
        Object[] objArr6 = {"\\", "/"};
        AbstractC2991l.startapp(2, objArr6);
        AbstractC8996l.remoteconfig(2, objArr6);
    }

    public C10815l(long j, int i, byte[] bArr, C0093l c0093l, C2494l c2494l) {
        this.yandex = j;
        this.loadAd = i;
        this.crashlytics = bArr;
        this.amazon = c0093l;
        this.purchase = c2494l;
    }

    public static C10815l crashlytics(C0093l c0093l, long j) {
        C10815l c10815l = new C10815l(j, 2, null, c0093l, null);
        long j2 = c0093l.f1006l;
        if (j2 <= 0) {
            return c10815l;
        }
        if (j2 < 0) {
            C8339l.metrica("Payload size must be positive.");
            return null;
        }
        if (j2 >= 0) {
            c10815l.billing = j2;
            return c10815l;
        }
        C8339l.metrica("Payload stream size must be larger than the offset.");
        return null;
    }

    public final void loadAd(String str) {
        if (str == null || str.isEmpty()) {
            C8339l.metrica("Payload parent folder should not be null or empty.");
            return;
        }
        if (this.loadAd != 2) {
            C8339l.metrica("Payload type must be FILE.");
            return;
        }
        C6490l c6490l = isPro;
        int i = c6490l.f13543l;
        int i2 = 0;
        while (i2 < i) {
            boolean zContains = str.contains((String) c6490l.get(i2));
            i2++;
            if (zContains) {
                C8339l.metrica("Folder name contains illegal string.");
                return;
            }
        }
        this.admob = str;
    }

    public final void yandex(String str) {
        if (str == null || str.isEmpty()) {
            C8339l.metrica("Payload file name should not be null or empty.");
            return;
        }
        if (this.loadAd != 2) {
            C8339l.metrica("Payload type must be FILE.");
            return;
        }
        C6490l c6490l = subs;
        int i = c6490l.f13543l;
        int i2 = 0;
        while (i2 < i) {
            String str2 = (String) c6490l.get(i2);
            i2++;
            if (str.contains(str2)) {
                C8339l.metrica(AbstractC14814l.ads("File name ", str, " contains illegal string ", str2, "."));
                return;
            }
        }
        this.mopub = str;
    }
}
