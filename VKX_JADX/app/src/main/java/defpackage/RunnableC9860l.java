package defpackage;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: lًٍ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9860l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f20066l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Object f20067l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f20068l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20069l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Object f20070l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f20071l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Object f20072l;

    public /* synthetic */ RunnableC9860l(String str, InterfaceC11139l interfaceC11139l, int i, IOException iOException, byte[] bArr, Map map) {
        AbstractC1051l.subs(interfaceC11139l);
        this.f20071l = interfaceC11139l;
        this.f20068l = i;
        this.f20070l = iOException;
        this.f20072l = bArr;
        this.f20066l = str;
        this.f20067l = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20069l) {
            case 0:
                C8118l c8118l = (C8118l) this.f20067l;
                C16386l c16386l = ((C17417l) c8118l.f833l).f33944l;
                C17417l.billing(c16386l);
                if (!c16386l.f36144l) {
                    Log.println(6, c8118l.m2266l(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (c8118l.f16913l == 0) {
                    C5051l c5051l = ((C17417l) c8118l.f833l).f33945l;
                    if (c5051l.f10321l == null) {
                        synchronized (c5051l) {
                            try {
                                if (c5051l.f10321l == null) {
                                    C17417l c17417l = (C17417l) c5051l.f833l;
                                    ApplicationInfo applicationInfo = c17417l.f33936l.getApplicationInfo();
                                    String strLicense = AbstractC13950l.license();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        c5051l.f10321l = Boolean.valueOf(str != null && str.equals(strLicense));
                                    }
                                    if (c5051l.f10321l == null) {
                                        c5051l.f10321l = Boolean.TRUE;
                                        C8118l c8118l2 = c17417l.f33950l;
                                        C17417l.admob(c8118l2);
                                        c8118l2.f16908l.yandex("My process not in the list of running processes");
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (c5051l.f10321l.booleanValue()) {
                        c8118l.f16913l = 'C';
                    } else {
                        c8118l.f16913l = 'c';
                    }
                    break;
                }
                if (c8118l.f16912l < 0) {
                    ((C17417l) c8118l.f833l).f33945l.m1678l();
                    c8118l.f16912l = 161000L;
                }
                int i = this.f20068l;
                char c = c8118l.f16913l;
                long j = c8118l.f16912l;
                String str2 = this.f20066l;
                Object obj = this.f20071l;
                Object obj2 = this.f20070l;
                Object obj3 = this.f20072l;
                char cCharAt = "01VDIWEA?".charAt(i);
                String strM2262l = C8118l.m2262l(true, str2, obj, obj2, obj3);
                StringBuilder sb = new StringBuilder(AbstractC5020l.applovin(String.valueOf(cCharAt).length() + 1, String.valueOf(c).length(), String.valueOf(j).length(), 1) + strM2262l.length());
                sb.append("2");
                sb.append(cCharAt);
                sb.append(c);
                sb.append(j);
                sb.append(":");
                sb.append(strM2262l);
                String string = sb.toString();
                if (string.length() > 1024) {
                    string = str2.substring(0, 1024);
                }
                C18338l c18338l = c16386l.f32058l;
                if (c18338l != null) {
                    String str3 = (String) c18338l.f35850l;
                    C16386l c16386l2 = (C16386l) c18338l.f35849l;
                    c16386l2.mo211l();
                    if (((C16386l) c18338l.f35849l).m4180l().getLong((String) c18338l.f35847l, 0L) == 0) {
                        c18338l.m4523throws();
                    }
                    SharedPreferences sharedPreferencesM4180l = c16386l2.m4180l();
                    String str4 = (String) c18338l.f35846l;
                    long j2 = sharedPreferencesM4180l.getLong(str4, 0L);
                    if (j2 <= 0) {
                        SharedPreferences.Editor editorEdit = c16386l2.m4180l().edit();
                        editorEdit.putString(str3, string);
                        editorEdit.putLong(str4, 1L);
                        editorEdit.apply();
                        return;
                    }
                    C17410l c17410l = ((C17417l) c16386l2.f833l).f33949l;
                    C17417l.billing(c17410l);
                    long jNextLong = c17410l.m4354l().nextLong() & Long.MAX_VALUE;
                    long j3 = j2 + 1;
                    long j4 = Long.MAX_VALUE / j3;
                    SharedPreferences.Editor editorEdit2 = c16386l2.m4180l().edit();
                    if (jNextLong < j4) {
                        editorEdit2.putString(str3, string);
                    }
                    editorEdit2.putLong(str4, j3);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((InterfaceC11139l) this.f20071l).purchase(this.f20066l, this.f20068l, (Throwable) this.f20070l, (byte[]) this.f20072l, (Map) this.f20067l);
                return;
        }
    }

    public RunnableC9860l(C8118l c8118l, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f20068l = i;
        this.f20066l = str;
        this.f20071l = obj;
        this.f20070l = obj2;
        this.f20072l = obj3;
        this.f20067l = c8118l;
    }
}
