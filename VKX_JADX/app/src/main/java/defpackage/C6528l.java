package defpackage;

import j$.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: lؙْ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6528l extends AbstractC0538l {
    public final /* synthetic */ int metrica;
    public final /* synthetic */ C17186l startapp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6528l(C17186l c17186l, int i) {
        super(c17186l, true);
        this.metrica = i;
        switch (i) {
            case 5:
                Objects.requireNonNull(c17186l);
                this.startapp = c17186l;
                super(c17186l, false);
                break;
            default:
                Objects.requireNonNull(c17186l);
                this.startapp = c17186l;
                break;
        }
    }

    @Override // defpackage.AbstractC0538l
    public final void isPro() {
        int i = this.metrica;
        C17186l c17186l = this.startapp;
        switch (i) {
            case 0:
                c17186l.crashlytics.yandex(firebase(), -1);
                break;
            case 1:
                c17186l.crashlytics.yandex(firebase(), 1);
                break;
            case 2:
                C7427l c7427l = c17186l.crashlytics;
                InterfaceC5194l interfaceC5194lFirebase = firebase();
                c7427l.getClass();
                JSONObject jSONObject = new JSONObject();
                long jVip = c7427l.vip();
                try {
                    jSONObject.put("requestId", jVip);
                    jSONObject.put("type", "QUEUE_GET_ITEM_IDS");
                    jSONObject.put("mediaSessionId", c7427l.loadAd());
                    break;
                } catch (JSONException unused) {
                }
                c7427l.remoteconfig(jVip, jSONObject.toString());
                c7427l.ads.yandex(jVip, interfaceC5194lFirebase);
                break;
            case 3:
                C7427l c7427l2 = c17186l.crashlytics;
                InterfaceC5194l interfaceC5194lFirebase2 = firebase();
                c7427l2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long jVip2 = c7427l2.vip();
                try {
                    jSONObject2.put("requestId", jVip2);
                    jSONObject2.put("type", "PAUSE");
                    jSONObject2.put("mediaSessionId", c7427l2.loadAd());
                    break;
                } catch (JSONException unused2) {
                }
                c7427l2.remoteconfig(jVip2, jSONObject2.toString());
                c7427l2.firebase.yandex(jVip2, interfaceC5194lFirebase2);
                break;
            case 4:
                C7427l c7427l3 = c17186l.crashlytics;
                InterfaceC5194l interfaceC5194lFirebase3 = firebase();
                c7427l3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long jVip3 = c7427l3.vip();
                try {
                    jSONObject3.put("requestId", jVip3);
                    jSONObject3.put("type", "PLAY");
                    jSONObject3.put("mediaSessionId", c7427l3.loadAd());
                    break;
                } catch (JSONException unused3) {
                }
                c7427l3.remoteconfig(jVip3, jSONObject3.toString());
                c7427l3.smaato.yandex(jVip3, interfaceC5194lFirebase3);
                break;
            default:
                C7427l c7427l4 = c17186l.crashlytics;
                InterfaceC5194l interfaceC5194lFirebase4 = firebase();
                c7427l4.getClass();
                JSONObject jSONObject4 = new JSONObject();
                long jVip4 = c7427l4.vip();
                try {
                    jSONObject4.put("requestId", jVip4);
                    jSONObject4.put("type", "GET_STATUS");
                    C10184l c10184l = c7427l4.billing;
                    if (c10184l != null) {
                        jSONObject4.put("mediaSessionId", c10184l.f20755l);
                    }
                    break;
                } catch (JSONException unused4) {
                }
                c7427l4.remoteconfig(jVip4, jSONObject4.toString());
                c7427l4.startapp.yandex(jVip4, interfaceC5194lFirebase4);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6528l(C17186l c17186l, int i, boolean z) {
        super(c17186l, false);
        this.metrica = i;
        this.startapp = c17186l;
    }
}
