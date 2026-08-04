package defpackage;

import org.conscrypt.PSKKeyManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: lؒٞؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1211l {
    public static final C14965l yandex;

    static {
        C9309l c9309l = new C9309l();
        C13544l c13544l = C13544l.yandex;
        c9309l.subs(AbstractC1211l.class, c13544l);
        c9309l.subs(C3996l.class, c13544l);
        yandex = new C14965l(c9309l);
    }

    public static C3996l yandex(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
        return new C3996l(string, string2, string3, string4, j);
    }
}
