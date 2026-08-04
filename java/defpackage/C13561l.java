package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* JADX INFO: renamed from: lْٟ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13561l extends AbstractC5890l {
    public final /* synthetic */ int amazon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13561l(int i, int i2, String str) {
        super(i, str);
        this.amazon = i2;
    }

    public static int crashlytics(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('A' <= c && c < '[') {
            return c - '7';
        }
        if (c == ' ') {
            return 36;
        }
        if (c == ':') {
            return 44;
        }
        if (c == '$') {
            return 37;
        }
        if (c == '%') {
            return 38;
        }
        if (c == '*') {
            return 39;
        }
        if (c == '+') {
            return 40;
        }
        switch (c) {
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                return 41;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                return 42;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                return 43;
            default:
                throw new IllegalArgumentException("Illegal character: " + c);
        }
    }

    @Override // defpackage.AbstractC5890l
    public final void loadAd(C16535l c16535l) {
        int i = this.amazon;
        String str = this.crashlytics;
        int i2 = 0;
        switch (i) {
            case 0:
                int length = str.length();
                while (true) {
                    int i3 = i2 + 1;
                    if (i3 < length) {
                        c16535l.admob(crashlytics(str.charAt(i3)) + (crashlytics(str.charAt(i2)) * 45), 11);
                        i2 += 2;
                    } else if (i2 < length) {
                        c16535l.admob(crashlytics(str.charAt(i2)), 6);
                    }
                    break;
                }
                break;
            default:
                int length2 = str.length();
                while (true) {
                    int i4 = i2 + 2;
                    if (i4 < length2) {
                        int i5 = i2 + 3;
                        c16535l.admob(Integer.parseInt(str.substring(i2, i5)), 10);
                        i2 = i5;
                    } else if (i2 < length2) {
                        int i6 = length2 - i2;
                        if (i6 == 1) {
                            c16535l.admob(Integer.parseInt(str.substring(i2, i2 + 1)), 4);
                        } else if (i6 == 2) {
                            c16535l.admob(Integer.parseInt(str.substring(i2, i4)), 7);
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC5890l
    public final int yandex() {
        switch (this.amazon) {
            case 0:
                break;
        }
        return this.crashlytics.length();
    }
}
