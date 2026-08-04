package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: lًؙٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8043l implements InterfaceC7299l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f16741l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f16742l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public long f16743l;

    public C8043l(C8648l c8648l, String str, long j) {
        this.f16741l = c8648l;
        AbstractC1051l.billing(str);
        this.f16742l = str;
        this.f16743l = c8648l.m2350l("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }

    public static String admob(long j, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    public static C8043l subs(String str) {
        Object obj = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C8043l(0L, str, obj);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C8043l(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e);
            return null;
        }
    }

    @Override // defpackage.InterfaceC7299l
    public EnumC15027l amazon() {
        InterfaceC7299l interfaceC7299l = (InterfaceC7299l) this.f16742l;
        return interfaceC7299l != null ? interfaceC7299l.amazon() : EnumC15027l.f29550l;
    }

    public void billing(long j, long j2) {
        ((C13507l) this.f16742l).yandex(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((C13507l) this.f16741l).yandex(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    @Override // defpackage.InterfaceC7299l
    public long crashlytics() {
        InterfaceC7299l interfaceC7299l = (InterfaceC7299l) this.f16742l;
        if (interfaceC7299l != null) {
            return interfaceC7299l.crashlytics();
        }
        long j = this.f16743l;
        if (j != -1) {
            return j;
        }
        C8339l.smaato("No timestamp is available.");
        return 0L;
    }

    public List firebase() {
        List list;
        List list2;
        C8648l c8648l = (C8648l) this.f16741l;
        ArrayList arrayList = new ArrayList();
        String str = (String) this.f16742l;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = c8648l.m2395l().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime", "elapsed_time"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.f16743l)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(3);
                        boolean z = cursorQuery.getLong(5) == 1;
                        long j3 = cursorQuery.getLong(6);
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j > this.f16743l) {
                            this.f16743l = j;
                        }
                        try {
                            C13135l c13135l = (C13135l) C13718l.m3698l(C1841l.m1049volatile(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            c13135l.metrica(string);
                            long j4 = cursorQuery.getLong(2);
                            c13135l.loadAd();
                            ((C1841l) c13135l.f20498l).m1053else(j4);
                            c13135l.loadAd();
                            ((C1841l) c13135l.f20498l).tapsense(j3);
                            arrayList.add(new C6700l(j, j2, z, (C1841l) c13135l.amazon()));
                        } catch (IOException e) {
                            C8118l c8118l = ((C17417l) c8648l.f833l).f33950l;
                            C17417l.admob(c8118l);
                            c8118l.f16908l.crashlytics(C8118l.m2260l(str), e, "Data loss. Failed to merge raw event. appId");
                        }
                    } while (cursorQuery.moveToNext());
                    list = arrayList;
                } else {
                    list2 = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e2) {
                C8118l c8118l2 = ((C17417l) c8648l.f833l).f33950l;
                C17417l.admob(c8118l2);
                c8118l2.f16908l.crashlytics(C8118l.m2260l(str), e2, "Data loss. Error querying raw events batch. appId");
                list = arrayList;
            }
            list = list2;
            return list;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public void isPro(C1791l c1791l, InterfaceC1286l interfaceC1286l, Map map, long j) {
        C16528l c16528l = (C16528l) this.f16741l;
        long j2 = c16528l.f32303l;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c16528l.f32302l;
        if (j > j2) {
            Object objRemove = linkedHashMap.remove(c1791l);
            if (objRemove != null) {
                c16528l.f32306l = c16528l.purchase() - c16528l.mopub(c1791l, objRemove);
                c16528l.loadAd(c1791l, objRemove, null);
            }
            ((C14785l) this.f16742l).advert(c1791l, interfaceC1286l, map, j);
            return;
        }
        C9178l c9178l = new C9178l(interfaceC1286l, map, j);
        Object objPut = linkedHashMap.put(c1791l, c9178l);
        c16528l.f32306l = c16528l.mopub(c1791l, c9178l) + c16528l.purchase();
        if (objPut != null) {
            c16528l.f32306l = c16528l.purchase() - c16528l.mopub(c1791l, objPut);
            c16528l.loadAd(c1791l, objPut, c9178l);
        }
        c16528l.admob(c16528l.f32303l);
    }

    @Override // defpackage.InterfaceC7299l
    public int loadAd() {
        InterfaceC7299l interfaceC7299l = (InterfaceC7299l) this.f16742l;
        if (interfaceC7299l != null) {
            return interfaceC7299l.loadAd();
        }
        return 1;
    }

    @Override // defpackage.InterfaceC7299l
    public EnumC4090l mopub() {
        InterfaceC7299l interfaceC7299l = (InterfaceC7299l) this.f16742l;
        return interfaceC7299l != null ? interfaceC7299l.mopub() : EnumC4090l.f8432l;
    }

    @Override // defpackage.InterfaceC7299l
    public EnumC11672l purchase() {
        InterfaceC7299l interfaceC7299l = (InterfaceC7299l) this.f16742l;
        return interfaceC7299l != null ? interfaceC7299l.purchase() : EnumC11672l.f23392l;
    }

    @Override // defpackage.InterfaceC7299l
    public C12920l yandex() {
        return (C12920l) this.f16741l;
    }

    public C8043l(C8648l c8648l, String str) {
        this.f16741l = c8648l;
        AbstractC1051l.billing(str);
        this.f16742l = str;
        this.f16743l = -1L;
    }

    public /* synthetic */ C8043l(long j, Object obj, Object obj2) {
        this.f16742l = obj;
        this.f16741l = obj2;
        this.f16743l = j;
    }

    public C8043l(long j, C14785l c14785l) {
        this.f16743l = j;
        this.f16742l = c14785l;
        this.f16741l = new C16528l(this, j);
    }

    public C8043l() {
        this.f16742l = new C13507l();
        this.f16741l = new C13507l();
    }
}
