package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lّۗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12799l {
    public final String loadAd;
    public final int yandex;
    public ArrayList crashlytics = null;
    public ArrayList amazon = null;

    public C12799l(int i, String str) {
        this.yandex = 0;
        this.loadAd = null;
        this.yandex = i == 0 ? 1 : i;
        this.loadAd = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.yandex;
        if (i == 2) {
            sb.append("> ");
        } else if (i == 3) {
            sb.append("+ ");
        }
        String str = this.loadAd;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        ArrayList<C9641l> arrayList = this.crashlytics;
        if (arrayList != null) {
            for (C9641l c9641l : arrayList) {
                sb.append('[');
                String str2 = c9641l.yandex;
                String str3 = c9641l.crashlytics;
                sb.append(str2);
                int iInmobi = AbstractC5020l.inmobi(c9641l.loadAd);
                if (iInmobi == 1) {
                    sb.append('=');
                    sb.append(str3);
                } else if (iInmobi == 2) {
                    sb.append("~=");
                    sb.append(str3);
                } else if (iInmobi == 3) {
                    sb.append("|=");
                    sb.append(str3);
                }
                sb.append(']');
            }
        }
        ArrayList<InterfaceC7658l> arrayList2 = this.amazon;
        if (arrayList2 != null) {
            for (InterfaceC7658l interfaceC7658l : arrayList2) {
                sb.append(':');
                sb.append(interfaceC7658l);
            }
        }
        return sb.toString();
    }

    public final void yandex(String str, int i, String str2) {
        if (this.crashlytics == null) {
            this.crashlytics = new ArrayList();
        }
        this.crashlytics.add(new C9641l(str, i, str2));
    }
}
