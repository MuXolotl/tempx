package defpackage;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l٘ؗ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC17708l {
    BOOLEAN(EnumC15893l.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(EnumC15893l.CHAR, "char", "C", "java.lang.Character"),
    BYTE(EnumC15893l.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(EnumC15893l.SHORT, "short", "S", "java.lang.Short"),
    INT(EnumC15893l.INT, "int", "I", "java.lang.Integer"),
    FLOAT(EnumC15893l.FLOAT, "float", "F", "java.lang.Float"),
    LONG(EnumC15893l.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(EnumC15893l.DOUBLE, "double", "D", "java.lang.Double");


    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f34520l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f34521l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final EnumC15893l f34522l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C2312l f34523l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final HashMap f34506l = new HashMap();

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final EnumMap f34518l = new EnumMap(EnumC15893l.class);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final HashMap f34512l = new HashMap();

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final HashSet f34509l = new HashSet();

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final HashMap f34510l = new HashMap();

    static {
        for (EnumC17708l enumC17708l : values()) {
            HashMap map = f34506l;
            String str = enumC17708l.f34521l;
            String str2 = enumC17708l.f34520l;
            map.put(str, enumC17708l);
            f34518l.put(enumC17708l.crashlytics(), enumC17708l);
            f34512l.put(str2, enumC17708l);
            String strReplace = enumC17708l.f34523l.yandex.yandex.replace('.', '/');
            f34509l.add(strReplace);
            f34510l.put(strReplace, AbstractC14814l.ads("(", str2, ")L", strReplace, ";"));
        }
    }

    EnumC17708l(EnumC15893l enumC15893l, String str, String str2, String str3) {
        if (enumC15893l == null) {
            yandex(8);
            throw null;
        }
        this.f34522l = enumC15893l;
        this.f34521l = str;
        this.f34520l = str2;
        this.f34523l = new C2312l(str3);
    }

    public static EnumC17708l loadAd(String str) {
        EnumC17708l enumC17708l = (EnumC17708l) f34506l.get(str);
        if (enumC17708l != null) {
            return enumC17708l;
        }
        C8339l.subs("Non-primitive type name passed: ".concat(str));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public static /* synthetic */ void yandex(int i) {
        String str;
        int i2;
        if (i != 4 && i != 6) {
            switch (i) {
                case 12:
                case 13:
                case 14:
                case 15:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 6) {
            switch (i) {
                case 12:
                case 13:
                case 14:
                case 15:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "methodDescriptor";
                break;
            case 3:
            case 9:
                objArr[0] = "name";
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 5:
                objArr[0] = "type";
                break;
            case 7:
            case 10:
                objArr[0] = "desc";
                break;
            case 8:
                objArr[0] = "primitiveType";
                break;
            case 11:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i != 4 && i != 6) {
            switch (i) {
                case 12:
                    objArr[1] = "getPrimitiveType";
                    break;
                case 13:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case 14:
                    objArr[1] = "getDesc";
                    break;
                case 15:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "isBoxingMethodDescriptor";
                break;
            case 3:
            case 5:
                objArr[2] = "get";
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "getByDesc";
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 6) {
            switch (i) {
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public final EnumC15893l crashlytics() {
        EnumC15893l enumC15893l = this.f34522l;
        if (enumC15893l != null) {
            return enumC15893l;
        }
        yandex(12);
        throw null;
    }
}
