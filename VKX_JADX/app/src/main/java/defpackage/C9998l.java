package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: lَؐٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9998l {
    public static int billing;
    public ArrayList amazon;
    public int crashlytics;
    public int loadAd;
    public int purchase;
    public ArrayList yandex;

    public final void crashlytics(int i, C9998l c9998l) {
        int i2 = c9998l.loadAd;
        for (C11338l c11338l : this.yandex) {
            ArrayList arrayList = c9998l.yandex;
            if (!arrayList.contains(c11338l)) {
                arrayList.add(c11338l);
            }
            if (i == 0) {
                c11338l.f22874while = i2;
            } else {
                c11338l.f22853implements = i2;
            }
        }
        this.purchase = i2;
    }

    public final int loadAd(C4847l c4847l, int i) {
        int iVip;
        int iVip2;
        ArrayList arrayList = this.yandex;
        if (arrayList.size() == 0) {
            return 0;
        }
        C10664l c10664l = (C10664l) ((C11338l) arrayList.get(0)).f22866switch;
        c4847l.tapsense();
        c10664l.loadAd(c4847l, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C11338l) arrayList.get(i2)).loadAd(c4847l, false);
        }
        if (i == 0 && c10664l.f21645l > 0) {
            AbstractC15960l.loadAd(c10664l, c4847l, arrayList, 0);
        }
        if (i == 1 && c10664l.f21633l > 0) {
            AbstractC15960l.loadAd(c10664l, c4847l, arrayList, 1);
        }
        try {
            c4847l.startapp();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.amazon = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C11338l c11338l = (C11338l) arrayList.get(i3);
            C2582l c2582l = new C2582l(14);
            new WeakReference(c11338l);
            C4847l.vip(c11338l.f22867synchronized);
            C4847l.vip(c11338l.f22864strictfp);
            C4847l.vip(c11338l.f22873volatile);
            C4847l.vip(c11338l.f22857native);
            C4847l.vip(c11338l.f22860private);
            this.amazon.add(c2582l);
        }
        if (i == 0) {
            iVip = C4847l.vip(c10664l.f22867synchronized);
            iVip2 = C4847l.vip(c10664l.f22873volatile);
            c4847l.tapsense();
        } else {
            iVip = C4847l.vip(c10664l.f22864strictfp);
            iVip2 = C4847l.vip(c10664l.f22857native);
            c4847l.tapsense();
        }
        return iVip2 - iVip;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.crashlytics;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String strRemoteconfig = AbstractC14814l.remoteconfig(this.loadAd, "] <", sb);
        for (C11338l c11338l : this.yandex) {
            StringBuilder sbAdvert = AbstractC5020l.advert(strRemoteconfig, " ");
            sbAdvert.append(c11338l.f22850finally);
            strRemoteconfig = sbAdvert.toString();
        }
        return strRemoteconfig.concat(" >");
    }

    public final void yandex(ArrayList arrayList) {
        int size = this.yandex.size();
        if (this.purchase != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C9998l c9998l = (C9998l) arrayList.get(i);
                if (this.purchase == c9998l.loadAd) {
                    crashlytics(this.crashlytics, c9998l);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }
}
