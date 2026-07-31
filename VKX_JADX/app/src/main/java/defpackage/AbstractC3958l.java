package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lؙؖٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3958l {
    public static final ArrayMap loadAd;
    public static final ArrayMap yandex;

    static {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(Boolean.class, "bool");
        arrayMap.put(Byte.class, "byte");
        arrayMap.put(Short.class, "short");
        arrayMap.put(Integer.class, "int");
        arrayMap.put(Long.class, "long");
        arrayMap.put(Double.class, "double");
        arrayMap.put(Float.class, "float");
        arrayMap.put(String.class, "string");
        arrayMap.put(Parcelable.class, "parcelable");
        arrayMap.put(Map.class, "map");
        arrayMap.put(List.class, "list");
        arrayMap.put(IconCompat.class, "image");
        yandex = arrayMap;
        ArrayMap arrayMap2 = new ArrayMap();
        arrayMap2.put(0, "primitive");
        arrayMap2.put(1, "iInterface");
        arrayMap2.put(9, "iBinder");
        arrayMap2.put(2, "map");
        arrayMap2.put(3, "set");
        arrayMap2.put(4, "list");
        arrayMap2.put(5, "object");
        arrayMap2.put(6, "image");
        loadAd = arrayMap2;
    }

    public static ArrayList admob(Class cls) {
        ArrayList arrayList = new ArrayList();
        if (cls != null && cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    arrayList.add(field);
                }
            }
            arrayList.addAll(admob(cls.getSuperclass()));
        }
        return arrayList;
    }

    public static HashMap amazon(Bundle bundle, C10166l c10166l) throws C9954l {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList == null) {
            throw new C9954l("Bundle is missing the map", c10166l);
        }
        HashMap map = new HashMap();
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            Bundle bundle2 = (Bundle) ((Parcelable) it.next());
            Bundle bundle3 = bundle2.getBundle("tag_1");
            Bundle bundle4 = bundle2.getBundle("tag_2");
            if (bundle3 == null) {
                throw new C9954l("Bundle is missing key", c10166l);
            }
            map.put(billing(bundle3, c10166l), bundle4 == null ? null : billing(bundle4, c10166l));
        }
        return map;
    }

    public static Object billing(Bundle bundle, C10166l c10166l) {
        ClassLoader classLoader = AbstractC3958l.class.getClassLoader();
        Objects.requireNonNull(classLoader);
        bundle.setClassLoader(classLoader);
        int i = bundle.getInt("tag_class_type");
        String str = (String) loadAd.get(Integer.valueOf(bundle.getInt("tag_class_type")));
        if (str == null) {
            str = "unknown";
        }
        C10166l c10166l2 = new C10166l(bundle, str, (ArrayDeque) c10166l.f20681l);
        try {
            switch (i) {
                case 0:
                    Object obj = bundle.get("tag_value");
                    if (obj == null) {
                        throw new C9954l("Bundle is missing the primitive value", c10166l2);
                    }
                    c10166l2.close();
                    return obj;
                case 1:
                    Object objCrashlytics = crashlytics(bundle, c10166l2);
                    c10166l2.close();
                    return objCrashlytics;
                case 2:
                    HashMap mapAmazon = amazon(bundle, c10166l2);
                    c10166l2.close();
                    return mapAmazon;
                case 3:
                    HashSet hashSet = new HashSet();
                    yandex(bundle, hashSet, c10166l2);
                    c10166l2.close();
                    return hashSet;
                case 4:
                    ArrayList arrayList = new ArrayList();
                    yandex(bundle, arrayList, c10166l2);
                    c10166l2.close();
                    return arrayList;
                case 5:
                    Object objPurchase = purchase(bundle, c10166l2);
                    c10166l2.close();
                    return objPurchase;
                case 6:
                    Bundle bundle2 = bundle.getBundle("tag_value");
                    if (bundle2 == null) {
                        throw new C9954l("IconCompat bundle is null", c10166l2);
                    }
                    IconCompat iconCompatYandex = IconCompat.yandex(bundle2);
                    if (iconCompatYandex == null) {
                        throw new C9954l("Failed to create IconCompat from bundle", c10166l2);
                    }
                    c10166l2.close();
                    return iconCompatYandex;
                case 7:
                    Object objLoadAd = loadAd(bundle, c10166l2);
                    c10166l2.close();
                    return objLoadAd;
                case 8:
                    String string = bundle.getString("tag_value");
                    if (string == null) {
                        throw new C9954l("Class is missing the class name", c10166l2);
                    }
                    try {
                        Class<?> cls = Class.forName(string);
                        c10166l2.close();
                        return cls;
                    } catch (ClassNotFoundException e) {
                        throw new C9954l("Class name is unknown: ".concat(string), c10166l2, e);
                    }
                case 9:
                    IBinder binder = bundle.getBinder("tag_value");
                    if (binder == null) {
                        throw new C9954l("Bundle is missing the binder", c10166l2);
                    }
                    c10166l2.close();
                    return binder;
                case 10:
                    C18283l c18283lYandex = C18283l.yandex(bundle);
                    c10166l2.close();
                    return c18283lYandex;
                default:
                    throw new C9954l("Unsupported class type in bundle: " + i, c10166l2);
            }
        } catch (Throwable th) {
            c10166l2.close();
            throw th;
        }
        try {
            c10166l2.close();
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public static Object crashlytics(Bundle bundle, C10166l c10166l) throws C9954l {
        IBinder binder = bundle.getBinder("tag_value");
        if (binder == null) {
            throw new C9954l("Bundle is missing the binder", c10166l);
        }
        String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new C9954l("Bundle is missing IInterface class name", c10166l);
        }
        try {
            Object objInvoke = mopub(Class.forName(string), "asInterface", c10166l).invoke(null, binder);
            if (objInvoke != null) {
                return objInvoke;
            }
            throw new C9954l("Failed to get interface from binder", c10166l);
        } catch (ClassNotFoundException e) {
            throw new C9954l("Binder for unknown IInterface: ".concat(string), c10166l, e);
        } catch (ReflectiveOperationException e2) {
            throw new C9954l("Method to create IInterface from a Binder is not accessible for interface: ".concat(string), c10166l, e2);
        }
    }

    public static Bundle firebase(Object obj, C10166l c10166l) throws C9954l {
        Bundle bundle = new Bundle(3);
        bundle.putInt("tag_class_type", 7);
        try {
            bundle.putString("tag_value", (String) mopub(obj.getClass(), "name", c10166l).invoke(obj, null));
            bundle.putString("tag_class_name", obj.getClass().getName());
            return bundle;
        } catch (ReflectiveOperationException e) {
            throw new C9954l("Enum missing name method", c10166l, e);
        }
    }

    public static Bundle isPro(Collection collection, C10166l c10166l) {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(startapp(it.next(), "<item " + i + ">", c10166l));
            i++;
        }
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    public static Object loadAd(Bundle bundle, C10166l c10166l) throws C9954l {
        String string = bundle.getString("tag_value");
        if (string == null) {
            throw new C9954l(AbstractC15560l.Signature("Missing enum name [", string, "]"), c10166l);
        }
        String string2 = bundle.getString("tag_class_name");
        if (string2 == null) {
            throw new C9954l(AbstractC15560l.Signature("Missing enum className [", string2, "]"), c10166l);
        }
        try {
            return mopub(Class.forName(string2), "valueOf", c10166l).invoke(null, string);
        } catch (ClassNotFoundException e) {
            throw new C9954l(AbstractC15560l.Signature("Enum class [", string2, "] not found"), c10166l, e);
        } catch (IllegalArgumentException e2) {
            throw new C9954l(AbstractC14814l.ads("Enum value [", string, "] does not exist in enum class [", string2, "]"), c10166l, e2);
        } catch (ReflectiveOperationException e3) {
            throw new C9954l(AbstractC15560l.Signature("Enum of class [", string2, "] missing valueOf method"), c10166l, e3);
        }
    }

    public static Bundle metrica(Object obj, C10166l c10166l) throws C9954l {
        Bundle bundle = new Bundle(2);
        bundle.putInt("tag_class_type", 0);
        if (obj instanceof Boolean) {
            bundle.putBoolean("tag_value", ((Boolean) obj).booleanValue());
            return bundle;
        }
        if (obj instanceof Byte) {
            bundle.putByte("tag_value", ((Byte) obj).byteValue());
            return bundle;
        }
        if (obj instanceof Character) {
            bundle.putChar("tag_value", ((Character) obj).charValue());
            return bundle;
        }
        if (obj instanceof Short) {
            bundle.putShort("tag_value", ((Short) obj).shortValue());
            return bundle;
        }
        if (obj instanceof Integer) {
            bundle.putInt("tag_value", ((Integer) obj).intValue());
            return bundle;
        }
        if (obj instanceof Long) {
            bundle.putLong("tag_value", ((Long) obj).longValue());
            return bundle;
        }
        if (obj instanceof Double) {
            bundle.putDouble("tag_value", ((Double) obj).doubleValue());
            return bundle;
        }
        if (obj instanceof Float) {
            bundle.putFloat("tag_value", ((Float) obj).floatValue());
            return bundle;
        }
        if (obj instanceof String) {
            bundle.putString("tag_value", (String) obj);
            return bundle;
        }
        if (!(obj instanceof Parcelable)) {
            throw new C9954l("Unsupported primitive type: ".concat(obj.getClass().getName()), c10166l);
        }
        bundle.putParcelable("tag_value", (Parcelable) obj);
        return bundle;
    }

    public static Method mopub(Class cls, String str, C10166l c10166l) throws C9954l {
        if (cls == null || cls == Object.class) {
            throw new C9954l("No method " + str + " in class " + cls, c10166l);
        }
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return mopub(cls.getSuperclass(), str, c10166l);
    }

    public static Object purchase(Bundle bundle, C10166l c10166l) throws C9954l {
        String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new C9954l("Bundle is missing the class name", c10166l);
        }
        try {
            Class<?> cls = Class.forName(string);
            if (!cls.isAnnotationPresent(InterfaceC12208l.class)) {
                throw new C9954l("Invalid class not marked as CarProtocol: ".concat(string), c10166l);
            }
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            Object objNewInstance = declaredConstructor.newInstance(null);
            for (Field field : admob(cls)) {
                field.setAccessible(true);
                String str = field.getDeclaringClass().getName() + field.getName();
                Object obj = bundle.get(str);
                if (obj == null) {
                    obj = bundle.get(str.replaceAll("androidx.core.graphics.drawable.IconCompat", "android.support.v4.graphics.drawable.IconCompat"));
                }
                if (obj instanceof Bundle) {
                    field.set(objNewInstance, billing((Bundle) obj, c10166l));
                } else if (obj == null && Log.isLoggable("CarApp.Bun", 3)) {
                    Log.d("CarApp.Bun", "Value is null for field: " + field);
                }
            }
            return objNewInstance;
        } catch (ClassNotFoundException e) {
            throw new C9954l("Object for unknown class: ".concat(string), c10166l, e);
        } catch (IllegalArgumentException e2) {
            throw new C9954l("Failed to deserialize class: ".concat(string), c10166l, e2);
        } catch (NoSuchMethodException e3) {
            throw new C9954l("Object missing no args constructor: ".concat(string), c10166l, e3);
        } catch (ReflectiveOperationException e4) {
            throw new C9954l("Constructor or field is not accessible: ".concat(string), c10166l, e4);
        }
    }

    public static Bundle remoteconfig(Object obj, C10166l c10166l) throws C9954l {
        String name = obj.getClass().getName();
        if (!obj.getClass().isAnnotationPresent(InterfaceC12208l.class)) {
            throw new C9954l("Invalid class not marked as CarProtocol: ".concat(name), c10166l);
        }
        try {
            obj.getClass().getDeclaredConstructor(null);
            ArrayList<Field> arrayListAdmob = admob(obj.getClass());
            Bundle bundle = new Bundle(arrayListAdmob.size() + 2);
            bundle.putInt("tag_class_type", 5);
            bundle.putString("tag_class_name", name);
            for (Field field : arrayListAdmob) {
                field.setAccessible(true);
                String strFirebase = AbstractC12900l.firebase(field.getDeclaringClass().getName(), field.getName());
                try {
                    Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        bundle.putParcelable(strFirebase, startapp(obj2, field.getName(), c10166l));
                    }
                } catch (IllegalAccessException e) {
                    throw new C9954l("Field is not accessible: ".concat(strFirebase), c10166l, e);
                }
            }
            return bundle;
        } catch (NoSuchMethodException e2) {
            throw new C9954l("Class to deserialize is missing a no args constructor: ".concat(name), c10166l, e2);
        }
    }

    public static Bundle smaato(Map map, C10166l c10166l) {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle2 = new Bundle(2);
            bundle2.putBundle("tag_1", startapp(entry.getKey(), "<key " + i + ">", c10166l));
            if (entry.getValue() != null) {
                bundle2.putBundle("tag_2", startapp(entry.getValue(), "<value " + i + ">", c10166l));
            }
            i++;
            arrayList.add(bundle2);
        }
        bundle.putInt("tag_class_type", 2);
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    public static Bundle startapp(Object obj, String str, C10166l c10166l) throws C3115l {
        ArrayDeque arrayDeque = (ArrayDeque) c10166l.f20681l;
        if (obj != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (((C12122l) it.next()).yandex == obj) {
                    throw new C3115l("Found cycle while bundling type ".concat(obj.getClass().getSimpleName()), c10166l);
                }
            }
        }
        C10166l c10166l2 = new C10166l(obj, str, arrayDeque);
        try {
            if (obj == null) {
                throw new C9954l("Bundling of null object is not supported", c10166l2);
            }
            if (obj instanceof IconCompat) {
                Bundle bundle = new Bundle(2);
                bundle.putInt("tag_class_type", 6);
                bundle.putBundle("tag_value", ((IconCompat) obj).admob());
                c10166l2.close();
                return bundle;
            }
            if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Short) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof String) && !(obj instanceof Parcelable)) {
                if (obj instanceof IInterface) {
                    IInterface iInterface = (IInterface) obj;
                    Bundle bundle2 = new Bundle(3);
                    String name = iInterface.getClass().getName();
                    bundle2.putInt("tag_class_type", 1);
                    bundle2.putBinder("tag_value", iInterface.asBinder());
                    bundle2.putString("tag_class_name", name);
                    c10166l2.close();
                    return bundle2;
                }
                if (obj instanceof IBinder) {
                    Bundle bundle3 = new Bundle(2);
                    bundle3.putInt("tag_class_type", 9);
                    bundle3.putBinder("tag_value", (IBinder) obj);
                    c10166l2.close();
                    return bundle3;
                }
                if (obj instanceof Map) {
                    Bundle bundleSmaato = smaato((Map) obj, c10166l2);
                    c10166l2.close();
                    return bundleSmaato;
                }
                if (obj instanceof List) {
                    Bundle bundleIsPro = isPro((List) obj, c10166l2);
                    bundleIsPro.putInt("tag_class_type", 4);
                    c10166l2.close();
                    return bundleIsPro;
                }
                if (obj instanceof Set) {
                    Bundle bundleIsPro2 = isPro((Set) obj, c10166l2);
                    bundleIsPro2.putInt("tag_class_type", 3);
                    c10166l2.close();
                    return bundleIsPro2;
                }
                if (obj.getClass().isEnum()) {
                    Bundle bundleFirebase = firebase(obj, c10166l2);
                    c10166l2.close();
                    return bundleFirebase;
                }
                if (obj instanceof Class) {
                    Bundle bundle4 = new Bundle(2);
                    bundle4.putInt("tag_class_type", 8);
                    bundle4.putString("tag_value", ((Class) obj).getName());
                    c10166l2.close();
                    return bundle4;
                }
                if (obj.getClass().isArray()) {
                    throw new C9954l("Object serializing contains an array, use a list or a set instead", c10166l2);
                }
                if (obj instanceof C18283l) {
                    Bundle bundleVip = vip((C18283l) obj);
                    c10166l2.close();
                    return bundleVip;
                }
                Bundle bundleRemoteconfig = remoteconfig(obj, c10166l2);
                c10166l2.close();
                return bundleRemoteconfig;
            }
            Bundle bundleMetrica = metrica(obj, c10166l2);
            c10166l2.close();
            return bundleMetrica;
        } catch (Throwable th) {
            try {
                c10166l2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String subs(Class cls) {
        String str = (String) yandex.get(cls);
        if (str == null) {
            if (List.class.isAssignableFrom(cls)) {
                return "<List>";
            }
            if (Map.class.isAssignableFrom(cls)) {
                return "<Map>";
            }
            if (Set.class.isAssignableFrom(cls)) {
                return "<Set>";
            }
        }
        return str == null ? cls.getSimpleName() : str;
    }

    public static Bundle vip(C18283l c18283l) {
        c18283l.getClass();
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", c18283l.yandex);
        IconCompat iconCompat = c18283l.loadAd;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.admob() : null);
        bundle.putString("uri", c18283l.crashlytics);
        bundle.putString("key", c18283l.amazon);
        bundle.putBoolean("isBot", c18283l.purchase);
        bundle.putBoolean("isImportant", c18283l.billing);
        bundle.putInt("tag_class_type", 10);
        return bundle;
    }

    public static void yandex(Bundle bundle, AbstractCollection abstractCollection, C10166l c10166l) throws C9954l {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList == null) {
            throw new C9954l("Bundle is missing the collection", c10166l);
        }
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            abstractCollection.add(billing((Bundle) ((Parcelable) it.next()), c10166l));
        }
    }
}
