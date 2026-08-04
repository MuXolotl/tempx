package defpackage;

import org.chromium.net.ConnectionMigrationOptions;
import org.chromium.net.DnsOptions;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.QuicOptions;
import org.chromium.net.loadAd;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: lِؗۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11650l implements loadAd {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C11650l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // org.chromium.net.loadAd
    public final void yandex(JSONObject jSONObject) throws JSONException {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                ExperimentalCronetEngine.Builder.lambda$setQuicOptions$0((QuicOptions) obj, jSONObject);
                break;
            case 1:
                ExperimentalCronetEngine.Builder.lambda$setDnsOptions$1((DnsOptions) obj, jSONObject);
                break;
            default:
                ExperimentalCronetEngine.Builder.lambda$setConnectionMigrationOptions$2((ConnectionMigrationOptions) obj, jSONObject);
                break;
        }
    }
}
