package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lُؔٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C8040l.class)
public final class C2540l implements Serializable {
    public static final C12237l Companion = new C12237l();

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C8688l f5523l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC14665l f5524l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final String f5525l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final ArrayList f5526l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C8688l f5527l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f5528l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f5529l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C17289l f5530l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C8688l f5531l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f5532l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f5533l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C8688l f5534l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C8688l f5535l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f5536l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C17289l f5537l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C8688l f5538l;

    public C2540l(C17289l c17289l, String str, int i, ArrayList arrayList, InterfaceC14665l interfaceC14665l, String str2, String str3, boolean z, String str4) {
        this.f5529l = str;
        this.f5528l = i;
        this.f5524l = interfaceC14665l;
        this.f5533l = str2;
        this.f5532l = str3;
        this.f5536l = z;
        this.f5525l = str4;
        if (i < 0 || i >= 65536) {
            C10754l.metrica(AbstractC0653l.vip(i, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
            throw null;
        }
        this.f5526l = arrayList;
        final int i2 = 1;
        this.f5535l = new C8688l(new C3318l(i2, arrayList));
        this.f5530l = c17289l;
        this.f5537l = c17289l == null ? C17289l.f33552l : c17289l;
        this.f5534l = new C8688l(new C5514l(arrayList, this, 10));
        final int i3 = 0;
        this.f5523l = new C8688l(new Function0(this) { // from class: lُٓؖ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C2540l f27224l;

            {
                this.f27224l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                C2540l c2540l = this.f27224l;
                switch (i4) {
                    case 0:
                        String str5 = c2540l.f5525l;
                        int iM3321extends = AbstractC12024l.m3321extends(str5, '?', 0, 6) + 1;
                        if (iM3321extends == 0) {
                            return "";
                        }
                        int iM3321extends2 = AbstractC12024l.m3321extends(str5, '#', iM3321extends, 4);
                        return iM3321extends2 == -1 ? str5.substring(iM3321extends) : str5.substring(iM3321extends, iM3321extends2);
                    case 1:
                        String str6 = c2540l.f5525l;
                        String str7 = c2540l.f5533l;
                        if (str7 == null) {
                            return null;
                        }
                        if (str7.length() == 0) {
                            return "";
                        }
                        int length = c2540l.f5537l.f33556l.length() + 3;
                        return str6.substring(length, AbstractC12024l.m3346throw(str6, new char[]{':', '@'}, length, false));
                    case 2:
                        String str8 = c2540l.f5525l;
                        String str9 = c2540l.f5532l;
                        if (str9 == null) {
                            return null;
                        }
                        return str9.length() == 0 ? "" : str8.substring(AbstractC12024l.m3321extends(str8, ':', c2540l.f5537l.f33556l.length() + 3, 4) + 1, AbstractC12024l.m3321extends(str8, '@', 0, 6));
                    default:
                        String str10 = c2540l.f5525l;
                        int iM3321extends3 = AbstractC12024l.m3321extends(str10, '#', 0, 6) + 1;
                        return iM3321extends3 == 0 ? "" : str10.substring(iM3321extends3);
                }
            }
        });
        this.f5538l = new C8688l(new Function0(this) { // from class: lُٓؖ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C2540l f27224l;

            {
                this.f27224l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i2;
                C2540l c2540l = this.f27224l;
                switch (i4) {
                    case 0:
                        String str5 = c2540l.f5525l;
                        int iM3321extends = AbstractC12024l.m3321extends(str5, '?', 0, 6) + 1;
                        if (iM3321extends == 0) {
                            return "";
                        }
                        int iM3321extends2 = AbstractC12024l.m3321extends(str5, '#', iM3321extends, 4);
                        return iM3321extends2 == -1 ? str5.substring(iM3321extends) : str5.substring(iM3321extends, iM3321extends2);
                    case 1:
                        String str6 = c2540l.f5525l;
                        String str7 = c2540l.f5533l;
                        if (str7 == null) {
                            return null;
                        }
                        if (str7.length() == 0) {
                            return "";
                        }
                        int length = c2540l.f5537l.f33556l.length() + 3;
                        return str6.substring(length, AbstractC12024l.m3346throw(str6, new char[]{':', '@'}, length, false));
                    case 2:
                        String str8 = c2540l.f5525l;
                        String str9 = c2540l.f5532l;
                        if (str9 == null) {
                            return null;
                        }
                        return str9.length() == 0 ? "" : str8.substring(AbstractC12024l.m3321extends(str8, ':', c2540l.f5537l.f33556l.length() + 3, 4) + 1, AbstractC12024l.m3321extends(str8, '@', 0, 6));
                    default:
                        String str10 = c2540l.f5525l;
                        int iM3321extends3 = AbstractC12024l.m3321extends(str10, '#', 0, 6) + 1;
                        return iM3321extends3 == 0 ? "" : str10.substring(iM3321extends3);
                }
            }
        });
        final int i4 = 2;
        this.f5531l = new C8688l(new Function0(this) { // from class: lُٓؖ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C2540l f27224l;

            {
                this.f27224l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i4;
                C2540l c2540l = this.f27224l;
                switch (i5) {
                    case 0:
                        String str5 = c2540l.f5525l;
                        int iM3321extends = AbstractC12024l.m3321extends(str5, '?', 0, 6) + 1;
                        if (iM3321extends == 0) {
                            return "";
                        }
                        int iM3321extends2 = AbstractC12024l.m3321extends(str5, '#', iM3321extends, 4);
                        return iM3321extends2 == -1 ? str5.substring(iM3321extends) : str5.substring(iM3321extends, iM3321extends2);
                    case 1:
                        String str6 = c2540l.f5525l;
                        String str7 = c2540l.f5533l;
                        if (str7 == null) {
                            return null;
                        }
                        if (str7.length() == 0) {
                            return "";
                        }
                        int length = c2540l.f5537l.f33556l.length() + 3;
                        return str6.substring(length, AbstractC12024l.m3346throw(str6, new char[]{':', '@'}, length, false));
                    case 2:
                        String str8 = c2540l.f5525l;
                        String str9 = c2540l.f5532l;
                        if (str9 == null) {
                            return null;
                        }
                        return str9.length() == 0 ? "" : str8.substring(AbstractC12024l.m3321extends(str8, ':', c2540l.f5537l.f33556l.length() + 3, 4) + 1, AbstractC12024l.m3321extends(str8, '@', 0, 6));
                    default:
                        String str10 = c2540l.f5525l;
                        int iM3321extends3 = AbstractC12024l.m3321extends(str10, '#', 0, 6) + 1;
                        return iM3321extends3 == 0 ? "" : str10.substring(iM3321extends3);
                }
            }
        });
        final int i5 = 3;
        this.f5527l = new C8688l(new Function0(this) { // from class: lُٓؖ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C2540l f27224l;

            {
                this.f27224l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i6 = i5;
                C2540l c2540l = this.f27224l;
                switch (i6) {
                    case 0:
                        String str5 = c2540l.f5525l;
                        int iM3321extends = AbstractC12024l.m3321extends(str5, '?', 0, 6) + 1;
                        if (iM3321extends == 0) {
                            return "";
                        }
                        int iM3321extends2 = AbstractC12024l.m3321extends(str5, '#', iM3321extends, 4);
                        return iM3321extends2 == -1 ? str5.substring(iM3321extends) : str5.substring(iM3321extends, iM3321extends2);
                    case 1:
                        String str6 = c2540l.f5525l;
                        String str7 = c2540l.f5533l;
                        if (str7 == null) {
                            return null;
                        }
                        if (str7.length() == 0) {
                            return "";
                        }
                        int length = c2540l.f5537l.f33556l.length() + 3;
                        return str6.substring(length, AbstractC12024l.m3346throw(str6, new char[]{':', '@'}, length, false));
                    case 2:
                        String str8 = c2540l.f5525l;
                        String str9 = c2540l.f5532l;
                        if (str9 == null) {
                            return null;
                        }
                        return str9.length() == 0 ? "" : str8.substring(AbstractC12024l.m3321extends(str8, ':', c2540l.f5537l.f33556l.length() + 3, 4) + 1, AbstractC12024l.m3321extends(str8, '@', 0, 6));
                    default:
                        String str10 = c2540l.f5525l;
                        int iM3321extends3 = AbstractC12024l.m3321extends(str10, '#', 0, 6) + 1;
                        return iM3321extends3 == 0 ? "" : str10.substring(iM3321extends3);
                }
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2540l.class != obj.getClass()) {
            return false;
        }
        return this.f5525l.equals(((C2540l) obj).f5525l);
    }

    public final int hashCode() {
        return this.f5525l.hashCode();
    }

    public final String toString() {
        return this.f5525l;
    }

    public final List yandex() {
        return (List) this.f5535l.getValue();
    }
}
