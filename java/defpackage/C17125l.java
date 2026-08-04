package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* JADX INFO: renamed from: lٗٔؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17125l {
    public static final C17125l amazon;
    public static final String crashlytics;
    public static final String loadAd;
    public static final C17125l purchase;
    public final boolean yandex;

    static {
        C6921l c6921l = AbstractC11407l.crashlytics;
        loadAd = Character.toString((char) 8206);
        crashlytics = Character.toString((char) 8207);
        amazon = new C17125l(false);
        purchase = new C17125l(true);
    }

    public C17125l(boolean z) {
        C6921l c6921l = AbstractC11407l.yandex;
        this.yandex = z;
    }

    public static int loadAd(String str) {
        C0693l c0693l = new C0693l(str);
        c0693l.crashlytics = c0693l.loadAd;
        int i = 0;
        while (true) {
            int i2 = i;
            while (c0693l.crashlytics > 0) {
                byte bYandex = c0693l.yandex();
                if (bYandex == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bYandex == 1 || bYandex == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bYandex != 9) {
                    switch (bYandex) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public static int yandex(String str) {
        byte directionality;
        C0693l c0693l = new C0693l(str);
        c0693l.crashlytics = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = c0693l.crashlytics;
            if (i4 < c0693l.loadAd && i == 0) {
                String str2 = c0693l.yandex;
                char cCharAt = str2.charAt(i4);
                c0693l.amazon = cCharAt;
                boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt);
                int i5 = c0693l.crashlytics;
                if (zIsHighSurrogate) {
                    int iCodePointAt = Character.codePointAt(str2, i5);
                    c0693l.crashlytics = Character.charCount(iCodePointAt) + c0693l.crashlytics;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    c0693l.crashlytics = i5 + 1;
                    char c = c0693l.amazon;
                    directionality = c < 1792 ? C0693l.purchase[c] : Character.getDirectionality(c);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                i3++;
                                i2 = 1;
                                continue;
                            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i != 0) {
            if (i2 == 0) {
                while (c0693l.crashlytics > 0) {
                    switch (c0693l.yandex()) {
                        case 14:
                        case 15:
                            if (i == i3) {
                                return -1;
                            }
                            i3--;
                            break;
                        case 16:
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            if (i == i3) {
                                return 1;
                            }
                            i3--;
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            i3++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i2;
            }
        }
        return 0;
    }
}
