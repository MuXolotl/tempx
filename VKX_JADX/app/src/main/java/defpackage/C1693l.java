package defpackage;

import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: lؚؓٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C1693l implements InterfaceC8396l, InterfaceC11545l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C1693l f4068l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C1693l f4069l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C1693l f4070l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C1693l f4071l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C1693l f4072l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C1693l f4073l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C1693l f4074l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C1693l f4075l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C1693l f4076l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f4077l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4078l;

    static {
        int i = 0;
        f4068l = new C1693l("TINK", i);
        f4073l = new C1693l("CRUNCHY", i);
        f4072l = new C1693l("LEGACY", i);
        f4075l = new C1693l("NO_PREFIX", i);
        int i2 = 1;
        f4069l = new C1693l("ENABLED", i2);
        f4070l = new C1693l("DISABLED", i2);
        f4074l = new C1693l("DESTROYED", i2);
        int i3 = 2;
        f4071l = new C1693l("TINK", i3);
        f4076l = new C1693l("NO_PREFIX", i3);
    }

    public C1693l(String str) {
        this.f4078l = 4;
        str.getClass();
        this.f4077l = str;
    }

    public static HashMap amazon(C17643l c17643l) {
        HashMap map = new HashMap();
        map.put("build_version", c17643l.admob);
        map.put("display_version", c17643l.mopub);
        map.put("source", Integer.toString(c17643l.subs));
        String str = c17643l.billing;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public static void loadAd(C18449l c18449l, C17643l c17643l) {
        String str = c17643l.yandex;
        if (str != null) {
            c18449l.m4543for("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        c18449l.m4543for("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c18449l.m4543for("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.4");
        c18449l.m4543for("Accept", "application/json");
        c18449l.m4543for("X-CRASHLYTICS-DEVICE-MODEL", c17643l.loadAd);
        String str2 = c17643l.crashlytics;
        if (str2 != null) {
            c18449l.m4543for("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = c17643l.amazon;
        if (str3 != null) {
            c18449l.m4543for("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = c17643l.purchase.crashlytics().yandex;
        if (str4 != null) {
            c18449l.m4543for("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    public static CharSequence mopub(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // defpackage.InterfaceC11545l
    public void accept(Object obj, Object obj2) {
        int i = C1539l.firebase;
        BinderC15695l binderC15695l = new BinderC15695l((C2350l) obj2);
        C18414l c18414l = (C18414l) ((C8900l) obj).metrica();
        Parcel parcelM743l = c18414l.m743l();
        AbstractC15425l.crashlytics(parcelM743l, binderC15695l);
        parcelM743l.writeString(this.f4077l);
        parcelM743l.writeString("");
        parcelM743l.writeString(null);
        c18414l.m741l(parcelM743l, 11);
    }

    public String billing(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        yandex(sb, it);
        return sb.toString();
    }

    public C1693l crashlytics(String str) {
        return new C1693l(this + '.' + str, 5);
    }

    public JSONObject purchase(C3185l c3185l) {
        int i = c3185l.crashlytics;
        C17334l c17334l = C17334l.f33646l;
        c17334l.m4318l("Settings response code was: " + i);
        String str = this.f4077l;
        if (i == 200 || i == 201 || i == 202 || i == 203) {
            String str2 = c3185l.loadAd;
            try {
                return new JSONObject(str2);
            } catch (Exception e) {
                c17334l.m4317l("Failed to parse settings JSON from ".concat(str), e);
                c17334l.m4317l("Settings response " + str2, null);
                return null;
            }
        }
        String str3 = "Settings request failed; (status: " + i + ") from " + str;
        if (c17334l.m4314implements(6)) {
            Log.e("FirebaseCrashlytics", str3, null);
        }
        return null;
    }

    public String toString() {
        int i = this.f4078l;
        String str = this.f4077l;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 5:
                return str;
            case 3:
            case 4:
            default:
                return super.toString();
        }
    }

    public void yandex(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(mopub(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f4077l);
                    sb.append(mopub(it.next()));
                }
            }
        } catch (IOException e) {
            C8339l.subs(e);
        }
    }

    public C1693l(String str, C15655l c15655l) {
        this.f4078l = 3;
        this.f4077l = str;
    }

    public /* synthetic */ C1693l(String str, int i) {
        this.f4078l = i;
        this.f4077l = str;
    }
}
