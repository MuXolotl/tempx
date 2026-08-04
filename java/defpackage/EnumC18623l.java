package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l۠ۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC18623l implements InterfaceC0629l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC18623l[] f36394l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C7281l f36395l;

    static {
        C7281l c7281l = new C7281l();
        f36395l = c7281l;
        f36394l = new EnumC18623l[]{c7281l, new EnumC18623l() { // from class: lؕٗۙ
            @Override // defpackage.InterfaceC0629l
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new EnumC18623l() { // from class: lؘؒۤ
            @Override // defpackage.InterfaceC0629l
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new EnumC18623l() { // from class: lٌْؑ
            @Override // defpackage.InterfaceC0629l
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static EnumC18623l valueOf(String str) {
        return (EnumC18623l) Enum.valueOf(EnumC18623l.class, str);
    }

    public static EnumC18623l[] values() {
        return (EnumC18623l[]) f36394l.clone();
    }
}
