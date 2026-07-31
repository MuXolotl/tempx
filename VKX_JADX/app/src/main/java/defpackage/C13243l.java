package defpackage;

import j$.util.Objects;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lٌْۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13243l implements InterfaceC1525l {
    public final String amazon;
    public final int billing;
    public final String crashlytics;
    public final String loadAd;
    public final boolean purchase;
    public final int yandex;

    public C13243l(int i, int i2, String str, String str2, String str3, boolean z) {
        AbstractC12442l.admob(i2 == -1 || i2 > 0);
        this.yandex = i;
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = str3;
        this.purchase = z;
        this.billing = i2;
    }

    public static C13243l amazon(Map map) {
        boolean z;
        int i;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i2;
        List list = (List) map.get("icy-br");
        boolean z2 = true;
        int i3 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i2 = Integer.parseInt(str4) * 1000;
                if (i2 > 0) {
                    z = true;
                } else {
                    try {
                        AbstractC6427l.vip("IcyHeaders", "Invalid bitrate: " + str4);
                        z = false;
                        i2 = -1;
                    } catch (NumberFormatException unused) {
                        AbstractC11043l.remoteconfig("Invalid bitrate header: ", str4, "IcyHeaders");
                        z = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i2 = -1;
            }
            i = i2;
        } else {
            z = false;
            i = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i4 = Integer.parseInt(str5);
                if (i4 > 0) {
                    i3 = i4;
                } else {
                    try {
                        AbstractC6427l.vip("IcyHeaders", "Invalid metadata interval: " + str5);
                        z2 = z;
                    } catch (NumberFormatException unused3) {
                        i3 = i4;
                        AbstractC11043l.remoteconfig("Invalid metadata interval: ", str5, "IcyHeaders");
                    }
                }
                z = z2;
            } catch (NumberFormatException unused4) {
            }
        }
        int i5 = i3;
        if (z) {
            return new C13243l(i, i5, str, str2, str3, zEquals);
        }
        return null;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ byte[] crashlytics() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C13243l.class == obj.getClass()) {
            C13243l c13243l = (C13243l) obj;
            if (this.yandex == c13243l.yandex && Objects.equals(this.loadAd, c13243l.loadAd) && Objects.equals(this.crashlytics, c13243l.crashlytics) && Objects.equals(this.amazon, c13243l.amazon) && this.purchase == c13243l.purchase && this.billing == c13243l.billing) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (527 + this.yandex) * 31;
        String str = this.loadAd;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.crashlytics;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.amazon;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.purchase ? 1 : 0)) * 31) + this.billing;
    }

    @Override // defpackage.InterfaceC1525l
    public final void loadAd(C3117l c3117l) {
        String str = this.crashlytics;
        if (str != null) {
            c3117l.f6660package = str;
        }
        String str2 = this.loadAd;
        if (str2 != null) {
            c3117l.inmobi = str2;
        }
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.crashlytics + "\", genre=\"" + this.loadAd + "\", bitrate=" + this.yandex + ", metadataInterval=" + this.billing;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ C5978l yandex() {
        return null;
    }
}
