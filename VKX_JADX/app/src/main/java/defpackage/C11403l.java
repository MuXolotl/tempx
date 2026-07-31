package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: renamed from: lُۡٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11403l extends AbstractC16800l {
    public final AbstractC1186l crashlytics;
    public final String loadAd;

    public C11403l(String str, String str2, C13708l c13708l) {
        super(str);
        AbstractC12442l.admob(!c13708l.isEmpty());
        this.loadAd = str2;
        AbstractC1186l abstractC1186lSignature = AbstractC1186l.Signature(c13708l);
        this.crashlytics = abstractC1186lSignature;
    }

    public static ArrayList amazon(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11403l.class != obj.getClass()) {
            return false;
        }
        C11403l c11403l = (C11403l) obj;
        return this.yandex.equals(c11403l.yandex) && Objects.equals(this.loadAd, c11403l.loadAd) && this.crashlytics.equals(c11403l.crashlytics);
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(527, 31, this.yandex);
        String str = this.loadAd;
        return this.crashlytics.hashCode() + ((iAdvert + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.AbstractC16800l, defpackage.InterfaceC1525l
    public final void loadAd(C3117l c3117l) {
        byte b;
        switch (this.yandex) {
            case "TAL":
                b = 0;
                break;
            case "TCM":
                b = 1;
                break;
            case "TDA":
                b = 2;
                break;
            case "TP1":
                b = 3;
                break;
            case "TP2":
                b = 4;
                break;
            case "TP3":
                b = 5;
                break;
            case "TRK":
                b = 6;
                break;
            case "TT2":
                b = 7;
                break;
            case "TXT":
                b = 8;
                break;
            case "TYE":
                b = 9;
                break;
            case "TALB":
                b = 10;
                break;
            case "TCOM":
                b = 11;
                break;
            case "TCON":
                b = 12;
                break;
            case "TDAT":
                b = 13;
                break;
            case "TDRC":
                b = 14;
                break;
            case "TDRL":
                b = 15;
                break;
            case "TEXT":
                b = 16;
                break;
            case "TIT2":
                b = 17;
                break;
            case "TPE1":
                b = 18;
                break;
            case "TPE2":
                b = 19;
                break;
            case "TPE3":
                b = 20;
                break;
            case "TRCK":
                b = 21;
                break;
            case "TYER":
                b = 22;
                break;
            default:
                b = -1;
                break;
        }
        AbstractC1186l abstractC1186l = this.crashlytics;
        try {
            switch (b) {
                case 0:
                case 10:
                    c3117l.crashlytics = (CharSequence) abstractC1186l.get(0);
                    break;
                case 1:
                case 11:
                    c3117l.signatures = (CharSequence) abstractC1186l.get(0);
                    break;
                case 2:
                case 13:
                    String str = (String) abstractC1186l.get(0);
                    int i = Integer.parseInt(str.substring(2, 4));
                    int i2 = Integer.parseInt(str.substring(0, 2));
                    c3117l.Signature = Integer.valueOf(i);
                    c3117l.license = Integer.valueOf(i2);
                    break;
                case 3:
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    c3117l.loadAd = (CharSequence) abstractC1186l.get(0);
                    break;
                case 4:
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    c3117l.amazon = (CharSequence) abstractC1186l.get(0);
                    break;
                case 5:
                case 20:
                    c3117l.premium = (CharSequence) abstractC1186l.get(0);
                    break;
                case 6:
                case 21:
                    String str2 = (String) abstractC1186l.get(0);
                    String str3 = AbstractC15323l.yandex;
                    String[] strArrSplit = str2.split("/", -1);
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    c3117l.metrica = Integer.valueOf(i3);
                    c3117l.startapp = numValueOf;
                    break;
                case 7:
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    c3117l.yandex = (CharSequence) abstractC1186l.get(0);
                    break;
                case 8:
                case 16:
                    c3117l.isVip = (CharSequence) abstractC1186l.get(0);
                    break;
                case 9:
                case 22:
                    c3117l.tapsense = Integer.valueOf(Integer.parseInt((String) abstractC1186l.get(0)));
                    break;
                case 12:
                    Integer numApplovin = AbstractC9966l.applovin((String) abstractC1186l.get(0));
                    if (numApplovin != null) {
                        String strYandex = AbstractC3298l.yandex(numApplovin.intValue());
                        if (strYandex != null) {
                            c3117l.inmobi = strYandex;
                        }
                    } else {
                        c3117l.inmobi = (CharSequence) abstractC1186l.get(0);
                    }
                    break;
                case 14:
                    ArrayList arrayListAmazon = amazon((String) abstractC1186l.get(0));
                    int size = arrayListAmazon.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                c3117l.license = (Integer) arrayListAmazon.get(2);
                            }
                        }
                        c3117l.Signature = (Integer) arrayListAmazon.get(1);
                    }
                    c3117l.tapsense = (Integer) arrayListAmazon.get(0);
                    break;
                case 15:
                    ArrayList arrayListAmazon2 = amazon((String) abstractC1186l.get(0));
                    int size2 = arrayListAmazon2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                c3117l.advert = (Integer) arrayListAmazon2.get(2);
                            }
                        }
                        c3117l.ad = (Integer) arrayListAmazon2.get(1);
                    }
                    c3117l.pro = (Integer) arrayListAmazon2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // defpackage.AbstractC16800l
    public final String toString() {
        return this.yandex + ": description=" + this.loadAd + ": values=" + this.crashlytics;
    }
}
