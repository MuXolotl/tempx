package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: lٜؔٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2759l implements Comparable {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C2759l f5974l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C2759l f5975l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C2759l f5976l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C2759l f5977l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C2759l f5978l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C2759l f5979l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C2759l f5980l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C2759l f5981l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C2759l f5982l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C2759l f5983l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C2759l f5984l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C2759l f5985l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f5986l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f5987l;

    static {
        C2759l c2759l = new C2759l(100, "Continue");
        C2759l c2759l2 = new C2759l(EnergyProfile.EVCONNECTOR_TYPE_OTHER, "Switching Protocols");
        C2759l c2759l3 = new C2759l(102, "Processing");
        C2759l c2759l4 = new C2759l(200, "OK");
        f5975l = c2759l4;
        C2759l c2759l5 = new C2759l(201, "Created");
        C2759l c2759l6 = new C2759l(202, "Accepted");
        C2759l c2759l7 = new C2759l(203, "Non-Authoritative Information");
        C2759l c2759l8 = new C2759l(204, "No Content");
        C2759l c2759l9 = new C2759l(205, "Reset Content");
        C2759l c2759l10 = new C2759l(206, "Partial Content");
        C2759l c2759l11 = new C2759l(207, "Multi-Status");
        C2759l c2759l12 = new C2759l(300, "Multiple Choices");
        C2759l c2759l13 = new C2759l(301, "Moved Permanently");
        C2759l c2759l14 = new C2759l(302, "Found");
        f5980l = c2759l14;
        C2759l c2759l15 = new C2759l(303, "See Other");
        C2759l c2759l16 = new C2759l(304, "Not Modified");
        C2759l c2759l17 = new C2759l(305, "Use Proxy");
        C2759l c2759l18 = new C2759l(306, "Switch Proxy");
        C2759l c2759l19 = new C2759l(307, "Temporary Redirect");
        C2759l c2759l20 = new C2759l(308, "Permanent Redirect");
        C2759l c2759l21 = new C2759l(400, "Bad Request");
        f5979l = c2759l21;
        C2759l c2759l22 = new C2759l(401, "Unauthorized");
        f5983l = c2759l22;
        C2759l c2759l23 = new C2759l(402, "Payment Required");
        C2759l c2759l24 = new C2759l(403, "Forbidden");
        C2759l c2759l25 = new C2759l(404, "Not Found");
        f5976l = c2759l25;
        C2759l c2759l26 = new C2759l(405, "Method Not Allowed");
        f5977l = c2759l26;
        C2759l c2759l27 = new C2759l(406, "Not Acceptable");
        f5982l = c2759l27;
        C2759l c2759l28 = new C2759l(407, "Proxy Authentication Required");
        C2759l c2759l29 = new C2759l(408, "Request Timeout");
        C2759l c2759l30 = new C2759l(409, "Conflict");
        C2759l c2759l31 = new C2759l(410, "Gone");
        f5978l = c2759l31;
        C2759l c2759l32 = new C2759l(411, "Length Required");
        C2759l c2759l33 = new C2759l(412, "Precondition Failed");
        C2759l c2759l34 = new C2759l(413, "Payload Too Large");
        C2759l c2759l35 = new C2759l(414, "Request-URI Too Long");
        C2759l c2759l36 = new C2759l(415, "Unsupported Media Type");
        f5984l = c2759l36;
        C2759l c2759l37 = new C2759l(416, "Requested Range Not Satisfiable");
        C2759l c2759l38 = new C2759l(417, "Expectation Failed");
        f5981l = c2759l38;
        C2759l c2759l39 = new C2759l(422, "Unprocessable Entity");
        C2759l c2759l40 = new C2759l(423, "Locked");
        C2759l c2759l41 = new C2759l(424, "Failed Dependency");
        C2759l c2759l42 = new C2759l(425, "Too Early");
        C2759l c2759l43 = new C2759l(426, "Upgrade Required");
        C2759l c2759l44 = new C2759l(429, "Too Many Requests");
        C2759l c2759l45 = new C2759l(431, "Request Header Fields Too Large");
        C2759l c2759l46 = new C2759l(500, "Internal Server Error");
        f5974l = c2759l46;
        C2759l c2759l47 = new C2759l(501, "Not Implemented");
        C2759l c2759l48 = new C2759l(502, "Bad Gateway");
        C2759l c2759l49 = new C2759l(503, "Service Unavailable");
        C2759l c2759l50 = new C2759l(504, "Gateway Timeout");
        f5985l = c2759l50;
        List listRemoteconfig = AbstractC14055l.remoteconfig(c2759l, c2759l2, c2759l3, c2759l4, c2759l5, c2759l6, c2759l7, c2759l8, c2759l9, c2759l10, c2759l11, c2759l12, c2759l13, c2759l14, c2759l15, c2759l16, c2759l17, c2759l18, c2759l19, c2759l20, c2759l21, c2759l22, c2759l23, c2759l24, c2759l25, c2759l26, c2759l27, c2759l28, c2759l29, c2759l30, c2759l31, c2759l32, c2759l33, c2759l34, c2759l35, c2759l36, c2759l37, c2759l38, c2759l39, c2759l40, c2759l41, c2759l42, c2759l43, c2759l44, c2759l45, c2759l46, c2759l47, c2759l48, c2759l49, c2759l50, new C2759l(505, "HTTP Version Not Supported"), new C2759l(506, "Variant Also Negotiates"), new C2759l(507, "Insufficient Storage"));
        int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(listRemoteconfig, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase >= 16 ? iFirebase : 16);
        for (Object obj : listRemoteconfig) {
            linkedHashMap.put(Integer.valueOf(((C2759l) obj).f5987l), obj);
        }
    }

    public C2759l(int i, String str) {
        this.f5987l = i;
        this.f5986l = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f5987l - ((C2759l) obj).f5987l;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2759l) && ((C2759l) obj).f5987l == this.f5987l;
    }

    public final int hashCode() {
        return this.f5987l;
    }

    public final String toString() {
        return this.f5987l + ' ' + this.f5986l;
    }
}
