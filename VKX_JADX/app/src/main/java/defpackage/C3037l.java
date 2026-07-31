package defpackage;

/* JADX INFO: renamed from: lؔۥ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3037l implements InterfaceC16588l {
    public static final C3037l yandex = new C3037l();
    public static final C17606l loadAd = new C17606l("kotlin.uuid.Uuid", C15358l.smaato);

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        interfaceC17739l.subscription(((C17201l) obj).toString());
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        String strTapsense = interfaceC10726l.tapsense();
        int length = strTapsense.length();
        int i = 0;
        if (length == 32) {
            long j = 0;
            while (i < 16) {
                long j2 = j << 4;
                char cCharAt = strTapsense.charAt(i);
                if ((cCharAt >>> '\b') == 0) {
                    long j3 = AbstractC15862l.crashlytics[cCharAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                AbstractC5711l.firebase(strTapsense, i, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char cCharAt2 = strTapsense.charAt(i2);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j6 = AbstractC15862l.crashlytics[cCharAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                AbstractC5711l.firebase(strTapsense, i2, "a hexadecimal digit");
                throw null;
            }
            if (j != 0 || j4 != 0) {
                return new C17201l(j, j4);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb.append(strTapsense.length() <= 64 ? strTapsense : strTapsense.substring(0, 64).concat("..."));
                sb.append("\" of length ");
                sb.append(strTapsense.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long j7 = 0;
            while (i < 8) {
                long j8 = j7 << 4;
                char cCharAt3 = strTapsense.charAt(i);
                if ((cCharAt3 >>> '\b') == 0) {
                    long j9 = AbstractC15862l.crashlytics[cCharAt3];
                    if (j9 >= 0) {
                        j7 = j8 | j9;
                        i++;
                    }
                }
                AbstractC5711l.firebase(strTapsense, i, "a hexadecimal digit");
                throw null;
            }
            if (strTapsense.charAt(8) != '-') {
                AbstractC5711l.firebase(strTapsense, 8, "'-' (hyphen)");
                throw null;
            }
            long j10 = 0;
            for (int i3 = 9; i3 < 13; i3++) {
                long j11 = j10 << 4;
                char cCharAt4 = strTapsense.charAt(i3);
                if ((cCharAt4 >>> '\b') == 0) {
                    long j12 = AbstractC15862l.crashlytics[cCharAt4];
                    if (j12 >= 0) {
                        j10 = j11 | j12;
                    }
                }
                AbstractC5711l.firebase(strTapsense, i3, "a hexadecimal digit");
                throw null;
            }
            if (strTapsense.charAt(13) != '-') {
                AbstractC5711l.firebase(strTapsense, 13, "'-' (hyphen)");
                throw null;
            }
            long j13 = 0;
            for (int i4 = 14; i4 < 18; i4++) {
                long j14 = j13 << 4;
                char cCharAt5 = strTapsense.charAt(i4);
                if ((cCharAt5 >>> '\b') == 0) {
                    long j15 = AbstractC15862l.crashlytics[cCharAt5];
                    if (j15 >= 0) {
                        j13 = j14 | j15;
                    }
                }
                AbstractC5711l.firebase(strTapsense, i4, "a hexadecimal digit");
                throw null;
            }
            if (strTapsense.charAt(18) != '-') {
                AbstractC5711l.firebase(strTapsense, 18, "'-' (hyphen)");
                throw null;
            }
            long j16 = 0;
            for (int i5 = 19; i5 < 23; i5++) {
                long j17 = j16 << 4;
                char cCharAt6 = strTapsense.charAt(i5);
                if ((cCharAt6 >>> '\b') == 0) {
                    long j18 = AbstractC15862l.crashlytics[cCharAt6];
                    if (j18 >= 0) {
                        j16 = j17 | j18;
                    }
                }
                AbstractC5711l.firebase(strTapsense, i5, "a hexadecimal digit");
                throw null;
            }
            if (strTapsense.charAt(23) != '-') {
                AbstractC5711l.firebase(strTapsense, 23, "'-' (hyphen)");
                throw null;
            }
            long j19 = 0;
            for (int i6 = 24; i6 < 36; i6++) {
                long j20 = j19 << 4;
                char cCharAt7 = strTapsense.charAt(i6);
                if ((cCharAt7 >>> '\b') == 0) {
                    long j21 = AbstractC15862l.crashlytics[cCharAt7];
                    if (j21 >= 0) {
                        j19 = j20 | j21;
                    }
                }
                AbstractC5711l.firebase(strTapsense, i6, "a hexadecimal digit");
                throw null;
            }
            long j22 = (j7 << 32) | (j10 << 16) | j13;
            long j23 = (j16 << 48) | j19;
            if (j22 != 0 || j23 != 0) {
                return new C17201l(j22, j23);
            }
        }
        return C17201l.f33381l;
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return loadAd;
    }
}
