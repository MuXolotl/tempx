package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: lًٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7976l {
    public int admob;
    public boolean billing;
    public C11919l mopub;
    public boolean purchase;
    public final /* synthetic */ C5613l subs;
    public final String yandex;
    public final long[] loadAd = new long[2];
    public final ArrayList crashlytics = new ArrayList(2);
    public final ArrayList amazon = new ArrayList(2);

    public C7976l(C5613l c5613l, String str) {
        this.subs = c5613l;
        this.yandex = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.crashlytics.add(this.subs.f11923l.purchase(sb.toString()));
            sb.append(".tmp");
            this.amazon.add(this.subs.f11923l.purchase(sb.toString()));
            sb.setLength(length);
        }
    }

    public final C10946l yandex() {
        if (!this.purchase || this.mopub != null || this.billing) {
            return null;
        }
        ArrayList arrayList = this.crashlytics;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            C5613l c5613l = this.subs;
            if (i >= size) {
                this.admob++;
                return new C10946l(c5613l, this);
            }
            if (!c5613l.f11924l.isVip((C14025l) arrayList.get(i))) {
                try {
                    c5613l.inmobi(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}
