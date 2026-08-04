package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;

/* JADX INFO: renamed from: lّؓٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1845l {
    public static final Map amazon;
    public static final Map crashlytics;
    public static final Map loadAd;
    public static final List yandex;

    static {
        C2336l c2336l = AbstractC18202l.yandex;
        int i = 0;
        List<InterfaceC1388l> listRemoteconfig = AbstractC14055l.remoteconfig(c2336l.loadAd(Boolean.TYPE), c2336l.loadAd(Byte.TYPE), c2336l.loadAd(Character.TYPE), c2336l.loadAd(Double.TYPE), c2336l.loadAd(Float.TYPE), c2336l.loadAd(Integer.TYPE), c2336l.loadAd(Long.TYPE), c2336l.loadAd(Short.TYPE));
        yandex = listRemoteconfig;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listRemoteconfig, 10));
        for (InterfaceC1388l interfaceC1388l : listRemoteconfig) {
            arrayList.add(new C8195l(AbstractC16131l.mopub(interfaceC1388l), AbstractC16131l.admob(interfaceC1388l)));
        }
        loadAd = AbstractC8676l.subscription(arrayList);
        List<InterfaceC1388l> list = yandex;
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(list, 10));
        for (InterfaceC1388l interfaceC1388l2 : list) {
            arrayList2.add(new C8195l(AbstractC16131l.admob(interfaceC1388l2), AbstractC16131l.mopub(interfaceC1388l2)));
        }
        crashlytics = AbstractC8676l.subscription(arrayList2);
        List listRemoteconfig2 = AbstractC14055l.remoteconfig(Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class);
        ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(listRemoteconfig2, 10));
        for (Object obj : listRemoteconfig2) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC14055l.subscription();
                throw null;
            }
            arrayList3.add(new C8195l((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        amazon = AbstractC8676l.subscription(arrayList3);
    }

    public static final ClassLoader amazon(Class cls) {
        ClassLoader classLoader = cls.getClassLoader();
        return classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }

    public static final List crashlytics(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return C2580l.f5619l;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        return parameterizedType.getOwnerType() == null ? AbstractC8669l.m2415super(parameterizedType.getActualTypeArguments()) : AbstractC17587l.adcel(new C8767l(AbstractC17587l.remoteconfig(type, C1490l.f3720l), C1490l.f3726l, C6657l.f13994l));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String loadAd(Class cls) {
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return cls.getName().replace('.', '/');
            }
            return "L" + cls.getName().replace('.', '/') + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        C8339l.metrica(AbstractC0653l.startapp(cls, "Unsupported primitive type: "));
        return null;
    }

    public static final C3624l yandex(Class cls) {
        if (cls.isPrimitive()) {
            C8339l.metrica(AbstractC0653l.startapp(cls, "Can't compute ClassId for primitive type: "));
            return null;
        }
        if (cls.isArray()) {
            C8339l.metrica(AbstractC0653l.startapp(cls, "Can't compute ClassId for array type: "));
            return null;
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            C2312l c2312l = new C2312l(cls.getName());
            return new C3624l(c2312l.loadAd(), AbstractC2130l.admob(c2312l.yandex.mopub()), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return yandex(declaringClass).amazon(C3498l.purchase(cls.getSimpleName()));
        }
        C2312l c2312l2 = new C2312l(cls.getName());
        return new C3624l(c2312l2.loadAd(), c2312l2.yandex.mopub());
    }
}
