package defpackage;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: lًٖٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16532l {
    public static final Charset loadAd = Charset.forName("UTF-8");
    public final C12714l yandex;

    public C16532l(C12714l c12714l) {
        this.yandex = c12714l;
    }

    public static void billing(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    public static ArrayList loadAd(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(AbstractC1211l.yandex(string));
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    public static void mopub(File file, String str) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", AbstractC14814l.adcel("Deleted corrupt file: ", file.getAbsolutePath(), "\nReason: ", str), null);
        }
    }

    public static String purchase(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(AbstractC1211l.yandex.billing(list.get(i))));
            } catch (JSONException e) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static HashMap yandex(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public final void admob(String str, Map map, boolean z) {
        BufferedWriter bufferedWriter;
        Exception e;
        C12714l c12714l = this.yandex;
        File fileAdmob = z ? c12714l.admob(str, "internal-keys") : c12714l.admob(str, "keys");
        BufferedWriter bufferedWriter2 = null;
        try {
            String string = new JSONObject(map).toString();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileAdmob), loadAd));
            try {
                try {
                    bufferedWriter.write(string);
                    bufferedWriter.flush();
                    AbstractC2632l.crashlytics(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter2 = bufferedWriter;
                    AbstractC2632l.crashlytics(bufferedWriter2, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                billing(fileAdmob);
                AbstractC2632l.crashlytics(bufferedWriter, "Failed to close key/value metadata file.");
            }
        } catch (Exception e3) {
            bufferedWriter = null;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            AbstractC2632l.crashlytics(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    public final String amazon(String str) {
        FileInputStream fileInputStream;
        File fileAdmob = this.yandex.admob(str, "user-data");
        ?? r5 = 0;
        if (fileAdmob.exists()) {
            ?? r2 = (fileAdmob.length() > 0L ? 1 : (fileAdmob.length() == 0L ? 0 : -1));
            try {
                if (r2 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileAdmob);
                        try {
                            JSONObject jSONObject = new JSONObject(AbstractC2632l.smaato(fileInputStream));
                            String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            String str2 = "Loaded userId " + strOptString + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            AbstractC2632l.crashlytics(fileInputStream, "Failed to close user metadata file.");
                            return strOptString;
                        } catch (Exception e) {
                            e = e;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            billing(fileAdmob);
                            AbstractC2632l.crashlytics(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        AbstractC2632l.crashlytics(r5, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r5 = r2;
            }
        }
        String strStartapp = AbstractC14814l.startapp("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strStartapp, null);
        }
        billing(fileAdmob);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    public final Map crashlytics(String str, boolean z) throws Throwable {
        ?? r8;
        FileInputStream fileInputStream;
        Exception e;
        C12714l c12714l = this.yandex;
        File fileAdmob = z ? c12714l.admob(str, "internal-keys") : c12714l.admob(str, "keys");
        if (!fileAdmob.exists() || fileAdmob.length() == 0) {
            mopub(fileAdmob, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        ?? r7 = 0;
        try {
            try {
                fileInputStream = new FileInputStream(fileAdmob);
                try {
                    HashMap mapYandex = yandex(AbstractC2632l.smaato(fileInputStream));
                    AbstractC2632l.crashlytics(fileInputStream, "Failed to close user metadata file.");
                    return mapYandex;
                } catch (Exception e2) {
                    e = e2;
                    Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                    billing(fileAdmob);
                    AbstractC2632l.crashlytics(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Exception e3) {
                fileInputStream = null;
                e = e3;
            } catch (Throwable th) {
                th = th;
                AbstractC2632l.crashlytics(r7, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r7 = r8;
            AbstractC2632l.crashlytics(r7, "Failed to close user metadata file.");
            throw th;
        }
    }
}
