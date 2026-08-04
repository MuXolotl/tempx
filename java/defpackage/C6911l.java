package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: lؙۣۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6911l {
    public final long amazon;
    public final long billing;
    public final String crashlytics;
    public final String loadAd;
    public final C16021l mopub;
    public final long purchase;
    public final String yandex;

    public C6911l(C17417l c17417l, String str, String str2, String str3, long j, long j2, long j3, Bundle bundle) {
        C16021l c16021l;
        AbstractC1051l.billing(str2);
        AbstractC1051l.billing(str3);
        this.yandex = str2;
        this.loadAd = str3;
        this.crashlytics = true == TextUtils.isEmpty(str) ? null : str;
        this.amazon = j;
        this.purchase = j2;
        this.billing = j3;
        if (j3 != 0 && j3 > j) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16910l.loadAd(C8118l.m2260l(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            c16021l = new C16021l(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    C8118l c8118l2 = c17417l.f33950l;
                    C17417l.admob(c8118l2);
                    c8118l2.f16908l.yandex("Param name can't be null");
                    it.remove();
                } else {
                    C17410l c17410l = c17417l.f33949l;
                    C17417l.billing(c17410l);
                    Object objM4373l = c17410l.m4373l(bundle2.get(next), next);
                    if (objM4373l == null) {
                        C8118l c8118l3 = c17417l.f33950l;
                        C17417l.admob(c8118l3);
                        c8118l3.f16910l.loadAd(c17417l.f33942l.loadAd(next), "Param value can't be null");
                        it.remove();
                    } else {
                        C17410l c17410l2 = c17417l.f33949l;
                        C17417l.billing(c17410l2);
                        c17410l2.m4368l(bundle2, next, objM4373l);
                    }
                }
            }
            c16021l = new C16021l(bundle2);
        }
        this.mopub = c16021l;
    }

    public final String toString() {
        String string = this.mopub.toString();
        String str = this.yandex;
        int length = String.valueOf(str).length();
        String str2 = this.loadAd;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        AbstractC9361l.appmetrica(sb, "Event{appId='", str, "', name='", str2);
        return AbstractC9361l.ad(sb, "', params=", string, "}");
    }

    public final C6911l yandex(C17417l c17417l, long j) {
        return new C6911l(c17417l, this.crashlytics, this.yandex, this.loadAd, this.amazon, this.purchase, j, this.mopub);
    }

    public C6911l(C17417l c17417l, String str, String str2, String str3, long j, long j2, long j3, C16021l c16021l) {
        AbstractC1051l.billing(str2);
        AbstractC1051l.billing(str3);
        AbstractC1051l.subs(c16021l);
        this.yandex = str2;
        this.loadAd = str3;
        this.crashlytics = true == TextUtils.isEmpty(str) ? null : str;
        this.amazon = j;
        this.purchase = j2;
        this.billing = j3;
        if (j3 != 0 && j3 > j) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16910l.crashlytics(C8118l.m2260l(str2), C8118l.m2260l(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.mopub = c16021l;
    }
}
