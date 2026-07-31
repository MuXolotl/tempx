package defpackage;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: renamed from: lًٛ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8118l extends AbstractC18512l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C14906l f16907l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C14906l f16908l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C14906l f16909l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C14906l f16910l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C14906l f16911l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long f16912l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public char f16913l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C14906l f16914l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C14906l f16915l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public String f16916l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C14906l f16917l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C14906l f16918l;

    public C8118l(C17417l c17417l) {
        super(c17417l);
        this.f16913l = (char) 0;
        this.f16912l = -1L;
        this.f16908l = new C14906l(this, 6, false, false);
        this.f16909l = new C14906l(this, 6, true, false);
        this.f16915l = new C14906l(this, 6, false, true);
        this.f16910l = new C14906l(this, 5, false, false);
        this.f16917l = new C14906l(this, 5, true, false);
        this.f16914l = new C14906l(this, 5, false, true);
        this.f16907l = new C14906l(this, 4, false, false);
        this.f16918l = new C14906l(this, 3, false, false);
        this.f16911l = new C14906l(this, 2, false, false);
    }

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public static C6327l m2260l(String str) {
        if (str == null) {
            return null;
        }
        return new C6327l(str);
    }

    /* JADX INFO: renamed from: lؚۥۚ, reason: contains not printable characters */
    public static String m2261l(Object obj, boolean z) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof C6327l) {
                return ((C6327l) obj).yandex;
            }
            return z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = C17417l.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: lًٍّ, reason: contains not printable characters */
    public static String m2262l(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String strM2261l = m2261l(obj, z);
        String strM2261l2 = m2261l(obj2, z);
        String strM2261l3 = m2261l(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strM2261l)) {
            sb.append(str2);
            sb.append(strM2261l);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strM2261l2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strM2261l2);
        }
        if (!TextUtils.isEmpty(strM2261l3)) {
            sb.append(str3);
            sb.append(strM2261l3);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    public final C14906l m2263l() {
        return this.f16910l;
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final C14906l m2264l() {
        return this.f16908l;
    }

    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    public final C14906l m2265l() {
        return this.f16918l;
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public final String m2266l() {
        String str;
        synchronized (this) {
            try {
                if (this.f16916l == null) {
                    ((C17417l) ((C17417l) this.f833l).f33945l.f833l).getClass();
                    this.f16916l = "FA";
                }
                AbstractC1051l.subs(this.f16916l);
                str = this.f16916l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: lٌٔٞ, reason: contains not printable characters */
    public final C14906l m2267l() {
        return this.f16911l;
    }

    /* JADX INFO: renamed from: lًَۙ, reason: contains not printable characters */
    public final void m2268l(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(m2266l(), i)) {
            Log.println(i, m2266l(), m2262l(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        AbstractC1051l.subs(str);
        C17923l c17923l = ((C17417l) this.f833l).f33929l;
        if (c17923l == null) {
            Log.println(6, m2266l(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!c17923l.f36144l) {
                Log.println(6, m2266l(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            c17923l.m4449l(new RunnableC9860l(this, i, str, obj, obj2, obj3));
        }
    }

    @Override // defpackage.AbstractC18512l
    /* JADX INFO: renamed from: lٕؖؔ */
    public final boolean mo699l() {
        return false;
    }
}
