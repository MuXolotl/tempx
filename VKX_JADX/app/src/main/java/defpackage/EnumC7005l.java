package defpackage;

import android.util.Size;

/* JADX INFO: renamed from: lُؚؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC7005l {
    VGA(0, new Size(640, 480)),
    X_VGA(1, new Size(1024, 768)),
    S720P_16_9(2, new Size(1280, 720)),
    PREVIEW(3, null),
    S1080P_4_3(4, new Size(1440, 1080)),
    S1080P_16_9(5, new Size(1920, 1080)),
    S1440P_4_3(6, new Size(1920, 1440)),
    S1440P_16_9(7, new Size(2560, 1440)),
    UHD(8, new Size(3840, 2160)),
    RECORD(9, null),
    MAXIMUM(10, null),
    MAXIMUM_4_3(11, null),
    MAXIMUM_16_9(12, null),
    ULTRA_MAXIMUM(13, null),
    NOT_SUPPORT(14, null);


    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Size f14693l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f14694l;

    EnumC7005l(int i, Size size) {
        this.f14694l = i;
        this.f14693l = size;
    }
}
