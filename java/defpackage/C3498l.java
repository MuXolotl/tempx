package defpackage;

/* JADX INFO: renamed from: lؕٛؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3498l implements Comparable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f7383l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f7384l;

    public C3498l(String str, boolean z) {
        if (str == null) {
            yandex(0);
            throw null;
        }
        this.f7384l = str;
        this.f7383l = z;
    }

    public static C3498l amazon(String str) {
        if (str != null) {
            return str.startsWith("<") ? mopub(str) : purchase(str);
        }
        yandex(9);
        throw null;
    }

    public static boolean billing(String str) {
        if (str == null) {
            yandex(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static C3498l mopub(String str) {
        if (str == null) {
            yandex(8);
            throw null;
        }
        if (str.startsWith("<")) {
            return new C3498l(str, true);
        }
        C8339l.metrica("special name must start with '<': ".concat(str));
        return null;
    }

    public static C3498l purchase(String str) {
        if (str != null) {
            return new C3498l(str, false);
        }
        yandex(5);
        throw null;
    }

    public static /* synthetic */ void yandex(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f7384l.compareTo(((C3498l) obj).f7384l);
    }

    public final String crashlytics() {
        if (this.f7383l) {
            C11983l.ad(this, "not identifier: ");
            return null;
        }
        String strLoadAd = loadAd();
        if (strLoadAd != null) {
            return strLoadAd;
        }
        yandex(2);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3498l)) {
            return false;
        }
        C3498l c3498l = (C3498l) obj;
        return this.f7383l == c3498l.f7383l && this.f7384l.equals(c3498l.f7384l);
    }

    public final int hashCode() {
        return (this.f7384l.hashCode() * 31) + (this.f7383l ? 1 : 0);
    }

    public final String loadAd() {
        String str = this.f7384l;
        if (str != null) {
            return str;
        }
        yandex(1);
        throw null;
    }

    public final String toString() {
        return this.f7384l;
    }
}
