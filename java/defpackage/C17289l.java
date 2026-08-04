package defpackage;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: lؙٗٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17289l implements Serializable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C17289l f33552l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final LinkedHashMap f33553l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C17289l f33554l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f33555l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f33556l;

    static {
        C17289l c17289l = new C17289l("http", 80);
        f33552l = c17289l;
        C17289l c17289l2 = new C17289l("https", 443);
        f33554l = c17289l2;
        List listRemoteconfig = AbstractC14055l.remoteconfig(c17289l, c17289l2, new C17289l("ws", 80), new C17289l("wss", 443), new C17289l("socks", 1080));
        int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(listRemoteconfig, 10));
        if (iFirebase < 16) {
            iFirebase = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase);
        for (Object obj : listRemoteconfig) {
            linkedHashMap.put(((C17289l) obj).f33556l, obj);
        }
        f33553l = linkedHashMap;
    }

    public C17289l(String str, int i) {
        this.f33556l = str;
        this.f33555l = i;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.toLowerCase(cCharAt) != cCharAt) {
                C8339l.metrica("All characters should be lower case");
                throw null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17289l)) {
            return false;
        }
        C17289l c17289l = (C17289l) obj;
        return this.f33556l.equals(c17289l.f33556l) && this.f33555l == c17289l.f33555l;
    }

    public final int hashCode() {
        return (this.f33556l.hashCode() * 31) + this.f33555l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("URLProtocol(name=");
        sb.append(this.f33556l);
        sb.append(", defaultPort=");
        return AbstractC0653l.adcel(sb, this.f33555l, ')');
    }
}
