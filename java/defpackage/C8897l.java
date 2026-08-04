package defpackage;

/* JADX INFO: renamed from: lٌٚ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8897l implements InterfaceC1525l {
    public final String loadAd;
    public final String yandex;

    public C8897l(String str, String str2) {
        this.yandex = AbstractC11452l.subs(str);
        this.loadAd = str2;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ byte[] crashlytics() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8897l.class == obj.getClass()) {
            C8897l c8897l = (C8897l) obj;
            if (this.yandex.equals(c8897l.yandex) && this.loadAd.equals(c8897l.loadAd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + AbstractC12589l.advert(527, 31, this.yandex);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.InterfaceC1525l
    public final void loadAd(C3117l c3117l) {
        String str = this.yandex;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    b = 0;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    b = 1;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    b = 2;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    b = 3;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    b = 4;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b = 5;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b = 6;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    b = 7;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b = 8;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b = 9;
                }
                break;
        }
        String str2 = this.loadAd;
        switch (b) {
            case 0:
                Integer numApplovin = AbstractC9966l.applovin(str2);
                if (numApplovin != null) {
                    c3117l.startapp = numApplovin;
                }
                break;
            case 1:
                Integer numApplovin2 = AbstractC9966l.applovin(str2);
                if (numApplovin2 != null) {
                    c3117l.appmetrica = numApplovin2;
                }
                break;
            case 2:
                Integer numApplovin3 = AbstractC9966l.applovin(str2);
                if (numApplovin3 != null) {
                    c3117l.metrica = numApplovin3;
                }
                break;
            case 3:
                c3117l.crashlytics = str2;
                break;
            case 4:
                c3117l.inmobi = str2;
                break;
            case 5:
                c3117l.yandex = str2;
                break;
            case 6:
                c3117l.mopub = str2;
                break;
            case 7:
                Integer numApplovin4 = AbstractC9966l.applovin(str2);
                if (numApplovin4 != null) {
                    c3117l.applovin = numApplovin4;
                }
                break;
            case 8:
                c3117l.amazon = str2;
                break;
            case 9:
                c3117l.loadAd = str2;
                break;
        }
    }

    public final String toString() {
        return "VC: " + this.yandex + "=" + this.loadAd;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ C5978l yandex() {
        return null;
    }
}
