package androidx.media;

import defpackage.AbstractC0653l;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {
    public int amazon;
    public int crashlytics;
    public int loadAd;
    public int yandex;

    public final boolean equals(Object obj) {
        int i;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.loadAd == audioAttributesImplBase.loadAd) {
            int i2 = this.crashlytics;
            int i3 = audioAttributesImplBase.crashlytics;
            int i4 = audioAttributesImplBase.amazon;
            if (i4 == -1) {
                int i5 = audioAttributesImplBase.yandex;
                int i6 = AudioAttributesCompat.loadAd;
                if ((i3 & 1) != 1) {
                    i = 4;
                    if ((i3 & 4) != 4) {
                        switch (i5) {
                            case 2:
                                i = 0;
                                break;
                            case 3:
                                i = 8;
                                break;
                            case 4:
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i = 5;
                                break;
                            case 6:
                                i = 2;
                                break;
                            case 11:
                                i = 10;
                                break;
                            case 12:
                            default:
                                i = 3;
                                break;
                            case 13:
                                i = 1;
                                break;
                        }
                    } else {
                        i = 6;
                    }
                } else {
                    i = 7;
                }
            } else {
                i = i4;
            }
            if (i == 6) {
                i3 |= 4;
            } else if (i == 7) {
                i3 |= 1;
            }
            if (i2 == (i3 & 273) && this.yandex == audioAttributesImplBase.yandex && this.amazon == i4) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.loadAd), Integer.valueOf(this.crashlytics), Integer.valueOf(this.yandex), Integer.valueOf(this.amazon)});
    }

    public final String toString() {
        String strVip;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.amazon != -1) {
            sb.append(" stream=");
            sb.append(this.amazon);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.yandex;
        int i2 = AudioAttributesCompat.loadAd;
        switch (i) {
            case 0:
                strVip = "USAGE_UNKNOWN";
                break;
            case 1:
                strVip = "USAGE_MEDIA";
                break;
            case 2:
                strVip = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strVip = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strVip = "USAGE_ALARM";
                break;
            case 5:
                strVip = "USAGE_NOTIFICATION";
                break;
            case 6:
                strVip = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strVip = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strVip = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strVip = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strVip = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strVip = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strVip = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strVip = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strVip = "USAGE_GAME";
                break;
            case 15:
            default:
                strVip = AbstractC0653l.vip(i, "unknown usage ");
                break;
            case 16:
                strVip = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strVip);
        sb.append(" content=");
        sb.append(this.loadAd);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.crashlytics).toUpperCase());
        return sb.toString();
    }
}
