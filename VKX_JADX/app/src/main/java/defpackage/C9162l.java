package defpackage;

import j$.util.Objects;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: lٌۤۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9162l extends AbstractC0538l {
    public final /* synthetic */ Object adcel;
    public final /* synthetic */ int metrica = 1;
    public final /* synthetic */ C17186l startapp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9162l(C17186l c17186l, int[] iArr) {
        super(c17186l, true);
        this.adcel = iArr;
        Objects.requireNonNull(c17186l);
        this.startapp = c17186l;
    }

    @Override // defpackage.AbstractC0538l
    public final void isPro() {
        int i = this.metrica;
        Object obj = this.adcel;
        C17186l c17186l = this.startapp;
        switch (i) {
            case 0:
                C7427l c7427l = c17186l.crashlytics;
                InterfaceC5194l interfaceC5194lFirebase = firebase();
                int[] iArr = (int[]) obj;
                c7427l.getClass();
                JSONObject jSONObject = new JSONObject();
                long jVip = c7427l.vip();
                try {
                    jSONObject.put("requestId", jVip);
                    jSONObject.put("type", "QUEUE_GET_ITEMS");
                    jSONObject.put("mediaSessionId", c7427l.loadAd());
                    JSONArray jSONArray = new JSONArray();
                    for (int i2 : iArr) {
                        jSONArray.put(i2);
                    }
                    jSONObject.put("itemIds", jSONArray);
                    break;
                } catch (JSONException unused) {
                }
                c7427l.remoteconfig(jVip, jSONObject.toString());
                c7427l.subscription.yandex(jVip, interfaceC5194lFirebase);
                break;
            default:
                C7427l c7427l2 = c17186l.crashlytics;
                InterfaceC5194l interfaceC5194lFirebase2 = firebase();
                c7427l2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long jVip2 = c7427l2.vip();
                long j = ((C13641l) obj).yandex;
                try {
                    jSONObject2.put("requestId", jVip2);
                    jSONObject2.put("type", "SEEK");
                    jSONObject2.put("mediaSessionId", c7427l2.loadAd());
                    Pattern pattern = AbstractC15091l.yandex;
                    jSONObject2.put("currentTime", j / 1000.0d);
                    break;
                } catch (JSONException unused2) {
                }
                c7427l2.remoteconfig(jVip2, jSONObject2.toString());
                c7427l2.mopub = Long.valueOf(j);
                c7427l2.remoteconfig.yandex(jVip2, new C0848l(c7427l2, interfaceC5194lFirebase2));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9162l(C17186l c17186l, C13641l c13641l) {
        super(c17186l, false);
        this.adcel = c13641l;
        this.startapp = c17186l;
    }
}
