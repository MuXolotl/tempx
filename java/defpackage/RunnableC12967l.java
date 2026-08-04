package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: renamed from: lّۥٍ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC12967l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11675l f25421l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25422l;

    public /* synthetic */ RunnableC12967l(C11675l c11675l, int i) {
        this.f25422l = i;
        this.f25421l = c11675l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f25422l;
        C11675l c11675l = this.f25421l;
        switch (i) {
            case 0:
                c11675l.m3187l();
                break;
            case 1:
                C10866l c10866l = c11675l.f23423l;
                C17417l c17417l = (C17417l) c10866l.f21968l;
                C17923l c17923l = c17417l.f33929l;
                C11675l c11675l2 = c17417l.f33927l;
                C16386l c16386l = c17417l.f33944l;
                C17417l.admob(c17923l);
                c17923l.mo211l();
                if (c10866l.metrica()) {
                    if (c10866l.crashlytics()) {
                        C17417l.billing(c16386l);
                        c16386l.f32047l.ad(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        C17417l.mopub(c11675l2);
                        c11675l2.m3196l("auto", "_cmpx", bundle);
                    } else {
                        C17417l.billing(c16386l);
                        C11919l c11919l = c16386l.f32047l;
                        String strPro = c11919l.pro();
                        if (TextUtils.isEmpty(strPro)) {
                            C8118l c8118l = c17417l.f33950l;
                            C17417l.admob(c8118l);
                            c8118l.f16909l.yandex("Cache still valid but referrer not found");
                        } else {
                            long j = 3600000;
                            long jAmazon = c16386l.f32050l.amazon() / 3600000;
                            Uri uri = Uri.parse(strPro);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                                j = j;
                            }
                            ((Bundle) pair.second).putLong("_cc", (jAmazon - 1) * j);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            C17417l.mopub(c11675l2);
                            c11675l2.m3196l(str2, "_cmp", (Bundle) pair.second);
                        }
                        c11919l.ad(null);
                    }
                    C17417l.billing(c16386l);
                    c16386l.f32050l.purchase(0L);
                    break;
                }
                break;
            case 2:
                c11675l.mo211l();
                C17417l c17417l2 = (C17417l) c11675l.f833l;
                C16386l c16386l2 = c17417l2.f33944l;
                C8118l c8118l2 = c17417l2.f33950l;
                C17417l.billing(c16386l2);
                C0851l c0851l = c16386l2.f32043l;
                if (c0851l.yandex()) {
                    C17417l.admob(c8118l2);
                    c8118l2.f16918l.yandex("Deferred Deep Link already retrieved. Not fetching again.");
                } else {
                    C3071l c3071l = c16386l2.f32040l;
                    long jAmazon2 = c3071l.amazon();
                    c3071l.purchase(1 + jAmazon2);
                    if (jAmazon2 >= 5) {
                        C17417l.admob(c8118l2);
                        c8118l2.f16910l.yandex("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        c0851l.loadAd(true);
                    } else {
                        if (c11675l.f23409l == null) {
                            c11675l.f23409l = new C6820l(c11675l, c17417l2, 3);
                        }
                        c11675l.f23409l.loadAd(0L);
                    }
                }
                break;
            default:
                c11675l.m3187l();
                break;
        }
    }
}
