package defpackage;

import android.text.TextUtils;

/* JADX INFO: renamed from: lؗٝٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5034l {
    public int amazon;
    public int billing;
    public int crashlytics;
    public int loadAd;
    public int purchase;
    public int yandex;

    public /* synthetic */ C5034l(int i, int i2, int i3, int i4, int i5, int i6) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = i3;
        this.amazon = i4;
        this.purchase = i5;
        this.billing = i6;
    }

    public static C5034l yandex(String str) {
        AbstractC12442l.admob(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < strArrSplit.length; i6++) {
            String strAdmob = AbstractC11452l.admob(strArrSplit[i6].trim());
            strAdmob.getClass();
            switch (strAdmob) {
                case "end":
                    i3 = i6;
                    break;
                case "text":
                    i5 = i6;
                    break;
                case "layer":
                    i = i6;
                    break;
                case "start":
                    i2 = i6;
                    break;
                case "style":
                    i4 = i6;
                    break;
            }
        }
        if (i2 == -1 || i3 == -1 || i5 == -1) {
            return null;
        }
        return new C5034l(i, i2, i3, i4, i5, strArrSplit.length);
    }
}
