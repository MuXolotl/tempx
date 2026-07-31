package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: lٔۗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15091l {
    public static final Pattern yandex = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");
    public static final Random loadAd = new Random(SystemClock.elapsedRealtime());

    public static int[] amazon(AbstractCollection abstractCollection) {
        int[] iArr = new int[abstractCollection.size()];
        Iterator it = abstractCollection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static boolean crashlytics(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        return (obj == null || obj2 == null || !obj.equals(obj2)) ? false : true;
    }

    public static void loadAd(String str) {
        if (TextUtils.isEmpty(str)) {
            C8339l.metrica("Namespace cannot be null or empty");
            return;
        }
        if (str.length() > 128) {
            C8339l.metrica("Invalid namespace length");
        } else if (!str.startsWith("urn:x-cast:")) {
            C8339l.metrica("Namespace must begin with the prefix \"urn:x-cast:\"");
        } else {
            if (str.length() != 11) {
                return;
            }
            C8339l.metrica("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
        }
    }

    public static ArrayList purchase(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static String yandex(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }
}
