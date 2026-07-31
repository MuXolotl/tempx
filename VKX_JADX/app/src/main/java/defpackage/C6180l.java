package defpackage;

/* JADX INFO: renamed from: lؙؑٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6180l implements InterfaceC5457l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static volatile C6180l f13028l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String[] f13032l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String[] f13033l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String[] f13034l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C2152l f13030l = new C2152l(0, 22);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C2152l f13029l = new C2152l(224, 239);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C2152l f13031l = new C2152l(253, 254);

    public C6180l() {
        C2152l c2152l = f13030l;
        String[] strArr = new String[(c2152l.loadAd - c2152l.yandex) + 1];
        this.f13034l = strArr;
        strArr[0] = "Padding (has no meaning)";
        strArr[1] = "End of initial silence";
        strArr[2] = "Intro start";
        strArr[3] = "Main part start";
        strArr[4] = "Outro start";
        strArr[5] = "Outro end";
        strArr[6] = "Verse start";
        strArr[7] = "Refrain start";
        strArr[8] = "Interlude start";
        strArr[9] = "Theme start";
        strArr[10] = "Variation start";
        strArr[11] = "Key change";
        strArr[12] = "Time change";
        strArr[13] = "Momentary unwanted noise (Snap, Crackle & Pop)";
        strArr[14] = "Sustained noise";
        strArr[15] = "Sustained noise end";
        strArr[16] = "Intro end";
        strArr[17] = "Main part end";
        strArr[18] = "Verse end";
        strArr[19] = "Refrain end";
        strArr[20] = "Theme end";
        strArr[21] = "Profanity";
        strArr[22] = "Profanity end";
        C2152l c2152l2 = f13029l;
        String[] strArr2 = new String[(c2152l2.loadAd - c2152l2.yandex) + 1];
        this.f13033l = strArr2;
        strArr2[0] = "Not predefined synch 0";
        strArr2[1] = "Not predefined synch 1";
        strArr2[2] = "Not predefined synch 2";
        strArr2[3] = "Not predefined synch 3";
        strArr2[4] = "Not predefined synch 4";
        strArr2[5] = "Not predefined synch 5";
        strArr2[6] = "Not predefined synch 6";
        strArr2[7] = "Not predefined synch 7";
        strArr2[8] = "Not predefined synch 8";
        strArr2[9] = "Not predefined synch 9";
        strArr2[10] = "Not predefined synch A";
        strArr2[11] = "Not predefined synch B";
        strArr2[12] = "Not predefined synch C";
        strArr2[13] = "Not predefined synch D";
        strArr2[14] = "Not predefined synch E";
        strArr2[15] = "Not predefined synch F";
        C2152l c2152l3 = f13031l;
        String[] strArr3 = new String[(c2152l3.loadAd - c2152l3.yandex) + 1];
        this.f13032l = strArr3;
        strArr3[0] = "Audio end (start of silence)";
        strArr3[1] = "Audio file ends";
    }

    public static C6180l yandex() {
        if (f13028l == null) {
            synchronized (C6180l.class) {
                try {
                    if (f13028l == null) {
                        f13028l = new C6180l();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13028l;
    }

    @Override // defpackage.InterfaceC5457l
    public final String getValue(int i) {
        C2152l c2152l = f13030l;
        if (c2152l.yandex(i)) {
            String str = this.f13034l[i - c2152l.yandex];
            return str == null ? "" : str;
        }
        C2152l c2152l2 = f13029l;
        if (c2152l2.yandex(i)) {
            String str2 = this.f13033l[i - c2152l2.yandex];
            return str2 == null ? "" : str2;
        }
        C2152l c2152l3 = f13031l;
        if (!c2152l3.yandex(i)) {
            return "";
        }
        String str3 = this.f13032l[i - c2152l3.yandex];
        return str3 == null ? "" : str3;
    }

    @Override // defpackage.InterfaceC5457l
    /* JADX INFO: renamed from: goto */
    public final boolean mo1044goto(int i) {
        return f13030l.yandex(i) || f13029l.yandex(i) || f13031l.yandex(i);
    }
}
